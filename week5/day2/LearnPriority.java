package week5.day2;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class LearnPriority {//enabled
	@Test(priority = 1)
	public void CreateLead() {
		System.out.println("CreateLead");
	}
	
	@Test(priority = -1)
	public void EditLead() {
		System.out.println("EditLead");
	}
	@Ignore
	@Test(enabled = false)
	public void DeleteLead() {
		System.out.println("DeleteLead");
	}
  
}
