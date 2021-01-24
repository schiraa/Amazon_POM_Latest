package Util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.apache.commons.io.FileUtils;
import com.cucumber.listener.Reporter;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook {
	public static WebDriver driver;
	public static Scenario scenario;
	protected static String fileSeperator = System.getProperty("file.separator");
	public static String screencapture_flag = "Yes";
	public Duration timeout;
	public String Browser;
	public PropertiesUtil putil;

	@Before
	public void setsuite(Scenario scenario) throws InvocationTargetException, Exception {
		createanddelete_Dir();
		putil = new PropertiesUtil();
		Browser = putil.getPropertyValue("Browser");
		if (Browser.equalsIgnoreCase("Chromium")) {
			EdgeOptions options = new EdgeOptions();
			options.addArguments("disable-extensions");
			options.setExperimentalOption("useAutomationExtension", false);
			options.addArguments("--no-sandbox");
			options.setPageLoadStrategy(PageLoadStrategy.EAGER);
			System.setProperty("webdriver.edge.driver", "Drivers" + File.separator + "msedgedriver.exe");
			try {
				driver = new EdgeDriver(options);
				System.out.println("TestInfo >>> Execution Started in Chromium Browser");
			} catch (Exception e) {
				System.out.println(e);
			}

		} else if (Browser.equalsIgnoreCase("Chrome")) {
			ChromeOptions chromeOptions = new ChromeOptions();
			HashMap chromePrefs = new HashMap();
			chromePrefs.put("download.default_directory", "//tmp//automation_downloads");
			chromeOptions = new ChromeOptions();
			chromeOptions.addArguments("--disable-notifications");
			chromeOptions.addArguments("disable-infobars");
			chromeOptions.setExperimentalOption("useAutomationExtension", false);
			chromeOptions.setExperimentalOption("prefs", chromePrefs);
			chromeOptions.setExperimentalOption("excludeSwitches", new String[] { "enable-automation" });
			System.setProperty("webdriver.chrome.driver", "Drivers" + File.separator + "chromedriver.exe");
			System.setProperty("webdriver.chrome.silentOutput", "true");
			driver = new ChromeDriver(chromeOptions);
			driver.manage().deleteAllCookies();
			System.out.println("\n" + "**************************** <<< >>>> *******************************");
			System.out.println("TEST EXECUTION STARTED");
			System.out.println("\n" + "**************************** <<< >>>> *******************************");
		}
	}

	@After
	public void takescreenshot(Scenario scenario) throws Throwable {
		tearDown(scenario);
		driver.close();
		driver.quit();

	}

	public void tearDown(Scenario scenario) throws Exception {
		try {

			if (scenario.isFailed()) {

				String screenShotName = scenario.getName() + " " + getTimeStamp() + ".png";
				String TotalFileName = scenario.getId().split(";")[0];
				String FeatureName = TotalFileName.replace("-", "_").toUpperCase();

				String imagePath = takeScreenShot(screenShotName, FeatureName);

				System.out.println("Path" + imagePath);
				System.out.println("TESTINFO >> Script Failed & Screenshot Captured");

				byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
				scenario.embed(screenshot, "image/png");

				Reporter.addScreenCaptureFromPath(imagePath);

			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public String getTimeStamp() {
		String today;
		DateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss");
		Calendar calendar = Calendar.getInstance();
		today = dateFormat.format(calendar.getTime());
		return today;
	}

	public String takeScreenShot(String screenShotName, String FeatureName) {
		try {
			File file = new File("Screenshots" + fileSeperator + "Results");
			if (!file.exists()) {
				System.out.println("File created " + file);
				file.mkdir();
			}
			File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			File targetFile = new File("Screenshots" + fileSeperator + "Results" + fileSeperator + FeatureName,
					screenShotName);
			File targetFile1 = new File("target" + fileSeperator + "cucumber-extent-reports", screenShotName);
			FileUtils.copyFile(screenshotFile, targetFile);
			FileUtils.copyFile(screenshotFile, targetFile1);
			return screenShotName;
		} catch (Exception e) {
			System.out.println("An exception occured while taking screenshot " + e.getCause());
			return null;
		}
	}

	public void createanddelete_Dir() throws IOException {
		if ((screencapture_flag.equalsIgnoreCase("Yes"))) {
			String Path = System.getProperty("user.dir") + "\\" + "Screenshots";
			File file = new File(Path);
			FileUtils.deleteDirectory(new File(Path));
			file.mkdir();
			screencapture_flag = "No";

		}
	}

}
