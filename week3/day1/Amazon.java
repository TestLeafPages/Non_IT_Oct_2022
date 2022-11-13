package week3.day1;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("One plus",Keys.ENTER);
       Thread.sleep(2000);
        String text = driver.findElement(By.xpath("//div[contains(@class,'a-section')]/span[text()='1-16 of over 8,000 results for']")).getText();
         System.out.println(text);
         String input="1-12 of over 8,000 results for";
         System.out.println(text.substring(13, 18));
	}

}
