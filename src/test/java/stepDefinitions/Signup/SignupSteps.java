package stepDefinitions.Signup;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.Login.LoginPage;
import pages.Signup.SignupPage;
import utils.TestContextSetup;

public class SignupSteps {
    TestContextSetup testContextSetup;
    SignupPage signupPage;
    LoginPage loginPage;

    public SignupSteps(TestContextSetup testContextSetup) {
        this.testContextSetup = testContextSetup;
        this.signupPage = testContextSetup.pageObjectManager.signUp();
        this.loginPage = testContextSetup.pageObjectManager.logIn();
    }

    @Given("user visits signup page")
    public void user_visits_signup_page() throws InterruptedException {
        signupPage.signup().click();
        Thread.sleep(3000);
    }

    @When("user Enter {string}, {string} and {string}")
    public void user_Enter_and(String Email, String FullName, String Password) {
        signupPage.setEmail(Email);
        signupPage.setFullName(FullName);
        signupPage.setPassword(Password);
    }

    @When("user Enter {string} in the Enter your email field")
    public void user_enter_in_the_enter_your_email_field(String email) {
        signupPage.setEmailField(email);
    }

    @And("click on Continue button")
    public void click_on_continue_button() throws InterruptedException {
        signupPage.continueButton().click();
        Thread.sleep(10000);
    }

    @And("click on three topics")
    public void click_on_three_topics() throws InterruptedException {
        signupPage.topicPicker().get(0).click();
        Thread.sleep(2000);
        signupPage.topicPicker().get(1).click();
        Thread.sleep(2000);
        signupPage.topicPicker().get(2).click();
    }

    @When("verify that registering text is displayed")
    public void verify_that_registering_text_is_displayed() {
        Assert.assertEquals(signupPage.registeringPopup(), "Thanks for registering");
    }

    @When("click on Got it Button")
    public void click_on_got_it_button() {
        signupPage.gotItButton().click();
    }

    @When("click on Skip for now")
    public void click_on_skip_for_now() throws InterruptedException {
        signupPage.skipForNow().click();
        Thread.sleep(8000);
    }

    @Then("verify that home page is visible")
    public void verify_that_home_page_is_visible() {
        Assert.assertEquals("Flipboard: Your Social Magazine", LoginPage.getPageTitle());
    }

    @When("click on Facebook")
    public void click_on_facebook() throws InterruptedException {
        signupPage.facebook().click();
        Thread.sleep(3000);
        loginPage.switchWindow();
        Thread.sleep(3000);
    }

    @Then("signup successfully and validation of page title")
    public void signup_successfully_and_validation_of_page_title() {
        Assert.assertEquals("Flipboard: Your Social Magazine", SignupPage.getPageTitle());
    }
}
