$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/Alex/.eclipse/cucumber/src/test/resources/fb.feature");
formatter.feature({
  "name": "Validate the FaceBook Page",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Validate Login with correct userName and correct password",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user is on Facebook page on chrome Browser",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdef.user_is_on_Facebook_page_on_chrome_Browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter username and password",
  "keyword": "When "
});
formatter.match({
  "location": "stepdef.user_enter_username_and_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user shouls click on login butoon",
  "keyword": "And "
});
formatter.match({
  "location": "stepdef.user_shouls_click_on_login_butoon()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should verify the Homepage is displayed or not",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdef.user_should_verify_the_Homepage_is_displayed_or_not()"
});
formatter.result({
  "status": "passed"
});
});