package org.vms.testscripts;

import java.io.IOException;
import java.sql.SQLException;

import org.builder.RandomName;
import org.builder.RandomString;
import org.testng.annotations.Test;
import org.vms.base.Base;
import org.vms.pages.CreateRoleType;
import org.vms.pages.LoginPage;
import org.vms.utility.Database;

import junit.framework.Assert;

public class TC002 extends Base {

	@Test
	
	public void testRoleCreate() throws InterruptedException, IOException, SQLException {
		
		LoginPage lp = new LoginPage(driver);
		lp.setLoginId("123");
		lp.setLoginPass("123");
		lp.setLoginButtonClick();
		//Thread.sleep(3000);
		
		String code=RandomString.getAlphaNumericString(10);
		Thread.sleep(4000);
		String name=RandomName.AlphaNumericString(10);
		

		CreateRoleType role = new CreateRoleType(driver);
		role.RoleType();
		role.CreateRole();
		role.RoleTypeCode(code);
		role.RoleTypeName(name);
		role.RList();
		role.Button();
		Database.dataBaseConnection("select * from vms_acl_role_type where role_type_code='"+code+"'");
		String rolecode=Database.result.getString("role_type_code");
		Assert.assertEquals(code, rolecode);
		
	}
}
