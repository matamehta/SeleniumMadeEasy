package com.seleniummadeeasy.webactions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.seleniummadeeasy.exceptions.NoSuchAttributeException;
import com.seleniummadeeasy.findelement.FindWebElement;

public class FormActions {
	
	WebDriver driver;
	Actions action;
	FindWebElement findElement;
	WaitActions waitAction;
	
	final int WAIT_TIMEOUT = 60;
	
	public FormActions(WebDriver driver) {
		this.driver = driver;
		action = new Actions(this.driver);
		findElement = new FindWebElement(this.driver);
		waitAction = new WaitActions(this.driver);
	}
	
	/**
	 * Enter text in a textbox using Selenium By locator
	 * 
	 * @author Mohit Gupta
	 * 
	 * @param byLocator Selenium By locator
	 * @param text String to enter in textbox
	 * @throws Exception
	 */
	public void enterTextUsingBy(By byLocator, String text) throws Exception {
		try {
			WebElement element = findElement.findWebElement(byLocator);
			action.sendKeys(element, text).build().perform();
			waitForPageToLoad();
		}
		catch(Exception e) {
			throw new Exception(e.getCause().toString());
		}
	}
	
	/**
	 * Enter text in a textbox using Selenium WebElement
	 * 
	 * @author Mohit Gupta
	 * 
	 * @param elementLocator Selenium WebElement
	 * @param text String to enter in textbox
	 * @throws Exception
	 */
	public void enterTextUsingWebElement(WebElement elementLocator, String text) throws Exception {
		try {
			action.sendKeys(elementLocator, text).build().perform();
			waitForPageToLoad();
		}
		catch(Exception e) {
			throw new Exception(e.getCause().toString());
		}
	}
	
	/**
	 * Click on element using Selenium By locator
	 * 
	 * @author Mohit Gupta
	 * 
	 * @param byLocator Selenium By locator
	 * @throws Exception
	 */
	public void clickUsingBy(By byLocator) throws Exception {
		try {
			waitAction.waitForElementToBeClickable(byLocator);
			WebElement element = findElement.findWebElement(byLocator);
			action.moveToElement(element).click().build().perform();
			waitForPageToLoad();
		}
		catch(Exception e) {
			throw new Exception(e.getCause().toString());
		}
	}
	
	/**
	 * Click on element using Selenium WebElement
	 * 
	 * @author Mohit Gupta
	 * 
	 * @param elementLocator Selenium WebElement
	 * @throws Exception
	 */
	public void clickUsingWebElement(WebElement elementLocator) throws Exception {
		try {
			waitAction.waitForElementToBeClickable(elementLocator);
			action.moveToElement(elementLocator).click().build().perform();
			waitForPageToLoad();
		}
		catch(Exception e) {
			throw new Exception(e.getCause().toString());
		}
	}
	
	/**
	 * Check an element using Selenium By locator
	 * 
	 * @author Mohit Gupta
	 * 
	 * @param byLocator Selenium By locator
	 * @throws Exception
	 */
	public void checkUsingBy(By byLocator) throws Exception {
		try {
			waitAction.waitForElementToBeClickable(byLocator);
			WebElement element = findElement.findWebElement(byLocator);
			if(!element.isSelected()) {
				action.moveToElement(element).click().build().perform();
				waitForPageToLoad();
			}
		}
		catch(Exception e) {
			throw new Exception(e.getCause().toString());
		}
	}
	
	/**
	 * Check an element using Selenium WebElement
	 * 
	 * @author Mohit Gupta
	 * 
	 * @param elementLocator Selenium WebElement
	 * @throws Exception
	 */
	public void checkUsingWebElement(WebElement elementLocator) throws Exception {
		try {
			waitAction.waitForElementToBeClickable(elementLocator);
			if(!elementLocator.isSelected()) {
				action.moveToElement(elementLocator).click().build().perform();
				waitForPageToLoad();
			}
		}
		catch(Exception e) {
			throw new Exception(e.getCause().toString());
		}
	}
	
