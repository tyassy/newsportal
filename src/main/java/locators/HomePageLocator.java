package locators;

import org.openqa.selenium.By;

public interface HomePageLocator {

  By INPUT_SEARCH = By.cssSelector("input[data-qa-id='input-search']");
  By BUTTON_TIDAK_ON_NOTIFICATION = By.cssSelector("button[id='onesignal-slidedown-cancel-button']");

}
