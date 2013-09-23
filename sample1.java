{
  "type": "script",
  "seleniumVersion": "2",
  "formatVersion": 1,
  "steps": [
    {
      "type": "get",
      "url": "http://www.youtube.com/"
    },
    {
      "type": "clickElement",
      "locator": {
        "type": "xpath",
        "value": "//div[@id='yt-masthead-signin']//button[.='Sign in ']"
      }
    },
    {
      "type": "clickElement",
      "locator": {
        "type": "id",
        "value": "link-signup"
      }
    },
    {
      "type": "setElementText",
      "locator": {
        "type": "id",
        "value": "FirstName"
      },
      "text": "himanshu"
    },
    {
      "type": "setElementText",
      "locator": {
        "type": "id",
        "value": "LastName"
      },
      "text": "verma"
    },
    {
      "type": "setElementText",
      "locator": {
        "type": "id",
        "value": "EmailAddress"
      },
      "text": "himanshu@panalinks.com"
    }
  ]
}