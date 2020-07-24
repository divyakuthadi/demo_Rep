package Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class demo {
	SoftAssert assert1 = new SoftAssert();
	@Test
	public void soft() {
		
	System.out.println("launch1");
	Assert.assertEquals(true, true);

	System.out.println("launch2");

	System.out.println("launch3");
	assert1.assertEquals(false, true);
	System.out.println(" executed");

	System.out.println("launch4");

	System.out.println("launch5");
	assert1.assertAll();
	

}
}