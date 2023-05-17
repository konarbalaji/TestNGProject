package testng.TestNgTest1;

import org.testng.annotations.Test;

public class PriorityTest1 {

    @Test
    public void openBrowser(){
        System.out.println("Test Case - Open the browser");
    }

    @Test(dependsOnMethods = {"SignIn"})
    public void Logout(){
        System.out.println("Test Case - Logout");
    }

    @Test(dependsOnMethods = {"openBrowser"})
    public void SignIn(){
        System.out.println("Test Case - SignIn");
    }
}