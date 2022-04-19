package liveProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class activity9 {
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

        //Open My info page
        driver.findElement(By.id("menu_pim_viewMyDetails")).click();

        //Click on emergency contacts
        driver.findElement(By.linkText("Emergency Contacts")).click();

        // Get all the table row elements from the table
        List<WebElement> allRows = driver.findElements(By.xpath("//*[@id=\"emgcontact_list\"]"));

        // And iterate over them and get all the cells
        for (WebElement row : allRows) {
            List<WebElement> cells = row.findElements(By.tagName("td"));

            // Print the contents of each cell
            for (WebElement cell : cells) {

                System.out.println(cell.getText());
                //Or try below code
                //System.out.println(cell.getAttribute("innerHTML"));

            }

        }

        driver.close();
    }
}
