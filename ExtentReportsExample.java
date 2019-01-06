package first;

import java.io.IOException;
import java.util.Scanner;

import com.aventstack.extentreports.ExtentReporter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportsExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Object test11 = ExtentReportsExample.test1();
		ExtentHtmlReporter report=new ExtentHtmlReporter("F:\\TrainingActivity\\seleniumpjct\\report\\output.html");
		ExtentReports extent=new ExtentReports();
		extent.attachReporter(report);
		ExtentTest logg=extent.createTest("test11");
		ExtentTest loggg=extent.createTest("ExtentReportsExample.test2()");
		loggg.log(Status.PASS, "Executed Succesfully");
		logg.log(Status.ERROR, "Might be wrong in return type");
		ExtentTest logg2=extent.createTest("ExtentReportsExample.test3()");
		logg2.log(Status.FAIL, "test case faiuled");
		ExtentTest logg3=extent.createTest("ExtentReportsExample.test4");
		logg3.log(Status.INFO, "Information about the test case");
		
		logg.addScreenCaptureFromPath("C:\\Users\\Ranjitha\\OneDrive\\Pictures\\Screenshots\\2019-01-05.png");
		logg.fail("failed due to some error");
		extent.flush();
		System.out.println("Task Completed");

	}
	public static Object test1()
	{
		String input="SAN-GEE-THA";
		String output=" ";
		String[] inputarray=input.split("-");
		for(int i=0;i<inputarray.length;i++)
		{
			String bf=new StringBuffer(inputarray[i]).reverse().toString();
			
			output=output+bf+"-";
		}
		System.out.print(output);
		return inputarray;
	}
	public static void test2()
	{
		System.out.println("Enter the Number to check it is palindrome or not");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int sum=0;
		System.out.println("The Entered number is\t"+num);
		//----------------palindrome function without using function------------------
		while(num!=0)
		{
		int rem=num%10;
		sum=(sum+rem)*10;
		num=num/10;
		}
		int rev=sum%10;
		int ssum=sum/10;
		System.out.println("After Reverseing "+ssum);
		if(num==ssum)
		{
			System.out.println("Entered Number is Palindrome");
		}
		else
		{
			System.out.println("The Given Number is Not Palindrome");
		}
		
	}
	public static void test3()
	{
		System.out.println("Error message");
	}
	public static void test4(){
		System.out.println("Test case is executed to debug the code");
	}

}
