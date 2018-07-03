package com.endomondo.project.page.object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class HomePremiumPopup {

    //localization of elements on page
    @FindBy(className = "MonthTrialPopup-close")
    WebElement xButton;
    @FindBy(xpath = "//span[@class='MonthTrialPopup-primaryButtonLabel']")
    WebElement Start30DaysForFreeButton;
    WebDriver driver;
    HomePage homePage;

    //HomePage homePage;
    //creating constructor
    public HomePremiumPopup(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }
    //initializing
    public WebElement getButtonStart30DaysForFree() {
        return Start30DaysForFreeButton;
    }

    public WebElement getXButton() {
        return xButton;
    }

    public HomePage clickToClosePopup(){
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        getXButton().click();
        return new HomePage(driver);
    }

}