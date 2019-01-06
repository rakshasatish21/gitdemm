package log4j;

import org.apache.log4j.Logger;

/*
 * if many lines of code is there it is different to get whats happening
 * log4j gives line by line -->output 
 * version 1.2.17
 * three components in log4j
 * logger, appenders , layout
 * 1.logger-capturing the information, we will take info and keep it
 * 2.appenders-we have info , we have to put in some way, like text file,save the info
 * 3.layout-format the information
 * 
 * we have to create one property
 * defining the appender
 * file location
 * we define the layout and pattern
 * conditions to create 
 * name of the file should be log4j
 * it should be in src folder only
 * it will search for log4j.properties in src folder only.
 * ex for singleton class-->runtime...
 * logger is a singleton class
 *create a folder by name logss and give our file location in properties file
 *Reporter.log-->both in report and console(console we will loose our data)
 *
 *it will also print in different formats like html, text
 *if it is not printing after 25th line, it means we have to fix from 26th line
 *
 *if one test method is depending on other test method, we use dependsOnMethods
 *Assert.assertTrue(false);
 *for group execution after test
 *<groups>
 *<run>
 *<include>
 *
 *to exclude any <exclude>
 *to exclude any test method
 *@Test(enabled=false)
 *@Test(invocationCount=0)
 *or we can make group and exclude that group
 *@Ignore annotation
 *@Test(alwaysRun=true)
 *@Test(priority=1)
 *default priority is 0
 *Listeners are interfaces , it will listen to testng and acts accordingly
 *implements ITestListners.
 *Listners will be listning to TestNG execution
 *To do connection, we use @Listners(classname.class).
 *This is the only listner, we use outside the class
 */
public class log4j {
	public static void main(String[] args) {
		//classname
		//logs helps log info
		Logger logs=Logger.getLogger("Log4j");
		logs.info("log4j working fine");
		//info method will show line name,class name,package name
		//info is information, we can give warning , error
		logs.info("log4j working fine");
		logs.info("log4j working fine");
		logs.info("log4j working fine");
		logs.info("log4j working fine");logs.info("log4j working fine");
		
	}

}
