package first;

import java.awt.Frame;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class BlueStone3 {
	static {
		System.setProperty("webdriver.chome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 20);
		driver.get("https://www.bluestone.com/");
		String ss = driver.getTitle();
		//System.out.println(ss);
		Assert.assertTrue(ss.contains("BlueStone"));   
		System.out.println("Welcome displayed correctly");
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.id("livechat-compact-view")));
		//driver.switchTo().frame("By.id("livechat-compact-view"");
		driver.findElement(By.xpath("//span[text()='CHAT with our experts !']")).click();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame("livechat-full-view");
		//Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='name']/ancestor::div/form/div[3]/p/input")).sendKeys("harish");
		driver.findElement(By.id("email")).sendKeys("harishbabu@gmail.com");
		driver.findElement(By.xpath("//input[@name='container_4_4']")).sendKeys("9990009999");
		driver.findElement(By.xpath("//input[@value='Start the chat']")).click();
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Type in your message here')]")));
		Thread.sleep(20000);
		WebElement we = driver.findElement(By.xpath("//span[contains(text(),'Type in your message here')]"));
		we.sendKeys("good");
		Robot rb = new Robot();
		rb.keyPress(KeyEvent.VK_ENTER);
}
}