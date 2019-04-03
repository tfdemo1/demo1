$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/03.Operations.feature");
formatter.feature({
  "name": "Operations on the bank account",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user types username \"stefan10\" and password \"stefan10\"",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.user_types_username_something_and_password_something(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "he clicks Log In button",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.he_clicks_Log_In_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user will be logged into his account",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.user_will_be_logged_into_his_account()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "New bank account creation",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@SanityTest"
    }
  ]
});
formatter.step({
  "name": "user clicks Open New Account",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.user_clicks_open_new_account()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Open New Account window is displayed he selects type of account \"SAVINGS\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.open_new_account_window_is_displayed_he_selects_type_of_account_something(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user submits creation",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.user_submits_creation()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "new bank account is opened",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.new_bank_account_is_opened()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user types username \"stefan10\" and password \"stefan10\"",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.user_types_username_something_and_password_something(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "he clicks Log In button",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.he_clicks_Log_In_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user will be logged into his account",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.user_will_be_logged_into_his_account()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Check find transaction option using date",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@RegTest"
    }
  ]
});
formatter.step({
  "name": "user clicks Find Transactions",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.user_clicks_find_transactions()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "he set today date",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.he_set_today_date()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks Find Transactions",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.clicks_find_transactions()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "transaction results are displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.transaction_results_are_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});