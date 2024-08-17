package org.page;

import org.global.CommonClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogOutPage extends CommonClass {
	public LogOutPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="Click here to login again")
	private WebElement linkBt;
	
	public WebElement getLinkBt() {
		return linkBt;
	}
	
	@FindBy(xpath="//td[contains(text(),'successfully logged')]")
	private WebElement userLogoutPage;
	
	public WebElement getUserLogoutPage() {
		return userLogoutPage;
	}
}
