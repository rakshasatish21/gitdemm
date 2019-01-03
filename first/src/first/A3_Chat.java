package first;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class A3_Chat 
{
	static {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	}
	public static void main(String[] args) throws Exception 
	{
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.bluestone.com/");
		String ss = driver.getTitle();
		//System.out.println(ss);
		Assert.assertTrue(ss.contains("BlueStone"));
		System.out.println("Welcom displayed correctly");
		driver.switchTo().frame("livechat-compact-view");
		WebElement cb = driver.findElement(By.id("open-label"));
		Thread.sleep(3000);
		cb.click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame("livechat-full-view");
		Thread.sleep(5000);
		driver.findElement(By.id("name")).sendKeys("BSTEST");
		driver.findElement(By.id("email")).sendKeys("bstesting1@gmail.com");
//		driver.findElement(By.id("subject")).sendKeys("BSTESTING");
//		driver.findElement(By.id("container_8_4")).sendKeys("RINGS QUERY");
		driver.findElement(By.id("container_4_4")).sendKeys("1234567890");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(3000);
		 WebElement chat_mesg = driver.findElement(By.id("message-placeholder"));
		Thread.sleep(2000);
		chat_mesg.sendKeys("hi ");
		
		driver.close();
		
	
		
		
		
		
	}
}
