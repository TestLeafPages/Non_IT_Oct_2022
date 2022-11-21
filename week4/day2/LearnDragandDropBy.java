package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnDragandDropBy {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/draggable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//handle the frame
		driver.switchTo().frame(0);
		//find the WebElement
		WebElement draggable = driver.findElement(By.id("draggable"));
		Point location = draggable.getLocation();
		System.out.println(location.getX());
		System.out.println(location.getY());
		Actions builder =new Actions(driver);
		System.out.println(draggable.getLocation());
		//Remember this!! all actions end with .perform()
		builder.dragAndDropBy(draggable, 100, 50).perform();
		//verify
		System.out.println(draggable.getLocation());
		
	}

}
