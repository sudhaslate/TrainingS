package fbsteps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class Logincode {
    public WebDriver driver;
    @Given("^User is on the Facebook Page$")
    public void user_is_on_the_Facebook_Page() {
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--disable-notifications");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(options);
        driver.get("https://en-gb.facebook.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"facebook\"]/body/div[3]/div[2]/div/div/div/div/div[3]")).click();
    }
    @When("^User enter\"([^\"]*)\" as EmailId$")
    public void user_enter_as_EmailId(String EmailId) {
        driver.findElement(By.cssSelector("#email")).sendKeys(EmailId);
    }
    @When("^User enters\"([^\"]*)\" as Password$")
    public void user_enters_as_Password(String Password) {
        driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(Password);
    }
    @When("^Click on the Login button$")
    public void click_on_the_Login_button()  {
        driver.findElement(By.name("login")).click();
    }
    @Then("^User should see The email address you entered isn't connected to an account$")
    public void user_should_see_The_email_address_you_entered_isn_t_connected_to_an_account() throws InterruptedException {
        driver.findElement(By.xpath("//div[@class='_9ay7']")).getText();
        Thread.sleep(5000);
    }
    @Then("^User logon to the account page Poorna Tummati$")
    public void user_logon_to_the_account_page_Poorna_Tummati() throws InterruptedException {
        driver.findElement(By.xpath("//span[contains(text(),'Poorna Tummati')]")).getText();
        Thread.sleep(5000);
    }
    @Then("^User should see The password that you've entered is incorrect\\. Forgotten password\\?$")
    public void user_should_see_The_password_that_you_ve_entered_is_incorrect_Forgotten_password() {
        driver.findElement(By.xpath("//div[@class='_9ay7']\n")).getText();
    }
    @Then("^User should see Find your account and log in\\.$")
    public void user_should_see_Find_your_account_and_log_in() {
        driver.findElement(By.xpath("//a[normalize-space()='Find your account and log in.']")).getText();
    }
    @When("^On account page click the Profile pic on top right hand corner$")
    public void on_account_page_click_the_Profile_pic_on_top_right_hand_corner() throws InterruptedException {
        driver.findElement(By.xpath("//div[@class='x78zum5 x1n2onr6']//div[@class='x1rg5ohu x1n2onr6 x3ajldb x1ja2u2z']//*[name()='svg']//*[name()='g' and contains(@mask,'url(#jsc_c')]//*[name()='image' and contains(@x,'0')]")).click();
        Thread.sleep(5000);
    }
    @When("^User should click on the last option LogOut$")
    public void user_should_click_on_the_last_option_LogOut() {
        driver.findElement(By.xpath("//span[normalize-space()='Log Out']")).click();
    }
    @Then("^User should land on the main page with Facebook$")
    public void user_should_land_on_the_main_page_with_Facebook() {
        driver.findElement(By.xpath("//img[@alt='Facebook']")).getText();
    }

    @When("^User clicks on Forgotten Pasword option$")
    public void user_clicks_on_Forgotten_Pasword_option()  {
        driver.findElement(By.xpath("//a[contains(text(),'Forgotten password?')]")).click();
    }
    @When("^User enters\"([^\"]*)\" in the input box$")
    public void user_enters_in_the_input_box(String EmailId)  {
        driver.findElement(By.xpath("//input[@id='identify_email']")).sendKeys(EmailId);
    }

    @When("^Click on the search button$")
    public void click_on_the_search_button() throws InterruptedException {
        driver.findElement(By.cssSelector("#did_submit")).click();
        Thread.sleep(5000);
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