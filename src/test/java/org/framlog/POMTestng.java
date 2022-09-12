package org.framlog;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.github.dockerjava.api.model.Driver;


public class POMTestng extends TestingBase {
	
	@FindBy(id="username")
	private WebElement username;
	
	@FindBy(id = "password")
	private WebElement password;
	
	@FindBy(name="login")
	private WebElement login;
	
	@FindBy(id ="location")
	private WebElement location;
	
	@FindBy(id="hotels")
	private WebElement hotel;
	
	@FindBy(id="room_type")
	private WebElement roomtype;
	
	@FindBy(id="room_nos")
	private WebElement noroom;
	
	@FindBy(id="datepick_in")
	private WebElement indate;
	
	@FindBy(id="datepick_out")
	private WebElement outdate;
	
	
	
	public WebElement getIndate() {
		return indate;
	}

	public WebElement getOutdate() {
		return outdate;
	}
	@FindBy(id="adult_room")
	private WebElement adultroom;
	
	@FindBy(id="child_room")
	private WebElement childroom;
	
	@FindBy(id="Submit")
	private WebElement search;
	
	@FindBy(id="radiobutton_0")
	private WebElement button;
	
	@FindBy(id="continue")
	private WebElement click;
	
	@FindBy(id="first_name")
	private WebElement name;
	
	@FindBy(id="last_name")
	private WebElement lastname;
	
	public WebElement getButton() {
		return button;
	}

	public WebElement getClick() {
		return click;
	}

	public WebElement getName() {
		return name;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCcno() {
		return ccno;
	}

	public WebElement getCctype() {
		return cctype;
	}

	public WebElement getCcexpmonth() {
		return ccexpmonth;
	}

	public WebElement getCcexpyear() {
		return ccexpyear;
	}

	public WebElement getCccvvnum() {
		return cccvvnum;
	}

	public WebElement getBooking() {
		return booking;
	}
	@FindBy(id="address")
	private WebElement address;
	
	@FindBy(id="cc_num")
	private WebElement ccno;
	
	@FindBy(id="cc_type")
	private WebElement cctype;
	
	@FindBy(id="cc_exp_month")
	private WebElement ccexpmonth;
	
	@FindBy(id="cc_exp_year")
	private WebElement ccexpyear;
	
	@FindBy(id="cc_cvv")
	private WebElement cccvvnum;
	
	@FindBy(id="book_now")
	private WebElement booking;
	
	@FindBy(id="order_no")
	private WebElement orderno;
	
	

	public WebElement getOrderno() {
		return orderno;
	}

	public WebElement getNoroom() {
		return noroom;
	}

	public WebElement getAdultroom() {
		return adultroom;
	}

	public WebElement getChildroom() {
		return childroom;
	}

	public WebElement getSearch() {
		return search;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getLocation() {
		return location;
	}
	
	public WebElement getLogin() {
		return login;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getUsername() {
		return username;
	}
	public POMTestng() {
		PageFactory.initElements(driver, this);
		
		
	}


}
