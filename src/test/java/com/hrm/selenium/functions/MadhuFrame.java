package com.hrm.selenium.functions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MadhuFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver",
				"Drivers\\chromedriver.exe");

		// WebDriver driver =new InternetExplorerDriver();
		WebDriver driver = new ChromeDriver();

		driver.get("https://netbanking.hdfcbank.com/netbanking/?_ga=2.90456159.454107980.1583650146-1656730725.1583650146");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.switchTo().frame("login_page");
		//driver.findElement(By.name("fldLoginUserId")).sendKeys("Madhu");
        driver.findElement(By.xpath("//img[@alt='continue']")).click();
        
        Alert a= driver.switchTo().alert();
    String text=    a.getText();
    System.out.println(text);    
    a.accept();
	}

}
