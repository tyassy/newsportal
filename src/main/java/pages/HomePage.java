package pages;

import static locators.HomePageLocator.BUTTON_TIDAK_ON_NOTIFICATION;
import static locators.HomePageLocator.INPUT_SEARCH;

import base.BasePageObject;

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

}
