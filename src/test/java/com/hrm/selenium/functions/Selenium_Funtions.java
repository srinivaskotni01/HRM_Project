package com.hrm.selenium.functions;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Selenium_Funtions {
	public static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// System.setProperty("webdriver.ie.driver",
		// "C:\\Users\\SRINIVAS\\Documents\\IEDriverServer.exe");
		System.setProperty("webdriver.chrome.driver",
				"Drivers\\chromedriver.exe");

		// WebDriver driver =new InternetExplorerDriver();
		driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// find element by Name
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		// find element by id
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@name='Submit']")).click();
		Mouseover("//a[@id='menu_admin_viewAdminModule']");
		findElements("//div[@class='menu']/ul/li/a/b");
		// find element by link text
		driver.findElement(By.linkText("Admin")).click();
		Isenabled();
		Isdisplayed();
		driver.findElement(By.linkText("Time")).click();
		select_BYValue();
		select_BYText();
		select_BYIndex();
		get_title();
		Get_currentURL();
		String parent = driver.getWindowHandle();
		click_link("Directory");
		click_link("OrangeHRM, Inc");
		String child = driver.getWindowHandle();
		driver.switchTo().window(child);
		Get_currentURL();
		driver.navigate()
				.to("https://www.talentzing.com/FreshersCorner/FreshersRegister.aspx");
		driver.findElement(By.partialLinkText("Site")).click();
		click_link("Terms & Conditions");
		click_link("Privacy & Policy");

		Close_childwindow();
		driver.switchTo().window(parent);
		driver.quit();
	}

	public static void Close_childwindow() {

		Set<String> a = driver.getWindowHandles();
		for (String all : a) {

			driver.switchTo().window(all);
			String url = driver.getCurrentUrl();
			if (url.contains("Privacy")) {

				System.out.println("Child url is" + url);
				driver.close();
			}

		}

	}

	public static void get_title() {
		System.out.println("title is " + driver.getTitle());
	}

	public static void click_link(String xpath) {

		driver.findElement(By.linkText(xpath)).click();
	}

	public static void Get_currentURL() {
		System.out.println("Get current URL " + driver.getCurrentUrl());
	}

	public static void DeselectAll() {
		WebElement ele = driver.findElement(By
				.xpath("//select[@id='time_startingDays']"));
		Select a = new Select(ele);
		a.deselectByValue("3");

	}

	public static void select_BYText() {
		WebElement ele = driver.findElement(By
				.xpath("//select[@id='time_startingDays']"));
		Select a = new Select(ele);
		a.selectByVisibleText("Friday");
		System.out.println("Visible text " + ele.getText());
	}

	public static void select_BYIndex() {
		WebElement ele = driver.findElement(By
				.xpath("//select[@id='time_startingDays']"));
		Select a = new Select(ele);
		a.selectByIndex(5);
		System.out.println("Index text " + ele.getText());
	}

	public static void select_BYValue() {
		WebElement ele = driver.findElement(By
				.xpath("//select[@id='time_startingDays']"));
		Select a = new Select(ele);
		a.selectByValue("3");
		System.out.println("Value text " + ele.getText());
	}

	public static void closedriver() {

		driver.close();
	}

	public static void Isenabled() {
		boolean check;

		check = driver.findElement(By.className("delete")).isEnabled();
		System.out.println("Enabled "+check);
		
		if (check == true) {
			System.out.println("Element is enabled");
		} else {

			System.out.println("Element is Not enabled");

		}

	}
	public static void Isdisplayed() {
		boolean check;

		check = driver.findElement(By.className("delete")).isDisplayed();
		
		System.out.println("displayed "+check);
		if (check == true) {
			System.out.println("Element is enabled");
		} else {

			System.out.println("Element is Not enabled");

		}

	}

	public static void Mouseover(String xpath) {
		WebElement ele = driver.findElement(By.xpath(xpath));

		Actions a = new Actions(driver);
		a.moveToElement(ele).build().perform();

	}

	public static void findElements(String Xpath) {
		List<WebElement> all = driver.findElements(By.xpath(Xpath));
		System.out.println("Menu Size  " + all.size());
		for (WebElement a : all) {
			String menu = a.getText();
			System.out.println(menu);
		}
	}

}
