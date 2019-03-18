package org.vms.testscripts;

import org.testng.annotations.Test;
import org.vms.base.Base;
import org.vms.pages.LoginPage;

public class TC001 extends Base {

	@Test
	public void testLogin() {

		LoginPage lp=new LoginPage(driver);
		lp.setLoginId("123");
		lp.setLoginPass("123");
		lp.setLoginButtonClick();
		
	}
}
