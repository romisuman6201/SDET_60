package TestScript;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import GenericUtility.BaseClass;
import GenericUtility.FileUtility;
import GenericUtility.WebDriverUtility;
import PomPages.CartPage;
import PomPages.ContactPage;
import PomPages.HomePage;
import PomPages.ShopPage;

public class Script {

	static {
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver (1).exe");
	}
	WebDriver driver;
	FileUtility fu = new FileUtility();
	WebDriverUtility webut = new WebDriverUtility();
	HomePage hp = new HomePage(driver);
	ContactPage cp = new ContactPage(driver);
	ShopPage shop = new ShopPage(driver);

	@Test

	public void TC_1() throws IOException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String URL = fu.readDataFromPropertyFile("url");
		// String BROWSER = fu.readDataFromPropertyFile("browser");

		driver.get(URL);
		driver.findElement(By.xpath("//a[@href='#/contact']")).click();
		webut.waitTillLoadPage();
		hp.clickcontactBtn();

	}

	@Test
	public void TC_2() throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String URL = fu.readDataFromPropertyFile("url");
		driver.get(URL);
		webut.waitTillLoadPage();
		hp.clickcontactBtn();
		cp.contactDetails("sumant", "abc@gmail.com", "banglore");

	}

	@Test
	public void TC_3() throws IOException {
		driver = new ChromeDriver();
		// driver.manage().window().maximize();
		webut.maximizeBrowser();
		String URL = fu.readDataFromPropertyFile("url");
		driver.get(URL);
		webut.waitTillLoadPage();
		// hp.clkShop();
		driver.findElement(By.xpath("//a[@href='#/shop']")).click();

	}

	@Test

	public void TC_4() throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jupiter.cloud.planittesting.com/#/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@href='#/shop']")).click();
		WebElement product2 = driver.findElement(By.xpath("//li[@id='product-2']//a[@class='btn btn-success']"));
		WebElement product4 = driver.findElement(By.xpath("//li[@id='product-4']//a[@class='btn btn-success']"));
		WebElement product7 = driver.findElement(By.xpath("//li[@id='product-7']//a[@class='btn btn-success']"));

		for (int i = 0; i < 2; i++) {
			product2.click();
		}
		for (int i = 0; i < 3; i++) {
			product4.click();
		}
		for (int i = 0; i < 4; i++) {
			product7.click();
		}

		driver.findElement(By.xpath("//a[@href='#/cart']")).click();
		CartPage cart = new CartPage();
//		WebElement totalList = driver.findElement(By.xpath("//table//tr//td[4]"));
//		WebElement quantity = driver.findElement(By.xpath("//table//tr//td[3]"));
//		WebElement price = driver.findElement(By.xpath("//table//tr//td[2]"));
		cart.verifyPrices();
		cart.verifySubtotal();

	}

}
