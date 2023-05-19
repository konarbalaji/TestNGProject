package testng.TestNgTest1.listeners;

import org.testng.Assert;
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


}
