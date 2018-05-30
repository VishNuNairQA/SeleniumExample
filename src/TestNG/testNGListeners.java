package TestNG;

import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class testNGListeners implements ITestListener, ISuiteListener{
	
	//Listeners, as the name suggests listens to what is happening in the Selenium Script and behaves accordingly,
	//There are different types of TestNG listeners, such as
	// 1. IHookable 2. ITestListener 3. ISuiteListene 4. IAnnotationTransformer
	
	//Some of the methods defined inside ITestListener are as: onStart, onFinish, onTestSuccess, onTestFailure and onTestSkipped

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Test Passed: " +result.getClass()+ " Method Name: " +result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		
		System.out.println("Test Failed: " +result.getClass()+ " Method Name: " +result.getName());
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ISuite suite) {
		// TODO Auto-generated method stub
		System.out.println("Suite Execution started");
		
	}

	@Override
	public void onFinish(ISuite suite) {
		// TODO Auto-generated method stub
		System.out.println("Suite Execution finished");
	}

}
