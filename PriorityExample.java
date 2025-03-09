package TestNG.TestNGBasics;

import org.testng.annotations.Test;

public class PriorityExample {

    @Test(priority = 1, groups = {"smoke"})
    public void testCaseZ()
    {
        System.out.println("Test Caes Z");
    }

    @Test(priority = -2)
    public void testCaseC(){
        System.out.println("Test Case C");
    }

    @Test(priority = 3, groups = {"smoke"})
    public void testCaseM(){
        System.out.println("Test Case M");

    }

    @Test(priority = 4,groups = {"smoke"})
    public void testCaseP(){
        System.out.println("Test Case P");
    }
    @Test(enabled = true)
    public void testCaseA()
    {
        System.out.println("Test case A");
    }
}
