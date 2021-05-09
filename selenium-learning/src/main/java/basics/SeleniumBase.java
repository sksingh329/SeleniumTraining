package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

enum BrowserType{
    CHROME, FIREFOX, SAFARI;
}

public class SeleniumBase {
    public static WebDriver launchPage(String browserName, String appUrl){
        String url = "http://the-internet.herokuapp.com/";
        BrowserType browser = BrowserType.valueOf(browserName.toUpperCase());
        WebDriver driver = null;
        switch (browser){
            case CHROME:
                System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/selenium-learning/src/main/resources/chromedriver7");
                driver = new ChromeDriver();
                break;
            case FIREFOX:
                System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"/selenium-learning/src/main/resources/geckodriver");
                driver = new FirefoxDriver();
                break;
            case SAFARI:
                driver = new SafariDriver();
                break;
            default:
                System.out.println("Invalid Browser");
        }
        driver.get(appUrl);
        driver.manage().window().maximize();
        //System.out.println(driver.getTitle());
        return driver;
    }
    public static void quitBrowser(WebDriver driver){
        driver.quit();
    }
}
