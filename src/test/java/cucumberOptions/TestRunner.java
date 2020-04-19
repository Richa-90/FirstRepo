package cucumberOptions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/Feature/Login.feature",
		glue ="stepDefinition",tags="@MobileTest,@WebTest")
public class TestRunner {

}
