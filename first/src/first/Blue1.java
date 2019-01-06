package first;

import java.util.concurrent.TimeUnit;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.Assert;
//import org.testng.annotations.Test;

public class Blue1 {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
	  // @Test
		//public void blustone1() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.bluestone.com/");
			//WebDriverWait wait=new WebDriverWait(driver, 20);
			//wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.id("livechat-compact-view")));
			
			
		//get title
		//String expectedtitle=driver.getTitle();
		//System.out.println(expectedtitle);
		//String actualtitle="Online Jewellery Shopping Store India | Buy Gold and Diamond jewellery with Latest Designs 2018 | BlueStone.com";
		//Assert.assertEquals(actualtitle, expectedtitle);
		Thread.sleep(5000);
		driver.switchTo().frame("livechat-compact-view");		
		WebElement e = driver.findElement(By.id("open-label"));
		Thread.sleep(4000);
		e.click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame("livechat-full-view");	
		Thread.sleep(5000);
		//driver.findElement(By.xpath("//span[.='CHAT with our experts !']")).click();
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("kalpana");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("kalpanaprani@gmail.com");
		driver.findElement(By.xpath("//input[@id='container_4_4']")).sendKeys("9019663091");
		driver.findElement(By.xpath("//input[@value='Start the chat']")).click();
		//driver.findElement(By.xpath("//span[@id='textarea-wrapper']")).sendKeys("abc");
		

	}

}
