package base;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import io.github.bonigarcia.wdm.WebDriverManager;
import util.ReadExcel;

public class ProjectSpecificMethod {
	public ChromeDriver driver;
	public String excelfile;
	@BeforeMethod
	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		System.out.println("base driver"+driver);
		
	}
	@AfterMethod
	public void close() {
		driver.close();
	}
	@DataProvider(name="fetchData")
	public String[][] testData() throws IOException {
		String[][] readData = ReadExcel.readdata(excelfile);
		return readData;
	}

}
