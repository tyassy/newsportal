package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.SearchPage;

public class HomePageSteps {

  HomePage homePage = new HomePage();
  SearchPage searchPage = new SearchPage();

  @Given("User access kumparan homepage")
  public void userAccessKumparanHomepage() {
    homePage.openPage();
  }


  @When("User search for {string}")
  public void userSearchFor(String keyword) {
    homePage.typeKeyword(keyword);
  }

  @When("User click any headline news in homepage")
  public void userClickAnyHeadlineNewsInHomepage() {
    searchPage.chooseSearchNewsResult();
  }
}
