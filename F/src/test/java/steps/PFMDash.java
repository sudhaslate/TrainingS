package steps;

import gherkin.lexer.Th;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PFMDash {

@FindBy(xpath="/html/body/div[1]/div[1]/section/div/div[1]/div[1]/div/a")
private WebElement mILComp;
@FindBy(xpath="/html/body/div[1]/div[1]/div/div/div/div[1]/h1")
public WebElement companiesPg;
@FindBy(xpath ="//a[@href='#'][normalize-space()='More info']")
private WebElement mILSalesRate;
@FindBy(xpath ="//p[normalize-space()='Sales Rate']")
private WebElement salesRatePg;
@FindBy(xpath ="//a[@href='http://solar.schoolnewgen.com/websolar/users'][normalize-space()='More info']")
private WebElement mILUsers;
@FindBy(xpath ="//h1[@class='m-0 text-dark']")
private WebElement usersPg;
@FindBy(xpath ="//a[@href='http://solar.schoolnewgen.com/websolar/products'][normalize-space()='More info']")
private WebElement mILProducts;
@FindBy(xpath ="//div[@class='inner']//p[contains(text(),'Products')]")
private WebElement productsPg;
@FindBy(xpath ="//a[@class='nav-link active']")
private WebElement donutBtn;
@FindBy(xpath ="//canvas[@id='sales-chart-canvas']")
private WebElement sectorOrange;
@FindBy(xpath ="//canvas[@id='sales-chart-canvas']")
private WebElement hoverSectOrange;
@FindBy(xpath ="//canvas[@id='sales-chart-canvas']")
private WebElement inStoreSale;
@FindBy(xpath ="//html")
private WebElement visitorsMap;
@FindBy(xpath ="//*[name()='path' and @id='jqvmap1_tx']")
private WebElement mapOfCountry;
@FindBy(xpath ="//*[name()='path' and @id='jqvmap1_tx']")
private WebElement countryName;





    private WebDriver driver;
    public PFMDash(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);}





    public void clickMILComp() {mILComp.click();}
    public void getCompaniesPg() {companiesPg.getText();}
    public void clickMILSalesRate() {mILSalesRate.click();}
    public void getSalesRatePg() {salesRatePg.getText();}
    public void clickMILUsers() {mILUsers.click();}
    public void getUsersPg() {usersPg.getText();}
    public void clickMILProducts() {mILProducts.click();}
    public void getProductsPg() {productsPg.getText();}
    public void clickDonutBtn() {donutBtn.click();}
    public void getSectorOrange() {sectorOrange.getText();}
    public void getLocationHoverSectOrange(){hoverSectOrange.getLocation();}
    public void getInStoreSale(){inStoreSale.getText();}
    public void clickVisitorsMap(){visitorsMap.click();}
    public void getMapOfCountry(){mapOfCountry.getLocation();}
    public void getCountryName(){countryName.getText();

    String actualResult=countryName.getText();
        System.out.println(actualResult);
    }
}
