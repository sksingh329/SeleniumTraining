package basics;

import base.WebDriverBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FBSignUp extends WebDriverBase {
    String url = "https://www.facebook.com/";
    By linkCreateNewAccount = By.linkText("Create New Account");
    By labelSignUpHeader = By.xpath("//div[contains(text(),'Sign Up')]");
    By labelSignUpHelper = By.xpath("//div[contains(text(),\"It's quick and easy.\")]");
    By txtFirstName = By.name("firstname");
    By txtLastName = By.name("lastname");
    By txtEmailId = By.name("reg_email__");
    By txtReEmailId = By.name("reg_email_confirmation__");
    By txtPassword = By.id("password_step_input");
    By dropDownBirthDay = By.name("birthday_day");
    By dropDownBirthMonth = By.name("birthday_month");
    By dropDownBirthYear = By.name("birthday_year");
    By labelGenderFemale = By.xpath("//input[@type='radio' and @name='sex' and @value='1']/preceding::label");
    By valueBirthDay = By.xpath("//select[@id='day']//option[@selected='1']");

    public void validateSignUpForm() throws InterruptedException {
        WebDriver driver = getDriver("chrome",url);
        System.out.println(driver.getTitle());
        driver.findElement(linkCreateNewAccount).click();
        Thread.sleep(10000);
        String header = driver.findElement(labelSignUpHeader).getText();
        System.out.println(header);
        String helper = driver.findElement(labelSignUpHelper).getText();
        System.out.println(helper);
        driver.findElement(txtFirstName).sendKeys("Subodh");
        System.out.println(driver.findElement(labelGenderFemale).getText());
        System.out.println(driver.findElement(valueBirthDay).getText());

    }

    public static void main(String[] args) throws InterruptedException {
        FBSignUp fbSignUp = new FBSignUp();
        fbSignUp.validateSignUpForm();
    }
}
