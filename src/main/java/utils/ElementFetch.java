package utils;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.BaseTest;

public class ElementFetch {

	public WebElement getWebElement(String identifierType, String identifierValue) {
		switch (identifierType) {

		case "CLASS":
			return BaseTest.driver.findElement(By.className(identifierValue));

		case "CSS":
			return BaseTest.driver.findElement(By.cssSelector(identifierValue));

		case "ID":
			return BaseTest.driver.findElement(By.id(identifierValue));

		case "LINK":
			return BaseTest.driver.findElement(By.linkText(identifierValue));

		case "NAME":
			return BaseTest.driver.findElement(By.name(identifierValue));

		case "PARTIAL_LINK":
			return BaseTest.driver.findElement(By.partialLinkText(identifierValue));

		case "TAG":
			return BaseTest.driver.findElement(By.tagName(identifierValue));

		case "XPATH":
			return BaseTest.driver.findElement(By.xpath(identifierValue));

		default:
			return null;
		}
	}
	
	public List<WebElement> getWebElements(String identifierType, String identifierValue) {
		switch (identifierType) {

		case "CLASS":
			return BaseTest.driver.findElements(By.className(identifierValue));

		case "CSS":
			return BaseTest.driver.findElements(By.cssSelector(identifierValue));

		case "ID":
			return BaseTest.driver.findElements(By.id(identifierValue));

		case "LINK":
			return BaseTest.driver.findElements(By.linkText(identifierValue));

		case "NAME":
			return BaseTest.driver.findElements(By.name(identifierValue));

		case "PARTIAL_LINK":
			return BaseTest.driver.findElements(By.partialLinkText(identifierValue));

		case "TAG":
			return BaseTest.driver.findElements(By.tagName(identifierValue));

		case "XPATH":
			return BaseTest.driver.findElements(By.xpath(identifierValue));

		default:
			return null;
		}
	}
}
