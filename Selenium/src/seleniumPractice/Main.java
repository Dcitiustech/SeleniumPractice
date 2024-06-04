package seleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
	static WebDriver driver;
	public static void main(String[] args) {
		
	String path= System.getProperty("user.dir");
	System.setProperty("Webdriver.chrome.driver",path+"//resources//chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("Moneycontrol.com");
	
		
	}

}
