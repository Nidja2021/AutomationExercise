package com.automationexercise.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;

public class Register extends BasePage {

    @FindBy(xpath = "//input[@data-qa='signup-name']")
    private WebElement signUpName;

    @FindBy(xpath = "//input[@data-qa='signup-email']")
    private WebElement signUpEmail;

    @FindBy(xpath = "//button[text()='Signup']")
    private WebElement signUpButton;

    @FindBy(xpath = "//input[@name='title']")
    private List<WebElement> title;

    @FindBy(id = "name")
    private WebElement name;

    @FindBy(id = "email")
    private WebElement email;

    @FindBy(id = "days")
    private WebElement days;

    @FindBy(id = "months")
    private WebElement months;

    @FindBy(id = "years")
    private WebElement years;

    @FindBy(id = "password")
    private WebElement password;

    @FindBy(id = "newsletter")
    private WebElement newsletter;

    @FindBy(id = "optin")
    private WebElement optin;

    @FindBy(id = "first_name")
    private WebElement firstname;

    @FindBy(id = "last_name")
    private WebElement lastname;

    @FindBy(id = "company")
    private WebElement company;

    @FindBy(id = "address1")
    private WebElement address1;

    @FindBy(id = "address2")
    private WebElement address2;

    @FindBy(id = "country")
    private WebElement country;

    @FindBy(id = "state")
    private WebElement state;

    @FindBy(id = "city")
    private WebElement city;

    @FindBy(id = "zipcode")
    private WebElement zipcode;

    @FindBy(id = "mobile_number")
    private WebElement mobileNumber;

    @FindBy(xpath = "//button[text()='Create Account']")
    private WebElement createAccountButton;

    @FindBy(xpath = "//a[normalize-space()='Continue']")
    private WebElement continueButton;

    @FindBy(xpath = "//a[normalize-space()='Delete Account']")
    private WebElement deleteAccountButton;

    @FindBy(xpath = "//li[10]//a[1]")
    private WebElement loggedUser;

    public Register(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void setSignUpName(String name) {
        writeText(this.signUpName, name);
    }

    public void setSignUpEmail(String email) {
        writeText(this.signUpEmail, email);
    }

    public void clickSignUpButton() {
        click(signUpButton);
    }

    public void setTitle(String value) {
        for (WebElement element : title) {
            if (element.getAttribute("value").equals(value)) {
                click(element);
            }
        }
    }

    public void setName(String name) {
        writeText(this.name, name);
    }

    public void setEmail(String email) {
        writeText(this.email, email);
    }

    public void setPassword(String password) {
        writeText(this.password, password);
    }

    public void selectDay(String option) {
        Select day = new Select(this.days);
        day.selectByValue(option);
    }

    public void selectMonth(String option) {
        Select month = new Select(this.months);
        month.selectByValue(option);
    }

    public void selectYear(String option) {
        Select year = new Select(this.years);
        year.selectByValue(option);
    }

    public void clickNewsletter() {
        scrollToElement(this.newsletter);
        click(this.newsletter);
    }

    public void clickOptin() {
        click(optin);
    }

    public void setFirstname(String firstname) {
        writeText(this.firstname, firstname);
    }

    public void setLastname(String lastname) {
        writeText(this.lastname, lastname);
    }

    public void setCompany(String company) {
        writeText(this.company, company);
    }

    public void setAddress1(String address1) {
        writeText(this.address1, address1);
    }

    public void setAddress2(String address2) {
        writeText(this.address2, address2);
    }

    public void selectCountry(String option) {
        Select countrySelect = new Select(country);
        countrySelect.selectByVisibleText(option);
    }

    public void setState(String state) {
        scrollToElement(this.state);
        writeText(this.state, state);
    }

    public void setCity(String city) {
        writeText(this.city, city);
    }

    public void setZipcode(String zipcode) {
        writeText(this.zipcode, zipcode);
    }

    public void setMobileNumber(String mobileNumber) {
        writeText(this.mobileNumber, mobileNumber);
    }

    public void clickCreateAccountButton() {
        click(createAccountButton);
    }

    public void clickContinueButton() {
        click(continueButton);
    }

    public String readTextLoggedUser() {
        System.out.println(readText(loggedUser));
        return readText(loggedUser);
    }

    public void clickDeleteAccountButton() {
        click(deleteAccountButton);
    }

}
