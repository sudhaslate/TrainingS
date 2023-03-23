package steps;
import cucumber.api.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.hc.core5.util.Asserts;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class search extends Utils {
    public static WebDriver driver;

    @Given("^User is on the Home page of Solar Test Company$")
    public void user_is_on_the_Home_page_of_Solar_Test_Company() {
        WebDriverManager.chromiumdriver().setup();
        driver = new ChromeDriver();
        driver.get("http://solar.schoolnewgen.com/websolar/login");
        driver.manage().window().maximize();
    }

    @When("^Enter the <\"([^\"]*)\"> in the input box username$")
    public void enter_the_in_the_input_box_username(String arg1) {
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("super_admin@gmail.com");
    }
    @When("^Enter the <\"([^\"]*)\"> in the input box password$")
    public void enter_the_in_the_input_box_password(String arg1) {
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret");
    }

    @When("^Click on the SignIn Button$")
    public void click_on_the_Signin_Button() {
        driver.findElement(By.xpath("/html/body/div/div[2]/div/form/div[3]/div[2]/button")).click();
    }

    @When("^Select the company SolarTestCompany from dropdown$")
    public void select_the_company_SolarTestCompany_from_dropdown() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement dropdownOption = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"companiesModal\"]/div/div/div/form/div/select/option[5]")));
        //  (By.xpath("//*[@id=\"companiesModal\"]/div/div/div/form/div/select")));
        dropdownOption.click();
    }
    @When("^Click on confirm button$")
    public void click_on_confirm_button() {
        driver.findElement(By.xpath("//*[@id=\"companiesModal\"]/div/div/div/form/button")).click();
    }

    @Then("^User should be able to launch on company page$")
    public void user_should_be_able_to_launch_on_company_page() {
        driver.findElement(By.xpath("/html/body/div[1]/aside/div/div[4]/div/div/div")).getText();


        String actualResult = driver.findElement(By.xpath("/html/body/div[1]/aside/div/div[4]/div/div/div")).getText();
        String expectedResult = "Super Admin";
        Assert.assertEquals(actualResult, expectedResult);
        driver.close();
    }

}