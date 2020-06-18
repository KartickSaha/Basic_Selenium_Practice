package basic_java;

import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.annotations.Test;

public class TestNG_Practice_2020 {
   /*
    String message = ".com";

    MessageUtil messageUtil = new MessageUtil(message);

    @Test(groups = {"functest"})
    public void testMessageOne() {
        System.out.println("Inside testPrintMessage()");
        message = ".com";
        Assert.assertEquals(message, messageUtil.printMessage());
    }

    @Test(groups = {"checkintest" })
    public void testMessageTwo() {
        System.out.println("Inside testPrintMessage()");
        message = ".com";
        Assert.assertEquals(message, messageUtil.printMessage());
    }

  @Test(groups = { "functest","checkintest" })
    public void testSalutationMessage() {
        System.out.println("Inside testSalutationMessage()");
        message = "tutorialspoint" + ".com";
        Assert.assertEquals(message, messageUtil.salutationMessage());
    }

 /*
    @Test(dependsOnMethods = { "login" })
    public void logOut() {
        System.out.println("Inside testSalutationMessage()");
        message = "Hi!" + "Kartick";
        Assert.assertEquals(message, messageUtil.salutationMessage());
    }
    @Test
    @Parameters("myName")
    public void parameterTest(String myName) {
        System.out.println("Parameterized value is : " + myName);
    }

    @Test(expectedExceptions = ArithmeticException.class)
    public void testPrintMessage() {
        System.out.println("Inside testPrintMessage()");
        messageUtil.printMessage();
    }*/

/*    @Test(groups = { "functest" })

    public void testingExitMessage() {
        System.out.println("Inside testExitMessage()");
        message = "www." + "tutorialspoint"+".com";
        Assert.assertEquals(message, messageUtil.exitMessage());
    }*/
    //multiple line comment out(ctrl+shift+/) after select
    //single line comment out(ctrl+/)  after select






   // test case 1
    //@Test (enabled = false)
    @Test (enabled = true)
    public void testCase1() {
        System.out.println("in test case 1");
    }

    // test case 2
/*    @Test
    public void testCase2() {
        System.out.println("in test case 2");
    }*/

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("in beforeMethod");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("in afterMethod");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("in beforeClass");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("in afterClass");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("in beforeTest");
    }

    @AfterTest
    public void afterTest()
    {
        System.out.println("in afterTest");
        System.out.println("in afterTest");
    }

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("in beforeSuite");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("in afterSuite");
    }








}
