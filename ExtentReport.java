package com.extentReport;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReport {
	public static void main(String[] args) throws IOException {
		ExtentHtmlReporter reporter=new ExtentHtmlReporter("C:\\Users\\Administrator\\Desktop\\TestYantra_Practice\\TestYantraFrameWork\\report\\firstreport.html");
		ExtentReports extent=new ExtentReports();
		extent.attachReporter(reporter);
		ExtentTest logg = extent.createTest("main");
		logg.log(Status.INFO, "test is running");
		logg.log(Status.ERROR, "Some error in test");
		logg.log(Status.PASS, "test is passed");
		logg.log(Status.WARNING, "Warning...");
		//Attach screen shot 
		logg.addScreenCaptureFromPath("C:\\Users\\Administrator\\Desktop\\TestYantra_Practice\\Urban_Ladder\\photo\\Shru.png");
		logg.fail("failed due to some ", MediaEntityBuilder.createScreenCaptureFromPath("C:\\Users\\Administrator\\Desktop\\TestYantra_Practice\\Urban_Ladder\\photo\\Shru.png").build());
		logg.log(Status.FAIL, "test is failed");
		
		extent.flush();
		System.out.println("Success");
		
	}

}
