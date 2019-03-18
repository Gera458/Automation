package org.vms.testscripts;

import java.io.IOException;
import java.sql.SQLException;

import org.builder.RandomName;
import org.builder.RandomString;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.vms.base.Base;
import org.vms.pages.CreateRoleType;
import org.vms.pages.LoginPage;
import org.vms.utility.Logs;
import org.vms.utility.Screenshot;
import org.vms.utility.Database;

public class CreateRoleTestscript extends Base
{
	//String role_Name="";
	@Test(invocationCount=2)
public void testRoleCreate() throws InterruptedException, IOException, SQLException {
		
		
		try {
			LoginPage lp = new LoginPage(driver);
			lp.setLoginId("123");
			lp.setLoginPass("123");
			lp.setLoginButtonClick();
			Thread.sleep(3000);
			
			String code=RandomString.getAlphaNumericString(5);
			Thread.sleep(3000);
			String name=RandomName.AlphaNumericString(5);
			

			CreateRoleType role = new CreateRoleType(driver);
			role.RoleType();
			role.CreateRole();
			
			role.RoleTypeCode(code);
			
			role.RoleTypeName(name);
			role.RList();
			role.Button();
			Assert.assertEquals(role.verify(), true);
			System.out.println("code--------->"+code);
			System.out.println("name------>"+name);
			Database.dataBaseConnection("select * from vms_acl_role_type where role_type_code='"+code+"'");
			Thread.sleep(5000);

			String rolecode=Database.result.getString("role_type_code");
            Assert.assertEquals(code, rolecode);
//Assert.assertEquals(name, rolename);
 
 Logs.takeLog("CreateRoleTestscript", "Pass");
		
} 
		
		catch (Exception e) {
			
			Logs.takeLog("CreateRoleTestscript","Fail" );
			Screenshot.TakescreenShot(driver, "C:\\Users\\Mukul\\git\\VMS_FrontEnd_Test_Cases\\VMS_1\\ScreenShot\\screen.png");
			
			
			System.out.println("Failed" +e);
		}
	 
	}

}
