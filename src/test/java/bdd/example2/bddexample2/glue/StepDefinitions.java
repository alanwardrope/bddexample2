package bdd.example2.bddexample2.glue;

/**
 * Created by vanwh on 18/01/2017.
 */
import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import bdd.example2.bddexample2.framework.ParentScenario;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class StepDefinitions extends ParentScenario {

    @Before
    public void beforeScenario() {
        startBrowser();
    }

    // Download Steps
    @Given("^I am on the Selenium homepage$")
    public void I_am_on_the_Selenium_homepage() {
        navigateTo();
    }

    @When("^I click on \"([^\"]*)\" tab$")
    public void I_click_tab_on(String tab) {
        mainPage.clickTab(tab);
    }

    @Then("^I should see \"([^\"]*)\" Download link on Download page$")
    public void I_should_see_download_link_on_download_page(String linkText) {
        System.out.println("Link is  : " + linkText);
        assertThat(downloadPage.hasDownloadLinkFor(linkText), is(true));
    }

    // Homepage Steps
    @When("^I read the \"([^\"]*)\" page$")
    public void I_read_the_page(String pgName) {
        // Write code here that turns the phrase above into concrete actions

        switch (pgName) {
            case "home":
                assertThat(commonPage.pageHasTitle(pgName), is("Selenium - Web Browser Automation"));
                break;
            case "download":
                assertThat(pgName, is("Downloads"));
                break;
            default:
                throw new IllegalArgumentException("Invalid page name: " + pgName);
        }
    }

    @Then("^I should see a section for \"([^\"]*)\"$")
    public void I_should_see_a_section_for(String sectionTitle) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Section Title is : " + sectionTitle);
        assertThat(mainPage.hasSectionHeaderFor(sectionTitle), is(true));
    }


    @After
    public void afterScenario() {
        closeBrowser();
    }
}