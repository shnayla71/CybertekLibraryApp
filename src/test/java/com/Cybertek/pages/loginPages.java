package com.Cybertek.pages;

import com.Cybertek.utilities.ConfigurationReader;
import com.Cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPages {
    public loginPages(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id="inputEmail")
    public WebElement mailBox;

    @FindBy(id="inputPassword")
    public WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signButton;

    public void login(){
        String username= ConfigurationReader.getProperty("username");
        String passwordString=ConfigurationReader.getProperty("password");
        mailBox.sendKeys(username);
        password.sendKeys(passwordString);
        signButton.click();
    }
    public void login1(){
        String username= ConfigurationReader.getProperty("student95_user");
        String passwordString=ConfigurationReader.getProperty("student95_pass");
        mailBox.sendKeys(username);
        password.sendKeys(passwordString);
        signButton.click();
    }
}
