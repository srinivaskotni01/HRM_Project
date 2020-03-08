package com.hrm.selenium.functions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollExamples {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SRINIVAS\\Documents\\chromedriver.exe");

		// WebDriver driver =new InternetExplorerDriver();
		WebDriver driver = new ChromeDriver();

	//	driver.get("http://demo.guru99.com/test/guru99home//");
		driver.get("https://www.orangehrm.com/");
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		JavascriptExecutor js = (JavascriptExecutor) (driver);
		js.executeScript("window.scrollBy(0,4800)");
		boolean c= driver.findElement(By.partialLinkText("Forum")).isDisplayed();
		System.out.println(c);	
		driver.findElement(By.partialLinkText("Forum")).click();

 	 
		
//	    WebElement Element=  driver.findElement(By.id("gantry-totop"));
		
	//Find element by link text and store in variable "Element"        		
 //     WebElement Element = driver.findElement(By.linkText("Linux"));

      //This will scroll the page till the element is found		
  //    JavascriptExecutor js = (JavascriptExecutor) (driver);
		
    //  js.executeScript("arguments[0].scrollIntoView();", Element);
	  
    //This will scroll the web page till end.		
    //  js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
      
	  //driver.close();
	  /*
		JavascriptExecutor js = (JavascriptExecutor) (driver);
		js.executeScript("window.scrollBy(100,2000)");
		*/
		
	}

}
