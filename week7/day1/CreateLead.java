package week7.day1;


import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import week5.day1.testcase.BaseClass;

public class CreateLead extends ProjectSpecificMethod{
	@BeforeTest
	public void openDb() {
		 excelfile="CreateLead";
	}
	
	@Test(dataProvider = "fetchData")

	public  void runCreateLead(String cname,String fname,String lname,String phnum) {
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phnum);
		driver.findElement(By.name("submitButton")).click();
		
} 
}






