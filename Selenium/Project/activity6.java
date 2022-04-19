package liveProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class activity6 {
    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver", "C:/Users/PujaJoshi/IdeaProjects/geckodriver.exe");
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

        //verify if the link for directory is visible or not
        WebElement directoryLink= driver.findElement(By.id("menu_directory_viewDirectory"));
        System.out.println("The Directory link is displayed : " + directoryLink.isDisplayed());
        System.out.println("The Directory link is Clickable : " + directoryLink.isEnabled());

        //click on the DirectoryLink
        driver.findElement(By.linkText("Directory")).click();
        driver.findElement(By.linkText("Directory")).click();

        //Verify the heading of the page
        WebElement pageHeading = driver.findElement(By.className("head"));
        Assert.assertEquals(pageHeading.getText(),"Search Directory");

       driver.close();
    }
}
