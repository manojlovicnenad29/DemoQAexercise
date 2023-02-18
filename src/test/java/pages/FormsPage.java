package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FormsPage extends BasePage{

    @FindBy(id = "item-0")
    private WebElement practiceFormButton;

    public FormsPage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }
}
