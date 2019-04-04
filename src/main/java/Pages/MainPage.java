package Pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class MainPage {

    private SelenideElement login = $(By.xpath("//input[@name='username']"));
    private SelenideElement password = $(By.xpath("//input[@name='password']"));
    private SelenideElement logBtn = $(By.xpath("//input[@value='Log In']"));
    private SelenideElement regBtn = $(By.xpath("//a[contains(@href,'register.htm')]"));
    private SelenideElement error = $(By.className("error"));


    public MainPage fillLoginFields(String log, String pwd) {

        login.waitUntil(Condition.visible, 25000, 4).setValue(log);
        password.setValue(pwd);
        return this;
    }

    public MainPage clickLoginBtn() {

        logBtn.click();
        return this;
    }

    public RegistrationPage clickRegisterBtn() {

        regBtn.waitUntil(Condition.visible, 20000, 5).click();
        return new RegistrationPage();
    }

    public MainPage errorLoginVerification() {

        error.shouldHave(text("The username and password could not be verified."));
        return this;
    }


}
