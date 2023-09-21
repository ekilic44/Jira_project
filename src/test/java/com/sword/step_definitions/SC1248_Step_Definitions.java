package com.sword.step_definitions;

import com.sword.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class SC1248_Step_Definitions {

    @When("Users click the step back button")
    public void users_click_the_step_back_button() {
        Driver.getDriver().navigate().back();
    }

    @Then("Users should stay on the same page")
    public void users_should_stay_on_the_same_page() {
            Assert.assertTrue(Driver.getDriver().getTitle().contains("Authorization"));
    }


}
