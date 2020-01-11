package com.nuskin.steps;

import com.nuskin.tests.BaseTest;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class BaseStep {
    @Step("Redirect to Region selection")
    public void goToRegionSelectionPage() {

    }

    @Step("Click on element")
    public void clickOnElement(By elementBy) {
        BaseTest.getDriver().findElement(elementBy).click();
    }
}
