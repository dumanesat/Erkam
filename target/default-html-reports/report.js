$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/iphone.feature");
formatter.feature({
  "name": "Search cheapest Iphone",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Apple watch",
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
  "name": "User enters Iphone model with storage \"Apple Watch Series 8\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.backmarket.step_definitions.IphoneStepDefs.user_enters_Iphone_model_with_storage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click model checkboxes \"Apple Watch Series 8\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.backmarket.step_definitions.IphoneStepDefs.user_click_model_checkboxes(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click storage check box \"256 GB\".",
  "keyword": "And "
});
formatter.match({
  "location": "com.backmarket.step_definitions.IphoneStepDefs.userClickStorageCheckBox(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User inconsistent prices according to \"cellular\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.backmarket.step_definitions.IphoneStepDefs.userInconsistentPricesAccordingTo(java.lang.String)"
});
formatter.result({
  "error_message": "java.util.NoSuchElementException\n\tat java.base/java.util.ArrayList$Itr.next(ArrayList.java:1000)\n\tat java.base/java.util.Collections.min(Collections.java:601)\n\tat com.backmarket.step_definitions.IphoneStepDefs.userInconsistentPricesAccordingTo(IphoneStepDefs.java:339)\n\tat ✽.User inconsistent prices according to \"cellular\"(file:///Users/sule/IdeaProjects/Erkam/src/test/resources/features/iphone.feature:26)\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png", "screenshot");
formatter.after({
  "status": "passed"
});
});