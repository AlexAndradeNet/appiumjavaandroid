# language: en

#@ignore
Feature: Solve course exercises
  As a User
  I want to test all the exercises
  So that I can practice the new knowledge

  #@ignore
  Scenario: The trader delete its account
    Given Jacob is in the Home Page
    When wants to delete its account
    Then see the accounts disappears

  #@ignore
  Scenario: The trader explores the menu
    Given Jacob is in the Home Page
    When navigates to the menu panel
    Then see the numbers of items is 8
