package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(dryRun = false, features = "src/test/resource/Features", glue = { "classpath:/stepDefinitions",
		"runner" }, tags = { "@tag" }, plugin = { "html:target/cucumber-report/Regression",
				"json:target/cucumber-report/Regression.json", "rerun:rerun/failed_scenarios.txt" })

public class Runner_AT {
}
