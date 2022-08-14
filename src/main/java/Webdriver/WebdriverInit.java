package Webdriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverInit {

  public static WebDriver driver;

  public static void initialize(){
    //setup webdriver
    WebDriverManager.chromedriver().setup();
    //inisialiasi
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

  }

  public static void quit(){
    driver.quit();
  }

}
