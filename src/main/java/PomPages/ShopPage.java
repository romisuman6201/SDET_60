package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShopPage {
	
	@FindBy(xpath="//li[@id='product-2']//a[.='Buy']")
	private WebElement product1;
	
	@FindBy(xpath="//li[@id='product-4']//a[.='Buy']")
	private WebElement flurryBunny;
	
	@FindBy(xpath="//li[@id='product-7']//a[@class='btn btn-success'][normalize-space()='Buy']")
	private WebElement valentineBaer ;
	
	public ShopPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}

	public WebElement getBuyStufferdDog() {
		return product1;
	}

	public WebElement getFlurryBunny() {
		return flurryBunny;
	}

	public WebElement getValentineBaer() {
		return valentineBaer;
	}
	public void frog() {
		for (int i = 0; i < 2; i++) {
			product1.click();
		}
	}

}
