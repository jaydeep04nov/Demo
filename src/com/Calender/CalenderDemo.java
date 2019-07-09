package com.Calender;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderDemo {
public static void main(String[] args) {
	

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\jaydeep\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/");
		
		driver.manage().window().maximize();
		
		
	WebElement datebox=	driver.findElement(By.cssSelector("input[type='datetime-local']"));
		
	datebox.sendKeys("04061993");	
	
	datebox.sendKeys(Keys.TAB);
	
	datebox.sendKeys("1215PM");
	
	driver.findElement(By.cssSelector("input[type='submit']")).click();
	
	
	
	
	
	
	
	
	
	
	
}
}
