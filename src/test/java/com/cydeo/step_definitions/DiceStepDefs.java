package com.cydeo.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DiceStepDefs {

    @Given("User is on dice homepage")
    public void user_is_on_dice_homepage() {
        System.out.println("User is on dice homepage");

    }
    @When("User enters keyword and zipcode")
    public void user_enters_keyword_and_zipcode() {
        System.out.println("User enters keyword and zipcode ");

    }
    @Then("User should see search result")
    public void user_should_see_search_result() {
        System.out.println("User should see search result");

    }


}
