package testng.TestNgTest1;

import org.testng.annotations.*;

public class AnnotationTest {

    @Test(enabled = true)
    public void testCase1(){
        System.out.println("In test case 1");
    }

    @Test(enabled = false)
    public void testCase2(){
        System.out.println("In test case 2");
    }

    @BeforeMethod
    public void BeforeMethod(){
        System.out.println("in BeforeMethod");
    }

    @AfterMethod
    public void AfterMethod(){
        System.out.println("In AfterMethod");
    }

    @BeforeClass
    public void BeforeClass(){
        System.out.println("In BeforeClass");
    }

    @AfterClass
    public void AfterClass(){
        System.out.println("In AfterClass");
    }

    @BeforeSuite
    public void BeforeSuite(){
        System.out.println("In BeforeSuite");
    }

    @AfterSuite
    public void AfterSuite(){
        System.out.println("In AfterSuite");
    }




}
