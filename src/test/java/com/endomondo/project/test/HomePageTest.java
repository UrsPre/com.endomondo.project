package com.endomondo.project.test;

import com.endomodo.project.infrastructure.SetupSuite;
import com.endomondo.project.page.object.HomePage;
import com.endomondo.project.page.object.HomePremiumPopup;
import com.endomondo.project.page.object.LoginPage;
import com.endomondo.project.page.object.MainPage;
import com.sun.org.apache.xpath.internal.operations.Equals;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends SetupSuite {
    @Test
    public void HomePageTest(){

        //given
        //creating a copy of the page class MainPage and passing the driver object
        MainPage mainPage = new MainPage(driver);
        //creating a copy of the page class LoginPage and inicializing metod clickToLoginLink

        //when
        LoginPage loginPage = mainPage.clickToLoginLink();
        loginPage.setEmail("majmagda1@o2.pl");
        loginPage.setPassword("ThePassword1");
        HomePage homePage = loginPage.clickToLoginButton();
        HomePremiumPopup homePremiumPopup = homePage.getHomePremiumPopup();
        homePremiumPopup.clickToClosePopup();

        //then

      //  Assert.assertEquals(homePage.getLogoOnHomePage(), logoOnHomePage);
        Assert.assertTrue(homePage.getLogoOnHomePage().isDisplayed());
    }
}

