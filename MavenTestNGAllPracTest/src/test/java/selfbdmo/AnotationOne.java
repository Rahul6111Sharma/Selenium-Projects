package selfbdmo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnotationOne {

	@BeforeClass  
	public void BeforeClassMethod()
	{
		System.out.println("Befor Class Execuion");
	}
	@BeforeMethod
	public void TestThreeMethod()
	{
		System.out.println("Before the execution of every method but after Class");
	}
	@AfterClass
	public void TestFourMethod()
	{
		System.out.println("This will execute in the last");
	}


	@Test
	public void TestOne(){
		System.out.println("Test One");
	}
	@Test
	public void TestTwo(){
		System.out.println("Test Two");
	}
	
}
