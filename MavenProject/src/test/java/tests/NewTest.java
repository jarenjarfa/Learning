package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class NewTest {

	private static WebDriver driver;

	setup s = new setup();
	testCase t = new testCase();

	@Test
	public void openMyBlog() throws Exception {

		t.findAndClickRadioButton(driver);
	}

	@BeforeClass
	public void BeforeClass() {
		driver=s.setupDriver();
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

}