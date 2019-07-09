package com.TabSwitch;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabDemo {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\jaydeep\\Desktop\\Selenium Testing Material\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();	
	driver.get("https://www.google.com");
	driver.manage().window().maximize();
	
	System.out.println(driver.getTitle());
	
	driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "t");
    
	driver.get("https://www.bing.com");
	System.out.println(driver.getTitle());
	
	driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "\t");
	System.out.println(driver.getTitle());
}
}
