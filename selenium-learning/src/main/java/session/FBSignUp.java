package session;

import base.WebDriverBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FBSignUp extends WebDriverBase {
    String url = "https://www.facebook.com/";
    // WebElement Locator
    By linkCreateNewButton = By.linkText("Create New Account");
    By lblSignUp = By.xpath("//div[text()='Sign Up']");
    By txtFirstName = By.name("firstname");
    By dropdownDOBDay = By.id("day");
    By dropDownDOBDaySelected = By.xpath("//select[@id='day']//option[@selected='1']");
    By radioGenderFemale = By.xpath("//input[@type='radio' and @name='sex' and @value='1']/preceding::label");

    public void validateSignUpForm() throws InterruptedException {
        WebDriver driver = getDriver("chrome",url);
        System.out.println(driver.getTitle());
        WebElement elemCreateNewAccount = driver.findElement(linkCreateNewButton);
        elemCreateNewAccount.click();
        Thread.sleep(10000);
        System.out.println(driver.findElement(lblSignUp).getText());
        System.out.println(driver.findElement(txtFirstName).getAttribute("aria-label"));
        System.out.println(driver.findElement(radioGenderFemale).getText());
        System.out.println(driver.findElement(dropDownDOBDaySelected).getText());
        driver.findElement(txtFirstName).sendKeys("Subodh");
        Select elemDOBDay = new Select(driver.findElement(dropdownDOBDay));
        elemDOBDay.selectByVisibleText("1");
        System.out.println(driver.findElement(dropDownDOBDaySelected).getText());
    }

    public static void main(String[] args) throws InterruptedException {
        FBSignUp fbSignUp = new FBSignUp();
        fbSignUp.validateSignUpForm();
    }
}
