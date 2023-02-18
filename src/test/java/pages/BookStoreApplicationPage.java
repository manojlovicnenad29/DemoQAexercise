package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BookStoreApplicationPage extends BasePage {
    @FindBy(id = "item-0")
    private WebElement loginButton;
    @FindBy(id = "item-1")
    private WebElement bookStoreButton;
    @FindBy(id = "item-2")
    private WebElement profileButton;
    @FindBy(id = "item-3")
    private WebElement bookStoreApiButton;

    public BookStoreApplicationPage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }
}
