package pageObject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import pageObject.pages.HomePage;
import pageObject.webdriver.WebDriverFactory;

public class TestBase {

	protected WebDriver webDriver;
	protected HomePage homePage;

	@BeforeMethod
//	@Parameters({ "browserName" })
	public void setup() throws Exception {
//		webDriver = WebDriverFactory.getInstance(browserName);
		webDriver = new FirefoxDriver();
		webDriver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
		// webDriver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		webDriver.manage().window().maximize();
		webDriver.get("http://my-hit.org");
		homePage = PageFactory.initElements(webDriver, HomePage.class);
	}

	@AfterMethod
	public void tearDown() throws Exception {
		webDriver.quit();
//		if (webDriver != null) {
//			WebDriverFactory.killDriverInstance();
//		}
	}

}