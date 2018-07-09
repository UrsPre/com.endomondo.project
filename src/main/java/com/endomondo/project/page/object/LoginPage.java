package com.endomondo.project.page.object;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class LoginPage {
    //page elements are defined

    private WebElement email;
    private WebElement password;
    
    @FindBy(xpath = "//span[@class='ng-binding ng-scope']")
    private WebElement loginButton;


    private WebDriver driver;
    //creating constructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    //access methods to the fields: Email/PAssword and ZALOGUJ button

    public void setEmail(String Email_input) { email.sendKeys(Email_input); }
    public void setPassword(String password_input) { password.sendKeys(password_input); }

    public HomePage clickToLoginButton() { loginButton.click();
    driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
    return new HomePage(driver);
    }

    public WebElement getLoginButton() {
        return loginButton;
    }


}
