package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WigdetPage extends BasePage {
    @FindBy(id = "item-0")
    private WebElement accordianButton;
    @FindBy(id = "item-1")
    private WebElement autoCompleteButton;
    @FindBy(id = "item-2")
    private WebElement datePickerButton;
    @FindBy(id = "item-3")
    private WebElement sliderButton;
    @FindBy(id = "item-4")
    private WebElement progressBarButton;
    @FindBy(id = "item-5")
    private WebElement tabsButton;
    @FindBy(id = "item-6")
    private WebElement toolTipsButton;
    @FindBy(id = "item-7")
    private WebElement menuButton;
    @FindBy(id = "item-8")
    private WebElement selectMenuButton;

    public WigdetPage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }
}
