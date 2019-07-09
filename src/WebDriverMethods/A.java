package WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jaydeep\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		
		driver.manage().window().maximize();
		
		//Get Title
		
		String title=driver.getTitle();
		System.out.println("The Current Title of WebPage is :"+title);
		
		//Get url
		
		String url=driver.getCurrentUrl();
		System.out.println("The Current URL of Webpage Is :"+url);
		
		//Get Page Source Code
		
		/*System.out.println(driver.getPageSource());*/
		
		//Window Handle
		
		
		String winkey=driver.getWindowHandle();
		System.out.println("Window Unique Key is :"+winkey);
		
		//Navigate
		
		driver.navigate().to("https://www.paytm.com");
		
		String title1=driver.getTitle();
		System.out.println("The Current Title of WebPage is :"+title1);
		
		//Navigate Back
		
		driver.navigate().back();
		
		// Get Title Again
		
		String title2=driver.getTitle(); 
		System.out.println("The Current Title of WebPage is :"+title2);
		
		/*driver.close();*/
		driver.quit();
		
	}

}
