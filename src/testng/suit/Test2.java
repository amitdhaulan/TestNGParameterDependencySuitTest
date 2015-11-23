package testng.suit;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test2 {
	String message = "Suit";
	MessageUtil messageUtil = new MessageUtil(message);

	@Test
	public void testSalutationMessage() {
		System.out.println("Inside testSalutationMessage()");
		message = "Hi!" + "Suit";
		Assert.assertEquals(message, messageUtil.salutationMessage());
	}
}