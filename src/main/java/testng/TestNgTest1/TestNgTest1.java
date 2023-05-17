package testng.TestNgTest1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNgTest1 {

    /*@Test(invocationCount = 3)
    void test1() {
        System.out.println("Hello");
    }

    @Test
    void test2() {
        System.out.println("Hello2");
    }*/

    @Test
    void login(){
        Assert.assertTrue(true);
        System.out.println("Login Success");
    }

    @Test(dependsOnMethods = "login")
    void sendEmail(){
        Assert.assertTrue(false);
        System.out.println("Email sent Success");
    }

    @Test(dependsOnMethods = "login", alwaysRun = true)
    void logout(){
        Assert.assertTrue(true);
        System.out.println("Logout Success");
    }
}