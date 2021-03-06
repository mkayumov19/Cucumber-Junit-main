package com.Practice.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
//       monochrome = true,
        stepNotifications = true,
        plugin = {"html:target/cucumber-report.html",
                  "json:target/cucumber.json",
                  "rerun:target/rerun.txt"
        },
        features = "src/test/resources/features",
        glue = "com/Practice/step_definitions",
        dryRun = false,
        tags = "@etsySearch"

)

public class CukesRunner {
}

