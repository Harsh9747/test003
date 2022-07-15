package com.virgingames.steps;

import com.virgingames.pages.FreeGamesPage;
import com.virgingames.pages.HomePage;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class FreeGamePageStep {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
    }

    @When("^I click on free games link$")
    public void iClickOnFreeGamesLink() {
        new HomePage().clickOnCookies();
        new HomePage().clickOnFreeGamesLink();
    }


    @Then("^I should see \"([^\"]*)\" text message$")
    public void iShouldSeeTextMessage(String text){
        Assert.assertEquals("User is not on free games page", text, new FreeGamesPage().getDailyFreeGameText());
    }
}
