package ty;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentRep {
	
	public static void main(String[] args) throws Exception {
		ExtentReports extent = new ExtentReports();
		ExtentHtmlReporter reporter  = new ExtentHtmlReporter("./reporter/out.html");
		extent.attachReporter(reporter);
		ExtentTest logg = extent.createTest("main");
		logg.log(Status.INFO, "test is running");
		logg.log(Status.PASS, "Extent reporter pass");
		logg.addScreenCaptureFromPath("shoot.png");
		logg.log(Status.FAIL, "test failed",MediaEntityBuilder.createScreenCaptureFromPath("shoot1.png").build());
		extent.flush();
		System.out.println("done");
	}

	
}
