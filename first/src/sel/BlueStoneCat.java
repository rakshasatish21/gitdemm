package sel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BlueStoneCat {
	
	static {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rahul\\git\\gitdemm\\first\\src\\driver\\chromedriver.exe");
	}
	@Test
	public void chatS() throws Exception {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
		Thread.sleep(2000);
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement frm = driver.findElement(By.id("livechat-compact-view"));
		driver.switchTo().frame(frm);
		driver.findElement(By.id("open-label")).click();
		Thread.sleep(4000);
		driver.switchTo().defaultContent();
		WebElement fulFrame = driver.findElement(By.id("livechat-full-view"));
		driver.switchTo().frame(fulFrame);
		Thread.sleep(2000);
		WebElement name = driver.findElement(By.xpath("//div[@class='form']/form//input[@id='name']"));
		name.sendKeys("Rahul");
		driver.findElement(By.id("email")).sendKeys("007aksingh1990@gmail.com");
		driver.findElement(By.id("container_4_4")).sendKeys("7982301671");
		driver.switchTo().defaultContent();
		WebElement startChat = driver.findElement(By.id("wiz-iframe"));
		driver.switchTo().frame(startChat);
		Thread.sleep(1000);
		driver.findElement(By.id("contentDiv")).click();;
		
		
		
		//driver.quit();//span[@id='open-label']
	}

}