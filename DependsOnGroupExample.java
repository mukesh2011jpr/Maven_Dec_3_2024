package TestNG.TestNGBasics;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnGroupExample {


    @Test(groups = {"smoke"})
    public void loginFunctionality(){
        Assert.assertTrue(false); // If parent test case failed then child class also failed
    }
    @Test(dependsOnGroups = {"smoke"})
    public void verifyHomePage(){
        System.out.println("Home Page Validation");
    }
    @Test(description = "Verify New account creation with valid data")
    public void onboarding(){
        System.out.println("Onboarding");
    }
}
