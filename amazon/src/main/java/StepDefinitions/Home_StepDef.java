package StepDefinitions;

import static org.testng.Assert.expectThrows;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Util.Hook;
import Util.PropertiesUtil;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import pageobjects.HomePageObject;

public class Home_StepDef {
	public static Hook hooks;
	public static WebDriver driver = null;
	private HomePageObject page;

	public Home_StepDef() throws FileNotFoundException, IOException {
		driver = Hook.driver;
		hooks = PageFactory.initElements(driver, Hook.class);
		page = PageFactory.initElements(driver, HomePageObject.class);
	}

	@Given("^User launch Amazon UK site$")
	public void userLaunchAmazonUKSite() throws Throwable {
		page.loginapp();
	}

	@Given("^User Select \"([^\"]*)\" from search dropdown$")
	public void userSelectFromSearchDropdown(String Ddvalue) throws Throwable {
		page.userSelectFromSearchDropdown(Ddvalue);
	}

	@Then("^User search book \"([^\"]*)\"$")
	public void userSerachBook(String BookName) throws Throwable {
		page.userSerachBook(BookName);
	}

}
