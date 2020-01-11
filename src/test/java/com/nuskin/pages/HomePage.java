package com.nuskin.pages;

import org.openqa.selenium.By;

public class HomePage extends BasePage {
    private final By btnLogin = By.id("btn-log");
    private final By btnRegistration = By.id("btn-reg");

    public By getBtnLogin() {
        return btnLogin;
    }

    public By getBtnRegistration() {
        return btnRegistration;
    }
}