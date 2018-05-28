package com.endomondo.project.page.object;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class EndoLoginPage {
    //page elements are defined

    private WebElement email;
    private WebElement password;
    
    @FindBy(xpath = "//span[@class='ng-binding ng-scope']")
    private WebElement loginButton;


    private WebDriver driver;
    //creating constructor
    public EndoLoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    //access methods to the fields: Email/PAssword and ZALOGUJ button

    public void setEmail(String Email_input) { email.sendKeys(Email_input); }

    public void setPassword(String password_input) { password.sendKeys(password_input); }

    public void loginToAccount() { loginButton.click(); }
}