	/**
	 * UnCheck an element using Selenium By locator
	 * 
	 * @author Mohit Gupta
	 * 
	 * @param byLocator Selenium By locator
	 * @throws Exception
	 */
	public void unCheckUsingBy(By byLocator) throws Exception {
		try {
			waitAction.waitForElementToBeClickable(byLocator);
			WebElement element = findElement.findWebElement(byLocator);
			if(element.isSelected()) {
				action.moveToElement(element).click().build().perform();
				waitForPageToLoad();
			}
		}
		catch(Exception e) {
			throw new Exception(e.getCause().toString());
		}
		
	}
	
	/**
	 * UnCheck an element using Selenium WebElement
	 * 
	 * @author Mohit Gupta
	 * 
	 * @param elementLocator Selenium WebElement
	 * @throws Exception
	 */
	public void unCheckUsingWebElement(WebElement elementLocator) throws Exception {
		try {
			waitAction.waitForElementToBeClickable(elementLocator);
			if(elementLocator.isSelected()) {
				action.moveToElement(elementLocator).click().build().perform();
				waitForPageToLoad();
			}
		}
		catch(Exception e) {
			throw new Exception(e.getCause().toString());
		}
	}
	
	/**
	 * Select a radio-button using Selenium By locator
	 * 
	 * @author Mohit Gupta
	 * 
	 * @param byLocator Selenium By locator
	 * @throws Exception
	 */
	public void selectRadioUsingBy(By byLocator) throws Exception {
		try {
			waitAction.waitForElementToBeClickable(byLocator);
			WebElement element = findElement.findWebElement(byLocator);
			if(!element.isSelected()) {
				action.moveToElement(element).click().build().perform();
				waitForPageToLoad();
			}
		}
		catch(Exception e) {
			throw new Exception(e.getCause().toString());
		}
	}
	
	/**
	 * Select a radio-button using Selenium WebElement
	 * 
	 * @author Mohit Gupta
	 * 
	 * @param elementLocator Selenium WebElement
	 * @throws Exception
	 */
	public void selectRadioUsingWebElement(WebElement elementLocator) throws Exception {
		try {
			waitAction.waitForElementToBeClickable(elementLocator);
			if(!elementLocator.isSelected()) {
				action.moveToElement(elementLocator).click().build().perform();
				waitForPageToLoad();
			}
		}
		catch(Exception e) {
			throw new Exception(e.getCause().toString());
		}
	}
	
	/**
	 * Select dropdown via option text using Selenium By locator
	 * 
	 * @author Mohit Gupta
	 * 
	 * @param byLocator Selenium By locator
	 * @throws Exception
	 */
	public void selectDropdownByTextUsingBy(By byLocator, String option) throws Exception {
		try {
			Select dropdown = findElement.findDropdownElement(byLocator);
			dropdown.selectByVisibleText(option);
			waitForPageToLoad();
		}
		catch(Exception e) {
			throw new Exception(e.getCause().toString());
		}
	}
	
	/**
	 * Select dropdown via option text using Selenium WebElement
	 * 
	 * @author Mohit Gupta
	 * 
	 * @param elementLocator Selenium WebElement
	 * @throws Exception
	 */
	public void selectDropdownByTextUsingWebElement(Select dropdownElement, String option) throws Exception {
		try {
			dropdownElement.selectByVisibleText(option);
			waitForPageToLoad();
		}
		catch(Exception e) {
			throw new Exception(e.getCause().toString());
		}
	}
	
	/**
	 * Select dropdown via index using Selenium By locator
	 * 
	 * @author Mohit Gupta
	 * 
	 * @param byLocator Selenium By locator
	 * @throws Exception
	 */
	public void selectDropdownByIndexUsingBy(By byLocator, int index) throws Exception {
		try {
			Select dropdown = findElement.findDropdownElement(byLocator);
			dropdown.selectByIndex(index-1);
			waitForPageToLoad();
		}
		catch(Exception e) {
			throw new Exception(e.getCause().toString());
		}
	}
	
	/**
	 * Select dropdown via index using Selenium WebElement
	 * 
	 * @author Mohit Gupta
	 * 
	 * @param elementLocator Selenium WebElement
	 * @throws Exception
	 */
	public void selectDropdownByIndexUsingWebElement(Select dropdownElement, int index) throws Exception {
		try {
			dropdownElement.selectByIndex(index-1);
			waitForPageToLoad();
		}
		catch(Exception e) {
			throw new Exception(e.getCause().toString());
		}
	}
	
