package testng.TestNgTest1.parametrization;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestWithParam {

    @Test
    @Parameters({"user","pass"})
    void login(String user, String pass){
        System.out.println("1st test : " + user + "======" + pass);
    }
}
