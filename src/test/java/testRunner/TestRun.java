package testRunner;
//rdctfr 
//hi new change
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
//hbub7hgfgfgfgh
@RunWith(Cucumber.class)
@CucumberOptions
(
	features="D:\\sql\\Hybridframe\\Features\\Login.feature",
	glue="StepDefinations",
	dryRun=false,
	monochrome=false,
	plugin= {"pretty",
			"html:test-output"}
	//new hdhkjh
		//jjhh
		)

public class TestRun {

}
