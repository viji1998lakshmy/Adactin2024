package org.page;

import org.global.CommonClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ItineraryPage extends CommonClass {
	public ItineraryPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.XPATH,using="//td[text()='Booked Itinerary']")
	private WebElement userItinerary;
	
	public WebElement getUserItinerary() {
		return userItinerary;
	}
	
	@FindBy(id="order_id_text")
	private WebElement searchBar;
	
	public WebElement getSearchBar() {
		return searchBar;
	}
	
	@FindBy(how=How.XPATH,using="//input[@id='search_hotel_id']")
	private WebElement goButton;
	
	public WebElement getGoButton() {
		return goButton;
	}
	
	@FindBy(xpath="//input[@value='Cancel Selected']")
	private WebElement cancelButton;
	
	public WebElement getCancelButton() {
		return cancelButton;
	}
	
	@FindBy(how=How.XPATH,using="//input[@id='check_all']")
	private WebElement checkBoxBt;
	
	public WebElement getCheckBoxBt() {
		return checkBoxBt;
	}
	
	@FindBy(how=How.ID,using="logout")
	private WebElement logoutBt;
	
	public WebElement getLogoutBt() {
		return logoutBt;
	}
	
	
	
	
}