package pages;

import static locators.NewsPageLocator.LABEL_ANY_NEWS_TITLE;
import static locators.NewsPageLocator.LABEL_NEWS_TITLE_IN_TRENDING_PAGE;

import base.BasePageObject;

public class NewsPage extends BasePageObject {

  public boolean isNewsPageAppear() {
    waitshortly();
    return find(LABEL_ANY_NEWS_TITLE).isDisplayed();
  }

  public void clickNewsInTrending() {
    waitshortly();
    find(LABEL_NEWS_TITLE_IN_TRENDING_PAGE).click();
    waitshortly();
  }
}
