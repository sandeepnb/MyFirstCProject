package co.pragra.mobileapp;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


// This is to test !!!!
public class TestUser {
	
	
	
	@BeforeSuite
	public void setUp()
	{
			System.out.println("Mobile app installed");
		
	}
	
	@Parameters({"username","password"})
	@BeforeTest
	public void loginUser(String username, String password)
	{
		System.out.println("Logged in  Username "+username +"Password is "+password);
	}
	

	@BeforeClass
	public void prepareTest()
	{
		
		int[][] array={{1,2},{2,3}};
		
		List<Integer[]> l=new ArrayList<Integer[]>();
		System.out.println("Sample Post Done");
		Integer[] arr={1,2};
		l.add(arr);
	}
	
	
	@DataProvider
	public Object[][] myDataProvider()
	{
		
		Object[][] ob={{"Sandeep",1234},{"Poonam",4567},{"Smita",2233}};
		
		return ob;
	}
	
	
	
	@Test(groups={"regressions","smoke"})
	public void testComments()
	{
		System.out.println("Test Comments");
		
	}
	
	
	@Test(dataProvider="myDataProvider", groups={"smoke"})
	public void testLike(String user,int pass)
	{
		
		System.out.println("username is *** "+user+" Password is ***"+pass);
		
		
		System.out.println("Test Like");
		
	}
}
