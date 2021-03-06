Feature: Etsy search functionality
  CBT-234 Agile Story: ...
  # can be placed any agile story and Ticket number for example: CBT-234
  Background: User is already on the Etsy home page
    Given User is on Etsy home page
    #is like before method is gonna be implemented before each scenario. We can pass more than one step under background

  @etsy
  Scenario: Etsy search title verification
    When User searches for chair
    Then User should see chair in the title

  @etsy2
  Scenario Outline: Etsy search title verification
    When User searches for "<searchValue>"
    Then User should see "<expectedTitle>" in the title
    Examples:
      | searchValue  | expectedTitle |
      | chair        | Chair         |
      | wooden spoon | Wooden spoon  |
      | desk         | Desk          |