package sel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Bluestone {
	static
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\TYSS\\Desktop\\Nandini\\Framework\\drivers\\chromedriver.exe");
	}

	public static void main(String[] args) {
		
     WebDriver driver=new ChromeDriver();
     driver.get("http://www.bluestone.com");
     driver.manage().window().maximize();
    WebElement alljewel = driver.findElement(By.xpath("//li[@class='menuparent']"));
    Actions action=new Actions(driver);
    action.moveToElement(alljewel).perform();
    WebElement kadas = driver.findElement(By.xpath("//a[.='Kadas']"));
    action.moveToElement(kadas).click().perform();
    driver.findElement(By.xpath("//div[@class='p-image'][1]")).click();
    WebElement ele = driver.findElement(By.id("ringselect"));
    Select s=new Select(ele);
     s.selectByVisibleText("2-2(2 2/16\")");
    driver.findElement(By.id("buy-now")).click();
    String actual = "2-2(2 2/16\")";
    String expected="2-2(2 2/16\")";
    Assert.assertEquals(actual,expected);

    
    
	}


}