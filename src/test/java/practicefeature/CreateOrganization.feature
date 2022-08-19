Feature: Organization

  Scenario Outline:
    Given Launch browser
    And enterURL "http://localhost:8888"
    When login page is displayed
    Then enterusername "admin"
    And enterpassword "12345"
    Then click on login button
    And verify the homepage title
    Then click on organizationlink
    And click on createorganization img
    Then enterorgname "<orgname>"
    And enter phonenumber "<phonenumber>"
    Then save the organization
    And logout from the application
    Then close the browser

    Examples: 
    | orgname | phonenumber |
    | GOOGLE_MUM | 12345 | 
    | IBM_MUM | 78910 |
    
    
    