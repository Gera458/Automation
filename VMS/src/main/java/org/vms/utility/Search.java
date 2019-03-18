package org.vms.utility;

import java.util.Scanner;

import org.openqa.selenium.WebElement;

public class Search {
	
	

	public String typecode(String roletypecode)
	{
		Scanner sc = new Scanner(System.in);
		roletypecode = sc.next();
		System.out.println("Enter role type code -"+roletypecode);
		return roletypecode;
	}
	
}
