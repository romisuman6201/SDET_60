package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
	WebDriver driver;
	@FindBy(xpath = "//td[.='$10.99']")
	private WebElement frogprice;

	@FindBy(xpath = "//td[.='$9.99']")
	private WebElement bunnyPrice;

	@FindBy(xpath = "//td[.='$14.99']")
	private WebElement bearprice;

	@FindBy(xpath = "//td[.='$21.98']")
	private WebElement frogtotal;

	@FindBy(xpath = "//td[.='$29.97']")
	private WebElement bunnytotal;

	@FindBy(xpath = "//td[.='$59.96']")
	private WebElement beartotal;

	public void CartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

//	public WebElement getFrogprice() {
//		return frogprice;
//	}
//
//	public WebElement getBunnyPrice() {
//		return bunnyPrice;
//	}
//
//	public WebElement getBearprice() {
//		return bearprice;
//	}
//
//	public WebElement getFrogtotal() {
//		return frogtotal;
//	}
//
//	public WebElement getBunnytotal() {
//		return bunnytotal;
//	}
//
//	public WebElement getBeartotal() {
//		return beartotal;
//	}

	public void verifyPrices() throws InterruptedException {
		if (frogprice.getText().contains("$10.99"))

		{
			System.out.println("price of frog is matched");
		}
		if (bunnyPrice.getText().contains("$9.99")) {
			System.out.println("price of bunny is matched");
		}
		if (bunnyPrice.getText().contains("$14.99")) {
			System.out.println("price of bear is matched");
		}
		Thread.sleep(2000);

	}

	public void verifySubtotal() {
		if (frogtotal.getText().contains("$21.98"))

		{
			System.out.println("subtotal of frog is matched");
		}
		if (bunnytotal.getText().contains("$29.97")) {
			System.out.println("subtotal of bunny is matched");
		}
		if (bunnytotal.getText().contains("$59.96")) {
			System.out.println("subtotal of bear is matched");
		}

	}

}
