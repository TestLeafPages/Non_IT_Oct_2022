package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnSelectable {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/selectable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Handle the frame
		driver.switchTo().frame(0);
		//Find the Element
		WebElement item1 = driver.findElement(By.xpath("//li[text()='Item 1']"));
		WebElement item2 = driver.findElement(By.xpath("//li[text()='Item 2']"));
		WebElement item3 = driver.findElement(By.xpath("//li[text()='Item 3']"));
		WebElement item4= driver.findElement(By.xpath("//li[text()='Item 4']"));
		Actions builder=new Actions(driver);
		builder.click(item1).click(item3).click(item4).release().perform();
		//Send keys
		//driver.findElement(By.xpath("")).sendKeys("Mobile",Keys.ENTER);
		builder.keyDown(Keys.CONTROL).click(item4).click(item3).click(item1).keyUp(Keys.CONTROL).perform();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
