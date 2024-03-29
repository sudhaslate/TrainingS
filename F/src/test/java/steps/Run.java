package steps;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(features = ".",plugin = {"pretty","html:cucumber-reports"},dryRun = false,tags="@RegressionTest")
public class Run {
}
