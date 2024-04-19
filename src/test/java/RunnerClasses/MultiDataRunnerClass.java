package RunnerClasses;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/FeatureFiles/Login_WithMultiple.feature",
        glue = {"StepFile"},plugin = {"html:target/test-output.html"})

public class MultiDataRunnerClass {

}
