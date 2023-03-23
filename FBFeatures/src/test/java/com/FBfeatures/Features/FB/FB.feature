Feature: Validating the features of Facebook Account

Background:
  Given User is on the Facebook Page
  When User enter"<chandra_sudu@yahoo.co.in>" as EmailId
  And User enters"<9password9>" as Password
  And Click on the Login button



 Scenario: Validating the path to account page
    Then User clicks on "Poorna Tummati" in the account page and should see the "profileCoverPhoto"


  Scenario:
    When :Click on the Create Story
    And :Click on Create Text
    And : In the Start Typing option enter"<Today's Story>"
    And :Click on share story
    Then : You should see the story posted on home page



