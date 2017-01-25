package bdd.example2.bddexample2.runners;

/**
 * Created by vanwh on 18/01/2017.
 */
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(features = "src/test/resources/features/Homepage.feature",
        glue = "bdd.example2.bddexample2.glue",
        format = {"pretty"})
public class HomepageFeatureRunner extends AbstractTestNGCucumberTests {
}