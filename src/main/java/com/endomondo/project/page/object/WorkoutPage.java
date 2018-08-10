package com.endomondo.project.page.object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WorkoutPage {

    private WebDriver driver;

    @FindBy(className = "manualWorkout")
    WebElement manualWorkoutButton;


    public WorkoutPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public WebElement getManualWorkoutButton(){
        return manualWorkoutButton;
    }
    public WorkoutPage clickNewManualWorkoutButton(){
        manualWorkoutButton.click();
        return new WorkoutPage(driver);
    }

}
