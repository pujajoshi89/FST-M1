package liveProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;


public class activity1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver","C:/Users/PujaJoshi/IdeaProjects/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        //open a browser
        driver.get("http://alchemy.hguy.co/orangehrm");
        String title = driver.getTitle();
        System.out.println("The title of the page is :" + title);
        Assert.assertEquals("OrangeHRM", title);

        driver.close();

    }


}
