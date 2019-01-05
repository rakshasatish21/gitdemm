package first;

import java.awt.Frame;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.gargoylesoftware.htmlunit.javascript.host.Window;

public class BlueStone4 {
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
		WebElement we = driver.findElement(By.xpath("//a[contains(text(),'Pendants')]"));
		Actions act =new Actions(driver);
		act.moveToElement(we).perform();
		WebElement we1 = driver.findElement(By.xpath("(//span[text()='Below 10,000'])[2]"));
		act.moveToElement(we1).click().perform();
		WebElement we2 = driver.findElement(By.xpath("//h2[text()=' Pendants ']"));
		JavascriptExecutor jc = (JavascriptExecutor) driver;
		jc.executeScript("arguments[0].scrollIntoView();",we2);
		//wait.until(ExpectedConditions.);
		Thread.sleep(12000);
		List<WebElement> list = driver.findElements(By.xpath("//span[text()='Rs.']/ancestor::div/div/span[@class=\"p-wrap\"]/span/span/span"));
		System.out.println(list.size());
		//wait.until(ExpectedConditions.visibilityOfAllElements(list));
		ArrayList<String> al = new ArrayList<>();
		for ( WebElement sr : list) {
			String val = sr.getText();
			String str1 = val.replaceAll("RS. "," ").trim().replaceAll(",","");
			al.add(str1);
		}
		for (String str : al) {
			
			 System.out.println(str);
		}
		
		
		driver.close();
}
}