package pageObject.pages.search;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import pageObject.pages.HomePage;
import pageObject.sikuli.SikuliImageRecognition;

public class MoviePage extends HomePage {

	@FindBy(how = How.XPATH, using = "//img[@title='Сэм Уортингтон']")
	public WebElement scrollToElement;

	@FindBy(how = How.XPATH, using = "//a[@title='Сэм Уортингтон' and text()='Сэм Уортингтон']")
	public WebElement selectActor;

	public MoviePage(WebDriver webDriver) {
		super(webDriver);
		// TODO Auto-generated constructor stub
	}

	public ActorPage selectActor(String actoravatar) {

		JavascriptExecutor je = (JavascriptExecutor) webDriver;
		je.executeScript("arguments[0].scrollIntoView(true);", scrollToElement);

		SikuliImageRecognition imageOfActor = new SikuliImageRecognition();
		imageOfActor.clickOnImage(actoravatar);

		return PageFactory.initElements(webDriver, ActorPage.class);

	}

}
