package tesng_Fundamentals;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AlwaysRun {

	@Test
	public void signin() {
		System.out.println("Signin page");
		Assert.fail();
	}	
	
	@Test(dependsOnMethods="signin", alwaysRun=true) //even though we have purposely failed the above test on which this test is dependent, this will run
	public void signout() {
		System.out.println("Signout page");
		
	}
}
