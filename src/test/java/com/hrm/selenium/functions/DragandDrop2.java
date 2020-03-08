package com.hrm.selenium.functions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SRINIVAS\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.get("https://www.testandquiz.com/selenium/testing.html");					
		 driver.manage().window().maximize();
         /*
		 //click on check box
			boolean check = driver.findElement(By.className("Performance")).isSelected();
			System.out.println(check); 
		driver.findElement(By.className("Performance")).click();
		 //click on check box
		boolean check1 = driver.findElement(By.className("Performance")).isSelected();
		System.out.println(check1);*/
		//double click
	/*	WebElement btn=driver.findElement(By.id("dblClkBtn"));
		Actions a=new Actions(driver);
		a.moveToElement(btn).doubleClick().build().perform();
*/
		//WebElement on which drag and drop operation needs to be performed  
        WebElement from = driver.findElement(By.id("sourceImage"));  

    //WebElement to which the above object is dropped  
        WebElement to = driver.findElement(By.id("targetDiv"));  
           
    //Creating object of Actions class to build composite actions  
        Actions act = new Actions(driver);  
          
    //Performing the drag and drop action  
        act.moveToElement(from).dragAndDrop(from,to).build().perform();   	
	}

}
