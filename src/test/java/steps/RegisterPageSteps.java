package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import pages.RegisterPage;

public class RegisterPageSteps {

  RegisterPage registerPage = new RegisterPage();

  @And("User access kumparan register page")
  public void userAccessKumparanRegisterPage() {
    registerPage.openRegisterPage();
  }

  @Then("User see register button is disabled")
  public void userSeeRegisterButtonIsDisabled() {
    Assertions.assertFalse(registerPage.isRegisterBtnEnabled());
  }

  @And("User input {string} as email in register page")
  public void userInputAsEmailInRegisterPage(String email) {
    registerPage.inputEmail(email);
  }

  @And("User click register button")
  public void userClickRegisterButton() {
    registerPage.clickRegisterBtn();
  }

  @Then("User see verification popup appears")
  public void userSeeVerificationPopupAppears() {
    Assertions.assertTrue(registerPage.isVerifPopupAppear());
  }
}
