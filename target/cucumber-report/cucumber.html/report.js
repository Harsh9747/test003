$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("freeGame.feature");
formatter.feature({
  "line": 2,
  "name": "Top menu Test",
  "description": "As a user I want to navigate top menu of virgin games website",
  "id": "top-menu-test",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@regression"
    }
  ]
});
formatter.before({
  "duration": 10610308600,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "User Should Navigate To free game page SuccessFully",
  "description": "",
  "id": "top-menu-test;user-should-navigate-to-free-game-page-successfully",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I click on free games link",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I should see \"Virgin Games Daily Free Games\" text message",
  "keyword": "Then "
});
formatter.match({
  "location": "FreeGamePageStep.iAmOnHomepage()"
});
formatter.result({
  "duration": 133260400,
  "status": "passed"
});
formatter.match({
  "location": "FreeGamePageStep.iClickOnFreeGamesLink()"
});
formatter.result({
  "duration": 294375100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Virgin Games Daily Free Games",
      "offset": 14
    }
  ],
  "location": "FreeGamePageStep.iShouldSeeTextMessage(String)"
});
formatter.result({
  "duration": 539623300,
  "status": "passed"
});
formatter.after({
  "duration": 901400500,
  "status": "passed"
});
});