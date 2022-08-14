package steps;

import io.cucumber.java.en.And;
import pages.SearchPage;

public class SearchPageSteps {

  SearchPage searchPage = new SearchPage();

  @And("User choose any search suggestion")
  public void userClickTopSuggestion() {
    searchPage.chooseSearchSuggestion();
  }

  @And("User choose any news result")
  public void userChooseTopNewsResult() {
    searchPage.chooseSearchNewsResult();
  }
}