package tesng_Fundamentals;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//Sequence: @BeforeSuite > @BeforeTest > @BeforeClass > @BeforeMethod > @Test > @AfterMethod > @AfterClass > @AfterTest > @AfterSuite
public class First_Program_TestNG {

	@BeforeSuite
	public void beforesuite() {
		System.out.println("This is the before suite method");
	}

	@BeforeTest
	public void beforetest() {
		System.out.println("This is the before test method");
		
	}

	@BeforeClass
	public void beforeclass() {
		System.out.println("This is the before class method");
	}
	
	@BeforeMethod
	public void beforemethod() {
		System.out.println("This is the before method");
	}

	@Test
	public void test() {
		System.out.println("This is the test method");
		
	}

	@AfterMethod
	public void aftermethod() {
		System.out.println("This is the after method");
		
	}

	@AfterClass
	public void afterclass() {
		System.out.println("This is the after class method");
	}

	@AfterTest
	public void aftertest() {
		System.out.println("This is the after test method");
	}

	@AfterSuite
	public void aftersuite() {
		System.out.println("This is the after suite method");
	}

}


