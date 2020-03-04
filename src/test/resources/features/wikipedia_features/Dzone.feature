Feature: Compare headers

  @headers
    Scenario: user should be able to compare the headers
    Given user is on "https://dzone.com/articles/gradle-vs-maven"
    Then user gets the header of the page
    And user is on "https://dzone.com/articles/api-security-weekly-issue-71"
    Then user gets the header of this page
    Then user should be able to compare the headers