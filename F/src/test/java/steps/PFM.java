package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import sun.security.util.Password;

public class PFM {

    @FindBy(xpath = "//*[@id=\"email\"]")
    private WebElement emailTxtBox;
    @FindBy(xpath = "//*[@id=\"password\"]")
    private WebElement passwordTxtBox;
    @FindBy(xpath = "/html/body/div/div[2]/div/form/div[3]/div[2]/button")
    private WebElement signInBtn;
    @FindBy(xpath = "/html/body/div/div[2]/div/div")
    private WebElement mainPage;


    private WebDriver driver;

    public PFM(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void getEmail(String EmailId) throws InterruptedException {
        emailTxtBox.sendKeys(EmailId);
        Thread.sleep(3000);
    }
    public void getPassword (String Password) throws InterruptedException {
            passwordTxtBox.sendKeys(Password);
            Thread.sleep(3000);
            signInBtn.click();
            mainPage.getText();
        }

    }
