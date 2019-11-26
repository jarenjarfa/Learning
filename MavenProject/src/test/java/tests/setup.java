package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class setup {
	
	public WebDriver setupDriver() {
		System.setProperty("webdriver.chrome.driver", "/home/jarfa/Downloads/chromedriver/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/ajax.html");
		driver.manage().window().maximize();
		return driver;
	}
}
