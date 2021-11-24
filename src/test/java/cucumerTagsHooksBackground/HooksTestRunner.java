package cucumerTagsHooksBackground;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/java/featureFileHooksTagsBackground/TagsHooksBackground.feature"}, 
				glue = {"cucumerTagsHooksBackground","hooks"},
				tags = "@main"
				
		
		
		)
public class HooksTestRunner {

}
