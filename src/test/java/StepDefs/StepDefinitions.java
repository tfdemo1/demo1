package StepDefs;

import Pages.*;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;


public class StepDefinitions  {


    MainPage mp = new MainPage();
    UserPage up = new UserPage();
    RegistrationPage rp = new RegistrationPage();
    OpenNewAccountPage onap = new OpenNewAccountPage();
    FindTransactionsPage ftp = new FindTransactionsPage();
    TransactionResults trp = new TransactionResults();



    @Given("user clicks Register button")
    public void user_clicks_Register_button() {

        mp.clickRegisterBtn();

    }

    @When("he populates required data (.+), (.+), (.+), (.+), (.+), (.+), (.+), (.+), (.+), (.+)")
    public void he_populates_required_data_(String firstname, String lastname, String address, String city, String state, String zipcode, String phone, String ssn, String username, String password) throws Throwable {

        rp.populateUserAccountData(firstname, lastname, address, city, state, zipcode, phone, ssn, username, password);

    }

    @And("he submits registration")
    public void he_submits_registration() {

        rp.submitRegister();
    }

    @Then("user will be logged into his account")
    public void user_will_be_logged_into_his_account() {

        up.checkLoggedAccess();

    }


    @Given("^user types username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void user_types_username_something_and_password_something(String ulog, String upassword) throws Throwable {

        mp.fillLoginFields(ulog, upassword);

    }

    @When("he clicks Log In button")
    public void he_clicks_Log_In_button() {

        mp.clickLoginBtn();

    }


    @Given("user types data")
    public void user_types_data(List<String> data) {

        mp.fillLoginFields(data.get(0), data.get(1));

    }

    @Then("he will receive error that user account could not be verified")
    public void he_will_receive_error_that_user_account_could_not_be_verified() {

        mp.errorLoginVerification();

    }


    @Given("user clicks Open New Account")
    public void user_clicks_open_new_account() throws Throwable {

        up.openNewAccount();

    }

    @When("Open New Account window is displayed he selects type of account \"([^\"]*)\"")
    public void open_new_account_window_is_displayed_he_selects_type_of_account_something(String aType) throws Throwable {

        onap.setAccountType(aType);
    }


    @And("user submits creation")
    public void user_submits_creation() throws Throwable {

        onap.clickOpenAccountBtn();

    }

    @Then("new bank account is opened")
    public void new_bank_account_is_opened() throws Throwable {

        onap.bankAccountCreationVerification();

    }

    @Given("user clicks Find Transactions")
    public void user_clicks_find_transactions() throws Throwable {

        up.findTrans();

    }

    @When("he set today date")
    public void he_set_today_date() throws Throwable {

        ftp.findTranByDate();

    }

    @And("clicks Find Transactions")
    public void clicks_find_transactions() throws Throwable {

        ftp.clickFindTrans();

    }

    @Then("transaction results are displayed")
    public void transaction_results_are_displayed() throws Throwable {

        trp.checkTranResults();

    }


}
