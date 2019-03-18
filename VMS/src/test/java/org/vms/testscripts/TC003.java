package org.vms.testscripts;

import org.testng.annotations.Test;
import org.vms.base.Base;
import org.vms.pages.LoginPage;
import org.vms.pages.SearchRoleType;
import org.vms.utility.Dropdown;

public class TC003 extends Base {
	
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
		sc.name("");
		//Thread.sleep(2000);
		sc.drop();
		sc.search();
		
		
		
		
		
	}
	
}
