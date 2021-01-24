package pageobjects;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import org.openqa.selenium.support.ui.Select;

import Util.Hook;
import Util.PropertiesUtil;

public class HomePageObject extends PageObject{
	public static String Book;
	public PropertiesUtil putil;

	public HomePageObject(WebDriver driver) throws FileNotFoundException, IOException {
		super(driver);
		putil = new PropertiesUtil();
	}

	@FindBy(how = How.XPATH, using = "//select[@id='searchDropdownBox']")
	private WebElement AmazonGlobalDropdown;

	public WebElement getAmazonGlobalDropdown() {
		return AmazonGlobalDropdown;
	}

	@FindBy(how = How.XPATH, using = "//input[@id='twotabsearchtextbox']")
	private WebElement AmazonGlobalSearch;

	public WebElement getAmazonGlobalSearch() {
		return AmazonGlobalSearch;
	}

	public void loginapp() {
		driver.get(putil.getPropertyValue("URL"));
		driver.manage().window().maximize();
		int waittime = Integer.parseInt(putil.getPropertyValue("ImplicitWait"));
		driver.manage().timeouts().implicitlyWait(waittime, TimeUnit.SECONDS);
	}

	public void userSelectFromSearchDropdown(String Ddvalue) throws InterruptedException {
		Select select = new Select(getAmazonGlobalDropdown());
		Thread.sleep(3000);
		select.selectByVisibleText(Ddvalue);
		Thread.sleep(3000);
	}

	public void userSerachBook(String BookName) throws InterruptedException {
		this.Book = BookName;
		getAmazonGlobalSearch().sendKeys(BookName);
		getAmazonGlobalSearch().sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		try {
			driver.findElement(By.id("sp-cc-accept")).click();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
