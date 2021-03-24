package dayone.org;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class MultiTest {
	@BeforeClass
	public static void browserLaunch() {
		System.out.println("BrowserLaunch");

	}
		@AfterClass
		public static void browserQuit() {
			System.out.println("Browser Quit");

		}
		@Test
		public void testOne() {
			System.out.println("Test1");

		}
		@Test
		public void testTwo() {
			System.out.println("Test2");

		}
		@Test
		public void testThree() {
			System.out.println("Test3");
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
