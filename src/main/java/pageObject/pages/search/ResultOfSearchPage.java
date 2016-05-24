package pageObject.pages.search;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import pageObject.pages.HomePage;

public class ResultOfSearchPage extends HomePage {

	@FindBy(how = How.XPATH, using = "//div[@id='film-list']/div/div/b")
	public List<WebElement> listOfSearchResult;

	public ResultOfSearchPage(WebDriver webDriver) {
		super(webDriver);
		// TODO Auto-generated constructor stub
	}

	public MoviePage selectMovie() {
		// TODO Auto-generated method stub
		// SELECT FIRST FROM LIST
		for (WebElement film : listOfSearchResult) {
			film.click();
			break;
		}
		return PageFactory.initElements(webDriver, MoviePage.class);
	}

}
