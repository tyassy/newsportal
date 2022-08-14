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

  @When("User put comment {string} in news page")
  public void userPutCommentInNewsPage(String arg0) {

  }

  @Then("User see put comment is succeeded")
  public void userSeePutCommentIsSucceeded() {

  }
}
