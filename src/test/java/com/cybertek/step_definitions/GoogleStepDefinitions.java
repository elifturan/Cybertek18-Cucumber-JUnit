package com.cybertek.step_definitions;


import com.cybertek.pages.googleSearchPage;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

import java.util.List;

public class GoogleStepDefinitions {

    googleSearchPage googleSearchPage= new googleSearchPage();

    @Given("User is on the google search page")
    public void user_is_on_the_google_search_page() {
      //  Assert.fail("Unpurpose failing here!!!!!!!!");

        Driver.getDriver().get("https://www.google.com");
    }


   // Some other steps were also undefined:

    @Then("User should see title is Google")
    public void user_should_see_title_is_google() {

     String actualTitle = Driver.getDriver().getTitle();
     String expectedTitle = "Google";




        Assert.assertEquals("Actual title does not match expected title!",actualTitle,expectedTitle);




    }


    @When("User searches apple")
    public void userSearchesApple() {

        googleSearchPage.searchBox.sendKeys("apple"+ Keys.ENTER);
        System.out.println("");
    }

    @Then("User should see apple in the Title")
    public void userShouldSeeAppleInTheTitle() {


        Assert.assertEquals("apple - Google Search",Driver.getDriver().getTitle());
        System.out.println("");
    }

    @When("User searches {string}")
    public void userSearches(String searchValue) {

        googleSearchPage.searchBox.sendKeys(searchValue+ Keys.ENTER);
    }

    @Then("User should see {string} in the Title")
    public void userShouldSeeInTheTitle(String searchValue) {
        Assert.assertEquals(searchValue+" - Google Search",Driver.getDriver().getTitle());
      //  System.out.println("");

    }

    @Then("User should see About link")
    public void userShouldSeeAboutLink() {
        Assert.assertTrue(googleSearchPage.aboutLink.isDisplayed());
    }


    @And("User clicks to About link")
    public void userClicksToAboutLink() {
        googleSearchPage.aboutLink.click();
    }

    @Then("User should see title Google - About Google, Our Culture & Company News")
    public void userShouldSeeTitleGoogleAboutGoogleOurCultureCompanyNews() {
        Assert.assertEquals("Google - About Google, Our Culture & Company News",Driver.getDriver().getTitle());
    }


    @Then("User should see six links in the footer")
    public void user_should_see_six_links_in_the_footer(List<String> links) {

int expectedSize = links.size();
int actualSize = googleSearchPage.footerLinks.size();
        System.out.println("links = " + links);

Assert.assertEquals(actualSize,expectedSize);
      //  System.out.println("links.size() = " + links.size());


    }



}
