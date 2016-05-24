package pageObject.pages.search;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import pageObject.pages.HomePage;

public class MoviePage extends HomePage{
	
	@FindBy(how = How.XPATH, using = "//a[@title='Сэм Уортингтон' and text()='Сэм Уортингтон']")
	public WebElement selectActor;

	public MoviePage(WebDriver webDriver) {
		super(webDriver);
		// TODO Auto-generated constructor stub
	}

	public ActorPage selectActor() {
		
		
//		SIKULI SELECT
		
		
		selectActor.click();
		return PageFactory.initElements(webDriver, ActorPage.class);
		
		
	}

	
}
