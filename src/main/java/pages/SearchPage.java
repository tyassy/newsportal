package pages;

import static locators.SearchLocator.BUTTON_SEARCH_NEWS_RESULT;
import static locators.SearchLocator.BUTTON_SEARCH_SUGGESTION;

import base.BasePageObject;

public class SearchPage extends BasePageObject {

  public void chooseSearchSuggestion() {
    waitlonger();
    try {
      find(BUTTON_SEARCH_SUGGESTION).click();
    } catch (Exception e) {
    }
  }

  public void chooseSearchNewsResult() {
    waitshortly();
    find(BUTTON_SEARCH_NEWS_RESULT).click();
  }

}
