$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/wikipedia_features/Dzone.feature");
formatter.feature({
  "name": "Compare headers",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "user should be able to compare the headers",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@headers"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on \"https://dzone.com/articles/gradle-vs-maven\"",
  "keyword": "Given "
});
formatter.match({
  "location": "Dzone_stepDefs.user_is_on(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user gets the header of the page",
  "keyword": "Then "
});
formatter.match({
  "location": "Dzone_stepDefs.user_gets_the_header_of_the_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is on \"https://dzone.com/articles/api-security-weekly-issue-71\"",
  "keyword": "And "
});
formatter.match({
  "location": "Dzone_stepDefs.user_is_on(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user gets the header of this page",
  "keyword": "Then "
});
formatter.match({
  "location": "Dzone_stepDefs.user_gets_the_header_of_this_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be able to compare the headers",
  "keyword": "Then "
});
formatter.match({
  "location": "Dzone_stepDefs.user_should_be_able_to_compare_the_headers()"
});
formatter.result({
  "error_message": "org.junit.ComparisonFailure: expected:\u003c[Gradle vs. Maven]\u003e but was:\u003c[API Security Weekly: Issue #71]\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:115)\r\n\tat org.junit.Assert.assertEquals(Assert.java:144)\r\n\tat step_definitions.Dzone_stepDefs.user_should_be_able_to_compare_the_headers(Dzone_stepDefs.java:32)\r\n\tat ✽.user should be able to compare the headers(src/test/resources/features/wikipedia_features/Dzone.feature:9)\r\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "status": "passed"
});
});