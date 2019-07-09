package com.Calender;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderDemo1 {
	public static void main(String[] args) {
		
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\jaydeep\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demos.telerik.com/kendo-ui/datetimepicker/index");
		
		driver.manage().window().maximize();
		
		
	WebElement datebox=	driver.findElement(By.cssSelector("input[id='datetimepicker']"));
		
	datebox.sendKeys("04111993");	
	datebox.sendKeys(Keys.TAB);
	datebox.sendKeys("1015");	
	datebox.sendKeys(Keys.TAB);
	datebox.sendKeys("AM");	
		
		
		
		
		
	}

}
