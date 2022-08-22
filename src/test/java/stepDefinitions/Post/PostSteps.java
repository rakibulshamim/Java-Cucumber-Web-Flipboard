package stepDefinitions.Post;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.Login.LoginPage;
import pages.Post.PostPage;
import utils.TestContextSetup;

public class PostSteps {
    PostPage postPage;
    LoginPage loginPage;
    TestContextSetup testContextSetup;

    public PostSteps(TestContextSetup testContextSetup) {
        this.testContextSetup = testContextSetup;
        this.postPage = testContextSetup.pageObjectManager.postPage();
        this.loginPage = testContextSetup.pageObjectManager.logIn();
    }

    @Given("click on Share icon in home page")
    public void click_on_share_icon_in_home_page() {
        postPage.homeShare().click();
    }

    @When("click on Share on Facebook button")
    public void click_on_share_on_facebook_button() throws InterruptedException {
        postPage.facebook().click();
        loginPage.switchWindow();
        Thread.sleep(3000);
    }

    @Then("click on Post To Facebook button")
    public void click_on_post_to_facebook_button() {
        postPage.post().click();
    }

    @When("click on Facebook login Button")
    public void click_on_Facebook_login_Button() {
        loginPage.setFbLogin().click();
    }

    @When("click on share the link below box and copy the link")
    public void click_on_share_the_link_below_box_and_copy_the_link() {
        postPage.shareLink().click();
    }

    @Then("verify that copied message is displayed")
    public void verify_that_copied_message_is_displayed() {
        Assert.assertEquals(postPage.messagesCopied(), "Copied!");
    }

    @Given("click on Flip icon in home page")
    public void click_on_flip_icon_in_home_page() {
        postPage.getHomeFlip().click();
    }

    @When("user enter {string} search magazines box")
    public void user_enter_search_magazines_box(String magazine_name) throws InterruptedException {
        postPage.searchMagazines(magazine_name);
        Thread.sleep(2000);
    }

    @Then("verify that search result is displayed correctly")
    public void verify_that_search_result_is_displayed_correctly() {
        Assert.assertEquals(postPage.searchResult(), "Test");
    }

    @When("click on Create Magazine button")
    public void click_on_create_magazine_button() {
        postPage.createMagazine().click();
    }

    @When("user enter magazine {string} in magazine name box")
    public void user_enter_magazine_in_magazine_name_box(String title) {
        postPage.setTitle(title);
    }

    @When("user enter magazine {string} magazine description box")
    public void user_enter_magazine_magazine_description_box(String description) {
        postPage.description(description);
    }

    @Then("verify that magazine created successfully")
    public void verify_that_magazine_created_successfully() {
        Assert.assertEquals(postPage.magazineCreatedPopup(), "Created magazine successfully");
    }

    @When("user enter a {string} in Add a comment box")
    public void user_enter_a_in_add_a_comment_box(String comment) {
        postPage.addComments(comment);
    }

    @And("click on comment Flip button")
    public void clickOnCommentFlipButton() {
        postPage.commentFlip().click();
    }

    @Then("verify that flipped popup is displayed")
    public void verify_that_flipped_popup_is_displayed() {
        Assert.assertTrue(postPage.flippedPopup());
    }

    @Given("click on Heart icon")
    public void click_on_heart_icon() {
        postPage.react().click();
    }

    @Then("verify that Heard icon is clicked")
    public void verify_that_heard_icon_is_clicked() {
//        Assert.assertTrue(postPage.react().isSelected());
    }

    @Given("click on The Daily Edition button")
    public void click_on_the_daily_edition_button() {
        postPage.theDailyEditionBtn().click();
    }

    @When("click on menu button")
    public void click_on_menu_button() {
        postPage.menu().click();
    }

    @And("click on Like button")
    public void click_on_like_button() {
        postPage.like().click();
    }

    @Then("verify that Like button is clicked")
    public void verify_that_like_button_is_clicked() {
//        Assert.assertTrue(postPage.like().isSelected());
    }

    @And("click on Flip button")
    public void click_on_flip_button() {
        postPage.flip().click();
    }

    @Then("verify that Flip button is clicked")
    public void verify_that_flip_button_is_clicked() {
//        Assert.assertTrue(postPage.commentFlip().isSelected());
    }

    @Then("click on Share button in Daily Edition page")
    public void click_on_share_button_in_daily_edition_page() {
        postPage.dailyEditionShare().click();
    }

    @Then("verify that Share button in Daily Edition page is clicked")
    public void verify_that_share_button_in_daily_edition_page_is_clicked() {
//        Assert.assertTrue(postPage.dailyEditionShare().isSelected());
    }

    @When("click on report button")
    public void click_on_report_button() {
        postPage.setReport().click();
    }

    @When("click on report button in report content")
    public void click_on_report_button_in_report_content() {
        postPage.reported().click();
    }

    @Then("verify that content is reported successfully")
    public void verify_that_content_is_reported_successfully() throws InterruptedException {
        Assert.assertEquals(postPage.reportedMessage(), "Content reported successfully.");
        Thread.sleep(3000);
    }

    @When("click on follow or unfollow button")
    public void click_on_follow_or_unfollow_button() {
        postPage.follow().click();
    }

    @Then("verify that follow or unfollow button is clicked")
    public void verify_that_follow_or_unfollow_button_is_clicked() {
//        Assert.assertTrue(postPage.follow().isSelected());
    }

    @Given("click on avatar icon")
    public void click_on_avatar_icon() {
        postPage.avatar().click();
    }

    @When("click on profile")
    public void click_on_profile() throws InterruptedException {
        postPage.profile().click();
        Thread.sleep(3000);
    }

    @Then("verify that profile page is visible")
    public void verify_that_profile_page_is_visible() throws InterruptedException {
        Thread.sleep(3000);
        Assert.assertEquals("Flipboard - Profile", PostPage.getPageTitle());
    }
}
