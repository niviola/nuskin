package com.nuskin.pages;

import org.openqa.selenium.By;

public class HomePage extends BasePage {
    private final By btnSelectorDropDown = By.xpath("/html/body/article/app-drawer-layout/div[1]/header/div[1]/div/div[3]/div");

    public By getBtnSelectorDropDown() {
        return btnSelectorDropDown;
    }
}