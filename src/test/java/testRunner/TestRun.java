package testRunner;
//rdctfr
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
(
	features="D:\\sql\\Hybridframe\\Features\\Login.feature",
	glue="StepDefinations",
	dryRun=false,
	monochrome=false,
	plugin= {"pretty",
			"html:test-output"}
	
		
		)

public class TestRun {

}
