$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/iphone.feature");
formatter.feature({
  "name": "Search cheapest Iphone",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "User should be able to find cheapest Iphone model",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on search page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.backmarket.step_definitions.IphoneStepDefs.user_is_on_search_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters Iphone model with storage \"iphone 11 256 gb unlocked\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.backmarket.step_definitions.IphoneStepDefs.user_enters_Iphone_model_with_storage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click model checkboxes \"iPhone 11\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.backmarket.step_definitions.IphoneStepDefs.user_click_model_checkboxes(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click storage check box \"256 GB\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.backmarket.step_definitions.IphoneStepDefs.user_click_storage_check_box(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User inconsistent prices according to condition",
  "keyword": "And "
});
formatter.match({
  "location": "com.backmarket.step_definitions.IphoneStepDefs.user_eliminates_inconsistent_prices_according_to_condition()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});