	/**
	 * Select dropdown via Value using Selenium By locator
	 * 
	 * @author Mohit Gupta
	 * 
	 * @param byLocator Selenium By locator
	 * @throws Exception
	 */
	public void selectDropdownByValueUsingBy(By byLocator, String value) throws Exception {
		try {
			Select dropdown = findElement.findDropdownElement(byLocator);
			dropdown.selectByValue(value);
			waitForPageToLoad();
		}
		catch(Exception e) {
			throw new Exception(e.getCause().toString());
		}
	}
	
	/**
	 * Select dropdown via Value using Selenium WebElement
	 * 
	 * @author Mohit Gupta
	 * 
	 * @param elementLocator Selenium WebElement
	 * @throws Exception
	 */
	public void selectDropdownByValueUsingWebElement(Select dropdownElement, String value) throws Exception {
		try {
			dropdownElement.selectByValue(value);
			waitForPageToLoad();
		}
		catch(Exception e) {
			throw new Exception(e.getCause().toString());
		}
	}
	
	/**
	 * Hover on an element using Selenium By locator
	 * 
	 * @author Mohit Gupta
	 * 
	 * @param byLocator Selenium By locator
	 * @throws Exception
	 */
	public void hoverUsingBy(By byLocator) throws Exception {
		try {
			WebElement element = findElement.findWebElement(byLocator);
			action.moveToElement(element).build().perform();
			waitForPageToLoad();
		}
		catch(Exception e) {
			throw new Exception(e.getCause().toString());
		}
	}
	
	/**
	 * Hover on an element using Selenium WebElement
	 * 
	 * @author Mohit Gupta
	 * 
	 * @param elementLocator Selenium WebElement
	 * @throws Exception
	 */
	public void hoverUsingWebElement(WebElement elementLocator) throws Exception {
		try {
			action.moveToElement(elementLocator).build().perform();
			waitForPageToLoad();
		}
		catch(Exception e) {
			throw new Exception(e.getCause().toString());
		}
	}
	
	/**
	 * Click OK on Alert
	 * 
	 * @author Mohit Gupta
	 * 
	 * @throws Exception
	 */
	public void clickOkOnAlert() throws Exception {
		try {
			driver.switchTo().alert().accept();
		}
		catch(NoAlertPresentException e) {
			throw new NoAlertPresentException("Alert is not present");
		}
		catch(Exception e) {
			throw new Exception(e.getCause().toString());
		}
	}
	
	/**
	 * Click Cancel on Alert
	 * 
	 * @author Mohit Gupta
	 * 
	 * @throws Exception
	 */
	public void clickCancelOnAlert() throws Exception {
		try{
			driver.switchTo().alert().dismiss();
		}
		catch(NoAlertPresentException e) {
			throw new NoAlertPresentException("Alert is not present");
		}
		catch(Exception e) {
			throw new Exception(e.getCause().toString());
		}
	}
	
	/**
	 * Get text of web element using Selenium By locator
	 * 
	 * @author Mohit Gupta
	 * 
	 * @param byLocator Selenium By locator
	 * @return			Text of web element
	 * @throws Exception
	 */
	public String getTextUsingBy(By byLocator) throws Exception {
		String textToReturn = null;
		try {
			WebElement element = findElement.findWebElement(byLocator);
			if(element.getTagName().equals("select")) {
				WebElement selectedOption = ((Select)element).getFirstSelectedOption();
				textToReturn = selectedOption.getText();
			}
			else {
				textToReturn = element.getText();
			}
		}
		catch(Exception e) {
			throw new Exception(e.getCause().toString());
		}
		
		return textToReturn;
	}
	
	/**
	 * Get text of web element using Selenium WebElement
	 * 
	 * @author Mohit Gupta
	 * 
	 * @param byLocator Selenium WebElement
	 * @return			Text of web element
	 * @throws Exception
	 */
	public String getTextUsingWebElement(WebElement elementLocator) throws Exception {
		String textToReturn = null;
		try {
			textToReturn = elementLocator.getText();
		}
		catch(Exception e) {
			throw new Exception(e.getCause().toString());
		}
		
		return textToReturn;
	}
	
