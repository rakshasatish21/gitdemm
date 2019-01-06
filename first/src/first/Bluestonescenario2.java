package first;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Bluestonescenario2 {
	
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
			
			
			WebElement ranges = driver.findElement(By.xpath("//span[text()='Between 10k-15k' and @data-p='pendants-10k15k,m']"));
			Thread.sleep(3000);
			ranges.click();
			
			List<WebElement> prices = driver.findElements(By.xpath("//span[@class='new-price']"));
			
			int count = prices.size();
			System.out.println(count);
			  int num=0;
			for(int i=0;i<count;i++)
			{
				WebElement links = prices.get(i);
				String txt = links.getText();
				//System.out.println(txt);
				String frmat = txt.replace("RS. ", "").replace(",", "").replace("RS.", "");
				System.out.println(frmat);
				num=Integer.parseInt(frmat);
			}
		if(num>10000 && num<=15000)
		{
			System.out.println("All rings are between range of 10,000-15,000");
		}
		
		
	}

}

