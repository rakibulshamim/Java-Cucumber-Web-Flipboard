package stepDefinitions.Home;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.Home.HomePage;
import pages.Login.LoginPage;
import utils.TestContextSetup;

public class HomeSteps {
    TestContextSetup testContextSetup;
    HomePage homePage;
    LoginPage loginPage;

    public HomeSteps(TestContextSetup testContextSetup) {
        this.testContextSetup = testContextSetup;
        this.homePage = testContextSetup.pageObjectManager.homePage();
        this.loginPage = testContextSetup.pageObjectManager.logIn();
    }

    @Given("click on For You")
    public void click_on_for_you() throws InterruptedException {
        homePage.forYou().click();
        Thread.sleep(3000);
    }

    @Then("verify that For You page is visible")
    public void verify_that_for_you_page_is_visible() {
        Assert.assertEquals(homePage.forYouTitle(), "FOR YOU");
    }

    @Given("click on The Daily Edition")
    public void click_on_the_daily_edition() throws InterruptedException {
        homePage.theDailyEdition().click();
        Thread.sleep(3000);
    }

    @Then("verify that The Daily Edition page is visible")
    public void verify_that_the_daily_edition_page_is_visible() {
        Assert.assertEquals(HomePage.getPageTitle(), "The Daily Edition | Flipboard");
    }

    @Given("click on personalize icon")
    public void click_on_personalize_icon() throws InterruptedException {
        homePage.personalizeForYou().click();
        Thread.sleep(2000);
    }

    @When("verify that personalize tab is open")
    public void verify_that_personalize_tab_is_open() {
        Assert.assertEquals(homePage.personalizeTitle(), "PERSONALIZE FOR YOU");
    }

    @When("user select favorite topic from list")
    public void user_select_favorite_topic_from_list() throws InterruptedException {
        homePage.selectTopic().click();
        Thread.sleep(2000);
    }

    @And("click on save button")
    public void click_on_save_button() throws InterruptedException {
        homePage.save().click();
        Thread.sleep(1000);
    }

    @And("click on confirm save button")
    public void click_on_confirm_save_button() {
        homePage.confirmSave().click();
    }

    @Then("verify that followed or unfollowed notification popup is displayed properly")
    public void verify_that_followed_or_unfollowed_notification_popup_is_displayed_properly() {
        Assert.assertTrue(homePage.personalizePopup());
    }
}
