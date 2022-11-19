package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class W3School {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        //handle the frame
		driver.switchTo().frame("iframeResult");//id/name
		//click try it
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		//handle the alert
		Alert alert = driver.switchTo().alert();
		alert.accept();
		//print the text
		String text = driver.findElement(By.id("demo")).getText();
		System.out.println(text);
		if(text.contains("You pressed")) {
			System.out.println("The element clicked");
		}
	}

}
