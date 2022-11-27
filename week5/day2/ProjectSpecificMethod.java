package week5.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ProjectSpecificMethod {
	public ChromeDriver driver;
	@Parameters({"url","username","password"})//step2
	@BeforeMethod
	public void launchBrowser(String url,String uname,String pwrd) {//step3 pass as a arg
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
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
}
