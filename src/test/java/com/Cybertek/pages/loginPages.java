package com.Cybertek.pages;

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
}
