package testng.TestNgTest1.listeners;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;

public class ListenerTwo implements IInvokedMethodListener {

    public void beforeInvocation(IInvokedMethod method, ITestResult testResult){
        System.out.println("Before method invocation " + testResult.getTestClass().getName() + " ---> " + method.getTestMethod().getMethodName());
    }

    public void afterInvocation(IInvokedMethod method, ITestResult testResult){
        System.out.println("After method invocation " + testResult.getTestClass().getName() + " ---> " + method.getTestMethod().getMethodName());
    }
}
