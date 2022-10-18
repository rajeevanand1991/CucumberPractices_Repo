package testrunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/AppFeatures/billing.feature"}, //will take the feature files from AppFeatures package
		glue = {"stepdefinitions"}, //will take the step definitions from stepdefinitions package
		//tags = "@Smoke or @Regression", //will execute both tags of features
	    //tags = "@Smoke and @Regression", //it wont pick any features because these 'and' will execute, when both features are tagged as same name of tags
		//tags = "not @Prod", //it wont pick this tag alone to execute
		//tags = "@All", //I am executing feature level now, so all below scenarios will take it into account for that tagged feature
		plugin = {"pretty"}
		)

public class BillingTest {

}