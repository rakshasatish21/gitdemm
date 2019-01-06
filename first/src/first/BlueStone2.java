package first;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class BlueStone2 {

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
		String ss1 = driver.getCurrentUrl();
		//System.out.println(ss1);
		Assert.assertTrue(ss1.contains("bangles-men"));
		System.out.println("men's Bangles page is displaying correctly");
		driver.findElement(By.id("pid_5669")).click();
		driver.findElement(By.id("ringselect")).click();
		WebElement we4 = driver.findElement(By.xpath("//option[text()='Select One']/../option[text()=' 2-6(2 6/16\")']"));
		String val = we4.getText();
		//System.out.println(val);
		we4.click();
		driver.findElement(By.id("buy-now")).click();
		Thread.sleep(300);
		String url = driver.getCurrentUrl();
		String strr ="order";
		Assert.assertTrue(url.contains(strr));
		System.out.println("Order page is displayed correctly");
		WebElement we3 = driver.findElement(By.xpath("//div[contains(text(),'Size')]/../../div/div[2]"));
		String size = we3.getText();
		//System.out.println(size);
		Assert.assertTrue(val.contains(size));
		System.out.println("Size of Bangle selected is correct");
		driver.close();
	}

}
