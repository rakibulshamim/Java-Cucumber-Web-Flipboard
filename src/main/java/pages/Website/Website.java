package pages.Website;

import org.openqa.selenium.WebDriver;

public class Website {
    public static WebDriver driver;

    public Website(WebDriver driver) {
        Website.driver = driver;
    }

    public static String getPageTitle() {
        return driver.getTitle();
    }
}
