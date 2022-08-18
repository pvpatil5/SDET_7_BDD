  Given Launch browser
    And enterURL "http://localhost:8888"
    When login page is displayed
    Then enterusername "admin"
    And enterpassword "12345"