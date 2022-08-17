package pages;

import static locators.RegisterPageLocator.BUTTON_SAVE_REGISTER;
import static locators.RegisterPageLocator.INPUT_EMAIL;
import static locators.RegisterPageLocator.VERIFICATION_POPUP;

import base.BasePageObject;

public class RegisterPage extends BasePageObject {

  public void openRegisterPage() {
    openUrl("https://kumparan.com/register");
    waitlonger();
  }

  public boolean isRegisterBtnEnabled() {
    find(INPUT_EMAIL).click();
    return find(BUTTON_SAVE_REGISTER).isEnabled();
  }

  public void inputEmail(String email) {
    type(INPUT_EMAIL,email);
  }

  public boolean isVerifPopupAppear() {
    return find(VERIFICATION_POPUP).isDisplayed();
  }

  public void clickRegisterBtn() {
    click(BUTTON_SAVE_REGISTER);
  }
}
