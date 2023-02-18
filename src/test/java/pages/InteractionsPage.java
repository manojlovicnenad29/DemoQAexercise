package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InteractionsPage extends BasePage {
    @FindBy(id = "item-0")
    private WebElement sortableButton;
    @FindBy(id = "item-1")
    private WebElement selectableButton;
    @FindBy(id = "item-2")
    private WebElement resizableButton;
    @FindBy(id = "item-3")
    private WebElement droppableButton;
    @FindBy(id = "item-4")
    private WebElement dragabbleButton;

    public InteractionsPage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }
}
