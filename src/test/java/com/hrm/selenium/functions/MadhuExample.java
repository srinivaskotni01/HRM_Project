package com.hrm.selenium.functions;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class MadhuExample {

	public static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\SRINIVAS\\Documents\\chromedriver.exe");

		// WebDriver driver =new InternetExplorerDriver();
		 driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.className("button")).click();
		driver.findElement(By.linkText("Admin")).click();
		driver.findElement(By.partialLinkText("Recru")).click();
		
		findelemts();
		
		boolean check =driver.findElement(By.xpath("//input[@id='btnDelete']")).isEnabled();
		System.out.println("delete button "+check);
		
		
		 check=driver.findElement(By.xpath("//input[@id='btnAdd']")).isDisplayed();
		
		System.out.println("Add button "+check);
		
	/*	Actions a=new Actions(driver);
		WebElement ele=driver.findElement(By.id("menu_admin_viewAdminModule"));
		a.moveToElement(ele).build().perform();
		
		Actions a1=new Actions(driver);
		WebElement ele2=driver.findElement(By.id("menu_admin_UserManagement"));
		a1.moveToElement(ele2).build().perform();
		driver.findElement(By.linkText("Users")).click();
	*/	
		
		driver.findElement(By.linkText("Time")).click();
		
		SelectByValue("Sunday");
		
	}
	
	public static void SelectByValue(String value){

		WebElement ele=driver.findElement(By.id("time_startingDays"));
		Select a=new Select(ele);
		a.selectByVisibleText(value);
		
		
	}
	

	public static void findelemts(){
		
		List<WebElement> all=driver.findElements(By.xpath("//div[@class='menu']/ul/li"));
		System.out.println(all.size());
		/*
		for(int i=0;i<all.size();i++){
			
			System.out.println(all.get(i).getText());
		}
		*/
		for(WebElement a:all){
			
			System.out.println(a.getText());
			
		}
		
		
	}
	
}
