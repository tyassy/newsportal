package locators;

import org.openqa.selenium.By;

public interface SearchLocator {

  String BUTTON_MAIN_MENU = "//yt-formatted-string[@class='tab-title style-scope ytmusic-pivot-bar-item-renderer'][(text()='%s')]";
  By BUTTON_SEARCH_SUGGESTION = By.xpath("//span[@class='Textweb__StyledText-sc-1uxddwr-0 ismIXc']/ancestor::button");
  By BUTTON_SEARCH_NEWS_RESULT = By.xpath("//span[(text()='kumparanNEWS')]/ancestor::a//span[@data-qa-id='title']/ancestor::a");

}
