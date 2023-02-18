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

    @Test
    public void goToTextBoxPageTest() {
        driverWait.until(ExpectedConditions.visibilityOf(elementsPage.getTextBoxButton()));
        elementsPage.textBoxButtonClick();
        Assert.assertTrue(driver.getCurrentUrl().equals("https://demoqa.com/text-box"));
    }

    @Test
    public void submitTextBox() {
        driverWait.until(ExpectedConditions.visibilityOf(elementsPage.getTextBoxButton()));
        elementsPage.fillOutTexBoxForm();
        Assert.assertTrue(elementsPage.getOutputName().getText().contains(elementsPage.getFullNameBox().getText()));
        Assert.assertTrue(elementsPage.getOutputEmail().getText().contains(elementsPage.getEmailBox().getText()));
        Assert.assertEquals(elementsPage.getOutputCurrentAddress().getText(), elementsPage.getCurrentAddressBox().getText());
        Assert.assertEquals(elementsPage.getPermanentAddressBox().getText(), elementsPage.getOutputPermanentAddress().getText());
    }

}
