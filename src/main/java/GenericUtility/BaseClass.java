package GenericUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public WebDriver driver;

	
	@BeforeClass

	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		//driver = new ChromeDriver();
//		if (browser.equalsIgnoreCase("chrome")) {
//			driver = new ChromeDriver();
//		} else if (browser.equalsIgnoreCase("firefox")) {
//			driver = new FirefoxDriver();
//
//		} 

	}

}
