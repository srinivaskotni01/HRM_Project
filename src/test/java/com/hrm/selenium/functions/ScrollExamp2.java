package com.hrm.selenium.functions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollExamp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SRINIVAS\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.orangehrm.com/");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		JavascriptExecutor js = (JavascriptExecutor) (driver);
		//js.executeScript("window.scrollBy(0,4800)");
		
		//driver.findElement(By.partialLinkText("Forum")).click();
		//WebElement ele= driver.findElement(By.xpath("//h5[@class='hidden-xs']"));
		//"arguments[0]" means first index of page starting at 0.
		//js.executeScript("arguments[0].scrollIntoView();",ele);
		
		//This will scroll the web page till end.		
	      js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	      
	}

}
