package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class WebElementDemo extends SeleniumBase{
    public static void main(String[] args) {
        WebDriver driver = launchPage("chrome","https://www.facebook.com/");
        System.out.println(driver.getTitle());
        List<WebElement> inputElem = driver.findElements(By.tagName("input"));
        System.out.println(inputElem.size());
        for (WebElement elem:inputElem) {
            System.out.println(elem.getAttribute("aria-label"));
        }
        quitBrowser(driver);
    }
}
