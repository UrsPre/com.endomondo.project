package com.endomondo.project.test;

import com.endomodo.project.infrastructure.SetupSuite;
import com.endomondo.project.page.object.LoginPage;
import com.endomondo.project.page.object.MainPage;
import com.endomondo.project.page.object.SignupPage;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignupPageTest extends SetupSuite{

    @Test
    public void shouldCreateNewAccount() {

        //given
        //creating a copy of the page class MainPage and passing the driver object
        MainPage mainPage = new MainPage(driver);

        //when
        //creating a copy of the page class LoginPage and inicializing metod clickToLoginLink
        SignupPage signupPage = mainPage.clickToSignupLink();
        signupPage.setEmailForSignup("test1@o2.pl");
        signupPage.setPassword("teeeeeeest");
        signupPage.setFirstName("test");
        signupPage.setLastName("test");
        signupPage.selectDayFromDropdownList("03");
        signupPage.selectCountryFromDropdownList("Barbados");
        signupPage.selectCheckbox();
        signupPage.clickSignupButton();

        //then
        Assert.assertTrue(signupPage.getAcceptAndContinueButton().isDisplayed());
    }
}
