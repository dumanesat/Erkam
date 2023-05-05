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

    public ElementsCollection conditionsPrice = $$x("//li[@data-qa='grade-0']/../li/a/div/div[2]");

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
        return $$x("//div[@class='flex flex-col md:flex-1 md:justify-end']/span[1][contains(text(),'"+wifiOrCellular+"')] | //div[@class='flex flex-col md:flex-1 md:justify-end']/h2[contains(text(),'\"+wifiOrCellular+\"')]");
    }
}
