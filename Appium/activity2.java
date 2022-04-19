package liveproject;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class activity2 {
    //Driver declaration
    AndroidDriver<MobileElement> driver;

    @BeforeClass
    public void setUp() throws MalformedURLException {
        //Desired capabilities
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName","android");
        caps.setCapability("automationName","UiAutomator2");
        caps.setCapability("deviceid","21cdc424");
        caps.setCapability("appPackage","com.google.android.keep");
        caps.setCapability("appActivity",".activities.BrowseActivity");
        caps.setCapability("noReset","true");

        //Appium server URL
        URL serverURL = new URL("http://localhost:4723/wd/hub");

        //Driver initialisation
        driver = new AndroidDriver<>(serverURL,caps);
    }
    @Test
    public void addTask() {
        //Insert new note
        driver.findElementById("new_note_button").click();
        MobileElement title = driver.findElementById("editable_title");
        title.sendKeys("Title");
        MobileElement desc = driver.findElementById("edit_note_text");
        desc.sendKeys("Desc");
        driver.findElementById("Navigate up").click();

        //assertion
        List<MobileElement> tasks = driver.findElements(By.id("index_note_title"));

        System.out.println ("The element as index 0 is " + tasks.get(0));

        //Assertion
        Assert.assertEquals(tasks,"Title");
    }

    @AfterClass
    public void tearDown(){
        //close the application
        driver.quit();
    }

}
