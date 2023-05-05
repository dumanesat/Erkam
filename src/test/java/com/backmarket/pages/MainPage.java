package com.backmarket.pages;

import com.backmarket.utlities.Driver;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

// page_url = https://www.backmarket.com/en-us
import static com.codeborne.selenide.Selenide.$;

public class MainPage {

    public MainPage() {
        // Constructor
    }

    public SelenideElement acceptCookies = $("button[type='button'][data-qa='accept-cta']");

    public SelenideElement searchBar = $("#desktop-searchbar");
}