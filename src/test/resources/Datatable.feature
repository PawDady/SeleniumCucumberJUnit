Feature: Run Selenium Scenarios

  @sanity @regression @Datatable @titleWebsiteUser
  Scenario: Check the title of website - www.softpost.org
    Given website title as tutorial home page of the
      | website | http://www.softpost.org |
      | title   | tutorials               |
      | user    | xyz                     |

  @sanity @regression @Datatable @titleWebsite
  Scenario: Check the title of website - google
    Given website title as google home page of the
      | website | http://www.google.com |
      | title   | google                |