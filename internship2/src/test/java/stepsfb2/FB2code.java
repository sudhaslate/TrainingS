package stepsfb2;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FB2code {
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
        driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("secret");
    }
    @When("^Click on the Login button$")
    public void click_on_the_Login_button()  {
        driver.findElement(By.name("login")).click();
    }
    @Then("^User should see The password that you've entered is incorrect\\. Forgotten password\\?$")
    public void user_should_see_The_password_that_you_ve_entered_is_incorrect_Forgotten_password()  {
        driver.findElement(By.xpath("//div[@class='_9ay7']\n")).getText();

     String actualResult=driver.findElement(By.xpath("//div[@class='_9ay7']\n")).getText();
     String expectedResult= "The password that you've entered is incorrect. Forgotten password?";
        Assert.assertEquals(actualResult,expectedResult);
        driver.close();
          }
}
