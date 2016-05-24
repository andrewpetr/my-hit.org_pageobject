package pageObject.pages.search;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import pageObject.pages.HomePage;

public class ActorPage extends HomePage {

	@FindBy(how = How.XPATH, using = "//h4[contains(text(),'Sam Worthington')]")
	WebElement nameOfActor;

	public String nameOfActor() {
		return nameOfActor.getText();
	}

	public ActorPage(WebDriver webDriver) {
		super(webDriver);
	}
}
