package com.cybertek.step_definitions;

import com.cybertek.pages.DownloadPracticePage;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class DownloadPracticeStepDefs {

    @Given("user opens bringYourOwnLaptop application")
    public void user_opens_bring_your_own_laptop_application() {
        Driver.getDriver().get("https://www.bringyourownlaptop.com/exercise-files");
    }

    @When("user finds Download link under {string} text")
    public void user_finds_download_link_under_text(String string) throws InterruptedException {
        DownloadPracticePage practicePage = new DownloadPracticePage();
        practicePage.downloadLink.click();
        Thread.sleep(2000);
        practicePage.approveDownload.click();
        Thread.sleep(2000);
    }

    @Then("user should not be able to proceed to next step for downloading in selenium")
    public void user_should_not_be_able_to_proceed_to_next_step_for_downloading_in_selenium() {
        String expectedTitle = "Download Exercise Files | Bring Your Own Laptop";
        String actualTitle = Driver.getDriver().getTitle();
        System.out.println("Expected title = " + expectedTitle);
        System.out.println("Actual title = " + actualTitle);
        Assert.assertEquals(expectedTitle, actualTitle);

    }

}
