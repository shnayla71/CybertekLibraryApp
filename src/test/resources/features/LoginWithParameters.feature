Feature: Login with parameters

@librarianParam
  Scenario: Login as librarian 12
    Given I am on the login page
    When I enter username "librarian22@library"
    And I enter password 'bJRnAAyp'
    And click the sign in button
    And there should be 725 users
  Then dashboard should be displayed
     #numbercan be whatever you have there