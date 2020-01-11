package com.nuskin.pages;

import org.openqa.selenium.By;

public class RegionSelectionPage {
    private final By paperTabAsiaPacific = By.xpath("/div/div[3]/div[1]/paper-tabs/paper-tab[6]");
    private final By linkPhilippines = By.xpath("/div/div[3]/div[2]/iron-pages/div[6]/div[9]/a");

    public By getPaperTabAsiaPacific() {
        return paperTabAsiaPacific;
    }

    public By getLinkPhilippines() {
        return linkPhilippines;
    }
}
