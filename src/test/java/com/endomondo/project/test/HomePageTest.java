package com.endomondo.project.test;

import com.endomodo.project.infrastructure.SetupSuite;
import com.endomondo.project.page.object.*;
import com.sun.org.apache.xpath.internal.operations.Equals;
import io.restassured.RestAssured;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends SetupSuite {

    @Test
    public void shouldDisplayHomePagePopup(){

        //given
        //creating a copy of the page class MainPage and passing the driver object
        MainPage mainPage = new MainPage(driver);
        //creating a copy of the page class LoginPage and inicializing metod clickToLoginLink
        LoginPage loginPage = mainPage.clickToLoginLink();

        //when
        //set email and password
        loginPage.setEmail("majmagda1@o2.pl");
        loginPage.setPassword("ThePassword1");
        //creating a copy of the page class HomePage and inicializing metod clickToLoginButton
        HomePage homePage = loginPage.clickToLoginButton();

        //then
        //checking if text on the button is correct
        Assert.assertEquals(homePage.getHomePremiumPopup().getButtonStart30DaysForFree().getText(),"ROZPOCZNIJ 30-DNIOWY DARMOWY OKRES PRÓBNY");
    }
    @Test
    public void shouldPublishMessage(){
        //given
        MainPage mainPage = new MainPage(driver);

        //when
        LoginPage loginPage = mainPage.clickToLoginLink();
        loginPage.setEmail("majmagda1@o2.pl");
        loginPage.setPassword("ThePassword1");
        HomePage homePage = loginPage.clickToLoginButton();
        HomePremiumPopup homePremiumPopup = homePage.getHomePremiumPopup();
        HomePage homePageWithPublishedMessage = homePremiumPopup.clickToClosePopup();
        homePageWithPublishedMessage.setMessage("traaalalala");
        homePageWithPublishedMessage.clickPublishMessageButton();

        //then
      //  Assert.assertEquals(homePageWithPublishedMessage.getMessageTime().getText(),"SEK. TEMU");

        RestAssured.given().
                accept("application/json").
                body("{\"message\":\"er422e\",\"picture_keys\":[]}").
                when().
                post("https://www.endomondo.com/rest/v1/users/37102364/feeds/").
                then().statusCode(200);

    }

    @Test
    public void shouldNewWorkoutBeAdded(){
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

        //then
        Assert.assertTrue(workoutPage.getManualWorkoutButton().isDisplayed());


    }
}

