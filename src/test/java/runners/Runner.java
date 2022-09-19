package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/reports/cucumberReport.json", "html:target/reports/report.html"},
        features = "src/test/resources/features",
        glue = {"steps"}
)
public class Runner extends RunnerTests {
    @AfterClass
    public static void tierDown() {

        driver.close();

    }
}

