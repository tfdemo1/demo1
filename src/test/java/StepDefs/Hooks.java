package StepDefs;

import com.codeborne.selenide.Configuration;
import cucumber.api.java.After;
import cucumber.api.java.Before;

import static com.codeborne.selenide.Selenide.close;
import static com.codeborne.selenide.Selenide.open;

public class Hooks {


    @Before("@RegTest,@SanityTest")
    public void openParabankPage() {

        Configuration.browser = "chrome";
        Configuration.browserSize = "1500x900";
        open("http://parabank.parasoft.com");

    }


    @After
    public void closeBrowser() {
        close();

    }


}
