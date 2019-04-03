package Pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class TransactionResults {

    private SelenideElement fundsTransferSent = $(By.xpath("//a[contains(text(),'Funds Transfer Sent')]"));


    public TransactionResults checkTranResults() {

        fundsTransferSent.isDisplayed();
        return this;
    }


}
