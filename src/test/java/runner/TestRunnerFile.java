package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features= {"features"},
		glue= {"com.facebook.stepDefinition"},
		tags= {"@Facebook"},
		
		monochrome=true, dryRun=true)
public class TestRunnerFile {

}
