package com.nuskin.steps;

import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class BaseStep {
    @Step("Redirect to Region selection")
    public void goToRegionSelectionPage() {

    }

    @Step("Click on element")
    public void clickOnElement(By elementBy) {
        getDriver().findElement(elementBy).click();
    }
}
