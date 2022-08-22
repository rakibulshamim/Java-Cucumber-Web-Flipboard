package pages.Home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {
    public static WebDriver driver;

    public HomePage(WebDriver driver) {
        HomePage.driver = driver;
    }

    By hrefForYou = By.xpath("//h2[contains(text(),'For You')]");
    By hrefDailyEdition = By.xpath("(//a[@class='css-8kn8dq emi04ju8 internal-link'])[2]");
    By personalizeIcon = By.xpath("//header/div[1]/button[1]");
    By personalizeTitle = By.xpath("//header[@class='topic-customization__header']/h1/span");
    By personalizePopup = By.xpath("//div[@class='toast-message__content']/p");
    By selectBtn = By.xpath("//body/div[1]/div[1]/div[1]/div[1]/div[2]/section[1]/div[2]/div[2]/div[1]/ul[1]/button[1]");
    By saveBtn = By.xpath("(//button[normalize-space()='Save'])[1]");
    By confirmSaveBtn = By.xpath("(//footer[@class='modal__controls css-16vqmov e1r2g7ir1']/button)[2]");

    public WebElement forYou() {
        return driver.findElement(hrefForYou);
    }

    public String forYouTitle() {
        return driver.findElement(hrefForYou).getText();
    }

    public WebElement theDailyEdition() {
        return driver.findElement(hrefDailyEdition);
    }

    public WebElement personalizeForYou() {
        return driver.findElement(personalizeIcon);
    }

    public String personalizeTitle() {
        return driver.findElement(personalizeTitle).getText();
    }

    public boolean personalizePopup() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(personalizePopup));
        return driver.findElement(personalizePopup).isDisplayed();
    }

    public WebElement selectTopic() {
        return driver.findElement(selectBtn);
    }

    public WebElement save() {
        return driver.findElement(saveBtn);
    }

    public WebElement confirmSave() {
        return driver.findElement(confirmSaveBtn);
    }

    public static String getPageTitle() {
        return driver.getTitle();
    }
}
