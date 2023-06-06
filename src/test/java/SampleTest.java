package test.java;

import org.testng.annotations.Test;

import main.java.pageEvents.HomePageEvents;
import main.java.pageEvents.LoginPageEvents;

public class SampleTest extends BaseTest {
	
	@Test
	public void sampleMethodForEmailEntering() {
		HomePageEvents homePageEvents = new HomePageEvents();
		homePageEvents.clickSignInButton();
		
		LoginPageEvents loginPageEvents = new LoginPageEvents();
		loginPageEvents.verifyLoginPageOpenOrNot();
		loginPageEvents.enterEmailId();
	}
	

}
