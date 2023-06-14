package com.backmarket.step_definitions;

import com.backmarket.utlities.ConfigurationReader;
import com.backmarket.utlities.Driver;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.junit.BeforeClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Hooks {

    @Before
    public void setUp(){
        // System.out.println(System.getProperty("browser"));
        Configuration.startMaximized=true;
        Configuration.timeout = 15000;
        Configuration.browser= ConfigurationReader.get("browser");
      Configuration.holdBrowserOpen=false;

        Configuration.pollingInterval = 500; // set the polling interval to half second
      //  WebDriverRunner.driver().getWebDriver().manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
        Configuration.browserCapabilities.setCapability("profile.default_content_setting_values", "popups=0");
        Configuration.browserCapabilities.setCapability("profile.default_content_settings.popups", 0);
    }

    @After
    public void tearDown(Scenario scenario){
        if(scenario.isFailed()){
            final byte[] screenshot =Selenide.screenshot(OutputType.BYTES);
            scenario.attach(screenshot,"image/png","screenshot");
        }



    }
}