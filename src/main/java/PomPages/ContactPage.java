package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactPage {
	
	@FindBy(xpath="//input[@id='forename']")
	private WebElement forename;
	
	@FindBy(xpath="//input[@id='email']")
	private WebElement email;
	
	@FindBy(xpath="//textarea[@id='message']")
	private WebElement messageField;
	
	@FindBy(xpath="//a[.='Submit']")
	private WebElement submitBtn;
	
	@FindBy(xpath="//div[@class='alert alert-error ng-scope']")
	private WebElement errorMsg;
	
	public WebElement getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(WebElement errorMsg) {
		this.errorMsg = errorMsg;
	}

	public ContactPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getForename() {
		return forename;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getMessageField() {
		return messageField;
	}
	public WebElement getSubmitBtn() {
		return submitBtn;
	}

	public void contactDetails(String forName,String emails,String msg) {
		forename.sendKeys(forName);
		email.sendKeys(emails);
		messageField.sendKeys(msg);
		submitBtn.click();
	}
	public void errorMessage() {
		String msg = errorMsg.getText();
	}

	
}
