package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import sun.security.util.Password;

public class PFM {

    @FindBy(xpath = "//*[@id=\"email\"]")
    private WebElement emailTxtBox;
    @FindBy(xpath = "//*[@id=\"password\"]")
    private WebElement passwordTxtBox;
    @FindBy(xpath = "/html/body/div/div[2]/div/form/div[3]/div[2]/button")
    private WebElement signInBtn;
    @FindBy(xpath="/html/body/div/div[2]/div/div")
    private WebElement mainPage;
    @FindBy(id = "email-error")
    private WebElement emailErrorMsg;
    @FindBy(id="password-error")
    private WebElement pwdErrorMsg;
    @FindBy(xpath = "/html/body/div[1]/div[1]/div/div/div/div[1]/h1")
    private WebElement dashBoard;
    @FindBy(xpath = "//*[@id=\"companiesModal\"]/div/div/div/form/div/select/option[5]")
    private WebElement dropDownBtn;
    @FindBy(xpath = "//*[@id=\"companiesModal\"]/div/div/div/form/button")
    private WebElement confirmBtn;
    @FindBy(xpath = "/html/body/div[1]/aside/div/div[4]/div/div/div")
    private WebElement superAdmin;
    @FindBy(xpath = "/html/body/div/div[2]/div/p[2]/a")
    private WebElement forgotPwd;
    @FindBy(xpath = "/html/body/div/div[2]/div/p[1]")
    private WebElement emailPwdLink;
    @FindBy(xpath = "//input[@id='email']")
    private WebElement pwdEmailBox;
    @FindBy(xpath = "//button[@type='submit']")
    private WebElement sendPwdLink;
    @FindBy(xpath = "/html/body/div/div[2]/div/form")
    private WebElement emailSentAcross;
    @FindBy(xpath = "/html/body/div/div[2]/div/p[2]/a")
    private WebElement signInPwdSentAcross;
    @FindBy(xpath = "/html/body/div/div[2]/div/p[1]")
    private WebElement startSessionPg;



    private WebDriver driver;
    public PFM(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);}




    public void getEmail(String EmailId) throws InterruptedException {emailTxtBox.sendKeys(EmailId);
        Thread.sleep(3000);}
    public void getPassword (String Password) throws InterruptedException {passwordTxtBox.sendKeys(Password);
        Thread.sleep(5000);}
    public void clickSingInBtn() {
            signInBtn.click();
    }
    public void getMainPage() {
        mainPage.getText();
    }
    public void getEmailErrorMsg(){
        emailErrorMsg.getText();
    }
    public void getPwdErrorMsg() {
        pwdErrorMsg.getText();
    }
    public void getDashBoard() throws InterruptedException {dashBoard.getText();
        Thread.sleep(1000);}
    public void clickDropDownBtn(){
        dropDownBtn.click();
    }
    public void clickConfirmBtn(){
        confirmBtn.click();
    }
    public void getSuperAdmin() throws InterruptedException {superAdmin.getText();
        Thread.sleep(3000);}
    public void clickForgotPwd() {forgotPwd.click();}
    public void getEmailPwdLink() {emailPwdLink.getText();}
    public void getPwdEmailBox(String EmailId) throws InterruptedException {pwdEmailBox.sendKeys(EmailId);
        Thread.sleep(2000);}
    public void  clickSendPwdLink(){sendPwdLink.click();}
    public void getemailSentAcross(){emailSentAcross.getText();}
    public void clickSignInPwdSentAcross(){signInPwdSentAcross.click(); }
    public void getstartSessionPg(){startSessionPg.getText();

        String actualResult = startSessionPg.getText();
        System.out.println(actualResult);
    }
    }
