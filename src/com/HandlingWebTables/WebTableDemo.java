package com.HandlingWebTables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableDemo {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jaydeep\\Desktop\\Selenium Testing Material\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();		
		driver.get("http://demo.automationtesting.in/WebTable.html");
		driver.manage().window().maximize();
		
	    WebElement cell=	driver.findElement(By.linkText("Piyush"));
		System.out.println(cell.getText());
		
		
		
		
	}

}
