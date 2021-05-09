package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/selenium-learning/src/main" +
                "/resources/chromedriver7");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.co.in");



        WebElement btnGoogleSearch = driver.findElement(By.name("btnK"));






    }
}
