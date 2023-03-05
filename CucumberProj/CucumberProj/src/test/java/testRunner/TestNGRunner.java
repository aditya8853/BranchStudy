package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "src/test/resources/featureResource",
		glue="stepDefinitions")
public class TestNGRunner extends AbstractTestNGCucumberTests{

	
}
