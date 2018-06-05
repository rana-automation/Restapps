package com.cengage.testRunner;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/featurefiles",tags = {"@csgHealthChecker,@wmsHealthChecker,@lcstxHealthChecker"},
        glue = "",

            format = {"json:target/cucumber/report.json", "html:target/cucumber-html-report/"}

)

public class TestRunner {

}




