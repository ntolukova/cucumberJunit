$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/vytrack_features/google.feature");
formatter.feature({
  "name": "Google feature verifications",
  "description": "  Agile Story: User stories, AC\n  Basically, we can pass here any additional information related to this feature file",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Google title verification",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smokeTest"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on Google homepage",
  "keyword": "When "
});
formatter.match({
  "location": "Google_StepDefs.user_is_on_Google_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should see title contains Google",
  "keyword": "Then "
});
formatter.match({
  "location": "Google_StepDefs.user_should_see_title_contains_Google()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});