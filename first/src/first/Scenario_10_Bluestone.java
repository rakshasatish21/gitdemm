package Assignment_Sel_01;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario_10_Bluestone {
	public static void main(String[] args) throws InterruptedException {
		String key="webdriver.chrome.driver";
		String value="./driver/chromedriver.exe";
		System.setProperty(key, value);
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.bluestone.com/");
		Thread.sleep(2000);
		
		String xp="//iframe[@src='about:blank']";
		WebElement e = driver.findElement(By.xpath(xp));
		driver.switchTo().frame(e);
		driver.findElement(By.id("open-label")).click();
		Thread.sleep(2000);
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame("livechat-full-view");
	
		driver.findElement(By.id("name")).sendKeys("Roopa");
		driver.findElement(By.id("email")).sendKeys("roopav44@gmail.com");
		driver.findElement(By.id("container_4_4")).sendKeys("9986717068");
		driver.findElement(By.xpath("//input[@value='Start the chat']")).click();
//		Thread.sleep(2000);
		driver.findElement(By.id("message-placeholder")).sendKeys("Hi");
	}

}
