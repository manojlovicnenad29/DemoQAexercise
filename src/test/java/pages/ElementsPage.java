package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementsPage extends BasePage {

    @FindBy(id = "item-0")
    private WebElement textBoxButton;
    @FindBy(id = "item-1")
    private WebElement checkBoxButton;
    @FindBy(id = "item-2")
    private WebElement radioButton;
    @FindBy(id = "item-3")
    private WebElement webTablesButton;
    @FindBy(id = "item-4")
    private WebElement buttonsButton;
    @FindBy(id = "item-5")
    private WebElement linksButton;
    @FindBy(id = "item-6")
    private WebElement brokenLinksImagesButton;
    @FindBy(id = "item-7")
    private WebElement uploadAndDownloadButton;
    @FindBy(id = "item-8")
    private WebElement dynamicPropertiesButton;

    public ElementsPage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }

}
