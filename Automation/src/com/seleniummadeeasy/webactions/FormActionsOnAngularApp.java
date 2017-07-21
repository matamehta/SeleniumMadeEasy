package com.seleniummadeeasy.webactions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.seleniummadeeasy.findelement.FindAngularElement;
import com.seleniummadeeasy.locators.AngularLocators.AngularLocator;

public class FormActionsOnAngularApp {
	
	WebDriver driver;
	FormActions formActions;
	FindAngularElement findAngularElement;
	
	public FormActionsOnAngularApp(WebDriver driver) {
		this.driver = driver;
		formActions = new FormActions(this.driver);
		findAngularElement = new FindAngularElement(this.driver);
	}
	
	public void enterText(AngularLocator locator, String locatorValue,  String text) throws Exception {
		try {
			WebElement element = findAngularElement.getWebElementFromAngularLocator(locator, locatorValue);
			formActions.enterTextUsingWebElement(element, text);
		}
		catch(Exception e) {
			throw new Exception(e.getCause().toString());
		}
	}
	
	public void click(AngularLocator locator, String locatorValue) throws Exception {
		try {
			WebElement element = findAngularElement.getWebElementFromAngularLocator(locator, locatorValue);
			formActions.clickUsingWebElement(element);
		}
		catch(Exception e) {
			throw new Exception(e.getCause().toString());
		}
	}
	
	public void check(AngularLocator locator, String locatorValue) throws Exception {
		try {
			WebElement element = findAngularElement.getWebElementFromAngularLocator(locator, locatorValue);
			formActions.checkUsingWebElement(element);
		}
		catch(Exception e) {
			throw new Exception(e.getCause().toString());
		}
	}
	
	public void uncheck(AngularLocator locator, String locatorValue) throws Exception {
		try {
			WebElement element = findAngularElement.getWebElementFromAngularLocator(locator, locatorValue);
			formActions.unCheckUsingWebElement(element);
		}
		catch(Exception e) {
			throw new Exception(e.getCause().toString());
		}
	}
	
	public void selectRadio(AngularLocator locator, String locatorValue) throws Exception {
		try {
			WebElement element = findAngularElement.getWebElementFromAngularLocator(locator, locatorValue);
			formActions.selectRadioUsingWebElement(element);
		}
		catch(Exception e) {
			throw new Exception(e.getCause().toString());
		}
	}
	
	public void selectDropdownByText(AngularLocator locator, String locatorValue, String option) throws Exception {
		try {
			WebElement element = findAngularElement.getWebElementFromAngularLocator(locator, locatorValue);
			formActions.selectDropdownByTextUsingWebElement((Select)element, option);
		}
		catch(Exception e) {
			throw new Exception(e.getCause().toString());
		}
	}
	
	public void selectDropdownByValue(AngularLocator locator, String locatorValue, String option) throws Exception {
		try {
			WebElement element = findAngularElement.getWebElementFromAngularLocator(locator, locatorValue);
			formActions.selectDropdownByValueUsingWebElement((Select)element, option);
		}
		catch(Exception e) {
			throw new Exception(e.getCause().toString());
		}
	}
	
	public void selectDropdownByIndex(AngularLocator locator, String locatorValue, int index) throws Exception {
		try {
			WebElement element = findAngularElement.getWebElementFromAngularLocator(locator, locatorValue);
			formActions.selectDropdownByIndexUsingWebElement((Select)element, index);
		}
		catch(Exception e) {
			throw new Exception(e.getCause().toString());
		}
	}
	
	public void hover(AngularLocator locator, String locatorValue) throws Exception {
		try {
			WebElement element = findAngularElement.getWebElementFromAngularLocator(locator, locatorValue);
			formActions.hoverUsingWebElement(element);
		}
		catch(Exception e) {
			throw new Exception(e.getCause().toString());
		}
	}
	
	public String getText(AngularLocator locator, String locatorValue) throws Exception {
		String textToReturn = null;
		try {
			WebElement element = findAngularElement.getWebElementFromAngularLocator(locator, locatorValue);
			textToReturn = formActions.getTextUsingWebElement(element);
		}
		catch(Exception e) {
			throw new Exception(e.getCause().toString());
		}
		return textToReturn;
	}
	
	public String getTextFromTextbox(AngularLocator locator, String locatorValue) throws Exception {
		String textToReturn = null;
		try {
			WebElement element = findAngularElement.getWebElementFromAngularLocator(locator, locatorValue);
			textToReturn = formActions.getTextFromTextboxUsingWebElement(element);
		}
		catch(Exception e) {
			throw new Exception(e.getCause().toString());
		}
		return textToReturn;
	}
	
	public String getAttribute(AngularLocator locator, String locatorValue, String attributeName) throws Exception {
		String textToReturn = null;
		try {
			WebElement element = findAngularElement.getWebElementFromAngularLocator(locator, locatorValue);
			textToReturn = formActions.getAttributeUsingWebElement(element, attributeName);
		}
		catch(Exception e) {
			throw new Exception(e.getCause().toString());
		}
		return textToReturn;
	}
	
	public Boolean isElementVisible(AngularLocator locator, String locatorValue) throws Exception {
		Boolean isElementVisible = null;
		try {
			WebElement element = findAngularElement.getWebElementFromAngularLocator(locator, locatorValue);
			isElementVisible = formActions.isElementVisibleUsingWebElement(element);
		}
		catch(Exception e) {
			if(e instanceof NoSuchElementException) {
				isElementVisible = false;
				return isElementVisible;
			}
			else if(e instanceof ElementNotVisibleException) {
				isElementVisible = false;
				return isElementVisible;
			}
			else {
				throw new Exception(e.getCause().toString());
			}
		}
		return isElementVisible;
	}
	
	public Boolean isElementEnable(AngularLocator locator, String locatorValue) throws Exception {
		Boolean isElementEnable = null;
		try {
			WebElement element = findAngularElement.getWebElementFromAngularLocator(locator, locatorValue);
			isElementEnable = formActions.isElementEnableUsingWebElement(element);
		}
		catch(Exception e) {
			throw new Exception(e.getCause().toString());
		}
		return isElementEnable;
	}
	
	public Boolean isElementPresent(AngularLocator locator, String locatorValue) throws Exception {
		Boolean isElementPresent = null;
		List<WebElement> elements;
		try {
			elements = findAngularElement.getWebElementsFromAngularLocator(locator, locatorValue);
			if(elements.size() > 0) {
				isElementPresent = true;
			}
			else {
				isElementPresent = false;
			}
		}
		catch(Exception e) {
			throw new Exception(e.getCause().toString());
		}
		return isElementPresent;
	}
}
