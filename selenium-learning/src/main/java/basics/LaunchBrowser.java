package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

enum BrowserType1{
    CHROME, FIREFOX, SAFARI;
}
public class LaunchBrowser {
    public static void main(String[] args) {
        String url = "http://the-internet.herokuapp.com/";
        //BrowserType browser = BrowserType.SAFARI;
        for(BrowserType b : BrowserType.values()){
            System.out.println(b);
        }
        BrowserType1 browser = BrowserType1.valueOf("SAFARI");
        WebDriver driver = null;
        switch (browser){
            case CHROME:
                System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/selenium-learning/src/main/resources/chromedriver");
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
        driver.get(url);
        System.out.println(driver.getTitle());
        //System.out.println(driver.getCurrentUrl());
        //System.out.println(driver.getPageSource());
        driver.quit();
    }
}
