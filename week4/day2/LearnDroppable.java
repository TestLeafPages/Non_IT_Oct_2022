package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnDroppable {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//handle the frame
		driver.switchTo().frame(0);
		//find source Element
		WebElement source = driver.findElement(By.id("draggable"));
        //find the destin Element
		WebElement destin = driver.findElement(By.id("droppable"));
		Actions  builder =new Actions(driver);
		builder.dragAndDrop(source, destin).perform();
	
		//verify
		System.out.println(destin.getText());
		//colour
		System.out.println(destin.getCssValue("background"));
		
	}

}
