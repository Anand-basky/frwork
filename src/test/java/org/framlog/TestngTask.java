package org.framlog;
import java.io.IOException;
import java.nio.channels.SelectableChannel;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;

import com.fasterxml.jackson.core.io.OutputDecorator;


public class TestngTask extends TestingBase {
	public static pageObjectModel p;

	@Test
	public void tc01() throws IOException, InterruptedException {
		getDriver("chrome");
		launch("https://adactinhotelapp.com/");
	    p = new pageObjectModel();
		WebElement username = p.getUsername();
		String getfile = Getfile(0, 1, "sheet1");
		textsend(username, getfile);
		
		WebElement password = p.getPassword();
		String getfile1 = Getfile(1, 1, "sheet1");
		textsend(password, getfile1);
	
		WebElement login = p.getLogin();
		buttonClick(login);

	
		WebElement location = p.getLocation();
		String getfile11 = Getfile(2, 1, "sheet1");
		selectBy(location, "value", getfile11);
		
		WebElement hotel = p.getHotel();
		String getfile2 = Getfile(3, 1, "sheet1");
		selectBy(hotel, "value", getfile2);
		
		WebElement roomtype = p.getRoomtype();
		String getfile3 = Getfile(4, 1, "sheet1");
		selectBy(roomtype, "value", getfile3);
		
		WebElement noroom = p.getNoroom();
		String getfile4 = Getfile(5, 1, "sheet1");
		selectBy(noroom, "value", getfile4);
		
		
//		WebElement indate = p.getIndate();
//		String getfile5 = Getfile(6, 1, "sheet1");
//		selectBy(indate, "value", getfile5);
//		
//		WebElement outdate = p.getOutdate();
//		String getfile6 = Getfile(7, 1, "sheet1");
//		selectBy(outdate, "value", getfile6);

		WebElement adultroom = p.getAdultroom();
		String getfile7 = Getfile(8, 1, "sheet1");
		selectBy(adultroom, "value", getfile7);
		
		WebElement childroom = p.getChildroom();
		String getfile8 = Getfile(9, 1, "sheet1");
		selectBy(childroom, "value", getfile8);
		
		WebElement search = p.getSearch();
		buttonClick(search);
		
		WebElement button = p.getButton();
		buttonClick(button);
		
		WebElement click = p.getClick();
		buttonClick(click);
		
		WebElement name = p.getName();
		String getfile9 = Getfile(10, 1, "sheet1");
		textsend(name, getfile9);
		
		WebElement lastname = p.getLastname();
		String getfile10 = Getfile(11, 1, "sheet1");
		textsend(lastname, getfile10);
		
		WebElement address = p.getAddress();
		String getfile12 = Getfile(12, 1, "sheet1");
		textsend(address, getfile12);
		
		WebElement ccno = p.getCcno();
		String getfile13 = Getfile(13, 1, "sheet1");
	    textsend(ccno, getfile13);
		
		WebElement cctype = p.getCctype();
		String getfile14 = Getfile(14, 1, "sheet1");
		selectBy(cctype, "value", getfile14);
		
		WebElement ccexpmonth = p.getCcexpmonth();
		String getfile15 = Getfile(15, 1, "sheet1");
		selectBy(ccexpmonth, "value", getfile15);
		
		WebElement ccexpyear = p.getCcexpyear();
		String getfile16 = Getfile(16, 1, "sheet1");
		selectBy(ccexpyear, "value", getfile16);
		
		WebElement cccvvnum = p.getCccvvnum();
		String getfile17 = Getfile(17, 1, "sheet1");
		textsend(cccvvnum, getfile17);
		
		
		WebElement booking = p.getBooking();
		buttonClick(booking);
		
		Thread.sleep(5000);
		
		WebElement orderno = p.getOrderno();
		String attribute = orderno.getAttribute("value");
		System.out.println(attribute);
		
		
	}
	

	
}
