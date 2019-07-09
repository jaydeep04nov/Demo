package com.TabSwitch;


import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class New {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\jaydeep\\Desktop\\Selenium Testing Material\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://demo.guru99.com/popup.php");
	
	driver.manage().window().maximize();
	
	driver.findElement(By.cssSelector("a[target='_blank']")).click();
	String Mainwindow=driver.getWindowHandle();
	
	Set<String> s=driver.getWindowHandles();
	
	Iterator<String> i=s.iterator();
	
	while(i.hasNext())
	{
		String childwindow=i.next();
		
		if(!Mainwindow.equalsIgnoreCase(childwindow))
		{    
			driver.switchTo().window(childwindow);
			driver.findElement(By.cssSelector("input[name='emailid']")).sendKeys("jaydeep04nov@gmail.com");
			driver.findElement(By.cssSelector("input[name='btnLogin']")).click();
			
		}
		
	}
	driver.switchTo().window(Mainwindow);
	
	
	
	
	
	
}
}
