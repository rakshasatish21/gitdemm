package first;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class BlueStone {

	static {
		System.setProperty("webdriver.chome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.bluestone.com/");
		String ss = driver.getTitle();
		//System.out.println(ss);
		Assert.assertTrue(ss.contains("BlueStone")); 
		System.out.println("Welcome displayed correctly");
		WebElement we = driver.findElement(By.xpath("//a[contains(text(),'All Jewellery ')]"));
		Actions act =new Actions(driver);
		act.moveToElement(we).perform();
		WebElement we1 = driver.findElement(By.xpath("//a[contains(text(),'Kadas')]"));
		act.moveToElement(we1).click().perform();
		Thread.sleep(3000);
		String ss1 = driver.getCurrentUrl();
		//System.out.println(ss1);
		Assert.assertTrue(ss1.contains("bangles-men"));
		System.out.println("men's Bangles page is displaying correctly");
		driver.findElement(By.id("pid_5669")).click();
		driver.findElement(By.id("buy-now")).click();
		WebElement we2 = driver.findElement(By.xpath("//div[contains(text(),'This field is required')]"));
		String str = we2.getText();
		//System.out.println(str);
		Assert.assertTrue(str.contains("This field is required"));
		System.out.println("Error msg displayed correctly");
		driver.close();
	}

}
