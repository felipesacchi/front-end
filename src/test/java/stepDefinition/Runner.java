package stepDefinition;

import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features"},
        glue = {"stepDefinition"},
        monochrome = true,
        tags = "@Login",
        plugin = {"pretty","html:target/html.html","json:target/cluecumber-report/json/cucumber.json", "junit:target/junit.xml"}
        )
public class Runner {
}
