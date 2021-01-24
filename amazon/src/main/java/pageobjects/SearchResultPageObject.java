package pageobjects;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;

import StepDefinitions.Home_StepDef;
import Util.PropertiesUtil;

public class SearchResultPageObject extends PageObject {

	public static WebDriver driver = null;

	public SearchResultPageObject(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
		putil = new PropertiesUtil();
	}

	@FindBy(how = How.XPATH, using = "//div[@class='s-main-slot s-result-list s-search-results sg-row']/div[@data-index='1']//span[@class='a-size-medium a-color-base a-text-normal']")
	private WebElement AmazonSearchResult;

	public WebElement getAmazonSearchResult() {
		return AmazonSearchResult;
	}

	@FindBy(how = How.XPATH, using = "//div[@class='s-main-slot s-result-list s-search-results sg-row']/div[@data-index='1']//span[@class='a-badge-text']")
	private WebElement CheckBestSellerTag;

	public WebElement getCheckBestSellerTag() {
		return CheckBestSellerTag;
	}

	@FindBy(how = How.XPATH, using = "//div[@class='s-main-slot s-result-list s-search-results sg-row']/div[@data-index='1']//h2/following-sibling::div/a")
	private WebElement Author;

	public WebElement getAuthor() {
		return Author;
	}

	@FindBys(value = @FindBy(how = How.XPATH, using = "//div[@class='s-main-slot s-result-list s-search-results sg-row']/div[@data-index='1']//div[@class='sg-col-inner']/div[@class='sg-row'][2]/div[1]//div[@class='a-row a-size-base a-color-base'][1]/a"))
	public List<WebElement> BookDetails;

	public List<WebElement> getBookDetails() {
		return BookDetails;
	}

	@FindBy(how = How.XPATH, using = "//div[@class='s-main-slot s-result-list s-search-results sg-row']/div[@data-index='1']//h2/following-sibling::div/span[5]")
	private WebElement DateofPublish;

	public WebElement getDateofPublish() {
		return DateofPublish;
	}

	@FindBy(how = How.XPATH, using = "//div[@class='s-main-slot s-result-list s-search-results sg-row']/div[@data-index='1']//h2/following-sibling::div/parent::div//following-sibling::div[@class='a-section a-spacing-none a-spacing-top-micro']//a/i/span")
	private WebElement Rating;

	public WebElement getRating() {
		return Rating;
	}

	@FindBy(how = How.XPATH, using = "//div[@class='s-main-slot s-result-list s-search-results sg-row']/div[@data-index='1']//h2/following-sibling::div/parent::div//following-sibling::div[@class='a-section a-spacing-none a-spacing-top-micro']//a/span")
	private WebElement PeopleReviews;

	public WebElement getPeopleReviews() {
		return PeopleReviews;
	}

	@FindBy(how = How.XPATH, using = "//div[@class='s-main-slot s-result-list s-search-results sg-row']/div[@data-index='1']//h2/a")
	private WebElement BookName;

	public WebElement getBookName() {
		return BookName;
	}
	
	public void validateTheSearchResult ()
	{
		String ActalBook_Name = HomePageObject.Book;
		String ExpectedBook_Name = getAmazonSearchResult().getText();
		if (ExpectedBook_Name.contains(ActalBook_Name)) {
			System.out.println("TestInfo >>User Found Matcing Book !!!");
			Assert.assertTrue("TestInfo >> Matcing Book Name", true);
		} else {
			Assert.fail("TestError >> Searched Book Not Found");
		}
		
	}
	
	public void userCheckWhetherTheBookIsOrNot(String TagName)
	{
		
		try {
			String TName = getCheckBestSellerTag().getText();
			if (TName.equalsIgnoreCase(TagName)) {
				Assert.assertTrue("TestInfo >> This Book is Best Seller in Amazon", true);
				System.out
						.println("TestInfo >> The Searched Book Having Best Seller Tag in Amazon under Books Section ");
			} else {
				Assert.fail("TestError : Not a Best Seller");
			}
		} catch (Exception e) {
			Assert.fail("TestError : Not a Best Seller");
		}
		
	}
	
	public void userCheckTheBookNameAuthoreAndOtherInformation()
	{
		
		System.out.println("TestInfo >> Author Name - " + getAuthor().getText());

		List<WebElement> Details = getBookDetails();

		for (int i = 0; i < Details.size(); i++) {

			System.out.println("TestInfo >> Book Availabel Formats - " + Details.get(i).getText());
		}

		System.out.println("TestInfo >> Date of Publishment  - " + getDateofPublish().getText());

		System.out.println("TestInfo >> Number of People Reviewed  - " + getPeopleReviews().getText());

		System.out.println("TestInfo >> Overall Rating of the Book  - " + getRating().getAttribute("innerHTML"));
		
	}

}
