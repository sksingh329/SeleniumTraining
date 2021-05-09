package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.locators.RelativeLocator;

public class RelativeLocatorDemo extends SeleniumBase{
    public static void main(String[] args) {
        WebDriver driver = launchPage("chrome","https://www.google.co.in");
        WebElement elemAbout = driver.findElement(By.linkText("About"));
        WebElement elemAdvertising = driver.findElement(RelativeLocator.withTagName("a").near(elemAbout));
        System.out.println(elemAdvertising.getText());
        System.out.println(elemAdvertising.getAttribute("class"));
        quitBrowser(driver);
    }
}
