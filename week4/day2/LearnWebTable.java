package week4.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWebTable {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/table.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    //Get the column count
		List<WebElement> column = driver.findElements(By.xpath("(//table[@role='grid'])[1]//th"));
	    System.out.println(column.size());
	    for (int i = 0; i < column.size(); i++) {
	    System.out.println(column.get(i).getText());
	    }
	    List<WebElement> tag = driver.findElements(By.tagName("th"));
	    System.out.println(tag.size());
	    //Get the row count
	    List<WebElement> row = driver.findElements(By.xpath("(//table[@role='grid'])[2]//tr"));
	    System.out.println(row.size());
	    //print particular data
	    String text = driver.findElement(By.xpath("(//table[@role='grid'])[2]//tr[3]/td[3]")).getText();
	    System.out.println(text);
	}

}
