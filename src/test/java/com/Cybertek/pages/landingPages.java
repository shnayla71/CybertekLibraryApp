package com.Cybertek.pages;

import com.Cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class landingPages {
    public landingPages(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id="user_count")
    public WebElement userCount;
}
