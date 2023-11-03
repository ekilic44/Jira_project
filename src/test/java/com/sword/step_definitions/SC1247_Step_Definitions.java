package com.sword.step_definitions;

import com.sword.pages.Authorization_Page;
import com.sword.pages.Portal_Page;
import com.sword.utilities.ConfigurationReader;
import com.sword.utilities.Driver;
import com.sword.utilities.Timer;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class SC1247_Step_Definitions {
        Authorization_Page authorization_page = new Authorization_Page();
        Portal_Page portal_page = new Portal_Page();

        @Given("Users should go to the Authorization page")
        public void users_should_go_to_the_authorization_page() {
            Driver.getDriver().get(ConfigurationReader.getProperty("Authorization.url"));
        }

        @Given("Users should enter valid user name")
        public void users_should_enter_valid_user_name() {
            authorization_page.userName.sendKeys("helpdesk1@cybertekschool.com");

        }

        @Given("Users should enter valid password")
        public void users_should_enter_valid_password() throws InterruptedException {
            Thread.sleep(3000);
            authorization_page.password.sendKeys("UserUser");
        }

        @Given("Users should click the Log in button")
        public void users_should_click_the_log_in_button() {
            authorization_page.login.click();
        }

        @Then("Users are on the Portal page")
        public void users_are_on_the_portal_page() {
            Assert.assertTrue(Driver.getDriver().getTitle().contains("Portal"));
        }

        @When("Users click profile dropdown should see Log out option")
        public void users_click_profile_dropdown_should_see_log_out_option() {
            portal_page.profileDropdown.click();
        }

        @When("Users click Log out option")
        public void users_click_log_out_option() {
            portal_page.logout.click();
        }

        @Then("Users should be on the Authorization page")
        public void users_should_be_on_the_authorization_page() {
            Assert.assertTrue(Driver.getDriver().getTitle().contains("Authorization"));
        }


    @Then("users")
    public void users() {
    }
}