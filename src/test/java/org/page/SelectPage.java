package org.page;

import org.global.CommonClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectPage extends CommonClass{
	public SelectPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//td[text()='Select Hotel ']")
	private WebElement userSelectPage;
	
	public WebElement getUserSelectPage() {
		return userSelectPage;
	}
	
	@FindBy(id="radiobutton_0")
	private WebElement radiobt;
	
	public WebElement getRadiobt() {
		return radiobt;
	}
	
	@FindBy(xpath="//input[@id='continue']")
	private WebElement continueBt;
	
	public WebElement getContinueBt() {
		return continueBt;
	}

}
