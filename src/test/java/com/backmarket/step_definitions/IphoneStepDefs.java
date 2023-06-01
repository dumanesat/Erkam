package com.backmarket.step_definitions;
import com.backmarket.pages.MainPage;
import com.backmarket.pages.SearchPage;
import com.backmarket.utlities.ConfigurationReader;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import io.cucumber.java.en.*;
import java.util.*;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import java.util.ArrayList;
import java.util.List;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class IphoneStepDefs {
    MainPage mainPage = new MainPage();
    SearchPage searchPage = new SearchPage();

    @Given("User is on search page")
    public void user_is_on_search_page() {
        open(ConfigurationReader.get("url"));
        mainPage.searchBar.waitUntil(visible, 10000);
        if (mainPage.acceptCookies.isDisplayed()) {
            mainPage.acceptCookies.hover().click();
        }
    }

String model1;
    @When("User enters Iphone model with storage {string}")
    public void user_enters_Iphone_model_with_storage(String model) throws InterruptedException {
        this.model1=model;
        mainPage.searchBar.setValue(model).pressEnter();
        searchPage.phoneList.get(searchPage.phoneList.size() - 1);


    }


    @When("User click model checkboxes {string}")
    public void user_click_model_checkboxes(String string) {

        searchPage.modelCheckBox(string).hover().click();
    }
String cond;
    @When("User clicks condition check box {string}")
    public void user_clicks_condition_check_box(String string) {

        cond=string;

        //searchPage.conditionCheckBox(string).shouldBe(exist);
        searchPage.conditionCheckBox(string).shouldBe(exist).hover().click();
    }

    String url;

    @When("User click storage check box {string}")
    public void user_click_storage_check_box(String string) {
        searchPage.storageCheckBox(string).hover().click();
        searchPage.unlockedPhoneList.get(0).shouldBe(exist);
        url = Selenide.webdriver().driver().url();
        System.out.println(url);
    }


    @When("User inconsistent prices according to condition")
    public void user_eliminates_inconsistent_prices_according_to_condition() throws InterruptedException {
        Thread.sleep(500);


        List<Double> fairPriceList = new ArrayList<>();
        List<Double> goodPriceList = new ArrayList<>();
        List<Double> excellentPriceList = new ArrayList<>();
        Thread.sleep(500);
        List<SelenideElement> newUnlocked = searchPage.unlockedPhoneList;
        System.out.println("newUnlocked.size() = " + newUnlocked.size());
        for (int i = 0; i < newUnlocked.size(); i++) {
            newUnlocked = searchPage.unlockedPhoneList;
            newUnlocked.get(i).shouldBe(visible, enabled, exist);
            newUnlocked.get(i).hover();
            newUnlocked.get(i).click();

         searchPage.condition.shouldBe(visible);

            Double fair;
            Double good;
            Double excellent;
           try {
               searchPage.conditionsPrice.get(0).shouldBe(visible);
               searchPage.conditionsPrice.get(1).shouldBe(visible);
               searchPage.conditionsPrice.get(2).shouldBe(visible);
           }catch (Exception e){
               e.getMessage();
           }

            if (searchPage.conditionsPrice.size() == 3) {
                Double prices[] = {Double.parseDouble(searchPage.conditionsPrice.get(2).getText().replace(",", "").substring(1)), Double.parseDouble(searchPage.conditionsPrice.get(0).getText().replace(",", "").substring(1)), Double.parseDouble(searchPage.conditionsPrice.get(1).getText().replace(",", "").substring(1))};
                Arrays.sort(prices);
                fair = prices[0];
                good = prices[1];
                excellent = prices[2];
                fairPriceList.add(fair);
                goodPriceList.add(good);
                excellentPriceList.add(excellent);

            } else if (searchPage.conditionsPrice.size() == 2 && (searchPage.coditionsName.get(0).getText().contains("Fair") && searchPage.coditionsName.get(1).getText().contains("Good"))) {


                Double prices[] = {Double.parseDouble(searchPage.conditionsPrice.get(0).getText().replace(",", "").substring(1)), Double.parseDouble(searchPage.conditionsPrice.get(1).getText().replace(",", "").substring(1))};
                Arrays.sort(prices);
                fair = prices[0];
                good = prices[1];
                fairPriceList.add(fair);
                goodPriceList.add(good);
            } else if (searchPage.conditionsPrice.size() == 2 && (searchPage.coditionsName.get(0).getText().contains("Fair") && searchPage.coditionsName.get(1).getText().contains("Excellent"))){
                Double prices[] = {Double.parseDouble(searchPage.conditionsPrice.get(0).getText().replace(",", "").substring(1)), Double.parseDouble(searchPage.conditionsPrice.get(1).getText().replace(",", "").substring(1))};
                Arrays.sort(prices);
                fair = prices[0];
                excellent = prices[1];
                fairPriceList.add(fair);
                excellentPriceList.add(excellent);

            } else if (searchPage.conditionsPrice.size() == 2 && (searchPage.coditionsName.get(0).getText().contains("Good") && searchPage.coditionsName.get(1).getText().contains("Excellent"))) {
                Double prices[] = {Double.parseDouble(searchPage.conditionsPrice.get(0).getText().replace(",", "").substring(1)), Double.parseDouble(searchPage.conditionsPrice.get(1).getText().replace(",", "").replace(",", "").substring(1))};
                Arrays.sort(prices);
                good = prices[0];
                excellent = prices[1];
                goodPriceList.add(good);
                excellentPriceList.add(excellent);
            } else if (searchPage.conditionsPrice.size() == 1 && searchPage.coditionsName.get(0).getText().contains("Excellent")) {
                excellent = Double.parseDouble(searchPage.conditionsPrice.get(0).getText().replace(",", "").substring(1));
                excellentPriceList.add(excellent);
            } else if (searchPage.conditionsPrice.size() == 1 && searchPage.coditionsName.get(0).getText().contains("Good")) {
                good = Double.parseDouble(searchPage.conditionsPrice.get(0).getText().replace(",", "").substring(1));
                goodPriceList.add(good);
            } else if (searchPage.conditionsPrice.size() == 1 && searchPage.coditionsName.get(0).getText().contains("Fair")) {
                fair = Double.parseDouble(searchPage.conditionsPrice.get(0).getText().replace(",", "").substring(1));
                fairPriceList.add(fair);
            } else {
                continue;
            }
            //webdriver().driver().getWebDriver().navigate().back();
            //open(url);
          Selenide.back();
          $x("//h3[@data-selector='total-products']").shouldBe(visible);

        }
        Collections.sort(fairPriceList);
        Collections.sort(goodPriceList);
        Collections.sort(excellentPriceList);
        System.out.println(model1+" fair = " + fairPriceList);
        System.out.println(model1+" good = " + goodPriceList);
        System.out.println(model1+" excellent = " + excellentPriceList);
        System.out.println(model1+ " The cheapest fair = " + Collections.min(fairPriceList));
        System.out.println(model1+" The cheapest good " + Collections.min(goodPriceList));
        System.out.println(model1+" The cheapest excellent " + Collections.min(excellentPriceList));
    }



    @When("User inconsistent prices according to condition..")
    public void user_inconsistent_prices_according_to_condition() {
        List<Double> fairPriceList = new ArrayList<>();
        List<Double> goodPriceList = new ArrayList<>();
        List<Double> excellentPriceList = new ArrayList<>();
        //Thread.sleep(500);
        List<SelenideElement> newUnlocked = searchPage.unlockedPhoneList;
        System.out.println("newUnlocked.size() = " + newUnlocked.size());
        for (int i = 0; i < newUnlocked.size(); i++) {
            newUnlocked = searchPage.unlockedPhoneList;
            newUnlocked.get(i).shouldBe(visible, enabled, exist);
            newUnlocked.get(i).hover();
            newUnlocked.get(i).click();
            $x("//p[normalize-space(text())='Condition']").shouldBe(visible);
            Double fair;
            Double good;
            Double excellent;
            if (searchPage.conditionsPrice.size() == 3) {
                Double prices[] = {Double.parseDouble(searchPage.conditionsPrice.get(2).getText().replace(",", "").substring(1)), Double.parseDouble(searchPage.conditionsPrice.get(0).getText().replace(",", "").substring(1)), Double.parseDouble(searchPage.conditionsPrice.get(1).getText().replace(",", "").substring(1))};
                Arrays.sort(prices);
                fair = prices[0];
                good = prices[1];
                excellent = prices[2];
                fairPriceList.add(fair);
                goodPriceList.add(good);
                excellentPriceList.add(excellent);

            } else if (searchPage.conditionsPrice.size() == 2 && searchPage.coditionsName.get(0).getText().contains("Fair") && searchPage.coditionsName.get(1).getText().contains("Good")) {


                Double prices[] = {Double.parseDouble(searchPage.conditionsPrice.get(0).getText().replace(",", "").substring(1)), Double.parseDouble(searchPage.conditionsPrice.get(1).getText().replace(",", "").substring(1))};
                Arrays.sort(prices);
                fair = prices[0];
                good = prices[1];
                fairPriceList.add(fair);
                goodPriceList.add(good);
            } else if (searchPage.conditionsPrice.size() == 2 && searchPage.coditionsName.get(0).getText().contains("Fair") && searchPage.coditionsName.get(1).getText().contains("Excellent")) {
                Double prices[] = {Double.parseDouble(searchPage.conditionsPrice.get(0).getText().replace(",", "").substring(1)), Double.parseDouble(searchPage.conditionsPrice.get(1).getText().replace(",", "").substring(1))};
                Arrays.sort(prices);
                fair = prices[0];
                excellent = prices[1];
                fairPriceList.add(fair);
                excellentPriceList.add(excellent);

            } else if (searchPage.conditionsPrice.size() == 2 && searchPage.coditionsName.get(0).getText().contains("Good") && searchPage.coditionsName.get(1).getText().contains("Excellent")) {
                Double prices[] = {Double.parseDouble(searchPage.conditionsPrice.get(0).getText().replace(",", "").substring(1)), Double.parseDouble(searchPage.conditionsPrice.get(1).getText().replace(",", "").replace(",", "").substring(1))};
                Arrays.sort(prices);
                good = prices[0];
                excellent = prices[1];
                goodPriceList.add(good);
                excellentPriceList.add(excellent);
            } else if (searchPage.conditionsPrice.size() == 1 && searchPage.coditionsName.get(0).getText().contains("Excellent")) {
                excellent = Double.parseDouble(searchPage.conditionsPrice.get(0).getText().replace(",", "").substring(1));
                excellentPriceList.add(excellent);
            } else if (searchPage.conditionsPrice.size() == 1 && searchPage.coditionsName.get(0).getText().contains("Good")) {
                good = Double.parseDouble(searchPage.conditionsPrice.get(0).getText().replace(",", "").substring(1));
                goodPriceList.add(good);
            } else if (searchPage.conditionsPrice.size() == 1 && searchPage.coditionsName.get(0).getText().contains("Fair")) {
                fair = Double.parseDouble(searchPage.conditionsPrice.get(0).getText().replace(",", "").substring(1));
                fairPriceList.add(fair);
            } else {
                continue;
            }
            // webdriver().driver().getWebDriver().navigate().back();
           // open(url);
            Selenide.back();
            $x("//h3[@data-selector='total-products']").shouldBe(visible);
           // if(!searchPage.modelCheckBox(model).isSelected()){
             //   searchPage.modelCheckBox(model).hover().click();
            }

        //    if (!searchPage.conditionCheckBox(cond).isSelected()){
           //     searchPage.conditionCheckBox(cond).hover().click();
           // }



        Collections.sort(fairPriceList);
        Collections.sort(goodPriceList);
        Collections.sort(excellentPriceList);
        System.out.println("fair = " + fairPriceList);
        System.out.println("good = " + goodPriceList);
        System.out.println("excellent = " + excellentPriceList);
        System.out.println("The cheapest fair = " + Collections.min(fairPriceList));
        System.out.println("The cheapest good " + Collections.min(goodPriceList));
        System.out.println("The cheapest excellent " + Collections.min(excellentPriceList));
    }


    @And("User click storage check box {string}.")
    public void userClickStorageCheckBox(String arg0) {
        searchPage.storageCheckBox(arg0).hover().click();


    }

    @And("User inconsistent prices according to {string}")
    public void userInconsistentPricesAccordingTo(String arg0) {
        List<Double> fairPriceList = new ArrayList<>();
        List<Double> goodPriceList = new ArrayList<>();
        List<Double> excellentPriceList = new ArrayList<>();
        //Thread.sleep(500);
        List<SelenideElement> newUnlocked = searchPage.returnCellular(arg0);
        System.out.println("newUnlocked.size() = " + newUnlocked.size());
        for (int i = 0; i < newUnlocked.size(); i++) {
            newUnlocked = searchPage.returnCellular(arg0);
            newUnlocked.get(i).shouldBe(visible, enabled, exist);
            newUnlocked.get(i).hover();
            newUnlocked.get(i).click();
            searchPage.condition.shouldBe(visible);

            Double fair;
            Double good;
            Double excellent;
            if (searchPage.conditionsPrice.size() == 3) {
                Double prices[] = {Double.parseDouble(searchPage.conditionsPrice.get(2).getText().replace(",", "").substring(1)), Double.parseDouble(searchPage.conditionsPrice.get(0).getText().replace(",", "").substring(1)), Double.parseDouble(searchPage.conditionsPrice.get(1).getText().replace(",", "").substring(1))};
                Arrays.sort(prices);
                fair = prices[0];
                good = prices[1];
                excellent = prices[2];
                fairPriceList.add(fair);
                goodPriceList.add(good);
                excellentPriceList.add(excellent);

            } else if (searchPage.conditionsPrice.size() == 2 && searchPage.coditionsName.get(0).getText().contains("Fair") && searchPage.coditionsName.get(1).getText().contains("Good")) {


                Double prices[] = {Double.parseDouble(searchPage.conditionsPrice.get(0).getText().replace(",", "").substring(1)), Double.parseDouble(searchPage.conditionsPrice.get(1).getText().replace(",", "").substring(1))};
                Arrays.sort(prices);
                fair = prices[0];
                good = prices[1];
                fairPriceList.add(fair);
                goodPriceList.add(good);
            } else if (searchPage.conditionsPrice.size() == 2 && searchPage.coditionsName.get(0).getText().contains("Fair") && searchPage.coditionsName.get(1).getText().contains("Excellent")) {
                Double prices[] = {Double.parseDouble(searchPage.conditionsPrice.get(0).getText().replace(",", "").substring(1)), Double.parseDouble(searchPage.conditionsPrice.get(1).getText().replace(",", "").substring(1))};
                Arrays.sort(prices);
                fair = prices[0];
                excellent = prices[1];
                fairPriceList.add(fair);
                excellentPriceList.add(excellent);

            } else if (searchPage.conditionsPrice.size() == 2 && searchPage.coditionsName.get(0).getText().contains("Good") && searchPage.coditionsName.get(1).getText().contains("Excellent")) {
                Double prices[] = {Double.parseDouble(searchPage.conditionsPrice.get(0).getText().replace(",", "").substring(1)), Double.parseDouble(searchPage.conditionsPrice.get(1).getText().replace(",", "").replace(",", "").substring(1))};
                Arrays.sort(prices);
                good = prices[0];
                excellent = prices[1];
                goodPriceList.add(good);
                excellentPriceList.add(excellent);
            } else if (searchPage.conditionsPrice.size() == 1 && searchPage.coditionsName.get(0).getText().contains("Excellent")) {
                excellent = Double.parseDouble(searchPage.conditionsPrice.get(0).getText().replace(",", "").substring(1));
                excellentPriceList.add(excellent);
            } else if (searchPage.conditionsPrice.size() == 1 && searchPage.coditionsName.get(0).getText().contains("Good")) {
                good = Double.parseDouble(searchPage.conditionsPrice.get(0).getText().replace(",", "").substring(1));
                goodPriceList.add(good);
            } else if (searchPage.conditionsPrice.size() == 1 && searchPage.coditionsName.get(0).getText().contains("Fair")) {
                fair = Double.parseDouble(searchPage.conditionsPrice.get(0).getText().replace(",", "").substring(1));
                fairPriceList.add(fair);
            } else {
                continue;
            }
            // webdriver().driver().getWebDriver().navigate().back();
            //open(url);
             Selenide.back();

            //    if (!searchPage.conditionCheckBox(cond).isSelected()){
            //     searchPage.conditionCheckBox(cond).hover().click();
            // }


        }
        Collections.sort(fairPriceList);
        Collections.sort(goodPriceList);
        Collections.sort(excellentPriceList);
        System.out.println("fair = " + fairPriceList);
        System.out.println("good = " + goodPriceList);
        System.out.println("excellent = " + excellentPriceList);
        System.out.println("The cheapest fair = " + Collections.min(fairPriceList));
        System.out.println("The cheapest good " + Collections.min(goodPriceList));
        System.out.println("The cheapest excellent " + Collections.min(excellentPriceList));
    }
}
