package TestNG.TestNGBasics;

import org.testng.annotations.*;

public class BeforeAndAfterClassExample {

    @BeforeClass //BeforeClass runs once before 1st Test Case executes
    public void beforeClassExample(){
        System.out.println("BEFORE CLASS");

    }

    @AfterClass  //AfterClass runs once after last Test Case executes
    public void afterClassExample() {
        System.out.println("AFTER CLASS");
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

}

