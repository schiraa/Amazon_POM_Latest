$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("amazon.feature");
formatter.feature({
  "line": 2,
  "name": "Validate Amazon E2E Scenarios",
  "description": "",
  "id": "validate-amazon-e2e-scenarios",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Demo"
    }
  ]
});
formatter.scenarioOutline({
  "line": 8,
  "name": "User Search the books from Amazon store",
  "description": "",
  "id": "validate-amazon-e2e-scenarios;user-search-the-books-from-amazon-store",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 9,
  "name": "User Select \"\u003cBooks\u003e\" from search dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User search book \"\u003cBookName\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "Validate the Search Result",
  "keyword": "And "
});
formatter.examples({
  "line": 13,
  "name": "",
  "description": "",
  "id": "validate-amazon-e2e-scenarios;user-search-the-books-from-amazon-store;",
  "rows": [
    {
      "cells": [
        "BookName",
        "Books"
      ],
      "line": 14,
      "id": "validate-amazon-e2e-scenarios;user-search-the-books-from-amazon-store;;1"
    },
    {
      "cells": [
        "Harry Potter and the Philosopher\u0027s Stone",
        "Books"
      ],
      "line": 15,
      "id": "validate-amazon-e2e-scenarios;user-search-the-books-from-amazon-store;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 5281635400,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "User launch Amazon UK site",
  "keyword": "Given "
});
formatter.match({
  "location": "Home_StepDef.userLaunchAmazonUKSite()"
});
formatter.result({
  "duration": 15760734800,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "User Search the books from Amazon store",
  "description": "",
  "id": "validate-amazon-e2e-scenarios;user-search-the-books-from-amazon-store;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Demo"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "User Select \"Books\" from search dropdown",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User search book \"Harry Potter and the Philosopher\u0027s Stone\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "Validate the Search Result",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "Books",
      "offset": 13
    }
  ],
  "location": "Home_StepDef.userSelectFromSearchDropdown(String)"
});
formatter.result({
  "duration": 6439371601,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Harry Potter and the Philosopher\u0027s Stone",
      "offset": 18
    }
  ],
  "location": "Home_StepDef.userSerachBook(String)"
});
formatter.result({
  "duration": 6702316400,
  "status": "passed"
});
formatter.match({
  "location": "SerachResult_StepDef.validateTheSearchResult()"
});
formatter.result({
  "duration": 50090700,
  "status": "passed"
});
formatter.after({
  "duration": 967681101,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 17,
  "name": "User Check Whether the Booke is Best selling in Amazon UK site",
  "description": "",
  "id": "validate-amazon-e2e-scenarios;user-check-whether-the-booke-is-best-selling-in-amazon-uk-site",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 18,
  "name": "User Select \"\u003cBooks\u003e\" from search dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "User search book \"\u003cBookName\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "User Check whether the Book is \"Best Seller\" or Not",
  "keyword": "And "
});
formatter.examples({
  "line": 22,
  "name": "",
  "description": "",
  "id": "validate-amazon-e2e-scenarios;user-check-whether-the-booke-is-best-selling-in-amazon-uk-site;",
  "rows": [
    {
      "cells": [
        "BookName",
        "Books"
      ],
      "line": 23,
      "id": "validate-amazon-e2e-scenarios;user-check-whether-the-booke-is-best-selling-in-amazon-uk-site;;1"
    },
    {
      "cells": [
        "Harry Potter and the Philosopher\u0027s Stone",
        "Books"
      ],
      "line": 24,
      "id": "validate-amazon-e2e-scenarios;user-check-whether-the-booke-is-best-selling-in-amazon-uk-site;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 3155862800,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "User launch Amazon UK site",
  "keyword": "Given "
});
formatter.match({
  "location": "Home_StepDef.userLaunchAmazonUKSite()"
});
formatter.result({
  "duration": 15148629400,
  "status": "passed"
});
formatter.scenario({
  "line": 24,
  "name": "User Check Whether the Booke is Best selling in Amazon UK site",
  "description": "",
  "id": "validate-amazon-e2e-scenarios;user-check-whether-the-booke-is-best-selling-in-amazon-uk-site;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Demo"
    }
  ]
});
formatter.step({
  "line": 18,
  "name": "User Select \"Books\" from search dropdown",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "User search book \"Harry Potter and the Philosopher\u0027s Stone\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "User Check whether the Book is \"Best Seller\" or Not",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "Books",
      "offset": 13
    }
  ],
  "location": "Home_StepDef.userSelectFromSearchDropdown(String)"
});
formatter.result({
  "duration": 6499110400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Harry Potter and the Philosopher\u0027s Stone",
      "offset": 18
    }
  ],
  "location": "Home_StepDef.userSerachBook(String)"
});
formatter.result({
  "duration": 6776488501,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Best Seller",
      "offset": 32
    }
  ],
  "location": "SerachResult_StepDef.userCheckWhetherTheBookIsOrNot(String)"
});
formatter.result({
  "duration": 47015399,
  "status": "passed"
});
formatter.after({
  "duration": 999529300,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 26,
  "name": "User Verify the author,Book related information form Search Page",
  "description": "",
  "id": "validate-amazon-e2e-scenarios;user-verify-the-author,book-related-information-form-search-page",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 27,
  "name": "User Select \"\u003cBooks\u003e\" from search dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "User search book \"\u003cBookName\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "User check the BookName,Authore and Other information",
  "keyword": "And "
});
formatter.examples({
  "line": 31,
  "name": "",
  "description": "",
  "id": "validate-amazon-e2e-scenarios;user-verify-the-author,book-related-information-form-search-page;",
  "rows": [
    {
      "cells": [
        "BookName",
        "Books"
      ],
      "line": 32,
      "id": "validate-amazon-e2e-scenarios;user-verify-the-author,book-related-information-form-search-page;;1"
    },
    {
      "cells": [
        "Harry Potter and the Philosopher\u0027s Stone",
        "Books"
      ],
      "line": 33,
      "id": "validate-amazon-e2e-scenarios;user-verify-the-author,book-related-information-form-search-page;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 3564251400,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "User launch Amazon UK site",
  "keyword": "Given "
});
formatter.match({
  "location": "Home_StepDef.userLaunchAmazonUKSite()"
});
formatter.result({
  "duration": 16035625200,
  "status": "passed"
});
formatter.scenario({
  "line": 33,
  "name": "User Verify the author,Book related information form Search Page",
  "description": "",
  "id": "validate-amazon-e2e-scenarios;user-verify-the-author,book-related-information-form-search-page;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Demo"
    }
  ]
});
formatter.step({
  "line": 27,
  "name": "User Select \"Books\" from search dropdown",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "User search book \"Harry Potter and the Philosopher\u0027s Stone\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "User check the BookName,Authore and Other information",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "Books",
      "offset": 13
    }
  ],
  "location": "Home_StepDef.userSelectFromSearchDropdown(String)"
});
formatter.result({
  "duration": 6349136100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Harry Potter and the Philosopher\u0027s Stone",
      "offset": 18
    }
  ],
  "location": "Home_StepDef.userSerachBook(String)"
});
formatter.result({
  "duration": 6461083000,
  "status": "passed"
});
formatter.match({
  "location": "SerachResult_StepDef.userCheckTheBookNameAuthoreAndOtherInformation()"
});
formatter.result({
  "duration": 283543100,
  "status": "passed"
});
formatter.after({
  "duration": 1013971101,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 35,
  "name": "User Verify the Book is available in Kindle format",
  "description": "",
  "id": "validate-amazon-e2e-scenarios;user-verify-the-book-is-available-in-kindle-format",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 36,
  "name": "User Select \"\u003cBooks\u003e\" from search dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "User search book \"\u003cBookName\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 38,
  "name": "User check the Book is available in \"Kindle\" format",
  "keyword": "And "
});
formatter.examples({
  "line": 40,
  "name": "",
  "description": "",
  "id": "validate-amazon-e2e-scenarios;user-verify-the-book-is-available-in-kindle-format;",
  "rows": [
    {
      "cells": [
        "BookName",
        "Books"
      ],
      "line": 41,
      "id": "validate-amazon-e2e-scenarios;user-verify-the-book-is-available-in-kindle-format;;1"
    },
    {
      "cells": [
        "Harry Potter and the Philosopher\u0027s Stone",
        "Books"
      ],
      "line": 42,
      "id": "validate-amazon-e2e-scenarios;user-verify-the-book-is-available-in-kindle-format;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 3229123800,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "User launch Amazon UK site",
  "keyword": "Given "
});
formatter.match({
  "location": "Home_StepDef.userLaunchAmazonUKSite()"
});
formatter.result({
  "duration": 15655705899,
  "status": "passed"
});
formatter.scenario({
  "line": 42,
  "name": "User Verify the Book is available in Kindle format",
  "description": "",
  "id": "validate-amazon-e2e-scenarios;user-verify-the-book-is-available-in-kindle-format;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Demo"
    }
  ]
});
formatter.step({
  "line": 36,
  "name": "User Select \"Books\" from search dropdown",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "User search book \"Harry Potter and the Philosopher\u0027s Stone\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 38,
  "name": "User check the Book is available in \"Kindle\" format",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "Books",
      "offset": 13
    }
  ],
  "location": "Home_StepDef.userSelectFromSearchDropdown(String)"
});
formatter.result({
  "duration": 6386873600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Harry Potter and the Philosopher\u0027s Stone",
      "offset": 18
    }
  ],
  "location": "Home_StepDef.userSerachBook(String)"
});
formatter.result({
  "duration": 7347717099,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Kindle",
      "offset": 37
    }
  ],
  "location": "CreateAccount_StepDef.userCheckTheBookIsAvailableInFormat(String)"
});
formatter.result({
  "duration": 93721700,
  "status": "passed"
});
formatter.after({
  "duration": 974384000,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 44,
  "name": "User Verify the author,Book related information form Search Page",
  "description": "",
  "id": "validate-amazon-e2e-scenarios;user-verify-the-author,book-related-information-form-search-page",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 45,
  "name": "User Select \"\u003cBooks\u003e\" from search dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 46,
  "name": "User search book \"\u003cBookName\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 47,
  "name": "User select the Book nd Proceeds towards checkout",
  "keyword": "And "
});
formatter.step({
  "line": 48,
  "name": "If User dnot have Account,validate all fields on Craete Amazon account Page",
  "keyword": "And "
});
formatter.examples({
  "line": 50,
  "name": "",
  "description": "",
  "id": "validate-amazon-e2e-scenarios;user-verify-the-author,book-related-information-form-search-page;",
  "rows": [
    {
      "cells": [
        "BookName",
        "Books"
      ],
      "line": 51,
      "id": "validate-amazon-e2e-scenarios;user-verify-the-author,book-related-information-form-search-page;;1"
    },
    {
      "cells": [
        "Harry Potter and the Philosopher\u0027s Stone",
        "Books"
      ],
      "line": 52,
      "id": "validate-amazon-e2e-scenarios;user-verify-the-author,book-related-information-form-search-page;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 3102384400,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "User launch Amazon UK site",
  "keyword": "Given "
});
formatter.match({
  "location": "Home_StepDef.userLaunchAmazonUKSite()"
});
formatter.result({
  "duration": 22088723600,
  "status": "passed"
});
formatter.scenario({
  "line": 52,
  "name": "User Verify the author,Book related information form Search Page",
  "description": "",
  "id": "validate-amazon-e2e-scenarios;user-verify-the-author,book-related-information-form-search-page;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Demo"
    }
  ]
});
formatter.step({
  "line": 45,
  "name": "User Select \"Books\" from search dropdown",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 46,
  "name": "User search book \"Harry Potter and the Philosopher\u0027s Stone\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 47,
  "name": "User select the Book nd Proceeds towards checkout",
  "keyword": "And "
});
formatter.step({
  "line": 48,
  "name": "If User dnot have Account,validate all fields on Craete Amazon account Page",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "Books",
      "offset": 13
    }
  ],
  "location": "Home_StepDef.userSelectFromSearchDropdown(String)"
});
formatter.result({
  "duration": 6286390299,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Harry Potter and the Philosopher\u0027s Stone",
      "offset": 18
    }
  ],
  "location": "Home_StepDef.userSerachBook(String)"
});
formatter.result({
  "duration": 6885711700,
  "status": "passed"
});
formatter.match({
  "location": "CheckOut_StepDef.userSelectTheBookNdProceedsTowardsCheckout()"
});
formatter.result({
  "duration": 20800600999,
  "status": "passed"
});
formatter.match({
  "location": "CreateAccount_StepDef.ifUserDnotHaveAccountValidateAllFieldsOnCraeteAAzonAccountPage()"
});
formatter.result({
  "duration": 1362998100,
  "status": "passed"
});
formatter.after({
  "duration": 1043078901,
  "status": "passed"
});
});