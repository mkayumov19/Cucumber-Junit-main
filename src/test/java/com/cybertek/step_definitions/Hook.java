package com.cybertek.step_definitions;

import com.cybertek.utilities.Driver;
import io.cucumber.java.Scenario;
import org.junit.After;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hook {

    @After
    public void tearDown(Scenario scenario){
        //this is the method for taking a screenshot using cucumber
        if (scenario.isFailed()){
            final byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "screenshot of result");
        }
    }

}
