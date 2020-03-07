package com.hrm.home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Login {

	public static void main(String[] args) {
/*		
		DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
		  
		capabilities.setCapability(CapabilityType.BROWSER_NAME, "internet explorer");
		capabilities.setCapability(InternetExplorerDriver.
		  INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
*/
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");

		WebDriver driver =new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	
	}
}
