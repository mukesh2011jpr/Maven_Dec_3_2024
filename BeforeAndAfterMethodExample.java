package TestNG.TestNGBasics;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeAndAfterMethodExample {

    @BeforeMethod
    public void setup(){
        System.out.println("Before Method");
    }

    @Test
    public void testCase1(){
        System.out.println("Test Case 1");
    }

    @Test
    public void testCase2(){
        System.out.println("Test Case 2");
    }

    @Test
    public void testCase3(){
        System.out.println("Test Case 3");
    }

    @AfterMethod
    public void tearDown(){
        System.out.println("Method Close");
    }
}
