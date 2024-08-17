package org.page;

import org.global.CommonClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConfirmationPage extends CommonClass{
	public ConfirmationPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//h4[text()='About Adactin']")
	private WebElement aboutAdactin;
	
	public WebElement getAboutAdactin() {
		return aboutAdactin;
	}
	
	@FindBy(xpath="//input[@id='order_no']")
	private WebElement orderId;
	
	public WebElement getOrderId() {
		return orderId;
	}
	
	@FindBy(xpath="//td[text()='Booking Confirmation ']")
	private WebElement userConfirmPage;
	
	public WebElement getUserConfirmPage() {
		return userConfirmPage;
	}

	@FindBy(xpath="//input[@id='my_itinerary']")
	private WebElement myItineraybt;
	
	public WebElement getMyItinerayBt() {
		return myItineraybt;
	}
}
