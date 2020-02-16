@Wiki
Feature: Wikipedia search functionality verification

  Scenario:TC#25: Wikipedia Search Functionality Title Verification
    Given User is on Wikipedia home page
    When User types "<value>" in the wiki search box
    And  User clicks on wiki search button
    Then User sees "Steve Jobs" is in the wiki title

  Scenario: TC#26: Wikipedia Search Functionality Header Verification
    Given User is on Wikipedia home page
    When User types "<value>" in the wiki search box
    And  User clicks on wiki search button
    Then User sees "Steve Jobs" is in the main header

  @PracticeScenarioOutline
  Scenario Outline: TC#27: Wikipedia Search Functionality Image Header Verification
    Given User is on Wikipedia home page
    When User types "<value>" in the wiki search box
    And  User clicks on wiki search button
    Then User sees "<expectedTitle>" is in the image header

    Examples: Test data for image header verification
      | value          | expectedTitle  |
      | Eminem         | Eminem         |
      | Stephen King   | Stephen King   |
      | Vladimir Putin | Vladimir Putin |

