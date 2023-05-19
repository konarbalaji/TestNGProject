package testng.TestNgTest1.dataprovider;

import org.testng.annotations.DataProvider;

public class DataProviderClassTest {

    @DataProvider(name = "login")
    public static Object[][] getData(){

        return new Object[][]{
                {"Balaji1","pwd1"},
                {"Balaji2","pwd2"},
                {"Balaji3","pwd3"},
                {"Balaji4","pwd4"},
        };
    }

    @DataProvider(name = "singUp")
    public static Object[][] singUp(){

        return new Object[][]{
                {"Balaji1","pwd1"},
                {"Balaji2","pwd2"},
                {"Balaji3","pwd3"},
                {"Balaji4","pwd4"},
        };
    }
}
