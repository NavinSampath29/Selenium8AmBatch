package Day18;

import org.testng.annotations.Test;

public class InvocationCount {
	
	@Test(invocationCount = 100, invocationTimeOut = 1000 )
	public void click5time()
	{
		System.out.println("Clickng 100 times");
	}

}
