package runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
   features = "src\\main\\resources\\features",
   glue = "stepDefinitions",
   tags = "@regression",
        plugin = {"pretty",
                "html:target/momo.html",
                "json:target/momo.json",
                "junit:target/momo.xml",
                "rerun:target/rerun.txt"
        }
)
public class TestRunner {
}
