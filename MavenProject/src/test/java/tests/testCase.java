package tests;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class testCase {
	
	setup s = new setup();
	
	public void findAndClickRadioButton(WebDriver driver) {
		
		
		// Find the radio button for “No” using its ID and click on it
		driver.findElement(By.id("no")).click();

		// Click on Check Button
		driver.findElement(By.id("buttoncheck")).click();
		List<WebElement> elements = new ArrayList<>();
		elements = driver.findElements(By.name("name"));
	    System.out.println("Number of elements:" +elements.size());
		for (int i=0; i<elements.size();i++){
		      System.out.println("Radio button text:" + elements.get(i).getAttribute("value"));
		}
	}
}
