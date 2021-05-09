package session;

import base.WebDriverBase;
import org.openqa.selenium.WebDriver;

public class LaunchBrowser extends WebDriverBase {

    public static void main(String[] args) {
       WebDriver driver = getDriver("chrome","http://www.google.co.in");
       driver.quit();
    }
}
