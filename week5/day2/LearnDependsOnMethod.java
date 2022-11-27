package week5.day2;

import org.testng.annotations.Test;

public class LearnDependsOnMethod {
	@Test
	public void CreateLead() {
		
		System.out.println("CreateLead");
		throw new RuntimeException();
	}
	
	@Test(timeOut =2000 )
	public void EditLead() throws InterruptedException {
		Thread.sleep(1000);
		System.out.println("EditLead");
	}
	@Test(dependsOnMethods = {"CreateLead"},alwaysRun = true)
	public void DeleteLead() {
		System.out.println("DeleteLead");
	}
}
