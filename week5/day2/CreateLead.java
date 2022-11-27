package week5.day2;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import week5.day1.testcase.BaseClass;

public class CreateLead extends ProjectSpecificMethod{
	@Test(dataProvider = "createlead")

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
	@DataProvider(name="createlead")
	public String[][] getData() {        //r//c
		String [][] data=new String[2][4];
		//1 st set of data
		data[0][0]="TestLeaf";
		data[0][1]="Princila";
		data[0][2]="edward";
		data[0][3]="99";
		//2nd set of data
		data[1][0]="Qeagle";
		data[1][1]="Raghu";
		data[1][2]="R";
		data[1][3]="99";
		return data;
		
	}
}






