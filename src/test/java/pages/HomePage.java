package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage {
    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div/div[2]/svg")
    private WebElement elementsButton;
    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div/div[2]/svg")
    private WebElement formsButton;
    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div[2]/div/div[3]/div/div[2]/svg")
    private WebElement alertsFrameWindowsButton;
    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div[2]/div/div[4]/div/div[2]/svg")
    private WebElement widgetsButton;
    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div[2]/div/div[5]/div/div[2]/svg")
    private WebElement interactionsButton;
    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div[2]/div/div[6]/div/div[2]/svg")
    private WebElement bookStoreApplicationsButton;
    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div[1]/a/img")
    private WebElement joinNowBanner;

    public HomePage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }

    public WebElement getElementsButton() {
        return elementsButton;
    }

    public WebElement getFormsButton() {
        return formsButton;
    }

    public WebElement getAlertsFrameWindowsButton() {
        return alertsFrameWindowsButton;
    }

    public WebElement getWidgetsButton() {
        return widgetsButton;
    }

    public WebElement getInteractionsButton() {
        return interactionsButton;
    }

    public WebElement getBookStoreApplicationsButton() {
        return bookStoreApplicationsButton;
    }

    public WebElement getJoinNowBanner() {
        return joinNowBanner;
    }
}
