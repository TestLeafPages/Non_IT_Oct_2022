package week2.day2;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {

	public static void main(String[] args) throws InterruptedException {
		//set up the path
		WebDriverManager.chromedriver().setup();
		//Launch the browser(edge)
		EdgeDriver driver=new EdgeDriver();
		//window maximize
		driver.manage().window().maximize();
		//Load the  url
		driver.get("http://leaftaps.com/opentaps/control/login");
		//wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Enter username
		Thread.sleep(2000);
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");//5
		//Enter password
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//click login button
		driver.findElement(By.className("decorativeSubmit")).click();
		//get the title of the page
		 String title = driver.getTitle();//ctrl+2+l
		 System.out.println(title);
		//click crmsfa
		driver.findElement(By.linkText("CRM/SFA")).click();
		System.out.println(driver.getTitle());
		//Click lead
		driver.findElement(By.linkText("Leads")).click();
		//click create lead
		driver.findElement(By.linkText("Create Lead")).click();
		//Enter company name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		//Enter first name
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("princila");
		//Enter lastname
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("edward");
		//Handle the dropdown
				//find the dropdown
				 WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));//ctrl+2+l
				//create obj  for Select 
				 Select sc=new Select(source);
				 sc.selectByIndex(20);//select by index
				 //sc.selectByValue("LEAD_TRADESHOW");//select by value
				// sc.selectByVisibleText("Word of Mouth"); //select by visible text
				 //click create lead
		driver.findElement(By.name("submitButton")).click();
		
		String title2 = driver.getTitle();
		System.out.println(title2);
		if(title2.contains("View Lead")) {
			System.out.println("Page Loaded");
		}
		else {
			System.out.println("Page not loaded");
		}
		//print the name
		String text = driver.findElement(By.id("viewLead_firstName_sp")).getText();//ctrl+2+l
		System.out.println(text);
		
  driver.close();

	}

}
