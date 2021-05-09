package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

enum BrowserType{
    CHROME, SAFARI, FIREFOX
}

public class WebDriverBase {
    public static WebDriver getDriver(String browserName, String url){
        BrowserType browser = BrowserType.valueOf(browserName.toUpperCase());
        WebDriver driver = null;
        switch(browser){
            case CHROME:
                System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/selenium-learning/src/main/resources/chromedriver7");
                driver = new ChromeDriver();
                break;
            case SAFARI:
                driver = new SafariDriver();
                break;
            case FIREFOX:
                System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"/selenium-learning/src/main/resources/geckodriver");
                driver = new FirefoxDriver();
                break;
            default:
                System.out.println("Invalid browser");
        }
        driver.get(url);
        driver.manage().window().maximize();

        //System.out.println(driver.getCurrentUrl());
        //System.out.println(driver.getTitle());
        return driver;
    }
}
