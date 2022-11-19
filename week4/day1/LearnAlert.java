package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnAlert {

public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://leafground.com/alert.xhtml");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	//simple Alert
	driver.findElement(By.xpath("//span[@class='ui-button-text ui-c']")).click();
	
	Alert sa = driver.switchTo().alert();
	
	//print information
		String text = sa.getText();
		System.out.println("simple Alert"+text);
	
		sa.accept();
	
	//find the element Alert (Confirm Dialog)
	driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[2]")).click();
	//handle alert
	Alert ca = driver.switchTo().alert();//ctrl+2+l
   //to get the text of information
	String msg = ca.getText();
	System.out.println("Confirm Alert"+msg);
	Thread.sleep(2000);
	ca.dismiss();
	String verify = driver.findElement(By.xpath("//span[@id='result']")).getText();
	System.out.println(verify);
	
	//prompt alert
	driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[6]")).click();
	
	Alert pa = driver.switchTo().alert();
	pa.sendKeys("Testleaf");
	Thread.sleep(3000);
	String text2 = pa.getText();
	System.out.println("prompt message"+text2);
	pa.accept();
	//print the result of text entered 
	String promsg = driver.findElement(By.xpath("//span[@id='confirm_result']")).getText();
	System.out.println(promsg);
	//sweet alert
	driver.findElement(By.xpath("//span[text()='Delete']")).click();
	//click yes
	driver.findElement(By.xpath("//span[text()='Yes']")).click();
	
}
}
