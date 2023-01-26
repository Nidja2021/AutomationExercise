package com.automationexercise.testCases;

import com.automationexercise.pageObject.HomePage;
import com.automationexercise.pageObject.Register;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_Register_001 extends BaseTest {

    private final String username = "joe";

    @Test
    public void register() {
        // Home Page
        HomePage homePage = new HomePage(driver);
        if (driver.getTitle().equals("Automation Exercise")) {
            logger.info("Home Page successfully loaded.");
        } else {
            logger.info("Home Page unsuccessfully loaded.");
            Assert.fail();
        }
        homePage.clickSignUpLoginLink();
        logger.info("Link Signup / Login clicked.");

        if (driver.getPageSource().contains("New User Signup")) {
            logger.info("'New User Signup' is visible.");
        } else {
            logger.info("'New User Signup' is not visible.");
            Assert.fail();
        }

        Register register = new Register(driver);
        register.setSignUpName(username);
        logger.info("Signup name entered.");
        register.setSignUpEmail("joe@gmail.com");
        logger.info("Signup email entered.");
        register.clickSignUpButton();

        if (driver.getPageSource().contains("Enter Account Information")) {
            logger.info("'ENTER ACCOUNT INFORMATION' is visible.");
        } else {
            logger.error("'ENTER ACCOUNT INFORMATION' is not visible.");
            Assert.fail();
        }

//        register.setTitle("Mr");
//        register.setName("joe");
//        register.setEmail("joe@gmail.com");

        register.setPassword("Pass123#");
        register.selectDay("18");
        register.selectMonth("7");
        register.selectYear("1986");
        register.clickNewsletter();
        register.clickOptin();
        register.setFirstname("joe");
        register.setLastname("Doe");
        register.setCompany("Company Name");
        register.setAddress1("Address 1");
        register.setAddress2("Address 2");
        register.selectCountry("Canada");
        register.setState("CA");
        register.setCity("Ottawa");
        register.setZipcode("12345");
        register.setMobileNumber("(123) 45 6789");
        register.clickCreateAccountButton();
        logger.info("Create Account Button clicked.");

        if (driver.getPageSource().contains("Account Created!")) {
            logger.info("'ACCOUNT CREATED!' is visible.");
        } else {
            logger.info("'ACCOUNT CREATED!' is not visible.");
            Assert.fail();
        }

        register.clickContinueButton();
        logger.info("Continue Button clicked.");



        if (register.readTextLoggedUser().equals("Logged in as " + username)) {
            logger.info("'Logged in as '" + username + " is visible.");
        } else {
            logger.info("'Logged in as '" + username + " is not visible.");
            Assert.fail();
        }

//        if (driver.getPageSource().contains(" Logged in as ")) {
//            logger.info("'Logged in as '" + username + " is visible.");
//        } else {
//            logger.info("'Logged in as '" + username + " is not visible.");
//            Assert.fail();
//        }

        register.clickDeleteAccountButton();
        logger.info("Delete Account Button clicked.");

        if (driver.getPageSource().contains("Account Deleted!")) {
            logger.info("'ACCOUNT DELETED!' is visible.");
        } else {
            logger.info("'ACCOUNT DELETED!' is not visible.");
            Assert.fail();
        }

        register.clickContinueButton();
        logger.info("Continue Button clicked.");
        logger.info("Register Test passed.");

        Assert.assertTrue(true);
    }
}
