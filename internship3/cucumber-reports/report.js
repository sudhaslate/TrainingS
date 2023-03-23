$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/fb3Features/fb3.feature");
formatter.feature({
  "line": 1,
  "name": "Validating LogOut Functionality",
  "description": "",
  "id": "validating-logout-functionality",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Validating the Logout Functionality on fabcebook page",
  "description": "",
  "id": "validating-logout-functionality;validating-the-logout-functionality-on-fabcebook-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User is on the Facebook Page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User enter\u003c\"chandra_sudu@yahoo.co.in\"\u003e in the input box",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User enters\u003c\"9password9\"\u003e in the password field",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Click on the Login button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "On account page click the Profile pic on top right hand corner",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User should click on the last option LogOut",
  "keyword": "Then "
});
formatter.match({
  "location": "FB3code.user_is_on_the_Facebook_Page()"
});
formatter.result({
  "duration": 2836247084,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "chandra_sudu@yahoo.co.in",
      "offset": 12
    }
  ],
  "location": "FB3code.user_enter_in_the_input_box(String)"
});
formatter.result({
  "duration": 143630333,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "9password9",
      "offset": 13
    }
  ],
  "location": "FB3code.user_enters_in_the_password_field(String)"
});
formatter.result({
  "duration": 39205416,
  "status": "passed"
});
formatter.match({
  "location": "FB3code.click_on_the_Login_button()"
});
formatter.result({
  "duration": 10422603584,
  "status": "passed"
});
formatter.match({
  "location": "FB3code.on_account_page_click_the_Profile_pic_on_top_right_hand_corner()"
});
formatter.result({
  "duration": 3071008458,
  "status": "passed"
});
formatter.match({
  "location": "FB3code.user_should_click_on_the_last_option_LogOut()"
});
formatter.result({
  "duration": 2675172333,
  "status": "passed"
});
});