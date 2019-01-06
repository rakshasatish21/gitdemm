package first;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGSampleProgram {
	
	@BeforeTest
	public void test1()
	{
		Reporter.log("Hi.........",true);
	}
	@Test
	public void Test2()
	{
		Reporter.log("hello...........",true);
	}
	@AfterTest
	public void test3()
	{
		Reporter.log("failed..........");
		Assert.fail();
	}
	

}
