package com.endomondo.project.page.object;

import lombok.Setter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class SignupPage {

    private WebElement email;
    private WebElement password;
    private WebElement firstName;
    private WebElement lastName;
    WebDriver driver;
    @FindBy (xpath = "//select[@name='day']")
    WebElement dayDropdownList;
    @FindBy (xpath = "//select[@name='country']")
    WebElement countryDropdownList;
    @FindBy(className = "eoCheckbox-label")
    WebElement checkboxDataPrivacy;
    @FindBy(xpath = "//span[@class='ng-binding ng-scope']")
    WebElement signupButton;
    @FindBy (xpath = "//span[@class='ng-scope']")
    WebElement acceptAndContinueButton;


    //initialization of the constructor
    public SignupPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this); }

    public void setEmailForSignup(String email_inp) {
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        email.clear();
        email.sendKeys(email_inp);
    }

    public void setPassword(String password_input) {

        password.sendKeys(password_input);
    }
    public void setFirstName(String firstName_input) {

        firstName.sendKeys(firstName_input);
    }
    public void setLastName(String lastName_input) {

        lastName.sendKeys(lastName_input);
    }

    public void selectDayFromDropdownList(String day) {
        Select dayDropdown = new Select(dayDropdownList);
        dayDropdown.selectByVisibleText(day);
    }
    public void selectCountryFromDropdownList(String country){
        Select countryDropdown = new Select(countryDropdownList);
        countryDropdown.selectByVisibleText(country);
    }
    public void selectCheckbox(){

        checkboxDataPrivacy.click();
    }
    public void clickSignupButton(){

        signupButton.click();
    }
    public WebElement getAcceptAndContinueButton(){

        return acceptAndContinueButton;
    }
}



