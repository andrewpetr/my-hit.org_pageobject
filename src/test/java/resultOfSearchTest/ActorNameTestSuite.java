package resultOfSearchTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.TestBase;
import pageObject.pages.search.ActorPage;
import pageObject.pages.search.MoviePage;
import pageObject.pages.search.ResultOfSearchPage;

public class ActorNameTestSuite extends TestBase {

	@Test
	public void checkAuthorName() {
		ResultOfSearchPage result = homePage.searchMovie();
		MoviePage movie = result.selectMovie();
		ActorPage actor = movie.selectActor();
		Assert.assertEquals(actor.nameOfActor(), "Sam Worthington");
	}

}
