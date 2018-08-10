package com.endomondo.project.page.object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewManualWorkoutPage {
    private WebDriver driver;
    @FindBy(className = "heading")
    WebElement newManualWorkoutHeading;

    public NewManualWorkoutPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public WebElement getNewManualWorkoutHeading(){
        return newManualWorkoutHeading;
    }
}
