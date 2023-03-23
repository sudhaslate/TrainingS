package fbsteps;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(features = ".",dryRun = false,monochrome = true,plugin = {"pretty","html:cucumber-reports"})

 // fbFeatures/login.feature
 // fbFeatures/features.feature

public class TotalRunner {
}
