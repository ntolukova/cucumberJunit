$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/etsy_features/etsySearch.feature");
formatter.feature({
  "name": "Etsy search functionality",
  "description": "  CBT-234 Agile Story: ...",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Etsy search title verification",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@etsy"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on Etsy home page",
  "keyword": "Given "
});
formatter.match({
  "location": "EtsySearchFunctionality.user_is_on_Etsy_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User searches for chair",
  "keyword": "When "
});
formatter.match({
  "location": "EtsySearchFunctionality.user_searches_for_chair()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should see chair in the title",
  "keyword": "Then "
});
formatter.match({
  "location": "EtsySearchFunctionality.user_should_see_chair_in_the_title()"
});
formatter.result({
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:86)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat org.junit.Assert.assertTrue(Assert.java:52)\r\n\tat step_definitions.etsy_StepDefs.EtsySearchFunctionality.user_should_see_chair_in_the_title(EtsySearchFunctionality.java:28)\r\n\tat ✽.User should see chair in the title(src/test/resources/features/etsy_features/etsySearch.feature:9)\r\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "status": "passed"
});
});