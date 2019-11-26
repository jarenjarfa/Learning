package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class testCase {
	
	setup s = new setup();
	
	public void findAndClickRadioButton(WebDriver driver) {
		
		
		// Find the radio button for “No” using its ID and click on it
		driver.findElement(By.id("no")).click();

		// Click on Check Button
		driver.findElement(By.id("buttoncheck")).click();
	}
}
