package testng.TestNgTest1.parallelization;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ParallelTest2 {




    @Test
    public void googleTest() throws InterruptedException {
        WebDriver driver;
        System.out.println("1st test case is executing : " + Thread.currentThread().getName());
        System.setProperty("webdriver.chrome.driver", "D:\\SW\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.google.com");
        String title = driver.getTitle();
        Assert.assertEquals(title, "Google");

        Thread.sleep(2000);
        driver.close();

    }

    @Test
    public void facebookTest() throws InterruptedException {

        WebDriver driver;
        System.out.println("1st test case is executing : " + Thread.currentThread().getName());
        System.setProperty("webdriver.chrome.driver", "D:\\SW\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
        String title = driver.getTitle();
        Assert.assertEquals(title, "Facebook – log in or sign up");

        Thread.sleep(2000);
        driver.close();

    }


}
