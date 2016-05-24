package pageObject.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import pageObject.pages.search.ResultOfSearchPage;

public class HomePage {
	protected WebDriver webDriver;

	public HomePage(WebDriver webDriver) {
		this.webDriver = webDriver;
	}

	@FindBy(how = How.XPATH, using = "//input[@id='search-navbar-q']")
	public WebElement searchBox;

	@FindBy(how = How.XPATH, using = "//button[@type='submit']")
	public WebElement searchButton;

	public void searchBoxForMovie(String movie) {
		searchBox.sendKeys(movie);
	}
	
	public ResultOfSearchPage searchMovie() {
		searchBoxForMovie("avatar");
		searchButton.click();
		return PageFactory.initElements(webDriver, ResultOfSearchPage.class);
		
	}
}