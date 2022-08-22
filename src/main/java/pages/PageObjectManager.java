package pages;

import org.openqa.selenium.WebDriver;
import pages.Download.DownloadPage;
import pages.Home.HomePage;
import pages.Login.LoginPage;
import pages.Post.PostPage;
import pages.Signup.SignupPage;
import pages.Website.Website;

public class PageObjectManager {

    public WebDriver driver;

    public PageObjectManager(WebDriver driver) {
        this.driver = driver;
    }

    public Website website() {
        return new Website(driver);
    }

    public DownloadPage download() {
        return new DownloadPage(driver);
    }

    public HomePage homePage() {
        return new HomePage(driver);
    }

    public LoginPage logIn() {
        return new LoginPage(driver);
    }

    public PostPage postPage() {
        return new PostPage(driver);
    }

    public SignupPage signUp() {
        return new SignupPage(driver);
    }
}
