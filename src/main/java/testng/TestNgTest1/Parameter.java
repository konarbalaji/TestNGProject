package testng.TestNgTest1;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class Parameter {

    @Test(enabled = false)
    public void PTest1() {
        System.out.println("Incorrect Login");
    }

    @Test
    public void NTest2() {
        System.out.println("un-Locked account");
    }

    @Test
    public void Test3(){
        String data = "id1";
        if(data.contains("id2"))
            System.out.println("Execute it");
        else
            throw new SkipException("Skip this test");
    }
}