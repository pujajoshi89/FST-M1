package liveProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static org.openqa.selenium.Keys.TAB;

public class activity8 {
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

        //Click on apply leave
        driver.findElement(By.linkText("Apply Leave")).click();
        driver.findElement(By.linkText("Apply Leave")).click();

        //leave form
        Select leaveReason = new Select(driver.findElement(By.id("applyleave_txtLeaveType")));
        leaveReason.selectByVisibleText("DayOff");
        leaveReason.selectByIndex(1);

        //Enter date
        driver.findElement(By.className("ui-datepicker-trigger")).click();
        WebElement leaveFrom = driver.findElement(By.id("applyleave_txtFromDate"));
        WebElement leaveTo = driver.findElement(By.id("applyleave_txtToDate"));
        leaveFrom.clear();
        leaveFrom.sendKeys("2022-04-15");
        //leaveFrom.sendKeys(TAB);
        driver.findElement(By.className("ui-datepicker-trigger")).click();
        leaveTo.clear();
        leaveTo.sendKeys("2022-04-15");

        //click on Apply button
        driver.findElement(By.id("applyBtn")).click();
        driver.findElement(By.id("applyBtn")).click();

        //Click on MyLeave link
        driver.findElement(By.id("menu_leave_viewMyLeaveList")).click();

        //Filter the search
        driver.findElement(By.className("ui-datepicker-trigger")).click();
        WebElement calFrom = driver.findElement(By.id("calFromDate"));
        WebElement calTo = driver.findElement(By.id("calToDate"));
        calFrom.clear();
        calFrom.sendKeys("2022-04-15");
        driver.findElement(By.className("ui-datepicker-trigger")).click();
        calTo.clear();
        calTo.sendKeys("2022-04-15");

        //click on search button
        driver.findElement(By.id("btnSearch")).click();

       driver.close();
    }
}