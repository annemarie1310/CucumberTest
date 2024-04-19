package RunnerClasses;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/FeatureFiles/Amazon.feature",
        glue = {"StepFile"},tags = " @GetSellTitle",publish = true,plugin = {"html:target/test-output.html"})
public class Amzzon {
}
