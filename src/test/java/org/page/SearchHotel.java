package org.page;

import org.global.CommonClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel extends CommonClass{
	public SearchHotel() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//td[text()='Search Hotel ']")
	private WebElement userSearchHotel;
	
	public WebElement getUserSearchHotel() {
		return userSearchHotel;
	}
	
	@FindBy(xpath="//select[@id='location']")
	private WebElement location;
	
	public WebElement getLocation() {
		return location;
	}
	
	@FindBy(xpath="//select[@id='hotels']")
	private WebElement hotels;
	
	public WebElement getHotels() {
		return hotels;
	}
	
	@FindBy(xpath="//select[@name='room_type']")
	private WebElement roomType;
	
	public WebElement getRoomType() {
		return roomType;
	}
	
	@FindBy(xpath="//select[@name='room_nos']")
	private WebElement noOfRooms;
	
	public WebElement getNoOfRooms() {
		return noOfRooms;
	}
	
	@FindBy(xpath="//input[@id='datepick_in']")
	private WebElement checkInDate;
	
	public WebElement getCheckInDate() {
		return checkInDate;
	}
	
	@FindBy(xpath="//input[@id='datepick_out']")
	private WebElement checkOtDate;
	
	public WebElement getCheckOtDate() {
		return checkOtDate;
	}
	
	@FindBy(xpath="//select[@id='adult_room']")
	private WebElement adultsPerRoom;
	
	public WebElement getAdultsPerRoom() {
		return adultsPerRoom;
	}
	
	@FindBy(xpath="//select[@id='child_room']")
	private WebElement childPerRoom;
	
	public WebElement getChildPerRoom() {
		return childPerRoom;
	}
	
	@FindBy(xpath="//input[@id='Submit']")
	private WebElement search;
	
	public WebElement getSearch() {
		return search;
	}
	
}
