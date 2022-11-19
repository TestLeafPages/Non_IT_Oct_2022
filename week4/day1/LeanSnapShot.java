package week4.day1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeanSnapShot {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/frame.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//to click the element
		//handle the frame
		driver.switchTo().frame(0);
		WebElement ele = driver.findElement(By.xpath("//button[@id='Click']"));
        ele.click();
        String msg = ele.getText();//crt+2+l
        System.out.println(msg);
        
        //How to take snap shot
        //step1: take a snap 
         File source = driver.getScreenshotAs(OutputType.FILE);//ctrl+2+l
        //step2:to save the file local dir
         File dest =new File("./snap/frame.png");
         //step 3 join both source dest
         FileUtils.copyFile(source, dest);
         

	}

}
