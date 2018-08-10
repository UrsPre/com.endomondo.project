package com.endomondo.project.test;

import com.endomodo.project.infrastructure.SetupSuite;
import com.endomondo.project.page.object.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WorkoutPageTest extends SetupSuite {
    @Test
    public void shouldNewManualWorkoutBeStarted(){
        //given
        MainPage mainPage = new MainPage(driver);
        //when
        LoginPage loginPage = mainPage.clickToLoginLink();
        loginPage.setEmail("majmagda1@o2.pl");
        loginPage.setPassword("ThePassword1");
        HomePage homePage = loginPage.clickToLoginButton();
        HomePremiumPopup homePremiumPopup = homePage.getHomePremiumPopup();
        HomePage homePageAfterClosingPopup = homePremiumPopup.clickToClosePopup();
        WorkoutPage workoutPage = homePageAfterClosingPopup.clickToAddWorkoutButton();
        WorkoutPage workoutPage1 = workoutPage.clickNewManualWorkoutButton();
        //then
       // Assert.assertEquals(workoutPage1.getNewManualWorkoutHeading().getText(),"Nowy trening");


    }

}
