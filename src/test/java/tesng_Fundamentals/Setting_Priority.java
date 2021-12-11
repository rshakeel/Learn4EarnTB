package tesng_Fundamentals;

import org.testng.annotations.Test;

public class Setting_Priority {

	@Test(priority=0, enabled = false)
	public void Apple() {
		System.out.println("Alphabet A");
	}
	
	@Test(priority=1)
	public void Ball() {
		System.out.println("Alphabet B");
	}
	
	@Test(priority=-1)
	public void Cat() {
		System.out.println("Alphabet C");
	}
}