	/**
	 * Get text from textbox using Selenium By locator
	 * 
	 * @author Mohit Gupta
	 * 
	 * @param byLocator Selenium By locator
	 * @return			Text present in textbox
	 * @throws Exception
	 */
	public String getTextFromTextboxUsingBy(By byLocator) throws Exception {
		String textToReturn = null;
		try {
			WebElement element = findElement.findWebElement(byLocator);
			textToReturn = element.getAttribute("value");
		}
		catch(Exception e) {
			throw new Exception(e.getCause().toString());
		}
		
		return textToReturn;
	}

	/**
	 * Get text of textbox using Selenium WebElement
	 * 
	 * @author Mohit Gupta
	 * 
	 * @param byLocator Selenium WebElement
	 * @return			Text present in textbox
	 * @throws Exception
	 */
	public String getTextFromTextboxUsingWebElement(WebElement elementLocator) throws Exception {
		String textToReturn = null;
		try {
			textToReturn = elementLocator.getAttribute("value");
		}
		catch(Exception e) {
			throw new Exception(e.getCause().toString());
		}
		return textToReturn;
	}
	
	/**
	 * Get attribute value using Selenium By locator
	 * 
	 * @author Mohit Gupta
	 * 
	 * @param byLocator Selenium By locator
	 * @param attributeName Attribute of whose value is required
	 * @return				Value of attribute
	 * @throws Exception
	 */
	public String getAttributeUsingBy(By byLocator, String attributeName) throws Exception {
		String attributeValue = null;
		try {
			WebElement element = findElement.findWebElement(byLocator);
			ArrayList<String> attributes = findElement.getAllAttributes(element);
			if(attributes.contains(attributeName)) {
				attributeValue = element.getAttribute(attributeName);
			}
			else {
				throw new NoSuchAttributeException();
			}
		}
		catch(NoSuchAttributeException e) {
			throw new NoSuchAttributeException("Attribute with name " + attributeName + " is not present in the HTML node");
		}
		catch(Exception e) {
			throw new Exception(e.getCause().toString());
		}
		return attributeValue;
	}
	
	/**
	 * Get attribute value using Selenium WebElement
	 * 
	 * @author Mohit Gupta
	 * 
	 * @param byLocator Selenium WebElement
	 * @param attributeName Attribute of whose value is required
	 * @return				Value of attribute
	 * @throws Exception
	 */
	public String getAttributeUsingWebElement(WebElement elementLocator, String attributeName) throws Exception {
		String attributeValue = null;
		try {
			ArrayList<String> attributes = findElement.getAllAttributes(elementLocator);
			if(attributes.contains(attributeName)) {
				attributeValue = elementLocator.getAttribute(attributeName);
			}
			else {
				throw new NoSuchAttributeException();
			}
		}
		catch(NoSuchAttributeException e) {
			throw new NoSuchAttributeException("Attribute with name " + attributeName + " is not present in the HTML node");
		}
		catch(Exception e) {
			throw new Exception(e.getCause().toString());
		}
		return attributeValue;
	}
	
	/**
	 * Get text from Alert box
	 * 
	 * @author Mohit Gupta
	 * 
	 * @return Text present in Alert
	 * @throws Exception
	 */
	public String getTextFromAlert() throws Exception {
		String alertText = null;
		try {
			alertText = driver.switchTo().alert().getText();
		}
		catch(NoAlertPresentException e) {
			throw new NoAlertPresentException("Alert is not present");
		}
		catch(Exception e) {
			throw new Exception(e.getCause().toString());
		}
		
		return alertText;
	}
	
