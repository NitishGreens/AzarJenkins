$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/FacebookLogin.feature");
formatter.feature({
  "name": "Validation of Login Page in facebook Web Application",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@TCAR4793835"
    }
  ]
});
formatter.scenario({
  "name": "TC01_Validation of Login page with valid username and valid password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@TCAR4793835"
    },
    {
      "name": "@Smoke"
    },
    {
      "name": "@Reg"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User launch Facebook Web Application",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.user_launch_Facebook_Web_Application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters valid username \"mani@gmail.com\" and valid password \"mani@123\" and click on login Button",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_enters_valid_username_and_valid_password_and_click_on_login_Button(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User verify Home Page is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_verify_Home_Page_is_displayed()"
});
formatter.result({
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:86)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat org.junit.Assert.assertTrue(Assert.java:52)\r\n\tat com.stepdefinition.StepDefinition.user_verify_Home_Page_is_displayed(StepDefinition.java:27)\r\n\tat ✽.User verify Home Page is displayed(file:src/test/resources/Features/FacebookLogin.feature:8)\r\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png", null);
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "TC02_Validation of Sign page with invalid inputs",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Sanity"
    },
    {
      "name": "@Reg"
    }
  ]
});
formatter.step({
  "name": "User launch Facebook Web Application",
  "keyword": "Given "
});
formatter.step({
  "name": "User Click on createNewAccount Button",
  "keyword": "When "
});
formatter.step({
  "name": "User enters \"\u003cfirstName\u003e\"and \"\u003clastName\u003e\" and click on signUp Button",
  "keyword": "And "
});
formatter.step({
  "name": "User verify Error message is displayed",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "firstName",
        "lastName"
      ]
    },
    {
      "cells": [
        "mani",
        "java"
      ]
    },
    {
      "cells": [
        "abu",
        "selenium"
      ]
    }
  ]
});
formatter.scenario({
  "name": "TC02_Validation of Sign page with invalid inputs",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@TCAR4793835"
    },
    {
      "name": "@Sanity"
    },
    {
      "name": "@Reg"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User launch Facebook Web Application",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.user_launch_Facebook_Web_Application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Click on createNewAccount Button",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_Click_on_createNewAccount_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters \"mani\"and \"java\" and click on signUp Button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_enters_and_and_click_on_signUp_Button(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User verify Error message is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_verify_Error_message_is_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "TC02_Validation of Sign page with invalid inputs",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@TCAR4793835"
    },
    {
      "name": "@Sanity"
    },
    {
      "name": "@Reg"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User launch Facebook Web Application",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.user_launch_Facebook_Web_Application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Click on createNewAccount Button",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_Click_on_createNewAccount_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters \"abu\"and \"selenium\" and click on signUp Button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_enters_and_and_click_on_signUp_Button(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User verify Error message is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_verify_Error_message_is_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});