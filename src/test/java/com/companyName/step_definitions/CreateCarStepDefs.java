package com.companyName.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

public class CreateCarStepDefs {

    @Given("user is on a landing page")
    public void user_is_on_a_landing_page() {
        System.out.println("user is on a landing page");
    }

    @When("user logs is with {string} and {string}")
    public void user_logs_is_with_and(String string, String string2) {
        System.out.printf("user logs in with credentials", string, string2);
    }

    @Then("user navigates to {string} and {string}")
    public void user_navigates_to_and(String string, String string2) {
        System.out.printf("User navigates to %tab and %module", string, string2);
    }

    @Then("user click on create car button")
    public void user_click_on_create_car_button() {
        System.out.println("user clicks on create car button");
    }

    @Then("user enters vehicles information:")
    public void user_enters_vehicles_information(List<Map<String, String>> dataTable) {
//        dataTable.forEach( p -> System.out.println(p));
        System.out.println("Driver: " + dataTable.get(0).get("Driver"));
        System.out.println("Driver: " + dataTable.get(0).get("Location"));

    }

}
