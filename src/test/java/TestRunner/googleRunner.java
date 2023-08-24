package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="FeaturesFile/GoogleAppTest.feature",
                              glue="StepDef")

public class googleRunner
{

}
