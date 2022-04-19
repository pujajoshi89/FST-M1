package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class TagsExample extends BaseClass{

    @Given("^user is on the TS homepage$")
    public void openTSHomepage(){
        driver.get("https://training-support.net");
    }

    @When("^user clicks on the about us button$")
    public void clickAboutUspage(){
        driver.findElement(By.id("about-link")).click();
    }

    @Then("^Then the user is redirected to the about us page$")
    public void aboutUsPageVerification(){
        String AboutUsPageTitle = driver.findElement(By.xpath("//h1[@class=ui header]")).getText();
        Assert.assertEquals("About Us",AboutUsPageTitle);
    }
}
