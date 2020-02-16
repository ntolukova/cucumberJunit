$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/wikipedia_features/wiki.feature");
formatter.feature({
  "name": "Wikipedia search functionality verification",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Wiki"
    }
  ]
});
formatter.scenarioOutline({
  "name": "TC#27: Wikipedia Search Functionality Image Header Verification",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@PracticeScenarioOutline"
    }
  ]
});
formatter.step({
  "name": "User is on Wikipedia home page",
  "keyword": "Given "
});
formatter.step({
  "name": "User types \"\u003cvalue\u003e\" in the wiki search box",
  "keyword": "When "
});
formatter.step({
  "name": "User clicks on wiki search button",
  "keyword": "And "
});
formatter.step({
  "name": "User sees \"\u003cexpectedTitle\u003e\" is in the image header",
  "keyword": "Then "
});
formatter.examples({
  "name": "Test data for image header verification",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "value",
        "expectedTitle"
      ]
    },
    {
      "cells": [
        "Eminem",
        "Eminem"
      ]
    },
    {
      "cells": [
        "Stephen King",
        "Stephen King"
      ]
    },
    {
      "cells": [
        "Vladimir Putin",
        "Vladimir Putin"
      ]
    }
  ]
});
formatter.scenario({
  "name": "TC#27: Wikipedia Search Functionality Image Header Verification",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Wiki"
    },
    {
      "name": "@PracticeScenarioOutline"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on Wikipedia home page",
  "keyword": "Given "
});
formatter.match({
  "location": "WikiSearchFunctionality.user_is_on_Wikipedia_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User types \"Eminem\" in the wiki search box",
  "keyword": "When "
});
formatter.match({
  "location": "WikiSearchFunctionality.user_types_in_the_wiki_search_box(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on wiki search button",
  "keyword": "And "
});
formatter.match({
  "location": "WikiSearchFunctionality.user_clicks_on_wiki_search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User sees \"Eminem\" is in the image header",
  "keyword": "Then "
});
formatter.match({
  "location": "WikiSearchFunctionality.user_sees_is_in_the_image_header(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "TC#27: Wikipedia Search Functionality Image Header Verification",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Wiki"
    },
    {
      "name": "@PracticeScenarioOutline"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on Wikipedia home page",
  "keyword": "Given "
});
formatter.match({
  "location": "WikiSearchFunctionality.user_is_on_Wikipedia_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User types \"Stephen King\" in the wiki search box",
  "keyword": "When "
});
formatter.match({
  "location": "WikiSearchFunctionality.user_types_in_the_wiki_search_box(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on wiki search button",
  "keyword": "And "
});
formatter.match({
  "location": "WikiSearchFunctionality.user_clicks_on_wiki_search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User sees \"Stephen King\" is in the image header",
  "keyword": "Then "
});
formatter.match({
  "location": "WikiSearchFunctionality.user_sees_is_in_the_image_header(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "TC#27: Wikipedia Search Functionality Image Header Verification",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Wiki"
    },
    {
      "name": "@PracticeScenarioOutline"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on Wikipedia home page",
  "keyword": "Given "
});
formatter.match({
  "location": "WikiSearchFunctionality.user_is_on_Wikipedia_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User types \"Vladimir Putin\" in the wiki search box",
  "keyword": "When "
});
formatter.match({
  "location": "WikiSearchFunctionality.user_types_in_the_wiki_search_box(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on wiki search button",
  "keyword": "And "
});
formatter.match({
  "location": "WikiSearchFunctionality.user_clicks_on_wiki_search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User sees \"Vladimir Putin\" is in the image header",
  "keyword": "Then "
});
formatter.match({
  "location": "WikiSearchFunctionality.user_sees_is_in_the_image_header(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});