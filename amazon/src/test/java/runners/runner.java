package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"html:target/cucumber-reports/cucumber-html-report",
		        "json:target/cucumber-reports/cucumber.json", "pretty:target/cucumber-reports/cucumber-pretty.txt",
		        "usage:target/cucumber-reports/cucumber-usage.json", "junit:target/cucumber-reports/cucumber-results.xml",
		        "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-extent-reports/report.html"},
		features = {"src/main/resources/features"},
		 glue = {"PageObjects","StepDefinitions","Util"},
		tags ={"@Demo"},
		dryRun = false,
		snippets = SnippetType.CAMELCASE
		)

public class runner {
	

}
