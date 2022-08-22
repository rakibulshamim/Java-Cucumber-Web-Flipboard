package pages.Signup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class SignupPage {
    public static WebDriver driver;

    public SignupPage(WebDriver driver) {
        SignupPage.driver = driver;
    }

    By signupBtn = By.xpath("//div[@class='anchored-dialog-menu__wrapper']");
    By email = By.name("email");
    By emailField = By.xpath("(//div[@class='input-field'])[2]");
    By fullName = By.name("realName");
    By password = By.name("password");
    By topicPicker = By.xpath("//div[@class='onboarding-modal__topic-picker']/ul/button");
    By continueBtn = By.xpath("//button[normalize-space()='Continue']");
    By registeringTxt = By.xpath("//h1[@class='css-1cj1gma e1c2wyms1']");
    By gotItBtn = By.xpath("//footer[@class='modal__controls css-16vqmov e1r2g7ir1']/button");
    By skipForNowBtn = By.xpath("//button[contains(text(),'Skip for now')]");
    By facebookIcon = By.xpath("(//div[@class='css-1yjvs5a eyhuarf4']/button)[1]");

    public WebElement signup() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(signupBtn));
        return driver.findElement(signupBtn);
    }

    public void setEmail(String Email) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(email));
        driver.findElement(email).sendKeys(Email);
    }

    public void setEmailField(String email) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(emailField));
        driver.findElement(emailField).sendKeys(email);
    }

    public void setFullName(String FullName) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(fullName));
        driver.findElement(fullName).sendKeys(FullName);
    }

    public void setPassword(String Password) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(password));
        driver.findElement(password).sendKeys(Password);
    }

    public List<WebElement> topicPicker() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(topicPicker));
        return driver.findElements(topicPicker);
    }

    public WebElement continueButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(continueBtn));
        return driver.findElement(continueBtn);
    }

    public String registeringPopup() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(registeringTxt));
        return driver.findElement(registeringTxt).getText();
    }

    public WebElement gotItButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(gotItBtn));
        return driver.findElement(gotItBtn);
    }

    public WebElement skipForNow() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(signupBtn));
        return driver.findElement(skipForNowBtn);
    }

    public static String getPageTitle() {
        return driver.getTitle();
    }

    public WebElement facebook() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(facebookIcon));
        return driver.findElement(facebookIcon);
    }
}

