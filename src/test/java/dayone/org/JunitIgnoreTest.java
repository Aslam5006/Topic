package dayone.org;


import java.sql.Driver;
import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import baseclass.org.LiGlobal;

public class JunitIgnoreTest extends LiGlobal {

	@BeforeClass
    public static void browserLaunch() {
	System.out.println("BrowserLaunch");
	loadBrowser();	
	

}
	@AfterClass
	public static void browserQuit() {
		System.out.println("Browser Quit");
		}
	@Test
	public void testOne() {
		System.out.println("Test1");
		loadUrl("https://www.facebook.com/");
		toMaximize();
		WebElement txtUser = driver.findElement(By.name("email"));
		toType(txtUser, "Rajesh");
		WebElement txtpass = driver.findElement(By.name("pass"));
		toType(txtpass, "Rajesh");
		
	}
	
	@Test
	public void testTwo() {
		System.out.println("Test2");
		loadUrl("https://www.facebook.com/");
		toMaximize();
	
		WebElement txtUser = driver.findElement(By.name("email"));
		toType(txtUser, "Rajesh");

		WebElement txtpass = driver.findElement(By.name("pass"));
		toType(txtpass, "Rajesh");

		

	}
	@Test
	public void testThree() {
		System.out.println("Test3");
			WebElement txtUser = driver.findElement(By.name("email"));
		toType(txtUser, "Rajesh");

		WebElement txtpass = driver.findElement(By.name("pass"));
		toType(txtpass, "Rajesh");


	}

	
	
	
	@After
	public void endDate() {
		Date d = new Date();
		System.out.println(d+"After");
	}
	@Before
	public void startDate() {
		Date d = new Date();
		System.out.println(d+"Before");

	}
}
