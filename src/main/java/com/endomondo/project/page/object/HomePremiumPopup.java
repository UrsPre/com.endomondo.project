package com.endomondo.project.page.object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePremiumPopup {


    @FindBy(xpath = "//span[@class='MonthTrialPopup-close']")
    WebElement xButton;
    @FindBy(xpath = "//span[@class='MonthTrialPopup-primaryButtonLabel']")
    WebElement Start30DaysForFreeButton;

    WebDriver driver;


    public HomePremiumPopup(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public WebElement getButtonStart30DaysForFree() {
        return Start30DaysForFreeButton;
    }
}