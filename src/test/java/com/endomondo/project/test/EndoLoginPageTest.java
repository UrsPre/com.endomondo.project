package com.endomondo.project.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import com.endomondo.project.page.object.EndoLoginPage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class EndoLoginPageTest extends EndoSuiteTest {

    @Test
    public void EndoLoginPageTest(){

        //given
        EndoLoginPage endoLogin = new EndoLoginPage(driver); //creating a copy of the page class EndoLoginPage and passing the driver object
        endoLogin.setEmail("majmagda1@o2.pl"); //set email
        endoLogin.setPassword("ThePassword1"); //set password
        endoLogin.loginToAccount(); //clicking button
        endoLogin.closePopupIfDisplayed();
        //when
        //then

        assertTrue(endoLogin.getLogo().isDisplayed());
    }

}
