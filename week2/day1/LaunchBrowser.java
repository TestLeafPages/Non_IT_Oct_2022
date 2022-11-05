package week2.day1;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {

	public static void main(String[] args) {
		//set up the path
		WebDriverManager.edgedriver().setup();
		//Launch the browser(edge)
		EdgeDriver driver=new EdgeDriver();
		//window maximize
		driver.manage().window().maximize();
		//Load the  url
		driver.get("http://leaftaps.com/opentaps/control/login");
		//wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Enter username
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");//5
		//Enter password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//click login button
		driver.findElement(By.className("decorativeSubmit")).click();
		//get the title of the page
		 String  title= driver.getTitle();//ctrl+2+l
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
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("princial");
		//Enter lastname
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("edward");
		//click create lead
		driver.findElement(By.name("submitButton")).click();
		String title2 = driver.getTitle();
		if(title2.contains("View Lead")) {
			System.out.println("The page loaded");
		}
		else {
			System.out.println("The page not loaded");
		}
		

	}

}
