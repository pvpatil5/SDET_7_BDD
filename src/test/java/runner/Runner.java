package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = { ".\\src\\test\\java\\table\\OrgTable.feature" }, glue = {
		"stepDefination.table" }, dryRun = false

)

public class Runner extends AbstractTestNGCucumberTests {

}
