package pages.Download;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DownloadPage {
    public static WebDriver driver;

    public DownloadPage(WebDriver driver) {
        DownloadPage.driver = driver;
    }

    By hrefTools = By.xpath("//a[contains(text(),'Tools')]");
    By hrefIOS = By.xpath("//li[@id='menu-item-18257']");
    By hrefAndroid = By.xpath("//li[@id='menu-item-18250']");

    public WebElement tools() {
        return driver.findElement(hrefTools);
    }

    public WebElement availableOniOS() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(hrefIOS));
        return driver.findElement(hrefIOS);
    }

    public WebElement availableOnAndroid() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(hrefAndroid));
        return driver.findElement(hrefAndroid);
    }

    public static String getPageTitle() {
        return driver.getTitle();
    }
}
