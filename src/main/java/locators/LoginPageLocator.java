package locators;

import org.openqa.selenium.By;

public interface LoginPageLocator {

  By BUTTON_MASUK = By.cssSelector("button[data-qa-id='hd-login']");
  By BUTTON_LOGIN_FACEBOOK = By.cssSelector("button[data-qa-id='btn-login-fb']");
  By BUTTON_LOGIN_GOOGLE = By.cssSelector("button[data-qa-id='btn-login-google']");
  By LABEL_CONTENT_FACEBOOK = By.xpath("//div[@class='fb_content clearfix']");
  By LABEL_TITLE_GOOGLE_LOGIN_EN = By.xpath("//div[(text()='Sign in with Google')]");
  By LABEL_TITLE_GOOGLE_LOGIN_ID = By.xpath("//div[(text()='Login dengan Google')]");
  By BUTTON_REGISTER = By.cssSelector("a[data-qa-id='btn-register']");
}
