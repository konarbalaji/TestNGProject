package testng.TestNgTest1.listeners;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Test2 {

    @Test
    void test3(){
        System.out.println("Test Three");
        Assert.assertTrue(true);
    }

    @Test
    void test4(){
        System.out.println("Test Four");
        Assert.assertTrue(false);
    }

    @AfterMethod
    public void afterMethod(ITestResult result){
        if(result.getStatus()==ITestResult.SUCCESS){
            System.out.println(result.getMethod().getMethodName() + " has PASSED");
        } else if(result.getStatus()==ITestResult.FAILURE){
            System.out.println(result.getMethod().getMethodName() + " has FAILED");
        }else if(result.getStatus()==ITestResult.SKIP){
            System.out.println(result.getMethod().getMethodName() + " has SKIPPED");
        }

    }


}
