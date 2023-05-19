package testng.TestNgTest1.listeners;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListenerOne.class)
public class Test1 {

    @Test
    void test1(){
        System.out.println("Test One");
        Assert.assertTrue(true);
    }

    @Test
    void test2(){
        System.out.println("Test Two");
        Assert.assertTrue(false);
    }

}