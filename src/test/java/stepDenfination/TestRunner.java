package stepDenfination;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/featureFiles/AdactinPage.feature",  glue = {"stepDenfination"}, dryRun = false, monochrome = true, plugin ={"pretty", "html:target/cucumber-reports"})
public class TestRunner {

}
