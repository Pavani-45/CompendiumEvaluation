package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import pages.ContactForm;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/Features/Compendium.feature",
        glue={"steps"}

)
        //tags = "@compendiumContact")
public class Runner {




}
