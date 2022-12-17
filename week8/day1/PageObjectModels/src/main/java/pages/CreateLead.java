package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethod;

public class CreateLead extends ProjectSpecificMethod{
	public CreateLead(ChromeDriver driver) {
		this.driver=driver;
	}
	
	public CreateLead enterCmpName(String cmp) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cmp);
		return this;
	}
	public CreateLead enterFname(String fname) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
		return this;
	}
	public CreateLead enterLname(String lname) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
		return this;
	}
	
	public CreateLead pnoneNum(String phnum) {
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phnum);
		return this;
	}
	public ViewLead clickCreateLead() {
		driver.findElement(By.name("submitButton")).click();
		return new ViewLead(driver);
	}
	
	
}




