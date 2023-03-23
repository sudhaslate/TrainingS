package steps;
import cucumber.api.java.After;
import cucumber.api.java.Before;
public class Hooks extends CommonFunc {

    @Before
    public void beforeMethod() {
        openBrowser();
    }



    @After
    public void afterMethod() {
        closeBrowser();
    }
}
