package pageobjects;

import org.openqa.selenium.WebDriver;

import Util.Hook;

public abstract class PageObject extends Hook{
	protected final WebDriver driver;
	
	protected PageObject(WebDriver driver) {
		driver = Hook.driver;
		this.driver = driver;
	}
	
}
