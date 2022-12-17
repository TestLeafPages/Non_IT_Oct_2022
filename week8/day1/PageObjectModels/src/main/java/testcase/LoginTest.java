package testcase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.LoginPage;

public class LoginTest extends ProjectSpecificMethod {
	@BeforeTest
	public void setup() {
		excelfile="Login";
	}

	@Test(dataProvider = "fetchData")
	public void  runLogin(String uname,String pwd) {
		//create obj for login
	LoginPage lp=new LoginPage(driver);
	lp.enterUsername(uname).enterPassword(pwd).clickLogin();
		
		
		
		
		
	}

}
