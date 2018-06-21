package com.endomondo.project.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public abstract class EndoSuiteTest  {

    public WebDriver driver;    // chromedriver declaration

    @BeforeSuite
    public void setup() {

        System.setProperty("webdriver.chrome.driver", "C:\\MOJ\\java\\webdrivers\\chromedriver.exe"); //chromdriver initialization
        driver = new ChromeDriver();
        driver.get("https://www.endomondo.com/login");
    }

    //@AfterSuite
    public void tearDown(){ //closing browser
        driver.quit();
    }
}
