package stepDenfination;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/java/featureFiles/strict.feature"}, glue = {"stepDenfination"})
public class StrictRunner {

}
