package steps;

import Webdriver.WebdriverInit;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import pages.LoginPage;

public class LoginPageSteps {

  LoginPage loginPage = new LoginPage();

  @When("User click Masuk button")
  public void userClickMasukButton() {
    loginPage.clickMasukBtn();
  }

  @When("User click facebook button in login page")
  public void userClickFacebookButtonInLoginPage() {
    loginPage.clickLoginFbBtn();
  }

  @When("User click google button in login page")
  public void userClickGoogleButtonInLoginPage() {
    loginPage.clickLoginGoogleBtn();
  }

  @Then("User see facebook login page appears")
  public void userSeeFacebookLoginPageAppears() {
    WebdriverInit.moveToAnotherTab();
    Assertions.assertTrue(loginPage.isFbLoginPageAppear());
  }

  @Then("User see google login page appears")
  public void userSeeGoogleLoginPageAppears() {
    WebdriverInit.moveToAnotherTab();
    Assertions.assertTrue(loginPage.isGoogleLoginPageAppear());
  }

  @When("User click Daftar Sekarang button")
  public void userClickDaftarSekarangButton() {
    loginPage.clickRegisterBtn();
  }
}
