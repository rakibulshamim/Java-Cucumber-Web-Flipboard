package pages.Post;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PostPage {
    public static WebDriver driver;

    public PostPage(WebDriver driver) {
        PostPage.driver = driver;
    }

    By facebookBtn = By.xpath("(//section[@class='share modal__content']/div/button)[1]");
    By postBtn = By.name("__CONFIRM__");
    By linkTxt = By.xpath("//div[@class=\"input-field\"]");
    By copiedMsg = By.xpath("//p[contains(text(),\"Copied\")]");
    By search = By.name("flip-compose-magazine-search");
    By searchResult = By.xpath("(//div[contains(@class,'button--unstyled__children')])[5]");
    By createBtn = By.xpath("//div[@class='flip-compose__create-magazine-thumbnail']");
    By titleField = By.name("title");
    By descriptionTxt = By.xpath("//textarea[@class='create-magazine__description']");
    By caption = By.name("captionText");
    By commentFlipBtn = By.xpath("//button[@type='submit']");
    By flipBtn = By.xpath("//button[@title='Flip']");
    By popup = By.xpath("//div[@class='toast-message__content']/p");
    By reactBtn = By.xpath("(//div[@class='css-p4wywr e1it2bgh1']/button)[1]");
    By menuBtn = By.xpath("(//div[@class='anchored-dialog-menu__wrapper']/div)[1]");
    By reportBtn = By.xpath("//span[contains(text(),'Report')]");
    By reportedBtn = By.xpath("//button[contains(text(),'Report')]");
    By reportedMsg = By.xpath("//p[contains(text(),'Content reported successfully.')]");
    By dailyEditionBtn = By.xpath("//h2[contains(text(),'The Daily Edition')]");
    By followBtn = By.xpath("//body/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/main[1]/div[2]/div[1]/div[2]/div[1]/button[1]");
    By dailyEditionShareBtn = By.xpath("//button[@title='Share']");
    By avatarIcon = By.xpath("(//picture[@class='css-1opdvho e1kiqfk30'])[1]");
    By profileBtn = By.xpath("//a[contains(text(),'Profile')]");
    By likeBtn = By.xpath("//span[contains(text(),'Like')]");
    By homeShareIcon = By.xpath("(//div[@class='css-16r705y e1it2bgh0']/button)[2]");
    By homeFlipIcon = By.xpath("(//div[@class='css-16r705y e1it2bgh0']/button)[1]");

    public WebElement facebook() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(facebookBtn));
        return driver.findElement(facebookBtn);
    }

    public WebElement post() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(postBtn));
        return driver.findElement(postBtn);
    }

    public WebElement shareLink() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(linkTxt));
        return driver.findElement(linkTxt);
    }

    public String messagesCopied() {
        return driver.findElement(copiedMsg).getText();
    }

    public void searchMagazines(String magazine_name) {
        driver.findElement(search).sendKeys(magazine_name);
    }

    public String searchResult() {
        return driver.findElement(searchResult).getText();
    }

    public WebElement createMagazine() {
        return driver.findElement(createBtn);
    }

    public void setTitle(String title) {
        driver.findElement(titleField).sendKeys(title);
    }

    public void description(String description) {
        driver.findElement(descriptionTxt).sendKeys(description);
    }

    public String magazineCreatedPopup() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(popup));
        return driver.findElement(popup).getText();
    }

    public void addComments(String comment) {
        driver.findElement(caption).sendKeys(comment);
    }

    public WebElement commentFlip() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(commentFlipBtn));
        return driver.findElement(commentFlipBtn);
    }

    public boolean flippedPopup() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(popup));
        return driver.findElement(popup).isDisplayed();
    }

    public WebElement dailyEditionShare() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(dailyEditionBtn));
        return driver.findElement(dailyEditionShareBtn);
    }

    public WebElement react() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(reactBtn));
        return driver.findElement(reactBtn);
    }

    public WebElement flip() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(flipBtn));
        return driver.findElement(flipBtn);
    }

    public WebElement menu() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(menuBtn));
        return driver.findElement(menuBtn);
    }

    public WebElement setReport() {
        return driver.findElement(reportBtn);
    }

    public WebElement reported() {
        return driver.findElement(reportedBtn);
    }

    public String reportedMessage() {
        return driver.findElement(reportedMsg).getText();
    }

    public WebElement follow() {
        return driver.findElement(followBtn);
    }

    public WebElement avatar() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(avatarIcon));
        return driver.findElement(avatarIcon);
    }

    public WebElement profile() {
        return driver.findElement(profileBtn);
    }

    public WebElement like() {
        return driver.findElement(likeBtn);
    }

    public WebElement theDailyEditionBtn() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(dailyEditionBtn));
        return driver.findElement(dailyEditionBtn);
    }

    public WebElement homeShare() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(homeShareIcon));
        return driver.findElement(homeShareIcon);
    }

    public WebElement getHomeFlip() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(homeFlipIcon));
        return driver.findElement(homeFlipIcon);
    }

    public static String getPageTitle() {
        return driver.getTitle();
    }
}
