package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import pages.NewsPage;

public class NewsPageSteps {

  NewsPage newsPage = new NewsPage();

  @Then("User see news page opened")
  public void userSeeNewsPageOpened() {
    Assertions.assertTrue(newsPage.isNewsPageAppear());
  }

  @When("User click any news in Trending page")
  public void userClickAnyNewsInTrendingPage() {
    newsPage.clickNewsInTrending();
  }
}
