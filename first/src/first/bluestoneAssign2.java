package first;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;



public class bluestoneAssign2 {
	static { 
		   System.setProperty("webdriver.chrome.driver","C:\\Users\\kvani\\Desktop\\workspaceA3\\Framework\\driver\\chromedriver.exe");
		   }
	@Test
	public void bluestone() throws Exception{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://www.bluestone.com");
		
		Actions actions=new Actions(driver);
	WebElement e = driver.findElement(By.xpath("//a[.='Pendants ']"));
		actions.moveToElement(e).perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//ul/li/span[@data-p='pendants-below10k,m']")).click();	
 Thread.sleep(1000);
 List<WebElement> price = driver.findElements(By.xpath("//div[@class='clearfix']//span[@class='new-price']"));
	List<Integer> newcostList=new ArrayList<Integer>();
	for(WebElement Cost:price)
	{
		String pendentcost=Cost.getText().replaceAll("RS.", "").replaceAll(",", "").replaceAll(" ", "");
		System.out.println(pendentcost);

		int intvalue=Integer.parseInt(pendentcost);

		newcostList.add(intvalue);
	}
	for(int newcostList1:newcostList)
	{
		if(newcostList1>10000)
		{
		System.out.println(newcostList1+" cost is greater than 10000");
		}
		else
		{
		System.out.println(newcostList1+" cost is below 10000");
		}
	}
	driver.close();

}

}