	/**
	 * Is web element with Selenium By locator visible
	 * 
	 * @author Mohit Gupta
	 * 
	 * @param byLocator Selenium By locator
	 * @return			true if element is visible, false otherwise
	 * @throws Exception
	 */
	public boolean isElementVisibleUsingBy(By byLocator) throws Exception {
		boolean isElementVisible = false;
		try {
			WebElement element = findElement.findWebElement(byLocator);
			isElementVisible = element.isDisplayed();
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
	 * Is web element with Selenium WebElement visible
	 * 
	 * @author Mohit Gupta
	 * 
	 * @param elementLocator Selenium WebElement
	 * @return				 true if element is visible, false otherwise
	 * @throws Exception
	 */
	public boolean isElementVisibleUsingWebElement(WebElement elementLocator) throws Exception {
		boolean isElementVisible = false;
		try {
			isElementVisible = elementLocator.isDisplayed();
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
	 * Is web element with Selenium By locator enable
	 * 
	 * @author Mohit Gupta
	 * 
	 * @param byLocator Selenium By locator
	 * @return			true if element is enable, false otherwise
	 * @throws Exception
	 */
	public boolean isElementEnableUsingBy(By byLocator) throws Exception {
		boolean isElementEnable = false;
		try {
			WebElement element = findElement.findWebElement(byLocator);
			isElementEnable = element.isEnabled();
		}
		catch(Exception e) {
			throw new Exception(e.getCause().toString());
		}
		return isElementEnable;
	}
	
	/**
	 * Is web element with Selenium WebElement enable
	 * 
	 * @author Mohit Gupta
	 * 
	 * @param elementLocator Selenium WebElement
	 * @return				 true if element is enable, false otherwise
	 * @throws Exception
	 */
	public boolean isElementEnableUsingWebElement(WebElement elementLocator) throws Exception {
		boolean isElementEnable = false;
		try {
			isElementEnable = elementLocator.isEnabled();
		}
		catch(Exception e) {
			throw new Exception(e.getCause().toString());
		}
		return isElementEnable;
	}
	
	/**
	 * Is web element with Selenium By locator present in HTML
	 * 
	 * @author Mohit Gupta
	 * 
	 * @param elementLocator Selenium By locator
	 * @return				 true if element is present in HTML, false otherwise
	 * @throws Exception
	 */
	public boolean isElementPresentUsingBy(By byLocator) throws Exception {
		boolean isElementPresent = false;
		try {
			List<WebElement> elements = findElement.findWebElements(byLocator);
			if(elements.size() > 0) {
				isElementPresent = true;
			}
		}
		catch(Exception e) {
		 throw new Exception(e.getCause().toString());
		}
		
		return isElementPresent;
	}
	
	/**
	 * Is web element selected with Selenium By locator
	 * 
	 * @author Mohit Gupta
	 * 
	 * @param elementLocator Selenium By locator
	 * @return				 true if web element is Selected. false otherwise
	 * @throws Exception
	 */
	public boolean isElementSelectedUsingBy(By byLocator) throws Exception {
		boolean isElementSelected = false;
		try {
			WebElement element = findElement.findWebElement(byLocator);
			isElementSelected = element.isSelected();
		}
		catch(Exception e) {
		 throw new Exception(e.getCause().toString());
		}
		
		return isElementSelected;
	}
	
	/**
	 * Is web element selected with Selenium WebElement
	 * 
	 * @author Mohit Gupta
	 * 
	 * @param elementLocator Selenium WebElement
	 * @return				 true if web element is Selected. false otherwise
	 * @throws Exception
	 */
	public boolean isElementSelectedUsingWebElement(WebElement elementLocator) throws Exception {
		boolean isElementSelected = false;
		try {
			isElementSelected = elementLocator.isSelected();
		}
		catch(Exception e) {
		 throw new Exception(e.getCause().toString());
		}
		
		return isElementSelected;
	}
	
	/**
	 * Drag and drop an element using Selenium WebElement
	 * 
	 * @author Mohit Gupta
	 * 
	 * @param sourceLocator Selenium WebElement
	 * @param destinationLocator Selenium WebElement
	 */
	public void dragAndDropUsingWebElement(WebElement sourceLocator, WebElement destinationLocator) {
		action.dragAndDrop(sourceLocator, destinationLocator).build().perform();
	}
	
	/**
	 * Wait for page to load ocmpletely
	 * 
	 * @author Mohit Gupta
	 */
	public void waitForPageToLoad() {
		
		String pageLocadStatus = null;
		
		do {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			pageLocadStatus = (String) js.executeScript("return document.readyState");
		}while(!pageLocadStatus.equals("complete"));
	}
}