package com.bluestone;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Shru_Ass4_pendants {
	static 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(option);
		driver.get("https://www.bluestone.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		Actions action=new Actions(driver);
		WebElement pendentWE = driver.findElement(By.xpath("//div[@class='container']//a[@title='Pendants' and text()='Pendants ']"));
		action.moveToElement(pendentWE).perform();
		driver.findElement(By.xpath("//span[text()='Below 10,000' and @data-p='pendants-below10k,m']")).click();
		Thread.sleep(1000);
		//Integer n=0;
		List<WebElement> allPrices = driver.findElements(By.xpath("//span[@class='new-price']"));
		
		int n =0;
		for(int i=0;i<allPrices.size();i++)
		{
			String price = allPrices.get(i).getText();
			String cPrice=price.replaceAll("Rs.", "").replaceAll(",", "").replaceAll(" ", "");
			System.out.println(cPrice);
			n =Integer.parseInt(cPrice);
			
		
		if(n<10000)
		{
			System.out.println("All products are below 10k");
		}
		else
		{
			System.out.println("All products are not below 10k");
		}
		}
	}
}
