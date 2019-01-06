package extentReport;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.MediaEntityModelProvider;


public class ExtentReport {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ExtentHtmlReporter reporter=new ExtentHtmlReporter("C:\\Users\\Amulya\\eclipse-workspace\\Testyantra\\reports\\firstreport.html");
//log or error or debug or warning , we have to report.it is not depend on test execution
//so if it failed also it will report.so it will generate report for all
		
		ExtentReports extent=new ExtentReports();
		extent.attachReporter(reporter);
		ExtentTest logg=extent.createTest("main");
		logg.log(Status.INFO, "test is running");
		logg.log(Status.ERROR, "error due to some reason");
		logg.log(Status.WARNING, "warrrr");
		logg.addScreenCaptureFromPath("C:\\Users\\Amulya\\eclipse-workspace\\Testyantra\\screenshot\\Desert.png");
		//logg.fail("failed due to some reason", MediaEntityBuilder.createScreenCaptureFromPath("C:\\\\Users\\\\Amulya\\\\eclipse-workspace\\\\Testyantra\\\\screenshot\\\\Desert.jpg"));
        logg.fail("failed due to some reason",MediaEntityBuilder.createScreenCaptureFromPath("C:\\\\Users\\\\Amulya\\\\eclipse-workspace\\\\Testyantra\\\\screenshot\\\\Desert.png").build());
		logg.log(Status.FAIL, "test failed");
		extent.flush();
		System.out.println("done");
		
		
/*we have to publish the report. we use flush method.execute and refresh
we get diff icon for pass fail info error guessing we will use
some warning , some time it may not generate
we can use it for line by line execution
in testng , only one info is there, we use console.if we are using 1 lakh test case also
if we want to know y testcase is failing, if we want to know in report only. we can 
add screenshot here only.we have to add screenshot in folder and give the path of it
if we want screenshot with some info,for ex,y test case is failing
loggg.statusfail.time for test case is displayed
	advantages
	customizable
	 *reports with stepwise and pie chart representation
	 *displays the time taken for test case execution within report
	 *screenshot for every step
	 *	
	 */
	
	
	}
	

}
