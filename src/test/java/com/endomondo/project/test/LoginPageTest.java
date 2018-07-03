package com.endomondo.project.test;

import com.endomodo.project.infrastructure.SetupSuite;
import com.endomondo.project.page.object.HomePage;
import com.endomondo.project.page.object.LoginPage;
import com.endomondo.project.page.object.MainPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LoginPageTest extends SetupSuite {

    @Test
    public void LoginPageTest(){

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
}
