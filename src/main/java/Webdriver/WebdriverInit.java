package Webdriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.time.Duration;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverInit {

  public static WebDriver driver;

  public static void initialize(){
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
  }

  public static void moveToAnotherTab() {
    for (String winHandle : driver.getWindowHandles()) {
      driver.switchTo().window(winHandle);
    }
  }

  public static void quit(){
    driver.quit();
  }

  public static void scrollDownBrowser() {
    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("scroll(0, 250)");
  }
}
