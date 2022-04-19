package liveProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import static org.testng.AssertJUnit.assertTrue;

public class activity4 {
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

        //click on PIM
        driver.findElement(By.id("menu_pim_viewPimModule")).click();

        //Click on EmployeeList
        driver.findElement(By.id("menu_pim_viewEmployeeList")).click();

        //click on Add button
        driver.findElement(By.id("btnAdd")).click();

        //Fill in employee details
        WebElement firstName = driver.findElement(By.id("firstName"));
        WebElement middleName = driver.findElement(By.id("middleName"));
        WebElement lastName = driver.findElement(By.id("lastName"));
        driver.findElement(By.id("employeeId")).clear();
        WebElement employeeId = driver.findElement(By.id("employeeId"));

        firstName.sendKeys("Puja");
        middleName.sendKeys("G");
        lastName.sendKeys("Joshi");
        employeeId.sendKeys("05805T");

        //browse photo
        //driver.findElement(By.id("photofile")).click();
        WebElement chooseFile = driver.findElement(By.id("photofile"));
        chooseFile.sendKeys("C:\\migrationTemp\\MHBackup20190219_122657744\\C_Drive\\personal\\work\\puja\\photo.gif");

        //click on checkbox
        driver.findElement(By.id("chkLogin")).click();

        //click on save button
        driver.findElement(By.id("btnSave")).click();

        //create username and password
        WebElement username = driver.findElement(By.id("user_name"));
        WebElement userpassword = driver.findElement(By.id("user_password"));
        WebElement repassword = driver.findElement(By.id("re_password"));

        username.sendKeys("pujajoshi");
        userpassword.sendKeys("Welcome2ibm");
        repassword.sendKeys("Welcome2ibm");

        //click on save button
        driver.findElement(By.id("btnSave")).click();

        //Navigate back to the EmployeeList
        driver.findElement(By.id("menu_pim_viewEmployeeList")).click();

        //Enter the employee id of the newly created user
        WebElement empSearch = driver.findElement(By.id("empsearch_id"));
        empSearch.sendKeys("05805T");

        //click on Search button
        driver.findElement(By.id("searchBtn")).click();

        driver.close();
    }
}