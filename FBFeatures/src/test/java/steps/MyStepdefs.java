package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MyStepdefs {
    public WebDriver driver;
    @Given("^User is on the Facebook Page$")
    public void userIsOnTheFacebookPage() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(options);
        driver.get("https://en-gb.facebook.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"facebook\"]/body/div[3]/div[2]/div/div/div/div/div[3]")).click();
    }
    @When("^User enter\"([^\"]*)\" as EmailId$")
    public void userEnterAsEmailId(String arg0)  {
        driver.findElement(By.cssSelector("#email")).sendKeys("chandra_sudu@yahoo.co.in");
    }
    @And("^User enters\"([^\"]*)\" as Password$")
    public void userEntersAsPassword(String arg1) {
        driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("9password9");
    }
    @And("^Click on the Login button$")
    public void clickOnTheLoginButton() {
        driver.findElement(By.name("login")).click();
    }
    @Then("^User clicks on \"([^\"]*)\" in the account page and should see the \"([^\"]*)\"$")
    public void userClicksOnInTheAccountPageAndShouldSeeThe(String PoornaTummati, String profileCoverPhoto ) {
        driver.findElement(By.xpath("//span[contains(text(),'Poorna Tummati')]")).click();
    }
    //********************************
    @When("^:Click on the Create Story$")
    public void clickOnTheCreateStory() {
        driver.findElement(By.xpath("")).click();
    }
    @And("^:Click on Create Text$")
    public void clickOnCreateText() {
        driver.findElement(By.xpath("")).click();
    }
    @And("^: In the Start Typing option enter\"([^\"]*)\"$")
    public void inTheStartTypingOptionEnter(String arg0) {
        driver.findElement(By.xpath("//textarea[@id='jsc_c_2l']")).sendKeys("Today's Story");
    }
    @And("^:Click on share story$")
    public void clickOnShareStory() {
        driver.findElement(By.xpath("//span[contains(text(),'Share to Story')]")).click();
    }
    @Then("^: You should see the story posted on home page$")
    public void youShouldSeeTheStoryPostedOnHomePage() {
        driver.findElement(By.id("ssrb_stories_end")).getText();

        String actualResult=driver.findElement(By.id("ssrb_stories_end")).getText();
        String expectedResult="View Your Story";
        Assert.assertEquals(actualResult,expectedResult);
        driver.close();
    }
    }
    //******************************
/*
    @And("^:Click on What's on your mind, Poorna\\?$")
    public void clickOnWhatSOnYourMindPoorna() {
    }
    @And("^:Click on Create post and then enter\"([^\"]*)\"$")
    public void clickOnCreatePostAndThenEnter(String arg0)  {
    }
    @Then("^: Click on the Post button and user should see it posted on the page\\.$")
    public void clickOnThePostButtonAndUserShouldSeeItPostedOnThePage() {
    }

    //********************************

    @And("^: Select the contact SudhaTalluru$")
    public void selectTheContactSudhaTalluru() {
        driver.findElement(By.xpath("//*[@id=\"mount_0_0_uU\"]/div/div[1]/div/div[3]/div/div/div/div[1]/div[1]/div/div[3]/div/div/div[1]/div/div[2]/div/div[2]/div/ul/li[1]")).click();
    }
    @And("^: Enter the message \"([^\"]*)\" in input box$")
    public void enterTheMessageInInputBox(String arg0)  {
    }
    @And("^:Click on the arrow but next to the message$")
    public void clickOnTheArrowButNextToTheMessage() {
    }
    @Then("^: Should be able to post the message$")
    public void shouldBeAbleToPostTheMessage() {      */



