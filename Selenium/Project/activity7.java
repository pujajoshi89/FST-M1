package liveProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class activity7 {
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

        //click on Myinfo
        driver.findElement(By.id("menu_pim_viewMyDetails")).click();

        //click on Qualification link
        driver.findElement(By.linkText("Qualifications")).click();

        //Add work experience
        driver.findElement(By.id("addWorkExperience")).click();

        WebElement company = driver.findElement(By.id("experience_employer"));
        WebElement jobTitle = driver.findElement(By.id("experience_jobtitle"));

        //Enter text
        company.sendKeys("IBM");
        jobTitle.sendKeys("Tester");

        //Enter date
        driver.findElement(By.className("ui-datepicker-trigger")).click();
        WebElement experienceFrom = driver.findElement(By.id("experience_from_date"));
        WebElement experienceTo = driver.findElement(By.id("experience_to_date"));
        experienceFrom.clear();
        experienceFrom.sendKeys("2013-04-08");
        experienceTo.clear();
        experienceTo.sendKeys("2022-04-18");

        //click on Save button
        driver.findElement(By.id("btnWorkExpSave")).click();
        //close browse
        driver.close();
    }
}
