package Assignment_Sel_01;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario_11_bluestone {
	public static void main(String[] args) throws InterruptedException {
		String key="webdriver.gecko.driver";
		String value="./driver/geckodriver.exe";
		System.setProperty(key, value);
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.bluestone.com/");
		
		WebElement pendentLink = driver.findElement(By.xpath("//a[text()='Pendants ']"));
		Actions action = new Actions(driver);
		action.moveToElement(pendentLink).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Below 10,000'][ @data-p='pendants-below10k,m']")).click();
		
		List<WebElement> allPrice = driver.findElements(By.xpath("//span[@class='new-price']"));
		int intNum=0;
		for(int i=0;i<allPrice.size();i++)
		{
			String price = allPrice.get(i).getText();
			String plainNum = price.replace("RS. ", "").replace(",", "");
			System.out.println(plainNum);
			intNum = Integer.parseInt(plainNum);
			
			
		}
		if(intNum<10000)
		{
			System.out.println("All the products are below 10000");
		}
		else
		{
			System.out.println("All the products are not below 10000");
		}
	}
}
