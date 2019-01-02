package com.bluestone;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Shr_Ass2 {
	static {
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bluestone.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Actions action=new Actions(driver);
		WebElement alljew = driver.findElement(By.xpath("//nav[@class='wh-navbar']/ul//a[contains(text(),'All Jewellery ')]"));
		action.moveToElement(alljew).perform();
		driver.findElement(By.xpath("//div[@class='wh-submenu-header']/following-sibling::ul//a[contains(text(),'Kadas')]")).click();
		driver.findElement(By.xpath("//div[@class='inner pd-gray-bg']/div/div/a/img[@alt='The Udith Kada For Him']")).click();
		String bang_size = driver.findElement(By.xpath("//select[@id='ringselect']/option[@value='04']")).getText();
		System.out.println(bang_size);
		driver.findElement(By.xpath("//select[@id='ringselect']/option[@value='04']")).click();	
		driver.findElement(By.xpath("//input[@value='Buy Now']")).click();
		Thread.sleep(1000);
		String bang_cartsize=driver.findElement(By.xpath("//div[@class='row line-separator']/div[2]")).getText();	

		String bang_cartsize1=bang_cartsize.replaceAll(":", "");
		System.out.println(bang_cartsize1);
		if(bang_size.equals(bang_cartsize1))
		{
			System.out.println("size are equal");
		}
		else
		{
			System.out.println("size are not equal");
		}

	}

}


