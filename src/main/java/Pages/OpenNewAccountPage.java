package Pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.testng.Assert;

import static com.codeborne.selenide.Selenide.$;

public class OpenNewAccountPage {

    private SelenideElement accountType = $(By.id("type"));
    private SelenideElement openBtn = $(By.xpath("//input[@type='submit']"));


    private SelenideElement accountCreationConfirmation = $(By.xpath("//p[contains(text(),'Congratulations, your account is now open.')]"));

    public OpenNewAccountPage setAccountType(String accType)  {


        accountType.waitUntil(Condition.visible, 20000, 4).selectOptionContainingText(accType);

        return this;
    }


    public OpenNewAccountPage clickOpenAccountBtn() {

        openBtn.waitUntil(Condition.visible, 20000, 4).click();
        openBtn.pressEnter();


        return this;
    }


    public void bankAccountCreationVerification() {
        Assert.assertEquals(accountCreationConfirmation.waitUntil(Condition.visible, 20000, 5).getText(), "Congratulations, your account is now open.");
    }


}
