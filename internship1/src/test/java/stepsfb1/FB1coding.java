package stepsfb1;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FB1coding {
    public WebDriver driver;
    @Given("^User is on the Facebook Page$")
    public void user_is_on_the_Facebook_Page()  {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://en-gb.facebook.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"facebook\"]/body/div[3]/div[2]/div/div/div/div/div[3]")).click();
    }
    @When("^User enter<\"([^\"]*)\"> in the input box$")
    public void user_enter_in_the_input_box(String arg1)  {
        driver.findElement(By.cssSelector("#email")).sendKeys("chandra_sudu@yahoo.co.in");
    }
    @When("^User clicks on Forgotten Pasword option$")
    public void user_clicks_on_Forgotten_Pasword_option()  {
        driver.findElement(By.xpath("//a[contains(text(),'Forgotten password?')]")).click();
    }
    @When("^User enters<\"([^\"]*)\"> in the input box$")
    public void user_enters_in_the_input_box(String arg1)  {
        driver.findElement(By.xpath("//input[@id='identify_email']")).sendKeys("chandra_sudu@yahoo.co.in");
    }

    @When("^Click on the search button$")
    public void click_on_the_search_button() throws InterruptedException {
        driver.findElement(By.cssSelector("#did_submit")).click();
        Thread.sleep(500);

    }
    @Then("^User should see Reset Your Password$")
    public void user_should_see_Reset_Your_Password()  {
        driver.findElement(By.xpath("//h2[@class='uiHeaderTitle']")).getText();

        String actualResult=driver.findElement(By.xpath("//h2[@class='uiHeaderTitle']")).getText();
        String expectedResult="Reset Your Password";
        Assert.assertEquals(actualResult,expectedResult);
        driver.close();
    }
}

