package com.endomondo.project.test;

import org.testng.annotations.Test;
import com.endomondo.project.page.object.EndoLoginPage;

public class EndoLoginPageTest extends EndoSuiteTest {

    @Test
    public void EndoLoginPageTest(){
        //creating a copy of the page class EndoLoginPage
        //and passing the driver object
        EndoLoginPage endoLogin = new EndoLoginPage(driver);

        //set email
        endoLogin.setEmail("majmagda1@o2.pl");
        endoLogin.setPassword("ThePassword1");
        endoLogin.loginToAccount();
    }
}
