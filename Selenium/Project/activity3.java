package liveProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import sun.security.util.Password;

public class activity3 {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver","C:/Users/PujaJoshi/IdeaProjects/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        //open a browser
        driver.get("http://alchemy.hguy.co/orangehrm");

        //Enter username and password
        WebElement userName = driver.findElement(By.id("txtUsername"));
        WebElement password = driver.findElement(By.id("txtPassword"));

        //Enter text
        userName.sendKeys("orange");
        password.sendKeys("orangepassword123");


        //Click login
        driver.findElement(By.id("btnLogin")).click();

        //verify successful Login
        WebElement loggedInUser = driver.findElement(By.id("welcome"));
        Assert.assertEquals(loggedInUser.getText(),"Welcome Rama");
        driver.close();
    }
}
