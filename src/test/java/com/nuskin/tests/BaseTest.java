package com.nuskin.tests;


import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import utils.PropertyReader;

import static net.thucydides.core.annotations.ClearCookiesPolicy.BeforeEachTest;

@RunWith(SerenityRunner.class)
public class BaseTest {
    private final PropertyReader pr = new PropertyReader();

    @Managed(uniqueSession=true, clearCookies=BeforeEachTest)
    public WebDriver driver;

    @Before
    public void setUp() {
        driver.get(this.pr.getURL());
    }

    @Ignore
    @After
    public void tearDown() {
        if(driver != null) {
            driver.quit();
        }
    }
}
