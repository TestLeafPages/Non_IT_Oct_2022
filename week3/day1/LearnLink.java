package week3.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnLink {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://testleaf.herokuapp.com/pages/Link.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Go to home 
		System.out.println(driver.getTitle());
		driver.findElement(By.linkText("Go to Home Page")).click();
		String title = driver.getTitle();
		System.out.println( title);
		System.out.println(driver.getCurrentUrl());
		//logic-2
		driver.get("http://testleaf.herokuapp.com/pages/Button.html");

	}

}
