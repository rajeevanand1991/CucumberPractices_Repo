package testrunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		//features = {"src/test/java/AppFeatures"}, //will take the feature files from AppFeatures package
		features = {"src/test/resources/AppFeatures/search.feature"}, 
		glue = {"stepdefinitions", "MyHooks"}, //will take the MyHooks and with step definitions from stepdefinitions package
		tags = "@Smoke or @Regression",
		plugin = {"pretty"}
		)

public class AmazonTest {

}