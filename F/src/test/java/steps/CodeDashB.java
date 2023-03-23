package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CodeDashB extends CommonFunc{
    PFMDash pm1=new PFMDash(driver);

        @And("^User clicks on the MoreInfo Link in Companies Card$")
    public void user_clicks_on_the_MoreInfo_Link_in_Companies_Card() {
        pm1.clickMILComp();
    }
    @Then("^User should see the Companies page$")
    public void user_should_see_the_Companies_page() {
        pm1.getCompaniesPg();
    }
    @And("^User clicks on the MoreInfo Link on Sales rate$")
    public void userClicksOnTheMoreInfoLinkOnSalesRate() {
        pm1.clickMILSalesRate();
    }
    @Then("^User should see the SalesRate page$")
    public void userShouldSeeTheSalesRatePage() {
        pm1.getSalesRatePg();
    }
    @And("^User clicks on the MoreInfo Link on Users$")
    public void userClicksOnTheMoreInfoLinkOnUsers() {
        pm1.clickMILUsers();
    }
    @Then("^User should see the Users page$")
    public void userShouldSeeTheUsersPage() {
        pm1.getUsersPg();
    }
    @And("^User clicks on the MoreInfo Link on Products$")
    public void userClicksOnTheMoreInfoLinkOnProducts() {
        pm1.clickMILProducts();
    }
    @Then("^User should see the Products page$")
    public void userShouldSeeTheProductsPage() {
        pm1.getProductsPg();
    }
    @And("^User clicks on the Donut button$")
    public void userClicksOnTheDonutButton() {
            pm1.clickDonutBtn();
    }
    @Then("^User should be able see the pie chart$")
    public void userShouldBeAbleSeeThePieChart() {
            pm1.getSectorOrange();
    }
    @And("^User hoovers on to the orange area of the pie chart$")
    public void userHooversOnToTheOrangeAreaOfThePieChart() {
            pm1.getLocationHoverSectOrange();
    }
    @Then("^User should see the InStore Sale$")
    public void userShouldSeeTheInStoreSale() {
            pm1.getInStoreSale();
    }
    @And("^User scrolls down to Visitors Map$")
    public void userScrollsDownToVisitorsMap() {
            pm1.clickVisitorsMap();
    }
    @And("^User hoovers the mouse over the map onto the country at the bottom$")
    public void userHooversTheMouseOverTheMapOntoTheCountryAtTheBottom() {
            pm1.getMapOfCountry();
    }
    @Then("^User should be able to see country name$")
    public void userShouldBeAbleToSeeCountryName() {
            pm1.getCountryName();
    }
}