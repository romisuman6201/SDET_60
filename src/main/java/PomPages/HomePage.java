package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public WebDriver driver;

	@FindBy(xpath = "//a[@href='#/contact']")
	private WebElement contactBtn;
	
	@FindBy(xpath = "//a[normalize-space()='Contact']")
	private WebElement shpoBtn;
	
	public WebElement getContactBtn() {
		return contactBtn;
	}
	


//	public WebDriver getDriver() {
//		return driver;
//	}

	public WebElement getShpoBtn() {
		return shpoBtn;
	}

	public HomePage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);

	}

	
	
	public void clickcontactBtn() {
		contactBtn.click();
	}
	public void clkShop() {
		shpoBtn.click();
	}

}
