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
import pageobjects.CreateAccountPageObject;
import pageobjects.HomePageObject;
import pageobjects.SearchResultPageObject;

public class CreateAccount_StepDef {
	public static Hook hooks;
	public static WebDriver driver = null;
	private CreateAccountPageObject page;

	public CreateAccount_StepDef() throws FileNotFoundException, IOException {
		driver = Hook.driver;
		hooks = PageFactory.initElements(driver, Hook.class);
		page = PageFactory.initElements(driver, CreateAccountPageObject.class);
		
	}
	
	@Then("^If User dnot have Account,validate all fields on Craete Amazon account Page$")
	public void ifUserDnotHaveAccountValidateAllFieldsOnCraeteAAzonAccountPage() throws Throwable {
		page.ifUserDnotHaveAccountValidateAllFieldsOnCraeteAAzonAccountPage();
	}

	
	@Then("^User check the Book is available in \"([^\"]*)\" format$")
	public void userCheckTheBookIsAvailableInFormat(String Format) throws Throwable {
		
		page.userCheckTheBookIsAvailableInFormat(Format);
}

}