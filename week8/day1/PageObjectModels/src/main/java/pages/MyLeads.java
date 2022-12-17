package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethod;

public class MyLeads extends ProjectSpecificMethod{
	public MyLeads(ChromeDriver driver) {
		this.driver=driver;
	}
	
   public CreateLead clickCreateLead() {
	   driver.findElement(By.linkText("Create Lead")).click();
	   return new CreateLead(driver);
   }
}
