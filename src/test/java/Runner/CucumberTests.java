package Runner;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty"},
		glue = {"src\\test\\java\\stepdefs"},
		features = {"src\\test\\resources\\FeatureFiles\\Feature.feature"})
public class CucumberTests {}
