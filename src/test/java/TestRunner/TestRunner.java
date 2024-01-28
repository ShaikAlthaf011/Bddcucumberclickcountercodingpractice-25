package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src//test//resources//feature",glue="StepDefinitions")
public class TestRunner extends AbstractTestNGCucumberTests {
}
