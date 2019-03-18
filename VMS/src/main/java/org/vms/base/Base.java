package org.vms.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base implements Constant {

	public WebDriver driver;
	public Properties prop;

	@BeforeMethod
	public void browserInitiate() throws FileNotFoundException, IOException {
		try {

			FileInputStream fs = new FileInputStream("./config/config.properties");
			prop = new Properties();
			prop.load(fs);

			System.setProperty(driverName, driverLoc);

			driver = new ChromeDriver();
			driver.manage().window().maximize();
			// driver.get(prop.getProperty("URL")); //By Property File
			driver.get(URL); // By interface

			driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		} catch (Exception e) {

			System.out.println("Error Message-" + e);

		}

	}

	/*@AfterMethod
	public void browserClose() {

		driver.close();
	}*/
}
