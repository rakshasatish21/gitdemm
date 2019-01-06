package first;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AutomateBluestone {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","/AutomateSelenium/exefiles/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.bluestone.com/");
		WebElement earings = driver.findElement(By.xpath("//a[@title='Pendants']"));
		
		Actions act=new Actions(driver);
		act.moveToElement(earings).perform();
		Thread.sleep(3000);
		
		
		WebElement ranges = driver.findElement(By.xpath("//span[text()='Below 10,000'][@data-p='pendants-below10k,m']"));
		Thread.sleep(3000);
		ranges.click();
		
		 List<WebElement> allprice = driver.findElements(By.xpath("//span[@class='new-price']"));
		 
		 int intNum=0;
		for(int i=0;i<allprice.size();i++)
		 {
			 String price = allprice.get(i).getText();
			 String nums = price.replace("RS. ", "").replace(",", "");
			 System.out.println(nums);
			 intNum=Integer.parseInt(nums);
		 }
		if(intNum<10000) 
		{
			System.out.println("All products are below 10000 ");
		}
		else
		{
		System.out.println("All products are above the range");
		}
	}

}
