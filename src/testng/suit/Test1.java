package testng.suit;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test1 {
	String message = "Suit";
	MessageUtil messageUtil = new MessageUtil(message);

	@Test
	public void testPrintMessage() {
		System.out.println("Inside testPrintMessage()");
		Assert.assertEquals(message, messageUtil.printMessage());
		
	}
}