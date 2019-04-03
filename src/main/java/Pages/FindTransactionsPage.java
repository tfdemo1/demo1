package Pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.text.SimpleDateFormat;
import java.util.Date;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class FindTransactionsPage {


    private SelenideElement findByDate = $(By.id("criteria.onDate"));
    private ElementsCollection findBtn = $$(By.xpath("//*[@type='submit']"));

    public FindTransactionsPage findTranByDate() {

        Date date = new Date();
        String today = new SimpleDateFormat("MM-DD-YYYY").format(date);
        findByDate.setValue(today);
        return this;
    }


    public TransactionResults clickFindTrans() {
        findBtn.get(1).click();
        return new TransactionResults();
    }


}
