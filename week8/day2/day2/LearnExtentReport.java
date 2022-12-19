package week8.day2;
import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class LearnExtentReport {

	public static void main(String[] args) throws IOException {
		//Setup the physical path for report
		ExtentHtmlReporter reporter = new ExtentHtmlReporter("./reports/result.html");
		//to keep the report history
		reporter.setAppendExisting(true);
		//Create object for ExtentReports
		ExtentReports extent=new ExtentReports();
		//attach data with physical path
		extent.attachReporter(reporter);
		//Create a test case and assign the test detail
		                                    //testname     //test description
		  ExtentTest test = extent.createTest("Login","Login test for LeafTap application");
          test.assignCategory("smoke");
          test.assignAuthor("Princila");
          //Step level status
          test.pass("Enter username");//if status pass, the test will treated as pass
          test.fail("Enter password");//the status is fail
          //attach the screenshot // ../ control still stay in report folder to come out of it
          test.pass("click login button",MediaEntityBuilder.createScreenCaptureFromPath(".././snap/leaf.png").build());
          
     
          //Mandatory step
          extent.flush();
	}

}
