package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = { ".\\src\\test\\java\\practicefeature" }, glue = {
		"stepDefination" }, dryRun = false

)

public class Runner extends AbstractTestNGCucumberTests {

}
