package week2.day2;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleDropDown {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/select.xhtml");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        WebElement tool = driver.findElement(By.className("ui-selectonemenu"));
        Select drop=new Select(tool);
        drop.selectByVisibleText("Selenium");
        //click the drop down
        //Not inside the select tag
        Thread.sleep(2000);//wait for 2 sec in same line
		  driver.findElement(By.id("j_idt87:country_label")).click();
		  driver.findElement(By.id("j_idt87:country_1")).click();
		 
        //Select country//present inside dom but not interacted
        WebElement country = driver.findElement(By.id("j_idt87:country_input"));
        Select sc=new Select(country);
        sc.selectByValue("Germany");
       
	}

}
