package first;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario_12_Bluestone {
	public static void main(String[] args) throws InterruptedException {
		String key="webdriver.gecko.driver";
		String value="./driver/geckodriver.exe";
		System.setProperty(key, value);
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.bluestone.com/");
		
		WebElement pendantLink = driver.findElement(By.xpath("//a[text()='Pendants ']"));
		Actions action = new Actions(driver);
		action.moveToElement(pendantLink).perform();;
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Between 10k-15k']")).click();
		
		List<WebElement> allPrice = driver.findElements(By.xpath("//span[@class='new-price']"));
		int num=0;
		for(int i=0;i<allPrice.size();i++)
		{
			String price = allPrice.get(i).getText();
			String numPrice = price.replace("RS. ", "").replace(",", "").replace("RS.", "");
			System.out.println(numPrice);
			
			num = Integer.parseInt(numPrice);
			
		}
		
		if(num>10000 && num<15000)
		{
			System.out.println("The products are in price range between 10000 to 15000");
		}
		else
		{
			System.out.println("The products are NOT in price range between 10000 to 15000");
		}
		
		driver.quit();
		
	}

}
