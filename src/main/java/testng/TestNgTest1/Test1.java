package testng.TestNgTest1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test1 {

    @Test
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","D:\\SW\\chromedriver_win32\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");

        String expectedTitle = "Google";
        String actualTitle = driver.getTitle();

        System.out.println("actualTitle : " + actualTitle);

        try{
            Assert.assertEquals(actualTitle, expectedTitle);
        }catch(Exception e){
            System.out.println("FAIL : " + e.getMessage());
        }finally {
            System.out.println("Closing driver");
            driver.close();
            System.out.println("Quitting driver");
            driver.quit();
        }
    }
}