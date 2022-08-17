package locators;

import org.openqa.selenium.By;

public interface NewsPageLocator {

  By LABEL_NEWS_TITLE_IN_TRENDING_PAGE = By.cssSelector("span[data-qa-id='title']");
  By LABEL_ANY_NEWS_TITLE = By.cssSelector("h1[data-qa-id='story-title']");

}
