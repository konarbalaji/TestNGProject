package testng.TestNgTest1.assertion;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {

    SoftAssert softAssert = new SoftAssert();
    String className = "SoftAssertion";

    @Test
    public  void test_usingSoftAssertion(){

        softAssert.assertTrue(true == true);
        softAssert.assertEquals("SoftAssert","SoftAssertion");
        softAssert.assertEquals(className,"SoftAssertion");
        System.out.println("Last statement gets executed ! ");
        softAssert.assertAll();

    }

    @Test
    public  void test_usingSoftAssertion2(){

        softAssert = new SoftAssert();
        softAssert.assertTrue(true == true);
        softAssert.assertEquals("SoftAssertion","SoftAssertion");
        softAssert.assertEquals(className,"SoftAssertion");
        System.out.println("Last statement gets executed ! ");
        softAssert.assertAll();

    }
}
