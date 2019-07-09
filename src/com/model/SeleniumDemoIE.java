package com.model;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class SeleniumDemoIE {
	public static void main(String[] args) {
		System.setProperty("webdriver.ie.driver", "C:\\Users\\jaydeep\\Desktop\\CJC Software\\4052019\\IEDriverServer_x64_3.14.0 (12)\\IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();
		driver.get("https://www.paytm.com");
		
		
		
		
		
	} 


}
