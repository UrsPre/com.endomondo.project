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
        //creating a copy of the page class LoginPageTest
        //and passing the driver object
        MainPage mainPage = new MainPage(driver);
        LoginPage loginPage = mainPage.clickToLoginLink();

        //set email
        //when
        loginPage.setEmail("majmagda1@o2.pl");
        loginPage.setPassword("ThePassword1");

        HomePage homePage = loginPage.clickToLoginButton();

        //then
        Assert.assertEquals(homePage.getHomePremiumPopup().getButtonStart30DaysForFree().getText(),"ROZPOCZNIJ 30-DNIOWY DARMOWY OKRES PRÓBNY");

    }
}
