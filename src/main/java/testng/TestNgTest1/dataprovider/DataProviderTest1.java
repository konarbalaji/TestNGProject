package testng.TestNgTest1.dataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest1 {

    @Test(dataProvider = "singUp", dataProviderClass = DataProviderClassTest.class)
    void loginTest(String user, String pass){
        System.out.println("Start Testing");
        System.out.println(user + "-----------" + pass);
        System.out.println("End Testing");
    }
}