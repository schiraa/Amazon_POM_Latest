package pageobjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CreateAccountPageObject extends PageObject {
	public static WebDriver driver = null;
	private SearchResultPageObject spage;

	public CreateAccountPageObject(WebDriver driver) {
		super(driver);
		spage = PageFactory.initElements(driver, SearchResultPageObject.class);

	}

	@FindBy(how = How.XPATH, using = "//input[@id='ap_email']")
	private WebElement SignInCheck;

	public WebElement getSignInCheck() {
		return SignInCheck;
	}

	@FindBy(how = How.XPATH, using = "//a[@id='createAccountSubmit']")
	private WebElement createAccount;

	public WebElement getcreateAccount() {
		return createAccount;
	}

	public void ifUserDnotHaveAccountValidateAllFieldsOnCraeteAAzonAccountPage() {
		if (getSignInCheck().isDisplayed()) {

			System.out.println("TestInfo >> User Not Sign - In !!! Directing to Create Account Page");
		} else {
			System.out.println("TestInfo >> User Sign - In not Displayed");
		}

		getcreateAccount().click();

	}

	public void userCheckTheBookIsAvailableInFormat(String Format) {
		List<WebElement> Details = spage.getBookDetails();
		String BookFormat = Format;
		for (int i = 0; i < Details.size(); i++) {
			String Actual_Format = Details.get(i).getText();

			if (Actual_Format.contains(BookFormat)) {
				System.out.println("TestInfo >> Matching Format Found -" + Actual_Format);
				break;
			}

		}

	}
}
