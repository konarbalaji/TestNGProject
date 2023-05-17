package testng.TestNgTest1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test2 {

    @Test
    void googleTitleTest() {
        System.setProperty("webdriver.chrome.driver","D:\\SW\\chromedriver_win32\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        Reporter.log("Launch the browser");
        driver.get("https://www.google.com");
        Reporter.log("Enter the URL");

        String expectedTitle = "Google";
        String actualTitle = driver.getTitle();

        System.out.println("actualTitle : " + actualTitle);

        try{
            Assert.assertEquals(actualTitle, expectedTitle);
            System.out.println("TEST PASS");
        }catch(Exception e){
            System.out.println("FAIL : " + e.getMessage());
        }finally {
            System.out.println("Closing driver");
            driver.close();
            System.out.println("Quitting driver");
            driver.quit();
        }
    }

    @Test
    void googleTest2(){
        System.out.println("Test case 2");
    }

    @Test
    void googleTest3(){
        System.out.println("Test case 3");
    }

}