package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnDoubleClick {

	public static void main(String[] args) {

		// We have to call WDM for the browser driver !!
				WebDriverManager.chromedriver().setup(); // verify the version, download, set up !
				
				
				// Launch the browser (chrome)
				ChromeDriver driver = new ChromeDriver();
				
				driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_ondblclick");
				
				// Maximize the browser 
				driver.manage().window().maximize();
				
				// Implicit Wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				
				driver.switchTo().frame(0);
				
				// Find element
				WebElement doubles = driver.findElement(By.xpath("//p[text()='Double-click this paragraph to trigger a function.']"));
				

				// Move to Actions
				Actions builder = new Actions(driver);
				
				// Mouse over
				builder.doubleClick(doubles).perform();

	}

}
