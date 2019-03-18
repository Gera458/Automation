package org.vms.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.vms.utility.Dropdown;

public class SearchRoleType {
	
	@FindBy(xpath = "//span[text()='Role Type']")
	WebElement roleType;
	
	@FindBy(xpath="//a[text()='Search Role Type']")
	WebElement searchType;

	@FindBy(xpath="//input[@id='roletypecode']")
	WebElement roleTypecode;
	
	@FindBy(xpath = "//input[@id='roletypename']")
	WebElement roleTypeName;
	
	@FindBy(xpath="//select[@formcontrolname='status']")
	WebElement dropdown;
	
	@FindBy(xpath="//button[text()='Search']")
	WebElement search;
	
	public WebDriver driver;

	public SearchRoleType(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void roleType()
	{
		roleType.click();
	}
	
	public void SearchType()
	{
		searchType.click();
	}
	public void code(String code)
	{
		
		roleTypecode.sendKeys(code);	
	}
	
	public void name(String name)
	{
		roleTypeName.sendKeys(name);
	}
	
	public void drop()
	{
		Dropdown.drop(dropdown, "Active");
	}
	
	public void search()
	{
		search.click();
	}
	
}
