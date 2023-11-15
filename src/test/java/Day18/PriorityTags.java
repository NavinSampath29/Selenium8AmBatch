package Day18;

import org.testng.annotations.Test;

public class PriorityTags {
	
	@Test(priority = 1) // Mainmethod
	public void tc01() {
		System.out.println("Test case one is executed");
	}
	
	@Test (priority = 3)// Mainmethod
	public void tc02() {
		System.out.println("Second case one is executed");
	}
	
	@Test (priority = 2)// Mainmethod
	public void tc03() {
		System.out.println("Third case one is executed");
	}
	
	@Test(priority = 5) // Mainmethod
	public void tc04() {
		System.out.println("Four case one is executed");
	}
	
	@Test(priority = 4) // Mainmethod
	public void tc05() {
		System.out.println("Five case one is executed");
	}
	
	

}
