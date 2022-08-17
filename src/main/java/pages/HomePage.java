package pages;

import static locators.HomePageLocator.BUTTON_TIDAK_ON_NOTIFICATION;
import static locators.HomePageLocator.BUTTON_TOP_MAIN_MENU;
import static locators.HomePageLocator.INPUT_SEARCH;
import static locators.HomePageLocator.LABEL_TITLE_CHANNEL_PAGE;
import static locators.HomePageLocator.LABEL_TITLE_TOP_MENU_PAGE;

import base.BasePageObject;
import org.openqa.selenium.By;

public class HomePage extends BasePageObject {


  public void openPage() {
    openUrl("https://kumparan.com/");
    waitlonger();
    if (isCancelNotifBtnAppear()) {
      click(BUTTON_TIDAK_ON_NOTIFICATION);
      waitshortly();
    }
  }

  public boolean isCancelNotifBtnAppear() {
    return find(BUTTON_TIDAK_ON_NOTIFICATION).isDisplayed();
  }

  public void typeKeyword(String keyword) {
    type(INPUT_SEARCH, keyword);
  }

  public boolean isMainMenuPageOpened(String menu) {
    return find(By.xpath(String.format(LABEL_TITLE_TOP_MENU_PAGE, menu))).isDisplayed();
  }

  public void clickTopMenu(String menu) {
    find(By.xpath(String.format(BUTTON_TOP_MAIN_MENU, menu))).click();
    waitshortly();
  }

  public boolean isChannelMenuPageOpened(String menu) {
    return find(By.xpath(String.format(LABEL_TITLE_CHANNEL_PAGE, menu))).isDisplayed();
  }

}
