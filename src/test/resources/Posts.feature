Feature: Test of writing new post and comment

  @Posts @NewPost
  Scenario: Writing new post and checking that post
    Given User is on Admin webside
    When User logins to main website
    Then User is logedin on website
    When User goes to write post site
    Then User is on Posts site
    When User writes and sends post
    Then User logedouts from admin website
    When User go to home website
    Then User sees writen posts

  @Posts @NewComment
  Scenario: Writing new comment and checking that comment
    Given User is on home page
    When User goes to posts
    Then User sees posts
    When User writes comment to post
    Then User sees writen comment