$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Users/Paru/Desktop/BDD/CitiProject/features/login.feature");
formatter.feature({
  "line": 2,
  "name": "Login Feature",
  "description": "",
  "id": "login-feature",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@FunctionalTest"
    }
  ]
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 4,
      "value": "#The Scenario Outline keyword can be used to run the same Scenario multiple times,"
    },
    {
      "line": 5,
      "value": "# with different combinations of values."
    },
    {
      "line": 6,
      "value": "# The keyword Scenario Template is a synonym of the keyword Scenario Outline."
    }
  ],
  "line": 8,
  "name": "Login with invalid credentials",
  "description": "",
  "id": "login-feature;login-with-invalid-credentials",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 9,
  "name": "User has to be in log in page",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "Try log in by invalid \"\u003cuserName\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "Unable to log in",
  "keyword": "Then "
});
formatter.examples({
  "line": 12,
  "name": "",
  "description": "",
  "id": "login-feature;login-with-invalid-credentials;",
  "rows": [
    {
      "cells": [
        "userName",
        "password"
      ],
      "line": 13,
      "id": "login-feature;login-with-invalid-credentials;;1"
    },
    {
      "cells": [
        "mnaque72@gmail.com",
        "Love143$"
      ],
      "line": 14,
      "id": "login-feature;login-with-invalid-credentials;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 6616452418,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Login with invalid credentials",
  "description": "",
  "id": "login-feature;login-with-invalid-credentials;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@FunctionalTest"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "User has to be in log in page",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "Try log in by invalid \"mnaque72@gmail.com\" and \"Love143$\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "Unable to log in",
  "keyword": "Then "
});
formatter.match({
  "location": "InvalidLogIn.user_has_to_be_in_log_in_page()"
});
formatter.result({
  "duration": 236522056,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "mnaque72@gmail.com",
      "offset": 23
    },
    {
      "val": "Love143$",
      "offset": 48
    }
  ],
  "location": "InvalidLogIn.try_log_in_by_invalid_and(String,String)"
});
formatter.result({
  "duration": 8738276636,
  "status": "passed"
});
formatter.match({
  "location": "InvalidLogIn.unable_to_log_in()"
});
formatter.result({
  "duration": 62740,
  "status": "passed"
});
formatter.after({
  "duration": 125631016,
  "status": "passed"
});
});