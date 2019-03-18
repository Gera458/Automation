package org.vms.utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class Dropdown  {
	
	static WebDriver driver;
	WebElement element;
	
	public static void drop(WebElement element, String key)
	{
		Select s= new Select(element);
		s.selectByVisibleText(key);		
	}

}
