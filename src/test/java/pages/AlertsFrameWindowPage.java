package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertsFrameWindowPage extends BasePage {

    @FindBy(id = "item-0")
    private WebElement browserWindowsButton;
    @FindBy(id = "item-1")
    private WebElement alertsButton;
    @FindBy(id = "item-2")
    private WebElement framesButton;
    @FindBy(id = "item-3")
    private WebElement nestedFramesButton;
    @FindBy(id = "item-4")
    private WebElement modalDialogsButton;

    public AlertsFrameWindowPage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }


}
