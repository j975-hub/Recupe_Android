Feature: Login on Recupe Team Clinic
  Description: User will login as Patient

  Scenario Outline: Recupe Team Sign in application
    Given User will give the credential to sign in the application
    And  User will able to see their name <Name> in the banner page
    And User will logout the app

      Examples:

      |Name|
      |JHON|
