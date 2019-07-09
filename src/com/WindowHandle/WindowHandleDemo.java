package com.WindowHandle;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleDemo {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\jaydeep\\Desktop\\Selenium Testing Material\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("http://demo.guru99.com/popup.php");
	driver.manage().window().maximize();
	
	driver.findElement(By.cssSelector("a[target='_blank']")).click();
	String MainWindow=driver.getWindowHandle();
	System.out.println("Window Key :"+MainWindow);
	
	 Set<String> s1=driver.getWindowHandles();		
     Iterator<String> i1=s1.iterator();		
     		
     while(i1.hasNext())			
     {		
         String ChildWindow=i1.next();		
         		
         if(!MainWindow.equalsIgnoreCase(ChildWindow))			
         {    		
              
              
                 driver.switchTo().window(ChildWindow);
                 driver.findElement(By.cssSelector("input[name='emailid']")).sendKeys("jaydeep04nov@gmail.com");
	             driver.findElement(By.cssSelector("input[name='btnLogin']")).click();
	             Thread.sleep(4000);
	             driver.close();
	
	
	
	
         }
     }
	driver.switchTo().window(MainWindow);
	
	driver.quit();
	
	
	
	
	
	
}
}
