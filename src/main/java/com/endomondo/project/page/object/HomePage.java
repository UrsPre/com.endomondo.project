package com.endomondo.project.page.object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class HomePage {

    private HomePremiumPopup homePremiumPopup;
    @FindBy(xpath = "//img[@alt='Endomondo Logo']")
    private WebElement logoHomePage;
    @FindBy(name = "message")
    private WebElement message;
    @FindBy(xpath = "//button[@class='button button-default']")
    private WebElement publishMessageButton;
    private WebDriver driver;

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

    public void setMessage(String message_text) {
        message.sendKeys(message_text);

    }
    public HomePage clickPublishMessageButton(){
        publishMessageButton.click();
        return new HomePage(driver);
    }

}


