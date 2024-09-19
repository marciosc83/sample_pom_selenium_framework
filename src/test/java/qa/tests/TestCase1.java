package qa.tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pageEvents.HomePageEvents;
import pageEvents.LoginPageEvents;
import utils.ElementFetch;

public class TestCase1 extends BaseTest{
ElementFetch ele = new ElementFetch();
HomePageEvents homePage = new HomePageEvents();
LoginPageEvents loginPage = new LoginPageEvents();

  @Test
  public void sampleMethodForEnteringCredentials() {
	  logger.info("Signin into LoginPage");
	  homePage.signInButton();
	  
	  logger.info("Verifying if Login text is present or not");
	  loginPage.verifyIfLoginPageIsLoaded();
	  
	  logger.info("Enter the credentials");
	  loginPage.enterCredentials();
  }
}
