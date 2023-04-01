package tests;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.ElementsPage;
import pages.HomePage;

public class ElementsTests extends BaseTest {

    protected ElementsPage elementsPage;
    protected HomePage homePage;

    @BeforeClass
    public void beforeClass() {
        super.beforeClass();
        elementsPage = new ElementsPage(driver, driverWait);
        homePage = new HomePage(driver, driverWait);
    }

    @BeforeMethod
    public void beforeMethod() {
        super.beforeMethod();
        homePage.clickElementsButton();
    }

    //Test every field functionality (filled, blank, special characters, numbers)
    @Test
    public void goToTextBoxPageTest() {
        driverWait.until(ExpectedConditions.visibilityOf(elementsPage.getTextBoxButton()));
        elementsPage.textBoxButtonClick();
        Assert.assertTrue(driver.getCurrentUrl().equals("https://demoqa.com/text-box"));
    }

    @Test
    //happy flow
    public void submitTextBox() {
        driverWait.until(ExpectedConditions.visibilityOf(elementsPage.getTextBoxButton()));
        elementsPage.fillOutTexBoxForm();
        Assert.assertTrue(elementsPage.getOutputName().getText().contains(elementsPage.getFullNameBox().getText()));
        Assert.assertTrue(elementsPage.getOutputEmail().getText().contains(elementsPage.getEmailBox().getText()));
        Assert.assertEquals(elementsPage.getOutputCurrentAddress().getText(), elementsPage.getCurrentAddressBox().getText());
        Assert.assertEquals(elementsPage.getPermanentAddressBox().getText(), elementsPage.getOutputPermanentAddress().getText());
    }

    @Test
    //There is no return message, expected test failure.
    public void blankTextBox() {
        driverWait.until(ExpectedConditions.visibilityOf(elementsPage.getTextBoxButton()));
        elementsPage.textBoxButtonClick();
        Assert.assertTrue(elementsPage.getOutputName().getText().contains(elementsPage.getFullNameBox().getText()));
        Assert.assertTrue(elementsPage.getOutputEmail().getText().contains(elementsPage.getEmailBox().getText()));
        Assert.assertEquals(elementsPage.getOutputCurrentAddress().getText(), elementsPage.getCurrentAddressBox().getText());
        Assert.assertEquals(elementsPage.getPermanentAddressBox().getText(), elementsPage.getOutputPermanentAddress().getText());
    }

    @Test
    public void fillFirstNameWithLetter() {
        driverWait.until(ExpectedConditions.visibilityOf(elementsPage.getTextBoxButton()));
        elementsPage.fillTextBoxFirstNameLetter();
        Assert.assertTrue(elementsPage.getOutputName().getText().contains(elementsPage.getFullNameBox().getText()));
    }

    @Test
    public void fillFirstNameWithSpecialCharacter() {
        driverWait.until(ExpectedConditions.visibilityOf(elementsPage.getTextBoxButton()));
        elementsPage.fillTextBoxFirstNameSpecialCharacter();
        Assert.assertTrue(elementsPage.getOutputName().getText().contains(elementsPage.getFullNameBox().getText()));
    }

    @Test
    public void fillFirstNameWithJustSpace() {
        driverWait.until(ExpectedConditions.visibilityOf(elementsPage.getTextBoxButton()));
        elementsPage.fillTextBoxWithJustSpace();
        Assert.assertTrue(elementsPage.getOutputName().getText().contains(elementsPage.getFullNameBox().getText()));
    }

    @Test
    public void fillValidEmail() {
        driverWait.until(ExpectedConditions.visibilityOf(elementsPage.getTextBoxButton()));
        elementsPage.fillValidEmail();
        Assert.assertTrue(elementsPage.getOutputEmail().getText().contains(elementsPage.getEmailBox().getText()));
    }

    @Test //There is no return message, expected test failure.
    public void fillInvalidEmail() {
        driverWait.until(ExpectedConditions.visibilityOf(elementsPage.getTextBoxButton()));
        elementsPage.fillInvalidEmail();
        Assert.assertTrue(elementsPage.getOutputEmail().getText().contains(elementsPage.getEmailBox().getText()));
    }

    @Test //There is no return message, expected test failure.
    public void fillEmailJustWithSpace() {
        driverWait.until(ExpectedConditions.visibilityOf(elementsPage.getTextBoxButton()));
        elementsPage.fillEmailJustWithSpace();
        Assert.assertTrue(elementsPage.getOutputEmail().getText().contains(elementsPage.getEmailBox().getText()));
    }

    @Test //There is no return message, expected test failure.
    public void fillEmailWithSpecialCharacter() {
        driverWait.until(ExpectedConditions.visibilityOf(elementsPage.getTextBoxButton()));
        elementsPage.fillEmailWithSpecialCharacter();
        Assert.assertTrue(elementsPage.getOutputEmail().getText().contains(elementsPage.getEmailBox().getText()));
    }

}
