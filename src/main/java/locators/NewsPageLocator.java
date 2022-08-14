package locators;

import org.openqa.selenium.By;

public interface NewsPageLocator {

  By LABEL_NEWS_TITLE = By.xpath("//span[(text()='kumparanNEWS')]/ancestor::div//h1[@data-qa-id='story-title']");

}
