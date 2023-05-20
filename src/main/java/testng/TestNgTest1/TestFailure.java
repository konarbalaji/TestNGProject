package testng.TestNgTest1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestFailure {

    @Test
    public void Test1() {
        System.out.println("test 1");
    }

    @Test
    public void Test2() {
        System.out.println("test 2");
    }

    @Test
    public void Test3() {
        System.out.println("test 3");
        Assert.assertTrue(false);
    }

    @Test
    public void Test4() {
        System.out.println("test 4");
        Assert.assertTrue(false);
    }
}
