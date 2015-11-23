package testng.parameter;

import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ParameterizeTest implements ITestListener {

	// *****************************Using data provider************************

	@Test(description = "Learnign parameters", dataProvider = "parameterIntTestProvider", priority = 0, expectedExceptionsMessageRegExp = "", alwaysRun = true, dependsOnMethods = { "calculateSum" })
	public void parameterIntTest(String UserName, String Password) {
		System.out.print("\n********************************************\n");
		System.out.println("UserName " + UserName + "   " + "Password "
				+ Password);
	}

	@DataProvider(name = "Data-Provider-Function", parallel = true)
	public Object[][] parameterIntTestProvider() {

		Object[][] data = new Object[3][2];

		data[0][0] = "UserName1";
		data[0][1] = "UserName1@123";

		data[1][0] = "UserName2";
		data[1][1] = "UserName2@123";

		data[2][0] = "UserName3";
		data[2][1] = "UserName3@123";

		return data;
	}

	@Test(description = "For Calculating sum of three numbers", dataProvider = "provider", priority = 1)
	public void calculateSum(String a, String b, String c) {
		System.out.print("\n********************************************\n");

		int ab = Integer.parseInt(a);
		int bc = Integer.parseInt(b);
		int cd = Integer.parseInt(c);
		int sum = ab + bc + cd;
		System.out.println("Sum Test having Sum " + sum);

		Assert.assertTrue(true, "19");
		System.out.println("Pass");

		System.out.print("\n********************************************\n");
	}

	@DataProvider(name = "provider")
	public Object[][] provider() {
		Object[][] sum = new Object[1][3];
		sum[0][0] = "5";
		sum[0][1] = "6";
		sum[0][2] = "8";
		return sum;

	}

	// **************************** Using XML File *****************************

	// @Parameters({ "browser" })
	// @Test(priority = 2)
	// public void testCaseOne(String browser) {
	// System.out.println("browser passed as :- " + browser);
	// }
	//
	// @Parameters({ "username", "password" })
	// @Test(priority = 3)
	// public void testCaseTwo(String username, String password) {
	// System.out.println("Parameter for User Name passed as :- " + username);
	// System.out.println("Parameter for Password passed as :- " + password);
	// }

	// *************************************************************************

	@Override
	public void onFinish(ITestContext arg0) {
		System.out.println("OnFinish" + arg0.getHost());
		System.out.println("OnFinish" + arg0.getName());
		System.out.println("OnFinish" + arg0.getOutputDirectory());
		System.out.println("OnFinish" + arg0.hashCode());
		System.out.println("OnFinish" + arg0.toString());
		System.out.println("OnFinish" + arg0.equals(""));
		System.out.println("OnFinish" + arg0.getAllTestMethods());
		System.out.println("OnFinish" + arg0.getAttributeNames());
		System.out.println("OnFinish" + arg0.getClass());
		System.out.println("OnFinish" + arg0.getCurrentXmlTest());
		System.out.println("OnFinish" + arg0.getEndDate());
		System.out.println("OnFinish" + arg0.getExcludedGroups());
		System.out.println("OnFinish" + arg0.getExcludedMethods());
		System.out.println("OnFinish"
				+ arg0.getFailedButWithinSuccessPercentageTests());
		System.out.println("OnFinish" + arg0.getFailedConfigurations());
		System.out.println("OnFinish" + arg0.getFailedTests());
		System.out.println("OnFinish" + arg0.getIncludedGroups());
		System.out.println("OnFinish" + arg0.getPassedTests());
		System.out.println("OnFinish" + arg0.getSuite());
	}

	@Override
	public void onStart(ITestContext arg0) {
		System.out.println("OnFinish" + arg0.getHost());
		System.out.println("OnFinish" + arg0.getName());
		System.out.println("OnFinish" + arg0.getOutputDirectory());
		System.out.println("OnFinish" + arg0.hashCode());
		System.out.println("OnFinish" + arg0.toString());
		System.out.println("OnFinish" + arg0.equals(""));
		System.out.println("OnFinish" + arg0.getAllTestMethods());
		System.out.println("OnFinish" + arg0.getAttributeNames());
		System.out.println("OnFinish" + arg0.getClass());
		System.out.println("OnFinish" + arg0.getCurrentXmlTest());
		System.out.println("OnFinish" + arg0.getEndDate());
		System.out.println("OnFinish" + arg0.getExcludedGroups());
		System.out.println("OnFinish" + arg0.getExcludedMethods());
		System.out.println("OnFinish"
				+ arg0.getFailedButWithinSuccessPercentageTests());
		System.out.println("OnFinish" + arg0.getFailedConfigurations());
		System.out.println("OnFinish" + arg0.getFailedTests());
		System.out.println("OnFinish" + arg0.getIncludedGroups());
		System.out.println("OnFinish" + arg0.getPassedTests());
		System.out.println("OnFinish" + arg0.getSuite());
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		System.out.println("OnTestFailure");
		System.out.println(arg0.isSuccess());
		System.out.println(arg0.getAttribute(""));
		System.out.println(arg0.getEndMillis());
		System.out.println(arg0.getHost());
		System.out.println(arg0.getHost());
		System.out.println(arg0.getInstance());
		System.out.println(arg0.getInstanceName());
		System.out.println(arg0.getName());
		System.out.println(arg0.getStartMillis());
		System.out.println(arg0.getStatus());
		System.out.println(arg0.getTestName());
		System.out.println(arg0.hashCode());
		System.out.println(arg0.isSuccess());
		System.out.println(arg0.toString());
		System.out.println(arg0.getAttributeNames());
		System.out.println(arg0.getClass());
		System.out.println(arg0.getMethod());
		System.out.println(arg0.getParameters());
		System.out.println(arg0.getTestContext());
	}

	@Override
	public void onTestFailure(ITestResult arg0) {
		System.out.println(arg0.getName() + " has failed");
	}

	@Override
	public void onTestSkipped(ITestResult arg0) {
		System.out.println("OnSkipped");
	}

	@Override
	public void onTestStart(ITestResult arg0) {
		System.out.println("OnTestStart");
	}

	@Override
	public void onTestSuccess(ITestResult arg0) {
		System.out.println("onTestSuccess");
	}
}
