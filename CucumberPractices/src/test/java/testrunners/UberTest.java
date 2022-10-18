package testrunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/AppFeatures/Uber.feature"}, //will take the feature files from AppFeatures package
		glue = {"stepdefinitions", "MyHooks"}, //will take the MyHooks and with step definitions from stepdefinitions package
		//tags = "@Smoke or @Regression", //will execute both tags of features
	    //tags = "@Smoke and @Regression", //it wont pick any features because these 'and' will execute, when both features are tagged as same name of tags
		//tags = "not @Prod", //it wont pick this tag alone to execute
		tags = "@All", //I am executing feature level now, so all below scenarios will take it into account for that tagged feature
		plugin = {"pretty",
					"json:target/MyReports/report.json",
					"junit:target/MyReports/report.xml"},
		monochrome = false, //make it true, to give the console in the proper format or alignment
		dryRun = true, // To check the stepDefinitions are written properly as per the feature file
		//strict = true, //if undefined and pending steps should be treated as errors.
		publish = true // This is to activate publishing your cucumber report globally to https://reports.cucumber.io
		) //Published our cucumber report: https://reports.cucumber.io/reports/06804d30-459c-4a96-9b39-cb109a51717a


public class UberTest {

}