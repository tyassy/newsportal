package pages;

import static locators.NewsPageLocator.LABEL_NEWS_TITLE;

import base.BasePageObject;

public class NewsPage extends BasePageObject {

  public boolean isNewsPageAppear() {
    return find(LABEL_NEWS_TITLE).isDisplayed();
  }

}
