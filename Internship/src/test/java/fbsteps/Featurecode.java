package fbsteps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Featurecode extends Utilities{
    @When("^User clicks on \"([^\"]*)\" in the account page$")
    public void user_clicks_on_in_the_account_page(String arg1) throws InterruptedException {
        Thread.sleep(3000);
    }
    @Then("^User clicks on \"([^\"]*)\" in the account page and should see the \"([^\"]*)\"$")
    public void userClicksOnInTheAccountPageAndShouldSeeThe(String PoornaTummati, String profileCoverPhoto ) throws InterruptedException {
        driver.findElement(By.xpath("//span[contains(text(),'Poorna Tummati')]")).click();
        Thread.sleep(3000);

        String actualResult=driver.findElement(By.xpath("//span[contains(text(),'Poorna Tummati')]")).getText();
        String expectedResult="Poorna Tummati";
        Assert.assertEquals(actualResult,expectedResult);
        driver.close();
}
}