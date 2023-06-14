package com.backmarket.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class SwappaMainPage {
public SelenideElement searchButton=$x("//button[@aria-label='Search' and @type='button']");
public SelenideElement searchBox=$x("//input[@placeholder='Find a good deal']");
//public SelenideElement searchPageButton=$x("//a[starts-with(@href,'/search?q=') and @class='btn btn-link']");
public ElementsCollection firstPhoneInSearch=$$x("//*[@id='quick-search-app']/div/div[2]/div[2]/div");

public SelenideElement carrierClick(String carrier){

    return $x("//a[contains(@href,'"+carrier+"') and @class='btn btn-default btn-block carrier_image']");
}
public SelenideElement selectStorage=$x("//select[@name='storage']");
}
