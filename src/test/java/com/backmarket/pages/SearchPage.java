package com.backmarket.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import java.util.List;
import java.util.stream.Collectors;

import static com.codeborne.selenide.CollectionCondition.*;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class SearchPage {


    public ElementsCollection phoneList = $$x("//div[@class='grid grid-cols-1 gap-4 md:gap-7 lg:grid-cols-[repeat(3,26.2rem)] md:grid-cols-[repeat(2,26.2rem)]']/div");

    public SelenideElement searchLink = $x("//a[@class='!w-full _1xMx-RYw _3jgXaWY4']");

  //  public ElementsCollection conditionsPrice = $$x("//li[@data-qa='grade-0']/../li/a/div/div[2]");
    public ElementsCollection conditionsPrice = $$x("(//ul[@class='grid gap-2 list-none grid-cols-3'])[1]/li/a/div/div[2]");

    public SelenideElement modelCheckBox(String model){
        return $x("//span[normalize-space(text())='"+model+"']");
    }

    public SelenideElement storageCheckBox(String storage){
        return $x("//span[normalize-space(text())='"+storage+"']");
    }

    public SelenideElement conditionCheckBox(String condition){
        return $x("//span[normalize-space(text())='"+condition+"']");
    }

   // public ElementsCollection unlockedPhoneList=$$x("//div[@class='flex flex-col md:flex-1 md:justify-end']/span[1][contains(text(),'Unlocked')]/../../../..");
    public ElementsCollection unlockedPhoneList=$$x("//div[@class='flex flex-col md:flex-1 md:justify-end']/span[1][contains(text(),'Unlocked')] | //div[@class='flex flex-col md:flex-1 md:justify-end']/h2[contains(text(),'Unlocked')]");
    public ElementsCollection returnCellular(String wifiOrCellular){
        return $$x("//h2[contains(text(),'"+wifiOrCellular+"')]");
    }
    public SelenideElement outOfStock=$x("//div[@data-test='out-of-stock-product-desktop-warning-message']/div/div");
    public ElementsCollection coditionsName=$$x("(//ul[@class='grid gap-2 list-none grid-cols-3'])[1]/li/a/div/div/span");
    public SelenideElement condition=$x("//p[normalize-space(text())='Condition']");
    public SelenideElement filterStorage=$x("//input[@id='facet-filter-storage']");
    public SelenideElement filterModel=$x("//input[@id='model']");

}
