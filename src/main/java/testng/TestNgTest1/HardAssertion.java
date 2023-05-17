package testng.TestNgTest1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertion {

    String classname = "HardAssertion";

    @Test
    public void test_UsingHardAssertion(){
        Assert.assertTrue(true == true);
        Assert.assertEquals("HardAssertion","HardAssertion1");
        Assert.assertEquals(classname, "HardAssertion");
        System.out.println("Successfully Passed !");
    }

    @Test
    public void test_UsingHardAssertion2(){
        Assert.assertTrue(true == true);
        Assert.assertEquals("HardAssertion","HardAssertion");
        Assert.assertEquals(classname, "HardAssertion");
        System.out.println("Successfully Passed !");
    }
}