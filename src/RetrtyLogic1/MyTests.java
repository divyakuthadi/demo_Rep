package RetrtyLogic1;

import org.testng.Assert;
import org.testng.annotations.Test;



public class MyTests {
	@Test(retryAnalyzer=retrylogic2.analyser.class)
	public void sum() {
		
	
	
Assert.assertEquals(false,true);
	
	}
}
	/*@Test
	public void Mul() {
		
	
	int a = 10;
	int b = 20;
	int c = a * b;
	System.out.println("the vaue of c is:"  +c);
	

}
@Test
	public void Div() {
		
		
		int a = 20;
		int b = 10;
		int c = a * b;
		System.out.println("the vaue of c is:"  +c);
		

	}}*/

