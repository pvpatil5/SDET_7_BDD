Feature: To test the login functionality
 
Scenario: Login to app with valid credential
 Given launch browser
 Then enter URL
 Then validated login page is displayed or not
 And enter username 
 And enter password
 And click on login btn
 Then home page should display

Scenario: Login to app with invalid credential
Given launch browser
 Then enter URL
 Then validated login page is displayed or not
 And enter username "admin" 
 And enter password "1235"
 And click on login btn
 Then home page should display

Scenario: After entering wrong UN and PWD check error msg is diaplayed or not
Given launch browser
 Then enter URL
 Then validated login page is displayed or not
 And enter username "admin" 
 And enter password "1235"
 And click on login btn
 Then check error msg
