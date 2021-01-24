package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(plugin = { "html:target/cucumber-reports/cucumber-html-report",
							"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-extent-reports/report.html" },
						features = {"src/main/resources/features" }, 
						glue = { "PageObjects", "StepDefinitions","Util" },
						tags = { "@Demo" }, 
						dryRun = false, 
						snippets = SnippetType.CAMELCASE)

public class runnerTestNG extends AbstractTestNGCucumberTests {

}
