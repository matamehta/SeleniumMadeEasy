package com.seleniummadeeasy.webactions;

import java.util.List;

import org.openqa.selenium.ElementNotVisibleException;
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
	
	/**
	 * Enter text in textbox using Angular specific locators
	 * 
	 * @author Mohit Gupta
	 * 
	 * @param locator Angular locator
	 * @param locatorValue Value of angular attribute
	 * @param text Text to enter in textbox
	 * @throws Exception
	 */
	public void enterText(AngularLocator locator, String locatorValue,  String text) throws Exception {
		try {
			WebElement element = findAngularElement.getWebElementFromAngularLocator(locator, locatorValue);
			formActions.enterTextUsingWebElement(element, text);
		}
		catch(Exception e) {
			throw new Exception(e.getCause().toString());
		}
	}
	
	/**
	 * Click on web element using Angular specific locator
	 * 
	 * @author Mohit Gupta
	 * 
	 * @param locator Angular locator
	 * @param locatorValue Value of angular attribute
	 * @throws Exception
	 */
	public void click(AngularLocator locator, String locatorValue) throws Exception {
		try {
			WebElement element = findAngularElement.getWebElementFromAngularLocator(locator, locatorValue);
			formActions.clickUsingWebElement(element);
		}
		catch(Exception e) {
			throw new Exception(e.getCause().toString());
		}
	}
	
	/**
	 * Check on web element using Angular specific locator
	 * 
	 * @author Mohit Gupta
	 * 
	 * @param locator Angular locator
	 * @param locatorValue Value of angular attribute
	 * @throws Exception
	 */
	public void check(AngularLocator locator, String locatorValue) throws Exception {
		try {
			WebElement element = findAngularElement.getWebElementFromAngularLocator(locator, locatorValue);
			formActions.checkUsingWebElement(element);
		}
		catch(Exception e) {
			throw new Exception(e.getCause().toString());
		}
	}
	
	/**
	 * UnCheck on web element using Angular specific locator
	 * 
	 * @author Mohit Gupta
	 * 
	 * @param locator Angular locator
	 * @param locatorValue Value of angular attribute
	 * @throws Exception
	 */
	public void uncheck(AngularLocator locator, String locatorValue) throws Exception {
		try {
			WebElement element = findAngularElement.getWebElementFromAngularLocator(locator, locatorValue);
			formActions.unCheckUsingWebElement(element);
		}
		catch(Exception e) {
			throw new Exception(e.getCause().toString());
		}
	}
	
	/**
	 * Select radio button using Angular specific locator
	 * 
	 * @author Mohit Gupta
	 * 
	 * @param locator Angular locator
	 * @param locatorValue Value of angular attribute
	 * @throws Exception
	 */
	public void selectRadio(AngularLocator locator, String locatorValue) throws Exception {
		try {
			WebElement element = findAngularElement.getWebElementFromAngularLocator(locator, locatorValue);
			formActions.selectRadioUsingWebElement(element);
		}
		catch(Exception e) {
			throw new Exception(e.getCause().toString());
		}
	}
	
	/**
	 * Select dropdown via Option text using Angular specific locator
	 * 
	 * @author Mohit Gupta
	 * 
	* @param locator Angular locator
	 * @param locatorValue Value of angular attribute
	 * @param option Text of option to select
	 * @throws Exception
	 */
	public void selectDropdownByText(AngularLocator locator, String locatorValue, String option) throws Exception {
		try {
			WebElement element = findAngularElement.getWebElementFromAngularLocator(locator, locatorValue);
			formActions.selectDropdownByTextUsingWebElement((Select)element, option);
		}
		catch(Exception e) {
			throw new Exception(e.getCause().toString());
		}
	}
	
	/**
	 * Select dropdown via Value using Angular specific locator 
	 * 
	 * @author Mohit Gupta
	 * 
	* @param locator Angular locator
	 * @param locatorValue Value of angular attribute
	 * @param value Text of value to select
	 * @throws Exception
	 */
	public void selectDropdownByValue(AngularLocator locator, String locatorValue, String value) throws Exception {
		try {
			WebElement element = findAngularElement.getWebElementFromAngularLocator(locator, locatorValue);
			formActions.selectDropdownByValueUsingWebElement((Select)element, value);
		}
		catch(Exception e) {
			throw new Exception(e.getCause().toString());
		}
	}
	
	/**
	 * Select dropdown via Index using Angular specific locator
	 * 
	 * @author Mohit Gupta
	 * 
	 * @param locator Angular locator
	 * @param locatorValue Value of angular attribute
	 * @param index Index of value to select
	 * @throws Exception
	 */
	public void selectDropdownByIndex(AngularLocator locator, String locatorValue, int index) throws Exception {
		try {
			WebElement element = findAngularElement.getWebElementFromAngularLocator(locator, locatorValue);
			formActions.selectDropdownByIndexUsingWebElement((Select)element, index);
		}
		catch(Exception e) {
			throw new Exception(e.getCause().toString());
		}
	}
	
	/**
	 * Hover on web element using Angular specific locator
	 * 
	 * @author Mohit Gupta
	 * 
	 * @param locator Angular locator
	 * @param locatorValue Value of angular attribute
	 * @throws Exception
	 */
	public void hover(AngularLocator locator, String locatorValue) throws Exception {
		try {
			WebElement element = findAngularElement.getWebElementFromAngularLocator(locator, locatorValue);
			formActions.hoverUsingWebElement(element);
		}
		catch(Exception e) {
			throw new Exception(e.getCause().toString());
		}
	}
	
	/**
	 * Get text of web element using Angular specific locator
	 * 
	 * @author Mohit Gupta
	 * 
	 * @param locator Angular locator
	 * @param locatorValue Value of angular attribute
	 * @return			   Text to return from web element
	 * @throws Exception
	 */
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
	
	/**
	 * Get text of web element using Angular specific locator
	 * 
	 * @author Mohit Gupta
	 * 
	 * @param locator Angular locator
	 * @param locatorValue Value of angular attribute
	 * @return			   Text to return from web element
	 * @throws Exception
	 */
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
	
	/**
	 * Get attribute value using Angular specific locator
	 * 
	 * @author Mohit Gupta
	 * 
	 * @param locator Angular locator
	 * @param locatorValue Value of angular attribute
	 * @param attributeName Attribute name whose value is to be retrieved
	 * @return				Value of given attribute
	 * @throws Exception
	 */
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
	
	/**
	 * Is web element with Angular specific locator visible on screen
	 * 
	 * @author Mohit Gupta
	 * 
	  * @param locator Angular locator
	 * @param locatorValue Value of angular attribute
	 * @return			   true if element is visible, false otherwise
	 * @throws Exception
	 */
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
	
	/**
	 * Is web element with Angular specific locator enable on screen
	 * 
	 * @author Mohit Gupta
	 * 
	  * @param locator Angular locator
	 * @param locatorValue Value of angular attribute
	 * @return			   true if element is enable, false otherwise
	 * @throws Exception
	 */
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
	
	/**
	 * Is web element with Angular specific locator present in HTML on screen
	 * 
	 * @author Mohit Gupta
	 * 
	  * @param locator Angular locator
	 * @param locatorValue Value of angular attribute
	 * @return			   true if element is present in HTML, false otherwise
	 * @throws Exception
	 */
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