package resultOfSearchTest;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pageObject.TestBase;
import pageObject.pages.search.ActorPage;
import pageObject.pages.search.MoviePage;
import pageObject.pages.search.ResultOfSearchPage;

public class ActorNameTestSuite extends TestBase {

	@Test
	@Parameters({"actorname", "actoravatar", "film"})
	public void checkAuthorName(String actorname, String actoravatar, String film) {
		ResultOfSearchPage result = homePage.searchMovie(film);
		MoviePage movie = result.selectMovie();
		ActorPage actor = movie.selectActor(actoravatar);
		Assert.assertEquals(actor.nameOfActor(), actorname);
	}

}
