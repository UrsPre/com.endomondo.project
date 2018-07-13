package com.endomondo.project.test;

import com.endomodo.project.infrastructure.SetupSuite;
import com.endomondo.project.page.object.LoginPage;
import com.endomondo.project.page.object.MainPage;
import org.testng.Assert;
import org.testng.annotations.Test;


public class MainPageTest extends SetupSuite {
    @Test
    public void shouldLoginPageBeDisplayedAfterClickToLoginLink() {
        //given
        //creating a copy of the page class LoginPageTest
        //and passing the driver object
        MainPage mainPage = new MainPage(driver);

        //when
        LoginPage loginPage = mainPage.clickToLoginLink();

        //then
        Assert.assertEquals(loginPage.getLoginButton().getText(),"LOG IN");
    }
}
