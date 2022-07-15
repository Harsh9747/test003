@regression
Feature: Top menu Test
  As a user I want to navigate top menu of virgin games website

  Scenario: User Should Navigate To free game page SuccessFully
    Given I am on homepage
    When I click on free games link
    Then I should see "Virgin Games Daily Free Games" text message


