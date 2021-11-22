package tests.testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/featureFiles/TestFeature.feature"}
        ,glue = "tests.stepDefinition", monochrome = true
        ,plugin = {"pretty","html:target/Html/Reports"})
public class RunTest {
}
