package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class coding {
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
    @When("^User enters<\"([^\"]*)\"> in the password field$")
    public void user_enters_in_the_password_field(String arg1)  {
        driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("9password9");
    }
    @When("^Click on the Login button$")
    public void click_on_the_Login_button()  {
    driver.findElement(By.name("login")).click();
    }

    @Then("^User logon to the account page \"([^\"]*)\"$")
    public void user_logon_to_the_account_page(String arg1) {

        String actualResult=driver.findElement(By.xpath("//span[contains(text(),'Poorna Tummati')]")).getText();
        String expectedResult="Poorna Tummati";
            Assert.assertEquals(actualResult,expectedResult);
            driver.close();
    }

        }





