package stepsfb3;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FB3code {

    public WebDriver driver;
    @Given("^User is on the Facebook Page$")
    public void user_is_on_the_Facebook_Page()  {
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--disable-notifications");
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver(options);
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
    public void click_on_the_Login_button() throws InterruptedException {
        driver.findElement(By.name("login")).click();
        Thread.sleep(5000);

    }
    @When("^On account page click the Profile pic on top right hand corner$")
    public void on_account_page_click_the_Profile_pic_on_top_right_hand_corner() throws InterruptedException {
        driver.findElement(By.xpath("//div[@class='x78zum5 x1n2onr6']//div[@class='x1rg5ohu x1n2onr6 x3ajldb x1ja2u2z']//*[name()='svg']//*[name()='g' and contains(@mask,'url(#jsc_c')]//*[name()='image' and contains(@x,'0')]")).click();
      Thread.sleep(3000);
    }

    @When("^User should click on the last option LogOut$")
    public void user_should_click_on_the_last_option_LogOut() {
      driver.findElement(By.xpath("//span[normalize-space()='Log Out']")).click();
    }
    @Then("^User should land on the main page with \"([^\"]*)\"$")
    public void user_should_land_on_the_main_page_with(String arg1)  {
        driver.findElement(By.xpath("//img[@alt='Facebook']")).getText();

   String actualResult=driver.findElement(By.xpath("//img[@alt='Facebook']")).getText();
   String expectedResult = "<[Facebook]>";
   Assert.assertEquals(actualResult,expectedResult);
   driver.close();
    }
}
