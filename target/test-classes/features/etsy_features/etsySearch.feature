Feature: Etsy search functionality
  CBT-234 Agile Story: ...
  # can be placed any agile story and Ticket number for example: CBT-234

  @etsy
  Scenario: Etsy search title verification
    Given User is on Etsy home page
    When User searches for chair
    Then User should see chair in the title
 # @etsy
  Scenario: Etsy search title verification
    Given User is on Etsy home page
    When User searches for "chair"
    Then User should see "Chair" in the title