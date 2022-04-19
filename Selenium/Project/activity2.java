package liveProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class activity2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver","C:/Users/PujaJoshi/IdeaProjects/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        //open a browser
        driver.get("http://alchemy.hguy.co/orangehrm");
        String url = driver.getCurrentUrl();
        System.out.println("The current URL is : " + url);
        driver.close();
    }
}
