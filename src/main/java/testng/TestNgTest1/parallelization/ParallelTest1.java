package testng.TestNgTest1.parallelization;

import org.testng.annotations.Test;

public class ParallelTest1 {

    long starttime = 0;
    long endtime = 0;


    @Test(priority = 1)
    public void loginTest1() throws InterruptedException {
        starttime = System.currentTimeMillis();
        Thread.sleep(5000);
        System.out.println("First Thread : " + Thread.currentThread().getId());
    }

    @Test(priority = 2)
    public void loginTest2() throws InterruptedException {
        Thread.sleep(5000);
        System.out.println("2nd Thread : " + Thread.currentThread().getId());
    }

    @Test(priority = 3)
    public void loginTest3() throws InterruptedException {
        Thread.sleep(5000);
        System.out.println("3rd Thread : " + Thread.currentThread().getId());
        endtime = System.currentTimeMillis();

        System.out.println("Tot time taken : " + (endtime-starttime) + " ms");
    }
}
