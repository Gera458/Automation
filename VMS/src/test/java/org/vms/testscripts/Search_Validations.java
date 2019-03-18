package org.vms.testscripts;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.vms.base.Base;
import org.vms.pages.LoginPage;
import org.vms.pages.SearchRoleType;

public class Search_Validations extends Base {
@Test(invocationCount=1)
	
	public void searchRole() throws InterruptedException
	{
		LoginPage lp = new LoginPage(driver);
		lp.setLoginId("123");
		lp.setLoginPass("123");
		lp.setLoginButtonClick();
		Thread.sleep(3000);
		
		SearchRoleType sc= new SearchRoleType(driver);
		sc.roleType();
		sc.SearchType();
		sc.code("");
		sc.name("Mukul");
		//Thread.sleep(2000);
		sc.drop();
		sc.search();
		driver.findElement(By.xpath("//th[@class='sorting_asc']")).getText();
		System.out.println(driver.findElement(By.xpath("//th[@class='sorting_asc']")).getText());
		Assert.assertEquals(driver.findElement(By.xpath("//th[@class='sorting_asc']")).getText(), "Role Type Cod");
		
		
		
		
		
		
	}

}
