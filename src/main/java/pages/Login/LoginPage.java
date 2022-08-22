package pages.Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

public class LoginPage {
    public static WebDriver driver;

    public LoginPage(WebDriver driver) {
        LoginPage.driver = driver;
    }

    By loginBtn = By.xpath("(//a[@class=\"button--base internal-link\"])[1]");
    By userName = By.xpath("//*[@name=\"username\"]");
    By passWord = By.xpath("//*[@name=\"password\"]");
    By facebookIcon = By.xpath("(//div[@class='css-1lsiokx egggxyu0']/button)[1]");
    By userId = By.id("email");
    By fbPassword = By.id("pass");
    By loginBtn2 = By.xpath("//button[normalize-space()='Log In']");
    By fbLoginBtn = By.name("login");

    public WebElement login() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(loginBtn));
        return driver.findElement(loginBtn);
    }

    public void setUserName(String username) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(userName));
        driver.findElement(userName).sendKeys(username);
    }

    public void setPassword(String password) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(passWord));
        driver.findElement(passWord).sendKeys(password);
    }

    public WebElement setLogin() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(loginBtn));
        return driver.findElement(loginBtn2);
    }

    public WebElement signInByFacebook() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(facebookIcon));
        return driver.findElement(facebookIcon);
    }

    public void switchWindow() throws InterruptedException {
        String parentHandle = driver.getWindowHandle();
        Set<String> handles = driver.getWindowHandles();
        for (String handle : handles) {
            if (!handle.equals(parentHandle)) {
                driver.switchTo().window(handle);
                Thread.sleep(5000);
            }
        }
    }

    public void setUserId(String Phone) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(userId));
        driver.findElement(userId).sendKeys(Phone);
    }

    public void setFBPassword(String FbPassword) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(fbPassword));
        driver.findElement(fbPassword).sendKeys(FbPassword);
    }

    public WebElement setFbLogin() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(fbLoginBtn));
        return driver.findElement(fbLoginBtn);
    }

    public void switchTab() {
        ArrayList<String> w = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(w.get(0));
    }

    public static String getPageTitle() {
        return driver.getTitle();
    }
}

