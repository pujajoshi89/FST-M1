package liveProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class activity5 {
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

        //click on Edit button
        driver.findElement(By.id("btnSave")).click();

        //fill in the form
        WebElement firstName = driver.findElement(By.id("personal_txtEmpFirstName"));
        WebElement lastName = driver.findElement(By.id("personal_txtEmpLastName"));
        WebElement gender = driver.findElement(By.id("personal_optGender_2"));
        WebElement nationality = driver.findElement(By.id("personal_cmbNation"));

        driver.findElement(By.id("personal_txtEmpFirstName")).clear();
        firstName.sendKeys("Preet");
        driver.findElement(By.id("personal_txtEmpLastName")).clear();
        lastName.sendKeys("Ahuja");
        driver.findElement(By.id("personal_optGender_2")).click();
        nationality.sendKeys("Indian");

        //click save
        driver.findElement(By.id("btnSave")).click();

        //close browser
        driver.close();
    }
}