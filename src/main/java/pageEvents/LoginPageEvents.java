package pageEvents;

import org.testng.Assert;

import pageObjects.LoginPageElements;
import utils.ElementFetch;

public class LoginPageEvents {

	ElementFetch ele = new ElementFetch();
	
	public void verifyIfLoginPageIsLoaded() {
		Assert.assertTrue(ele.getWebElements("XPATH", LoginPageElements.loginText).size() > 0, "Element not found");
	}
	
	public void enterCredentials() {
		ele.getWebElement("ID", LoginPageElements.emailAddress).sendKeys("test_email@gmail.com");
		ele.getWebElement("ID", LoginPageElements.passwordField).sendKeys("P@ssw0rd");
	}
}
