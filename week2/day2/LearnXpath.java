package week2.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnXpath {
	
public static void main(String[] args) {
	//set up the path
			WebDriverManager.chromedriver().setup();
			//Launch the browser(edge)
			ChromeDriver driver=new ChromeDriver();
			//window maximize
			driver.manage().window().maximize();
			//Load the  url
			driver.get("http://testleaf.herokuapp.com/pages/checkbox.html");
			//wait
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath("(//label[@for='java']/following-sibling::input)[2]")).click();

}
}
