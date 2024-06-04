package com.seleniumconcepts.SELENIUMCONCEPT;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTestClass {
	public static WebDriver driver;
	
	@BeforeMethod
	public void browserSetUp() throws InterruptedException {
		String path = System.getProperty("user.dir");
		System.setProperty("Webdriver.Chrome.driver", path+"//Resourses//chromedriver.exe");
		driver=new ChromeDriver();
		//driver.get("https://demo.guru99.com/test/web-table-element.php");
		driver.get("https://www.moneycontrol.com/");
		driver.manage().window().maximize();
		Thread.sleep(10000);
	}
	
	@AfterMethod
	public void deleteSession()
	{
		driver.quit();
	}

}
