package CucumberOptions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/MobileFeatures",
        glue = "MobileStepDefinitions",
        monochrome = true,
        dryRun = false,
        plugin = {"pretty","html:target/cucumber.html", "json:target/cucumber.json" , "junit:target/cucumber.xml",
                  "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                  "rerun:target/fail_scenarios.txt"}
                )
public class JunitRunnerTest {
}
