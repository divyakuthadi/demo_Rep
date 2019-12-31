package TestNG_Practise;

import org.testng.annotations.Test;

public class invocationcount {
@Test(invocationCount = 10)
	public void count() {
	System.out.println("**************");
	
}
}
