package stepsfb1;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(features = ".",plugin = {"pretty","html:cucumber-reports"})

public class RunFB1 {
}
