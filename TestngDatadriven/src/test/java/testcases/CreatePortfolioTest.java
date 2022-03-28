package testcases;


import org.testng.annotations.Test;

import keywords.ApplicationKeywords;

public class CreatePortfolioTest {
	
	@Test
	public void createPortFolioTest() {
		   // no webdriver code
	       // login
		   // create
		   // verify
			
		   ApplicationKeywords app = new ApplicationKeywords();// init prop
	
		   app.openBrowser("Chrome");
		   app.navigate("url");
		   app.type("username_css", "ashishthakur1983");
		   app.type("password_xpath", "pass@1234");
		   app.validateElementPresent("login_submit_id");
		   app.click("login_submit_id");
		   app.validateLogin();
		   //app.selectDateFromCalendar();	

		
	}

	@Test
	public void createReservation() {
		
	}

}
