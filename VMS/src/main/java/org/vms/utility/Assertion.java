package org.vms.utility;

import org.testng.Assert;

public class Assertion {

	
	public static void assertion(String actual, String expected)
	{
		
		Assert.assertEquals(actual, expected);
		
	}
	
	
}
