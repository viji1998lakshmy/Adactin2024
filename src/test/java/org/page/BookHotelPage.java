package org.page;

import org.global.CommonClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotelPage extends CommonClass{
	public BookHotelPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//td[text()='Book A Hotel ']")
	private WebElement userBookPage;
	
	public WebElement getUserBookPage() {
		return userBookPage;
	}
	
	@FindBy(xpath="//input[@name='first_name']")
	private WebElement firstName;
	
	public WebElement getFirstName() {
		return firstName;
	}
	@FindBy(xpath="//input[@name='last_name']")
	private WebElement lastsName;
	
	public WebElement getLastsName() {
		return lastsName;
	}
	@FindBy(xpath="//textarea[@id='address']")
	private WebElement adress;
	
	public WebElement getAdress() {
		return adress;
	}
	
	@FindBy(xpath="//input[@id='cc_num']")
	private WebElement creditCardNumber;
	
	public WebElement getCreditCardNumber() {
		return creditCardNumber;
	}
	
	@FindBy(xpath="//select[@id='cc_type']")
	private WebElement creditCardType;
	
	public WebElement getCreditCardType() {
		return creditCardType;
	}
	
	@FindBy(xpath="//select[@id='cc_exp_month']")
	private WebElement expiryMonth;
	
	public WebElement getExpiryMonth() {
		return expiryMonth;
	}
	
	@FindBy(xpath="//select[@id='cc_exp_year']")
	private WebElement expiryYear;
	
	public WebElement getExpiryYear() {
		return expiryYear;
	}
	
	@FindBy(xpath="//input[@id='cc_cvv']")
	private WebElement cvvNum;
	
	public WebElement getCvvNum() {
		return cvvNum;
	}
	
	@FindBy(xpath="//input[@value='Book Now']")
	private WebElement bookNowBt;
	
	public WebElement getBookNowBt() {
		return bookNowBt;
	}
	
	
	
	
	
	
}
