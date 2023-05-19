package testng.TestNgTest1.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerOne implements ITestListener {

    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("The name of test case started is : " + result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("The name of test case success is : " + result.getName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("The name of test case failed is : " + result.getName());
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("The name of test case skipped is : " + result.getName());
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        System.out.println("The name of test case FailedButWithinSuccessPercentage is : " + result.getName());
    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {
        System.out.println("The name of test case TestFailedWithTimeout is : " + result.getName());
    }
}
