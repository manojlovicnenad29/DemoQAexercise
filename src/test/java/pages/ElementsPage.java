package pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementsPage extends BasePage {
    protected Faker faker = new Faker();

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

    @FindBy(id = "userName")
    private WebElement fullNameBox;
    @FindBy(id = "userEmail")
    private WebElement emailBox;
    @FindBy(id = "currentAddress")
    private WebElement currentAddressBox;
    @FindBy(id = "permanentAddress")
    private WebElement permanentAddressBox;

    @FindBy(id = "submit")
    private WebElement submitButton;

    @FindBy(id = "output")
    private WebElement outputBox;

    @FindBy(id = "userForm")
    private WebElement userForm;

    @FindBy(id = "name")
    private WebElement outputName;

    @FindBy(id = "email")
    private WebElement outputEmail;

    @FindBy(id = "currentAddress")
    private WebElement outputCurrentAddress;

    @FindBy(id = "permanentAddress")
    private WebElement outputPermanentAddress;

    public ElementsPage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }

    public WebElement getTextBoxButton() {
        return textBoxButton;
    }

    public WebElement getCheckBoxButton() {
        return checkBoxButton;
    }

    public WebElement getRadioButton() {
        return radioButton;
    }

    public WebElement getWebTablesButton() {
        return webTablesButton;
    }

    public WebElement getButtonsButton() {
        return buttonsButton;
    }

    public WebElement getLinksButton() {
        return linksButton;
    }

    public WebElement getBrokenLinksImagesButton() {
        return brokenLinksImagesButton;
    }

    public WebElement getUploadAndDownloadButton() {
        return uploadAndDownloadButton;
    }

    public WebElement getDynamicPropertiesButton() {
        return dynamicPropertiesButton;
    }

    public WebElement getOutputBox() {
        return outputBox;
    }

    public WebElement getUserForm() {
        return userForm;
    }

    public WebElement getFullNameBox() {
        return fullNameBox;
    }

    public WebElement getEmailBox() {
        return emailBox;
    }

    public WebElement getCurrentAddressBox() {
        return currentAddressBox;
    }

    public WebElement getPermanentAddressBox() {
        return permanentAddressBox;
    }

    public WebElement getSubmitButton() {
        return submitButton;
    }

    public WebElement getOutputName() {
        return outputName;
    }

    public WebElement getOutputEmail() {
        return outputEmail;
    }

    public WebElement getOutputCurrentAddress() {
        return outputCurrentAddress;
    }

    public WebElement getOutputPermanentAddress() {
        return outputPermanentAddress;
    }

    public void textBoxButtonClick() {
        textBoxButton.click();
    }

    public void fillOutTexBoxForm() {
        textBoxButtonClick();
        fullNameBox.click();
        fullNameBox.sendKeys(faker.name().fullName());
        emailBox.click();
        emailBox.sendKeys(faker.internet().emailAddress());
        currentAddressBox.click();
        currentAddressBox.sendKeys(faker.address().fullAddress());
        permanentAddressBox.click();
        permanentAddressBox.sendKeys(faker.address().fullAddress());
        submitButton.click();
    }

}
