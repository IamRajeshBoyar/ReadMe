package stepDefination2;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src/test/java/featureFiles2/ActinTest.feature"}, glue = {"stepDefination2"})
public class AdactinExample2Runner {

}
