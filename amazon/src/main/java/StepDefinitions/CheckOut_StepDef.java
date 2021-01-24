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
import pageobjects.CheckOutPageObject;
import pageobjects.HomePageObject;
import pageobjects.SearchResultPageObject;

public class CheckOut_StepDef {
	public static Hook hooks;
	public static WebDriver driver = null;
	private CheckOutPageObject page;

	public CheckOut_StepDef() throws FileNotFoundException, IOException {
		driver = Hook.driver;
		hooks = PageFactory.initElements(driver, Hook.class);
		page = PageFactory.initElements(driver, CheckOutPageObject.class);
	}

	@Then("^User select the Book nd Proceeds towards checkout$")
	public void userSelectTheBookNdProceedsTowardsCheckout() throws Throwable {
		page.userSelectTheBookNdProceedsTowardsCheckout();
	}
}
