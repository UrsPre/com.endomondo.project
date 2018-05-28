package com.endomondo.project.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.endomondo.project.page.object.EndoLoginPage;
import org.testng.asserts.Assertion;

import java.io.Serializable;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class EndoLoginPageTest extends EndoSuiteTest {

    @Test
    public void EndoLoginPageTest(){
        //creating a copy of the page class EndoLoginPage
        //and passing the driver object
        EndoLoginPage endoLogin = new EndoLoginPage(driver);

        //set email
        endoLogin.setEmail("majmagda1@o2.pl");
        //set password
        endoLogin.setPassword("ThePassword1");
        endoLogin.loginToAccount();

        assertTrue(driver.getTitle().startsWith("Utrzymaj motywację"),
                "title should start with Utrzymaj motywację");
    }
}
