package com.endomondo.project.page.object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    HomePremiumPopup homePremiumPopup;
    @FindBy(xpath = "//img[@alt='Endomondo Logo']")
    WebElement logoHomePage;

    WebDriver driver;
    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        this.homePremiumPopup= new HomePremiumPopup(driver);
    }
    public HomePremiumPopup getHomePremiumPopup(){
        return homePremiumPopup;
    }
    public WebElement getLogoOnHomePage(){
        return logoHomePage;
    }


}


