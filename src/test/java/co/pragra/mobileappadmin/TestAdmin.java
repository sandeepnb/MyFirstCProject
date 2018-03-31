package co.pragra.mobileappadmin;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestAdmin {
	
	
	
	@AfterSuite
	public void tearDown()
	{
		
		System.out.println("Mobile App UnInstalled");
	}
	
	
	@BeforeTest
	public void  logAdmin()
	{
		
		System.out.println("Logged as Admin");
	}

	@BeforeTest
	public void login()
	{
		System.out.println("login as Admin");
	}
	
	@AfterTest
	public void logOut(){
		
		System.out.println("logout as Admin");
		
	}
	
	
	@Test
	public void tc01()
	{
		
		System.out.println("tc1");
	}
	
	@Test
	public void tc02()
	{
		
		System.out.println("tc2");
	}
	
}
