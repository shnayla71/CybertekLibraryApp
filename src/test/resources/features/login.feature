
Feature: LoginAs I user, I should be able to login
  @librarian
  Scenario: Login as a librarian
    Given Librarian on the login page
    When Librarian login as a librarian
    Then Dashboard should be displayed
 @student
  Scenario: Login as a student
    Given Student on the login page
    When Student login as a student
    Then Dashboard1 should be displayed