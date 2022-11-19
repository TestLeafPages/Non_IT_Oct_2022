package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWindow {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/window.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//print active window/tab
		String windowHandle = driver.getWindowHandle();//ctrl+2+l
		System.out.println(windowHandle);
		System.out.println(driver.getTitle());
		//click open
		driver.findElement(By.xpath("//span[text()='Open']")).click();
		System.out.println(driver.getWindowHandle());
		System.out.println(driver.getTitle());
		//how can i go to second window
	    Set<String> windowHandles = driver.getWindowHandles();//ctrl=2+l
		System.out.println("How many window open"+windowHandles.size());
	    //convert set into list
		List<String>lstwindow =new ArrayList<String>(windowHandles);
		//String string = lstwindow.get(1);
		//move the  control into second open window
		driver.switchTo().window(lstwindow.get(1));
		System.out.println(driver.getWindowHandle());
		System.out.println(driver.getTitle());
		//control back to the window
		driver.switchTo().window(lstwindow.get(0));
		System.out.println(driver.getTitle());
		
		//current window
		driver.close();
		driver.quit();
		
		
		
		
		
		
		
		
	}

}
