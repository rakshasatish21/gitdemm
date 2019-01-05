package com.bluestone;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Shr_Ass3_ChatBluestone {
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
		driver.findElement(By.xpath("//span[contains(.,'CHAT')]")).click();
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Shruthi");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("shruthikeerthi.r@gmail.com");
		driver.findElement(By.xpath("//input[@id='container_4_4']")).sendKeys("9740023206");
		driver.findElement(By.xpath("//input[@value='Start the chat']")).click();
		driver.findElement(By.xpath("//span[text()='Type in your message here and press Enter to send']")).sendKeys("Hi....");
		
		
}
}
