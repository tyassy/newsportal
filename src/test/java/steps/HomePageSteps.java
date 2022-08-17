package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import pages.HomePage;

public class HomePageSteps {

  HomePage homePage = new HomePage();

  @Given("User access kumparan homepage")
  public void userAccessKumparanHomepage() {
    homePage.openPage();
  }

  @Then("User see top menu {string} page is opened")
  public void userSeeTrendingPageIsOpened(String menu) {
    Assertions.assertTrue(homePage.isMainMenuPageOpened(menu));
  }

  @When("User click {string} in top menu homepage")
  public void userClickInTopMenuHomepage(String menu) {
    homePage.clickTopMenu(menu);
  }

  @Then("User see channel menu {string} page is opened")
  public void userSeeChannelMenuPageIsOpened(String menu) {
    Assertions.assertTrue(homePage.isChannelMenuPageOpened(menu));
  }
}
