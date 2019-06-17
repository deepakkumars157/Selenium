Feature: As an i-nexus user I can access My World Dashboard

  @Dashboard
  Scenario: I can view, add and remove a new panel on My World Dashboard
    Given I am logged into "stgrel" with "SG19" and Password as "Password1"
    When I navigate to My World Dashboard
    Then I should be presented with my Dashboard
    And I add a new panel
    And I can remove a panel

