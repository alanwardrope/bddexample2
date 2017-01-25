
Feature: Download section
  2. In order to use Selenium in my project, I need to download the correct Selenium Language bindings

  Scenario:
    Given I am on the Selenium homepage
    When I click on "Download" tab
    Then I should see "Java" Download link on Download page
    And I should see "C#" Download link on Download page
    And I should see "Ruby" Download link on Download page
    And I should see "Python" Download link on Download page
    And I should see "Javascript (Node)" Download link on Download page