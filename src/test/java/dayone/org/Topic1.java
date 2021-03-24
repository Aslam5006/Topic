package dayone.org;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Topic1 {

	
	@BeforeClass
	public static void browserLaunch() {
		System.out.println("Browser Launch");
	}
	@AfterClass
	public static void browserQuit() {
		System.out.println("Browser Quit");
	}
	@Before
	public  void startDate() {
		Date d = new Date();
		System.out.println(d+"@before");

	}
	@After
	public void endDate() {
		Date date = new Date();
		System.out.println(date+"@after");

	}
	@Test
	public void tc1() {
		System.out.println("content");

	}
	
	private void sysout() {
		// TODO Auto-generated method stub

	}
	
}
