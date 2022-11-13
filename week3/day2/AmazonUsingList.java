package week3.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonUsingList {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Phone",Keys.ENTER);
        //locate by common locator
       List<String>lst=new ArrayList<String>();//declare new list
       List<WebElement> price = driver.findElements(By.className("a-price-whole"));//ctrl+2+l
	     for (int i = 0; i <price.size(); i++) {//30
	    	 //print the value
	    	 String text = price.get(i).getText(); 
	   
	    	 for (int j = 0; j < text.length(); j++) {//String
			     lst.add(text);
		}  
	}
	     System.out.println(lst);
	     Collections.sort(lst);
	     Set<String>set=new HashSet<String>(lst);
	     System.out.println(set);
	     System.out.println("lowest price"+lst.get(0));

}
}