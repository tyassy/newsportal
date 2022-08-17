package locators;

import org.openqa.selenium.By;

public interface HomePageLocator {

  By INPUT_SEARCH = By.cssSelector("input[data-qa-id='input-search']");
  By BUTTON_TIDAK_ON_NOTIFICATION = By.cssSelector("button[id='onesignal-slidedown-cancel-button']");
  String BUTTON_TOP_MAIN_MENU = "//div[@class='Viewweb__StyledView-sc-1ajfkkc-0 ehOcl']//span[(text()='%s')]";
  String LABEL_TITLE_TOP_MENU_PAGE = "//span[@data-qa-id='name'][(text()='%s')]";
  String LABEL_TITLE_CHANNEL_PAGE = "//h1[@data-qa-id='channel-title'][(text()='%s')]";

}
