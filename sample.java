{
  "type": "script",
  "seleniumVersion": "2",
  "formatVersion": 1,
  "steps": [
    {
      "type": "get",
      "url": "https://ignite.where2stageit.com/login.html"
    },
    {
      "type": "setElementText",
      "locator": {
        "type": "id",
        "value": "loginid"
      },
      "text": "qa_tester"
    },
    {
      "type": "setElementText",
      "locator": {
        "type": "id",
        "value": "password"
      },
      "text": "Where2getit!"
    },
    {
      "type": "clickElement",
      "locator": {
        "type": "id",
        "value": "submit"
      }
    },
    {
      "type": "clickElement",
      "locator": {
        "type": "css selector",
        "value": "b"
      }
    },
    {
      "type": "clickElement",
      "locator": {
        "type": "id",
        "value": "accounts_chzn_o_0"
      }
    },
    {
      "type": "clickElement",
      "locator": {
        "type": "id",
        "value": "btn-select-account"
      }
    },
    
    
    {
      "type": "verifyTextPresent",
      "text": "Total Channel Performance Across TimeDate Range: 06/01/2013 - 08/31/2013"
    },
    {
      "type": "clickElement",
      "locator": {
        "type": "id",
        "value": "change-chart"
      }
    },
    {
      "type": "clickElement",
      "locator": {
        "type": "id",
        "value": "change-chart"
      }
    },
    {
      "type": "verifyTextPresent",
      "text": "Channels Performance Date Range: 06/01/2013 - 08/31/2013"
    },
    {
      "type": "verifyTextPresent",
      "text": "web 17 42% ↑ 320 260% ↑ 1,882.35% 154% ↑ $0.50 -50% ↓"
    },
    {
      "type": "verifyTextPresent",
      "text": "search 0 0% ↑ 0 0% ↑ 0% 0% ↑ $0 0% ↑"
    },
    {
      "type": "verifyTextPresent",
      "text": "mobile 0 0% ↑ 0 0% ↑ 0% 0% ↑ $0 0% ↑"
    },
    {
      "type": "verifyTextPresent",
      "text": "social 0 0% ↑ 0 0% ↑ 0% 0% ↑ $0 0% ↑"
    },
    {
      "type": "verifyTextPresent",
      "text": "Totals173201,882.35%$0.50"
    }
  ]
}
