package Pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.testng.Assert;

import static com.codeborne.selenide.Selenide.$;

public class UserPage {


    private SelenideElement openOption = $(By.xpath("//a[contains(text(),'Open New Account')]"));
    private SelenideElement findTrans = $(By.xpath("//a[contains(@href,'/parabank/findtrans.htm')]"));


    public UserPage checkLoggedAccess() {
        Assert.assertEquals(openOption.waitUntil(Condition.visible, 10000, 5).getText(), "Open New Account");
        return this;
    }


    public OpenNewAccountPage openNewAccount() {

        openOption.waitUntil(Condition.visible, 20000, 4).click();

        return new OpenNewAccountPage();
    }


    public FindTransactionsPage findTrans() {
        findTrans.click();
        return new FindTransactionsPage();
    }


}
