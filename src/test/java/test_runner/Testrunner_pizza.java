package test_runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src\\test\\resources\\New.feature", 
		glue = {"step_defenition" }, 
		dryRun = false, 
		monochrome = true, 
		//plugin = {"pretty"})
		//plugin = {"html:reports\\report.html"})
		  //plugin = {"json:reports\\report.json"})
		//  plugin = {"junit:reports\\report.xml"})

		plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})



public class Testrunner_pizza {

}
