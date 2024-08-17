package org.testscript;

import org.global.CommonClass;
import org.manager.ProjectClassManager;
import org.openqa.selenium.Alert;

public class Execution {

	public static void main(String[] args) throws InterruptedException {
		
		ProjectClassManager projectClass=new ProjectClassManager();
		CommonClass base=new CommonClass();
		
		base.getDriver(base.readExcel(4, 4));
		base.windowMx();
		
		base.geturl(base.readExcel(3, 5));
		
		if(base.getcurrentURL().equals(base.readExcel(3, 5))) {
			System.out.println("Browser Launched");
			//base.writeExcel(1, 6, "Browser Launched");
		}
		
		//base.load();
		
		//base.screenshot("LoginPage");
		//base.writeExcel(1, 7, "Login ScreenShot Succeeded");
		
		base.load();
		
		if(projectClass.getLoginPage().getUserLoginPage().isDisplayed()) {
			System.out.println("User in Login Page");
			//base.writeExcel(2, 6,"User in Login Page" );
			
		}
		projectClass.getLoginPage().getUsername().sendKeys(base.readExcel(3,0));
		//base.load();
		projectClass.getLoginPage().getPassword().sendKeys(base.readExcel(3,1));
		//projectClass.getLoginPage().getLoginbt().click();
		base.clickbutton(projectClass.getLoginPage().getLoginbt());
		base.load();
		
		if(projectClass.getSearchHotel().getUserSearchHotel().isDisplayed()) {
			System.out.println("User in Search Hotel Page");
			//base.writeExcel(4, 6, "User in Search Hotel Page");
		}
		
		base.selectbyIndex( projectClass.getSearchHotel().getLocation(), 3);
		base.selectbyVisibleText(projectClass.getSearchHotel().getHotels(),"Hotel Sunshine");
		base.selectbyIndex(projectClass.getSearchHotel().getRoomType(), 2);
		base.selectbyVisibleText(projectClass.getSearchHotel().getNoOfRooms(), "4 - Four");
		
		base.clearText(projectClass.getSearchHotel().getCheckInDate());
		base.sendkeys(projectClass.getSearchHotel().getCheckInDate(), base.readExcel(4, 2) );
		
		base.clearText(projectClass.getSearchHotel().getCheckOtDate());
		base.sendkeys(projectClass.getSearchHotel().getCheckOtDate(), base.readExcel(2, 2));
		
		base.selectbyIndex(projectClass.getSearchHotel().getAdultsPerRoom(), 1);
		//base.selectbyVisibleText(projectClass.getSearchHotel().getChildPerRoom(), "2 - Two");
		base.selectbyValue(projectClass.getSearchHotel().getChildPerRoom(), "2");
		
		
		//base.screenshot("SearchHotel");
		//base.writeExcel(4, 7, "Search Hotel ScreenShot Succeeded");
		
		base.clickbutton(projectClass.getSearchHotel().getSearch());
		
		if(projectClass.getSelectPage().getUserSelectPage().isDisplayed()) {
			System.out.println("User in Select Hotel Page");
			//base.writeExcel(6,6, "User in Select Hotel Page");
		}
		
		base.clickbutton(projectClass.getSelectPage().getRadiobt());
		
		//base.screenshot("SelectPage");
		//base.writeExcel(6, 7,"Select Page ScreenShot Succeeded");
		
		base.clickbutton(projectClass.getSelectPage().getContinueBt());
		
		if(projectClass.getBookHotelPage().getUserBookPage().isDisplayed()) {
			System.out.println("User in Book Hotel Page");
			//base.writeExcel(8, 6, "User in Book Hotel Page");
		}
		
		base.sendkeys(projectClass.getBookHotelPage().getFirstName(), base.readExcel(3, 0));	
		base.sendkeys(projectClass.getBookHotelPage().getLastsName(), base.readExcel(3, 8));
		base.sendkeys(projectClass.getBookHotelPage().getAdress(), base.readExcel(3, 9));
		base.sendkeys(projectClass.getBookHotelPage().getCreditCardNumber(), base.readExcel(1, 10));
		base.selectbyIndex(projectClass.getBookHotelPage().getCreditCardType(), 2);
		base.selectbyVisibleText(projectClass.getBookHotelPage().getExpiryMonth(), "February");
		base.selectbyValue(projectClass.getBookHotelPage().getExpiryYear(), "2029");
		base.sendkeys(projectClass.getBookHotelPage().getCvvNum(), base.readExcel(1, 11));
		
		base.load();
		
		//base.screenshot("BookPage");
		//base.writeExcel(8, 7, "Book Page ScreenShot Succeeded");
		
		base.clickbutton(projectClass.getBookHotelPage().getBookNowBt());
		
		Thread.sleep(10000);
		
		if(projectClass.getConfirmPage().getUserConfirmPage().isDisplayed()) {
			System.out.println("User in Confirmation Page");
			//base.writeExcelNewRow(10, 6, "User in Confirmation Page");
		}
		
		base.scroll(projectClass.getConfirmPage().getAboutAdactin(), "Down");
		String orderIdValue = base.getAttributeJava(projectClass.getConfirmPage().getOrderId());
		
		base.load();
		
		//base.screenshot("ConfirmationPage");
		//base.writeExcel(10, 7, "Confirmation Page Screenshot Succeeded");
		
		if(projectClass.getConfirmPage().getMyItinerayBt().isDisplayed()) {
			
			if(projectClass.getConfirmPage().getMyItinerayBt().isEnabled()) {
				base.clickbutton(projectClass.getConfirmPage().getMyItinerayBt());
				
			}
		}
		
		if(projectClass.getItineraryPage().getUserItinerary().isDisplayed()) {
			System.out.println("User in Itinerary Page");
			//base.writeExcelNewRow(12, 6, "User in Itinerary Page");
		}
		
		//base.screenshot("ItineraryPage");
//		base.load();
//		//base.writeExcel(12, 7, "Itinerary Page ScreenShot Succeeded");
//		base.load();
		
		base.sendkeys(projectClass.getItineraryPage().getSearchBar(), orderIdValue);
		base.clickbutton(projectClass.getItineraryPage().getGoButton());
		base.clickbutton(projectClass.getItineraryPage().getCheckBoxBt());
		base.clickbutton(projectClass.getItineraryPage().getCancelButton());
		
		base.alertOK();
		
		base.load();
		base.scroll(projectClass.getItineraryPage().getCancelButton(), "Down");
		base.clickbutton(projectClass.getItineraryPage().getLogoutBt());
		
		base.load();
		
		//base.alertOK();
		
		if(projectClass.getLogOutPage().getUserLogoutPage().isDisplayed()) {
			System.out.println("User in LogOut Page");
			//base.writeExcelNewRow(14, 6, "User in LogOut Page");
		}
		
		base.load();
		base.screenshot("LogOutPage");
		//base.load();
		//base.writeExcel(14, 7, "Logout Page Screenshot Succeeded");
		
		base.clickbutton(projectClass.getLogOutPage().getLinkBt());
		
		base.load();
		
		if(projectClass.getLoginPage().getUserLoginPage().isDisplayed()) {
			System.out.println("User Back to Login Page");
			base.writeExcelNewRow(16, 6, "User Back to Login Page");
		}
		
		base.load();
		
		base.screenshot("BackToHomePage");
		base.load();
		base.writeExcel(16, 7, "Back To home Page Screenshot Succeeded");
		

	}

}
