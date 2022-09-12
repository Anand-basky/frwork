package org.framlog;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class testng extends TestingBase {
	public static void main(String[] args)  {
		public static POMTestng p;

		@Parameters({ "name", "pass" })
		@Test
		private void tc01(String username, String password) {
			getDriver("chrome");
			launch("https://adactinhotelapp.com/");
			p = new POMTestng();
			WebElement name = p.getUsername();
			textsend(name, username);
			WebElement pass = p.getPassword();
			textsend(pass, password);
			WebElement login = p.getLogin();
			buttonClick(login);
		}

		@Parameters({ "location" })
		@Test
		private void tc02(String location) {
			WebElement location2 = p.getLocation();
			selectBy(location2, "value", location);
		}

		@Parameters({ "hotel" })
		@Test
		private void tc03(String hotel) {
			WebElement hotel2 = p.getHotel();
			selectBy(hotel2, "value", hotel);

		}

		@Parameters({ "roomtype", "noroom", "adroom", "chroom" })
		@Test
		private void tc04(String roomtype, String noroom, String adroom, String chroom) {
			WebElement roomtype1 = p.getRoomtype();
			selectBy(roomtype1, "value", roomtype);
			WebElement noroom2 = p.getNoroom();
			selectBy(noroom2, "value", noroom);
			WebElement adroom1 = p.getAdultroom();
			selectBy(adroom1, "value", adroom);
			WebElement childroom = p.getChildroom();
			selectBy(childroom, "value", chroom);

			WebElement search = p.getSearch();
			buttonClick(search);
			WebElement button = p.getButton();
			buttonClick(button);
			WebElement click = p.getClick();
			buttonClick(click);

		}

		@Parameters({ "fname", "lname", "address", "ccnum" })
		@Test
		private void tc08(String fname, String lname, String address, String ccnum) {
			WebElement name = p.getName();
			textsend(name, fname);
			WebElement lastname = p.getLastname();
			textsend(lastname, lname);
			WebElement address1 = p.getAddress();
			textsend(address1, address);
			WebElement ccno = p.getCcno();
			textsend(ccno, ccnum);

		}

		@Parameters({ "cardtype" })
		@Test
		private void tc09(String ctype) {
			WebElement cardtype = p.getCctype();
			selectBy(cardtype, "value", ctype);
		}

		@Parameters({ "month", "year", "cccvv" })
		@Test
		private void tc10(String month, String year, String cccvv) throws InterruptedException {
			WebElement month1 = p.getCcexpmonth();
			selectBy(month1, "value", month);
			WebElement ccexpyear = p.getCcexpyear();
			selectBy(ccexpyear, "value", year);
			WebElement cccvvnum = p.getCccvvnum();
			textsend(cccvvnum, cccvv);
			WebElement booking = p.getBooking();
			buttonClick(booking);
			Thread.sleep(6000);
		}

		@Parameters({ "orderno" })
		@Test
		private void tc11(String odno) {
			WebElement orderno = p.getOrderno();
			String attribute = orderno.getAttribute(odno);
			System.out.println(attribute);
		}

		
		
	}

}
