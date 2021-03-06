package Pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class RegistrationPage {


    private SelenideElement fn = $(By.id("customer.firstName"));
    private SelenideElement ln = $(By.id("customer.lastName"));
    private SelenideElement add = $(By.id("customer.address.street"));
    private SelenideElement city = $(By.id("customer.address.city"));
    private SelenideElement state = $(By.id("customer.address.state"));
    private SelenideElement zip = $(By.id("customer.address.zipCode"));
    private SelenideElement phone = $(By.id("customer.phoneNumber"));
    private SelenideElement ssn = $(By.id("customer.ssn"));
    private SelenideElement un = $(By.id("customer.username"));
    private SelenideElement pass1 = $(By.id("customer.password"));
    private SelenideElement pass2 = $(By.id("repeatedPassword"));
    private SelenideElement regButton = $(byValue("Register"));


    public RegistrationPage populateUserAccountData(
            String firstnameVal,
            String lastnameVal,
            String addressVal,
            String cityVal,
            String stateVal,
            String zipVal,
            String phoneVal,
            String ssnVal,
            String unVal,
            String passVal


    ) {


        fn.waitUntil(Condition.visible, 30000, 5).setValue(firstnameVal);
        ln.setValue(lastnameVal);
        add.setValue(addressVal);
        city.setValue(cityVal);
        state.setValue(stateVal);
        zip.setValue(zipVal);
        phone.setValue(phoneVal);
        ssn.setValue(ssnVal);
        un.setValue(unVal);
        pass1.setValue(passVal);
        pass2.val(passVal);

        return this;
    }


    public UserPage submitRegister() {
        regButton.waitUntil(Condition.visible, 20000, 5).click();
        return new UserPage();
    }

}
