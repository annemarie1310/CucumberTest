package RunnerClasses;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/java/FeatureFiles/Logo.feature"},
        glue = {"StepFile"})

public class LogoRunnerClass
{


}




















