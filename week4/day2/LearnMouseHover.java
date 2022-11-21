package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnMouseHover {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //find the element to be musehover
		WebElement mouseHover = driver.findElement(By.xpath("//a[text()='Kids']"));
		//Mousehover
		Actions builder =new Actions(driver);
		builder.moveToElement(mouseHover).perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
