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
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import sun.security.util.Password;

public class Code extends CommonFunc {

    PFM pm=new PFM(driver);
    @Given("^User is on the Home page of Solar Test Company$")
    public void user_is_on_the_Home_page_of_Solar_Test_Company()  {
    }
    @When("^Enter the \"([^\"]*)\" as EmailId$")
    public void enterTheAsEmailId(String EmailId) throws InterruptedException {
        pm.getEmail(EmailId);
    }
    @And("^Enter \"([^\"]*)\" as Password$")
    public void enterAsPassword(String Password) throws InterruptedException {
        pm.getPassword(Password);
    }
    @When("^Click on the SignIn Button$")
    public void click_on_the_SignIn_Button() {
    }
    @Then("^User should see Login failed\\. Please try again$")
    public void userShouldSeeLoginFailedPleaseTryAgain()  {
    }
    @Then("^User should see The email field is required\\.$")
    public void userShouldSeeTheEmailFieldIsRequired() {
        driver.findElement(By.id("id=\"email-error\"")).getText();
    }
    @Then("^User should see The password field is required\\.$")
    public void userShouldSeeThePasswordFieldIsRequired() {
        driver.findElement(By.xpath("//*[@id=\"password-error\"]")).getText();
    }
    @Then("^User should see be able to launch on company page$")
    public void userShouldSeeBeAbleToLaunchOnCompanyPage() {
   driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div/div[1]/h1")).getText();
    }
    @When("^Select the company SolarTestCompany from dropdown$")
    public void select_the_company_SolarTestCompany_from_dropdown() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement dropdownOption = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"companiesModal\"]/div/div/div/form/div/select/option[5]")));
        dropdownOption.click();
    }
    @When("^Click on confirm button$")
    public void click_on_confirm_button() {
        driver.findElement(By.xpath("//*[@id=\"companiesModal\"]/div/div/div/form/button")).click();
    }
    @Then("^User should be able to launch on main company page$")
    public void userShouldBeAbleToLaunchOnMainCompanyPage() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/aside/div/div[4]/div/div/div")).getText();
        Thread.sleep(5000);
    }
    @And("^User clicks on I Forgot My Password$")
    public void userClicksOnIForgotMyPassword() {
        driver.findElement(By.xpath("/html/body/div/div[2]/div/p[2]/a")).click();
    }
    @Then("^User should see Give the email that is registered with us\\. We will send a password reset link\\.$")
    public void userShouldSeeGiveTheEmailThatIsRegisteredWithUsWeWillSendAPasswordResetLink() {
        driver.findElement(By.xpath("/html/body/div/div[2]/div/p[1]")).getText();
    }
    @And("^User enters the \"([^\"]*)\" for reset link to be sent$")
    public void userEntersTheForResetLinkToBeSent(String EmailId) {
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys(EmailId);
    }
    @And("^User clicks on send password reset link$")
    public void userClicksOnSendPasswordResetLink() {
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }
    @Then("^User should see the email sent across page$")
    public void userShouldSeeTheEmailSentAcrossPage() {
        driver.findElement(By.xpath("/html/body/div/div[2]/div/form")).getText();
    }
    @And("^User clicks on Sign In on send password reset link page$")
    public void userClicksOnSignInOnSendPasswordResetLinkPage() {
        driver.findElement(By.xpath("/html/body/div/div[2]/div/p[2]/a")).click();
    }
    @Then("^User should see Sign in to start your session page$")
    public void userShouldSeeSignInToStartYourSessionPage() {
        driver.findElement(By.xpath("/html/body/div/div[2]/div/p[1]")).getText();
    }

}

