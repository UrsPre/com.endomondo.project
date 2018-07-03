package com.endomondo.project.page.object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class HomePage {

    HomePremiumPopup homePremiumPopup;

    WebDriver driver;
    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        this.homePremiumPopup= new HomePremiumPopup(driver);
    }
    public HomePremiumPopup getHomePremiumPopup(){
        return homePremiumPopup;
    }

}


