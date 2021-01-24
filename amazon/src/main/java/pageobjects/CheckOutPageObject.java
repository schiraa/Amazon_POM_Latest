package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CheckOutPageObject extends PageObject {
	private SearchResultPageObject spage;

	public CheckOutPageObject(WebDriver driver) {
		super(driver);
		spage = PageFactory.initElements(driver, SearchResultPageObject.class);
	}

	@FindBy(how = How.XPATH, using = "//input[@id='buy-now-button']")
	private WebElement BuyNow;

	public WebElement getBuyNow() {
		return BuyNow;
	}

	public void userSelectTheBookNdProceedsTowardsCheckout() throws InterruptedException {
		spage.getBookName().click();
		Thread.sleep(5000);
		getBuyNow().click();
		Thread.sleep(3000);
		String handle = driver.getWindowHandle();
		Thread.sleep(3000);
		driver.switchTo().window(handle).getTitle();
	}

}
