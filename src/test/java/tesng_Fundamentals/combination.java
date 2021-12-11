package tesng_Fundamentals;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class combination {

	@BeforeMethod
	public void beforemethod() {
		System.out.println("This is the before method");
	}	
	
	@Test
	public void test() {
		System.out.println("This is only the test method");
	}
	
	@AfterMethod
	public void aftermethod() {
		System.out.println("This is the after method");
		
	}
	
}
