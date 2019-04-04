package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(

        // features = "src/test/resources/features/01.UserAccounts.feature",
       // features = "src/test/resources/features/03.Operations.feature",
        //  features = {"src/test/resources/features/01.UserAccounts.feature", "src/test/resources/features/02.Login.feature"},
         features = "src/test/resources/features",

        glue = "StepDefs",
        tags = "@SanityTest,@RegTest",
        strict = true,
        monochrome = true,
        plugin = {"pretty",
                "html:target/cucumber-reports",
                "json:target/json-reports",
                "junit:target/cukes.xml"
        })


public class TestRunner extends AbstractTestNGCucumberTests {


}
