package pages;

import static locators.LoginPageLocator.BUTTON_LOGIN_FACEBOOK;
import static locators.LoginPageLocator.BUTTON_LOGIN_GOOGLE;
import static locators.LoginPageLocator.BUTTON_MASUK;
import static locators.LoginPageLocator.BUTTON_REGISTER;
import static locators.LoginPageLocator.LABEL_CONTENT_FACEBOOK;
import static locators.LoginPageLocator.LABEL_TITLE_GOOGLE_LOGIN_EN;
import static locators.LoginPageLocator.LABEL_TITLE_GOOGLE_LOGIN_ID;

import Webdriver.WebdriverInit;
import base.BasePageObject;

public class LoginPage extends BasePageObject {

  public void clickMasukBtn() {
    find(BUTTON_MASUK).click();
    waitshortly();
  }

  public void clickLoginFbBtn() {
    waitshortly();
    find(BUTTON_LOGIN_FACEBOOK).click();
    waitshortly();
  }

  public boolean isFbLoginPageAppear() {
    waitshortly();
    try {
      return find(LABEL_CONTENT_FACEBOOK).isDisplayed();
    } catch (Exception e){
      return false;
    }
  }

  public boolean isGoogleLoginPageAppear() {
    waitshortly();
    try {
      return find(LABEL_TITLE_GOOGLE_LOGIN_ID).isDisplayed();
    } catch (Exception e){
      return find(LABEL_TITLE_GOOGLE_LOGIN_EN).isDisplayed();
    }
  }

  public void clickLoginGoogleBtn() {
    waitshortly();
    find(BUTTON_LOGIN_GOOGLE).click();
    waitshortly();
  }

  public void clickRegisterBtn() {
    WebdriverInit.scrollDownBrowser();
    waitshortly();
    find(BUTTON_REGISTER).click();
    waitshortly();
  }
}
