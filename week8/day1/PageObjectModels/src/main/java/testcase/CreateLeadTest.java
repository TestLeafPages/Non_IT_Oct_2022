package testcase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.LoginPage;

public class CreateLeadTest extends ProjectSpecificMethod{
	@BeforeTest
	public void setup() {
		excelfile="CreateLead";
	}

	@Test(dataProvider = "fetchData")
	public void runCreateLead(String uname,String pwd,String cname,String fname,String lname,String phnum) {
		LoginPage lp=new LoginPage(driver);
		lp.enterUsername(uname)
		.enterPassword(pwd)
		.clickLogin()
		.clickCRMSFA()
		.clickLead()
		.clickCreateLead()
		.enterCmpName(cname)
		.enterFname(fname)
		.enterLname(lname)
		.pnoneNum(phnum)
		.clickCreateLead()
		.verifyLead();
	}

}
