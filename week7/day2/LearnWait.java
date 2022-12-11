package week7.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWait {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/waits.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//find the element
		WebElement visible = driver.findElement(By.xpath("(//span[text()='Click'])[1]"));
		
		visible.click();
		
		//Explicit wait
		//create obj for webdriverwait
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		//wait till the element 
		wait.until(ExpectedConditions.visibilityOf(visible));
		//verification
		String text = driver.findElement(By.xpath("//span[text()='I am here']")).getText();
        System.out.println(text);
	}

}
