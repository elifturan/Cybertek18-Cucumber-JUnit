Feature: Search
  Agile story: As a user, I shoul be able to search when I am on Google search page.

  Background: User should be on google search page
    Given User is on the google search page


  Scenario: Google default title verification
    Then User should see title is Google


  Scenario: Google title verification after search
    When User searches apple
    Then User should see apple in the Title


  Scenario: Google title verification after search
    When User searches "peach"
    Then User should see "peach" in the Title

  @wip
  Scenario: Google -About- link page title verification
    Then User should see About link
    And User clicks to About link
    Then User should see title Google - About Google, Our Culture & Company News

    @googleTable
  Scenario: Google search page footer links verification
    Then User should see six links in the footer
      | Advertising      |
      | Business         |
      | How Search Works |
      | Privacy          |
      | Terms            |
      | Setting          |

