package com.Whatsapp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class whatsAppDemo {
	public static void main(String[] args) {
		
		
		
		
	

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\jaydeep\\Desktop\\Selenium Testing Material\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://web.whatsapp.com/");
	driver.manage().window().maximize();

}
}