package com.hrm.selenium.functions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"Drivers\\chromedriver.exe");

		// WebDriver driver =new InternetExplorerDriver();
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to("https://netbanking.hdfcbank.com/netbanking/");
		/*
		 * WebElement ele=
		 * driver.findElement(By.xpath("//frame[@name='login_page']"));
		 * driver.switchTo().frame(ele);
		 * driver.findElement(By.xpath("//img[@alt='continue']")).click();
		 * driver.switchTo().defaultContent();
		 */
		WebElement ele = driver.findElement(By
				.xpath("//frame[@name='login_page']"));
		driver.switchTo().frame(ele);
		// driver.findElement(By.name("fldLoginUserId")).sendKeys("test");
		driver.findElement(By.xpath("//img[@alt='continue']")).click();
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();

		System.out.println("alert text is " + text);
		alert.dismiss();

		 alert.accept();

	}

}
