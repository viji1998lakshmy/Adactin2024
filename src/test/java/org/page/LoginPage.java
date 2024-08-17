package org.page;

import org.global.CommonClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage  extends CommonClass {
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//td[text()='Existing User Login - Build 1']")
	private WebElement userLoginPage;
	
	public WebElement getUserLoginPage() {
		return userLoginPage;
	}
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement password;
	
	public WebElement getPassword() {
		return password;
	}
	
	@FindBys( {@FindBy(how=How.ID,using="username") , @FindBy(how=How.XPATH,using="//input[@name='username']")})
	private WebElement username;
	
	public WebElement getUsername() {
		return username;
	}
	
	@FindBy(className="login_button")
	private WebElement loginbt;
	
	public WebElement getLoginbt() {
		return loginbt;
	}
	
	
	
}
