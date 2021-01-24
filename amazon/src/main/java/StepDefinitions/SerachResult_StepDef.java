package StepDefinitions;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import Util.Hook;
import Util.PropertiesUtil;
import cucumber.api.java.en.Then;
import pageobjects.SearchResultPageObject;

public class SerachResult_StepDef {
	public static Hook hooks;
	public static WebDriver driver = null;
	private SearchResultPageObject page;

	public SerachResult_StepDef() throws FileNotFoundException, IOException {
		driver = Hook.driver;
		hooks = PageFactory.initElements(driver, Hook.class);
		page = PageFactory.initElements(driver, SearchResultPageObject.class);

	}

	@Then("^Validate the Search Result$")
	public void validateTheSearchResult() throws Throwable {
		page.validateTheSearchResult();

	}

	@Then("^User Check whether the Book is \"([^\"]*)\" or Not$")
	public void userCheckWhetherTheBookIsOrNot(String TagName) throws Throwable {
		page.userCheckWhetherTheBookIsOrNot(TagName);
	}

	@Then("^User check the BookName,Authore and Other information$")
	public void userCheckTheBookNameAuthoreAndOtherInformation() throws Throwable {
		page.userCheckTheBookNameAuthoreAndOtherInformation();

	}

}
