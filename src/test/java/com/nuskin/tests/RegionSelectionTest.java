package com.nuskin.tests;

import com.nuskin.pages.RegionSelectionPage;
import com.nuskin.steps.RegionSelectionStep;
import org.junit.Test;

public class RegionSelectionTest extends BaseTest {

    private final RegionSelectionPage page = new RegionSelectionPage();
    private final RegionSelectionStep step = new RegionSelectionStep();

    /**
     * Verify that Home Page opens
     */
    @Test
    public void verify_HomePage_opens() {
        step.goToRegionSelectionPage();
        step.clickOnElement(page.getPaperTabAsiaPacific());
        step.clickOnElement(page.getLinkPhilippines());

    }

}
