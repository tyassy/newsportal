package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import Webdriver.WebdriverInit;

public class BasePageObject {

  public WebDriver getDriver() {
    return WebdriverInit.driver;
  }

  public WebElement find(By locator){
    return getDriver().findElement(locator);
  }

  public void click(By locator){
    find(locator).click();
  }

  public void type(By locator, CharSequence... text){
    WebElement element = find(locator);
    element.clear();
    element.sendKeys(text);
  }

  public String getText(By locator){
    return find(locator).getText();
  }

  public String getAttribute(By locator, String attributeName) {
    return find(locator).getAttribute(attributeName);
  }

  public void openUrl(String url){
    getDriver().get(url);
  }

  public void waitABit(java.lang.Integer seconds){}

  public void waitshortly(){
    try{
      Thread.sleep(3000);
    }catch (Exception e){
      System.out.println("timeout");
    }
  }

  public void waitlonger(){
    try{
      Thread.sleep(5000);
    }catch (Exception e){
      System.out.println("timeout");
    }
  }

  public void waitmoreLonger(){
    try{
      Thread.sleep(20000);
    }catch (Exception e){
      System.out.println("timeout");
    }
  }

}
