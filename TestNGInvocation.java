package TestNG.TestNGBasics;

import org.testng.annotations.Test;

public class TestNGInvocation {

    @Test(invocationCount=5,invocationTimeOut = 2)
    public void repeatingTestClassExample(){
        System.out.println("Repeating Test Case Example");
    }
}
