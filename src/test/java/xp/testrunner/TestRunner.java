package xp.testrunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		         features = {"E:\\eclipseEE\\seleniumTesting\\PeerXPTASK\\src\\test\\resources\\featurefile"}, 
                 glue = {"xp.stepdefination","xp.hooks"}, 
                 plugin = {"pretty",
                		   "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
				           }
		        )

public class TestRunner {

}
