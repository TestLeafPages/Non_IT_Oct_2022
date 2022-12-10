package week7.day1;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ProjectSpecificMethod {
	public RemoteWebDriver driver;
	String excelfile;
	@Parameters({"browser","url","username","password"})//step2
	@BeforeMethod
	public void launchBrowser(String browser,String url,String uname,String pwrd) {//step3 pass as a arg
		if(browser.equalsIgnoreCase("Chrome")) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		}
		else if (browser.equalsIgnoreCase("Edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys(uname);
		driver.findElement(By.id("password")).sendKeys(pwrd);
		driver.findElement(By.className("decorativeSubmit")).click();
	}
		@AfterMethod
        public void tearDown() {
			driver.close();

	}
		  @DataProvider(name="fetchData")
		 	public String[][] getData() throws IOException {        //r//c
		 		String[][] readdata = ReadExcel.readdata(excelfile);//ctrl+2+l
		 		return readdata;
		 		
		 	}
}
