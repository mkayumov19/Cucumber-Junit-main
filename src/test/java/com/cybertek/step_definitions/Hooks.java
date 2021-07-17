package com.cybertek.step_definitions;

import com.cybertek.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    //Import from io.cucumber.java not from junit
    @Before
    public void setupScenario(){
        System.out.println("--Setting up browser with further details...");
    }

    @After
    public void tearDownScenario(){
        System.out.println("--Teardown steps are being applied...");
        Driver.closeDriver();
    }

    @After
    public void tearDown(Scenario scenario) {
        //this is the method for taking a screenshot using cucumber
        if (scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "screenshot of result");
            Driver.closeDriver();
        }
    }

}
