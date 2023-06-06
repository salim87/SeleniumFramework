package main.java.pageEvents;

import main.java.pageObjects.HomePageElements;
import main.java.utils.ElementFetch;

public class HomePageEvents {
	
	public void clickSignInButton() {
		ElementFetch elementFetch = new ElementFetch();
		elementFetch.getWebElement("XPATH", HomePageElements.signInButton);
	}

}
