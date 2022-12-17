package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethod;

public class ViewLead extends ProjectSpecificMethod {

	public ViewLead(ChromeDriver driver) {
		this.driver=driver;
	}
	
	public ViewLead verifyLead() {
		String text = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		if(text.equals(text)) {
			System.out.println("Lead created");
		}
		else {
			System.out.println("Lead not created");
		}
		return this;
	}
}
