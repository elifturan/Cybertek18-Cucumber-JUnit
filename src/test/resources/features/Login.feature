Feature: Login feature
 CBT-25:  As a user, I should be able to login with correct
 credentials to different accounts. And dashboard should be displayed
@librarian @employee @sunday
  Scenario: Librarian login scenario
    Given User is on the login page
    When User logs in as librarian
    Then User should see dashboard
# or and like  && || in java
@student
  Scenario: Student login scenario
    Given User is on the google search page
    When User logs in as student
    Then User should see dashboard
@admin @employee @sunday
    Scenario: Admin login scenario
      Given User is on the login page
      When User logs in as admin
      Then User should see dashboard
