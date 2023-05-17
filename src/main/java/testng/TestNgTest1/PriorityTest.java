package testng.TestNgTest1;

import org.testng.annotations.Test;

public class PriorityTest {

    @Test(priority = 10)
    public void a_test1(){
        System.out.println("Test case 1");
    }

    @Test(priority = -115)
    public void c_test2(){
        System.out.println("Test case 2");
    }

    @Test(priority = 31)
    public void b_test3(){
        System.out.println("Test case 3");
    }
}