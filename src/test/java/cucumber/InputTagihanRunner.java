package cucumber;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(glue = {"cucumber"}
        , features = {"src/test/resources/features/InputTagihan.feature"}
        , plugin = "json:target/cucumber-result/json/QuickSearch.json"
)
public class InputTagihanRunner {
}
