package testng.TestNgTest1.parametrization;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestWithParam2 {

    @Test
    @Parameters({"user","pass"})
    void login(String user, String pass){
        System.out.println("2nd test : " + user + "======" + pass);
    }
}
