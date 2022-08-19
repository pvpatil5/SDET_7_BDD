Feature: 
  To create org

  Scenario Outline:  To create org with orgname, mono,mailId

    Given Launch browser
    And enterURL "http://localhost:8888"
    When login page is displayed
    Then enterusername "admin"
    And enterpassword "12345"
    Then click on login button
    And verify the homepage title
    Then click on organizationlink
    And click on createorganization img
    Then create org with name mobile and mailid
      | APEEJAY33 | 456789 | apj@tyss.com |
      | APEEJAY13 | 456789 | apj@tyss.com |
      | APEEJAY32 | 456789 | apj@tyss.com |
    Then save the organization
    And logout from the application
    Then close the browser
