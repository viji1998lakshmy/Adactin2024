package org.manager;

import org.page.BookHotelPage;
import org.page.ConfirmationPage;
import org.page.ItineraryPage;
import org.page.LogOutPage;
import org.page.LoginPage;
import org.page.SearchHotel;
import org.page.SelectPage;

public class ProjectClassManager {
	
	private LoginPage loginPage;
	
	public LoginPage getLoginPage() {
		return (loginPage==null)	?	loginPage=new LoginPage()	:	loginPage;
	}
	
	private SearchHotel searchHotel;
	
	public SearchHotel getSearchHotel() {
		return (searchHotel==null)	?	searchHotel=new SearchHotel()	:	searchHotel;
	}

	private SelectPage selectPage;
	
	public SelectPage getSelectPage() {
		return (selectPage==null)	?	selectPage=new SelectPage()	:	selectPage;
	}
	
	private BookHotelPage bookHotelPage;
	
	public BookHotelPage getBookHotelPage() {
		return (bookHotelPage==null)	?	bookHotelPage=new BookHotelPage()	:	bookHotelPage;
	}
	
	private ConfirmationPage confirmPage;
	
	public ConfirmationPage getConfirmPage() {
		return (confirmPage==null)	?	confirmPage=new ConfirmationPage()	:	confirmPage;
	}
	
	private ItineraryPage itineraryPage;
	
	public ItineraryPage getItineraryPage() {
		return (itineraryPage==null)	?	itineraryPage=new ItineraryPage()	:	itineraryPage;
	}
	
	private LogOutPage logOutPage;
	
	public LogOutPage getLogOutPage() {
		return (logOutPage==null)	?	logOutPage=new LogOutPage()	:	logOutPage;
	}
	
}
