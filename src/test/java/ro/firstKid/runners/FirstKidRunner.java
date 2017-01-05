package ro.firstKid.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        monochrome = true,
        plugin =  {"rerun", "html:target/cucumber","json:target/jsonReports/FirstKidRunner.json"},
        glue = {"ro.firstKid"},
        features = {
                "src/test/resources/features/buyProducts.feature",
                "src/test/resources/features/registeringUser.feature"
        }
)

public class FirstKidRunner {
}
