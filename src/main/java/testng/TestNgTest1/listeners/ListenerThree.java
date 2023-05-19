package testng.TestNgTest1.listeners;

import org.testng.ISuite;
import org.testng.ISuiteListener;

public class ListenerThree implements ISuiteListener {

    @Override
    public void onStart(ISuite suite) {
        System.out.println("Before Suite Start -- Initialize all the connection ");
    }

    @Override
    public void onFinish(ISuite suite) {
        System.out.println("After Suite Start -- Release all the connection");
    }
}
