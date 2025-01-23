package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "classpath:Features",
		glue = {"steps"},
		tags = {"@testeAtual"},
		plugin = {"pretty", "html:target/cucumber-reports"},
		monochrome = true,
		dryRun = false
)
public class Runner {
}
