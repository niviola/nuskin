package com.nuskin.pages;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
@DefaultUrl("https://test.nuskin.com/content/login/corporate/en.html?destination=https:" +
        "//test.nuskin.com/content/nuskin/en_PH/home.html&cancel=" +
        "https://test.nuskin.com/content/nuskin/en_PH/home.html&market=PH&localepage=undefined#/")
public class PageSignIn extends PageObject {
    public String uName = "PH00687401";
    public String uPass = "Abcd1234";
    @FindBy(xpath = "//input[@class='primary-hit fluid']")
    WebElement signIn;
    @FindBy(xpath = "//input[@name='username']")
    WebElement userName;
    @FindBy(xpath = "//input[@name='password']")
    WebElement password;

    public void signIn() {
        userName.sendKeys(uName);
        password.sendKeys(uPass);
        signIn.click();
//        waitClickable(userName, 40);
//        userName.sendKeys(uName);
//        waitClickable(password, 40);
//        password.sendKeys(uPass);
//        waitClickable(signIn, 40);
//        signIn.click();
    }

}
