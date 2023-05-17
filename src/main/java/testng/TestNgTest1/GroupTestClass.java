package testng.TestNgTest1;

import org.testng.annotations.Test;

public class GroupTestClass {

    @Test(groups = {"sanity","Regression"})
    public void Sanity1(){
        System.out.println("sanity test 1");
    }

    @Test(groups = {"sanity","Regression"})
    public void Sanity2(){
        System.out.println("sanity test 1");
    }

    @Test(groups = {"Smoke","Regression"})
    public void SmokeTest1(){
        System.out.println("Smoke test 1");
    }

    @Test(groups = {"Smoke","Regression"})
    public void SmokeTest2(){
        System.out.println("Smoke test 2");
    }

    @Test(groups = {"Regression"})
    public void Regression(){
        System.out.println("Regression test 1");
    }


}
