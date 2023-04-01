package pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
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

    public void fillTextBoxFirstNameLetter() {
        textBoxButtonClick();
        fullNameBox.click();
        fullNameBox.sendKeys("a");
        submitButton.click();
    }

    public void fillTextBoxFirstNameSpecialCharacter() {
        textBoxButtonClick();
        fullNameBox.click();
        fullNameBox.sendKeys(Keys.DECIMAL);
        submitButton.click();
    }

    public void fillTextBoxWithJustSpace() {
        textBoxButtonClick();
        fullNameBox.click();
        fullNameBox.sendKeys(Keys.SPACE);
        submitButton.click();
    }

    public void fillValidEmail() {
        textBoxButtonClick();
        emailBox.click();
        emailBox.sendKeys("example@gmail.com");
        submitButton.click();
    }

    public void fillInvalidEmail() {
        textBoxButtonClick();
        emailBox.click();
        emailBox.sendKeys("example");
        submitButton.click();
    }

    public void fillEmailJustWithSpace() {
        textBoxButtonClick();
        emailBox.click();
        emailBox.sendKeys(Keys.SPACE);
        submitButton.click();
    }

    public void fillEmailWithSpecialCharacter() {
        textBoxButtonClick();
        emailBox.click();
        emailBox.sendKeys("example`@gmail.com");
        submitButton.click();
    }

    public void emptyCurrentAddress() {
        textBoxButtonClick();
        currentAddressBox.click();
        submitButton.click();
    }

    public void fillCurrentAddressWithValidAddress() {
        textBoxButtonClick();
        currentAddressBox.click();
        currentAddressBox.sendKeys("13th Street. 47 W 13th St, New York, NY 10011, USA");
        submitButton.click();
    }

    public void fillCurrentAddressWithSpace() {
        textBoxButtonClick();
        currentAddressBox.click();
        currentAddressBox.sendKeys(Keys.SPACE);
        submitButton.click();
    }

    public void fillCurrentAddressWithSpecialCharacter() {
        textBoxButtonClick();
        currentAddressBox.click();
        currentAddressBox.sendKeys(Keys.DECIMAL);
        submitButton.click();
    }

    public void emptyPermanentAddress() {
        textBoxButtonClick();
        permanentAddressBox.click();
        submitButton.click();
    }

    public void fillPermanentAddressWithValidAddress() {
        textBoxButtonClick();
        permanentAddressBox.click();
        permanentAddressBox.sendKeys("13th Street. 47 W 13th St, New York, NY 10011, USA");
        submitButton.click();
    }

    public void fillPermanentAddressWithSpecialCharacter() {
        textBoxButtonClick();
        permanentAddressBox.click();
        permanentAddressBox.sendKeys(Keys.DECIMAL);
        submitButton.click();
    }

    public void fillPermanentAddressWithSpace() {
        textBoxButtonClick();
        permanentAddressBox.click();
        permanentAddressBox.sendKeys(Keys.SPACE);
        submitButton.click();
    }
}
