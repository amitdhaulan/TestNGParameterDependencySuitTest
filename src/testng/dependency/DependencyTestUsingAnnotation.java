package testng.dependency;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyTestUsingAnnotation {
	String message = "Dependency";
	MessageUtil messageUtil = new MessageUtil(message);

	@Test(priority = 0)
	public void testPrintMessage() {
		System.out.println("Inside testPrintMessage()");
		message = "Dependency";
		Assert.assertEquals(message, messageUtil.printMessage());
	}

	@Test(dependsOnMethods = { "initEnvironmentTest" }, priority = 2)
	public void testSalutationMessage() {
		System.out.println("Inside testSalutationMessage()");
		message = "Hi!" + "Dependency";
		Assert.assertEquals(message, messageUtil.salutationMessage());
	}

	@Test(enabled = true, priority = 1)
	public void initEnvironmentTest() {
		System.out.println("This is initEnvironmentTest");
	}
	
	
}