package com.companyName.step_definitions;

import com.companyName.pages.DropdownsPage;
import com.companyName.pages.LibraryLoginPage;
import com.companyName.utilities.BrowserUtils;
import com.companyName.utilities.ConfigurationReader;
import com.companyName.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Map;

public class DataTables_StepDefinitions {
    LibraryLoginPage libraryLoginPage = new LibraryLoginPage();
    DropdownsPage dropdownsPage = new DropdownsPage();

    @Given("User is on the login page of library app")
    public void user_is_on_the_login_page_of_library_app() {
        String url = ConfigurationReader.getProperty("url");
        Driver.getDriver().get(url);
    }

    @When("User enters username and password as below")
    public void user_enters_username_and_password_as_below(Map<String, String> loginInfo) {
        String username = loginInfo.get("username");
//        String password = loginInfo.get("password");
        libraryLoginPage.emailInput.sendKeys(username);
        libraryLoginPage.passwordInput.sendKeys(loginInfo.get("password"));
        libraryLoginPage.signIn.click();
    }

    @Then("User should see title is Library")
    public void userShouldSeeTitleIsLibrary() {
        System.out.println("Title verification");
    }

    @Then("user should see below words displayed")
    public void user_should_see_below_words_displayed(List<String> listOfFruits) {
        System.out.println("listOfFruits.size() = " + listOfFruits.size());
        System.out.println("listOfFruits = " + listOfFruits);
    }

    @Given("User is on the dropdowns page of practice tool")
    public void user_is_on_the_dropdowns_page_of_practice_tool() {
        Driver.getDriver().get("http://practice.cybertekschool.com/dropdown");
    }

    @Then("User should see below info in month dropdown")
    public void user_should_see_below_info_in_month_dropdown(List<String> expectedList) {
        Select monthDropdown = new Select(dropdownsPage.month);
        List<WebElement> actualMonthWebElement = monthDropdown.getOptions();
        Assert.assertEquals(expectedList, BrowserUtils.getElementsText(actualMonthWebElement));


        //replacing all below lines with single line at 57.
//        List<String> actualMonthAsString = new ArrayList<>();
//        for (WebElement each : actualMonthWebElement) {
//            actualMonthAsString.add(each.getText());
//        }
//        Assert.assertEquals(expectedList, actualMonthAsString);
//        System.out.println("Expected months = "+expectedList);
//        System.out.println("Actual months = "+actualMonthAsString);
    }

}
