package com.endomondo.project.page.object;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

public class MainPage {

    @FindBy(linkText = "Log in")
    private WebElement loginLink;
    private WebDriver driver;

    //creating constructor
    public MainPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public LoginPage clickToLoginLink() {
        loginLink.click();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        return new LoginPage(driver);
    }

}