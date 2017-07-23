package com.seleniummadeeasy.webactions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitActions {
	
	WebDriver driver;
	WebDriverWait wait;
	
	final int WAIT_TIMEOUT = 60;
	
	public WaitActions(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(this.driver, WAIT_TIMEOUT);
	}
	
	/**
	 * Wait for specific text in web element given using Selenium By locator
	 * 
	 * @author Mohit Gupta
	 * 
	 * @param byLocator Selenium By locator
	 * @param text Text to wait in web element
	 * @throws Exception
	 */
	public void waitForTextInElementUsingBy(By byLocator, String text) throws Exception {
		try {
			wait.until(ExpectedConditions.textToBePresentInElementLocated(byLocator, text));
		}
		catch(TimeoutException e) {
			throw new TimeoutException("Text " + text + " could not be found in element using locator " + 
											byLocator + " in " + WAIT_TIMEOUT + " seconds");
		}
		catch(Exception e) {
			throw new Exception(e.getCause().toString());
		}
	}
	
	/**
	 * Wait for specific text in web element given using Selenium WebElement
	 * 
	 * @author Mohit Gupta
	 * 
	 * @param elementLocator Selenium WebElement
	 * @param text Text to wait in web element
	 * @throws Exception
	 */
	public void waitForTextInElementUsingWebElement(WebElement elementLocator, String text) throws Exception {
		try {
			wait.until(ExpectedConditions.textToBePresentInElementValue(elementLocator, text));
		}
		catch(TimeoutException e) {
			throw new TimeoutException("Text " + text + " could not be found in element " + 
					elementLocator + " in " + WAIT_TIMEOUT + " seconds");
		}
		catch(Exception e) {
			throw new Exception(e.getCause().toString());
		}
	}
	
	/**
	 * Wait for exact text in web element using Selenium By locator
	 * 
	 * @author Mohit Gupta
	 * 
	 * @param elementLocator Selenium WebElement
	 * @param text Exact text to wait in web element
	 * @throws Exception
	 */
	public void waitForExactTextInElementUsingBy(By byLocator, String text) throws Exception {
		try {
			wait.until(ExpectedConditions.textToBe(byLocator, text));
		}
		catch(TimeoutException e) {
			throw new TimeoutException("Text " + text + " could not be found in element using locator " + 
											byLocator + " in " + WAIT_TIMEOUT + " seconds");
		}
		catch(Exception e) {
			throw new Exception(e.getCause().toString());
		}
	}
	
	/**
	 * Wait for web element to be visible using Selenium By locator
	 * 
	 * @author Mohit Gupta
	 * 
	 * @param byLocator Selenium By locator
	 * @throws Exception
	 */
	public void waitForElementToBeVisibleUsingBy(By byLocator) throws Exception {
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(byLocator));
		}
		catch(TimeoutException e) {
			throw new TimeoutException("Element with locator " + byLocator + " is not visible after " + WAIT_TIMEOUT + " seconds");
		}
		catch(Exception e) {
			throw new Exception(e.getCause().toString());
		}
	}
	
	/**
	 * Wait for web element to be visible using Selenium WebElement
	 * 
	 * @author Mohit Gupta
	 * 
	 * @param elementLocator Selenium WebElement
	 * @throws Exception
	 */
	public void waitForElementToBeVisibleUsingWebElement(WebElement elementLocator) throws Exception {
		try {
			wait.until(ExpectedConditions.visibilityOf(elementLocator));
		}
		catch(TimeoutException e) {
			throw new TimeoutException("Element with locator " + elementLocator + " is not visible after " + 
											WAIT_TIMEOUT + " seconds");
		}
		catch(Exception e) {
			throw new Exception(e.getCause().toString());
		}
	}
	
	/**
	 * Wait for all web elements to be visible using Selenium By locator
	 * 
	 * @author Mohit Gupta
	 * 
	 * @param byLocator Selenium By locator
	 * @throws Exception
	 */
	public void waitForAllElementToBeVisibleUsingBy(By byLocator) throws Exception {
		try {
			wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(byLocator));
		}
		catch(TimeoutException e) {
			throw new TimeoutException("All elements with locator " + byLocator + " is not visible after " +
												WAIT_TIMEOUT + " seconds");
		}
		catch(Exception e) {
			throw new Exception(e.getCause().toString());
		}
	}
	
	/**
	 * Wait for all web elements to be visible using Selenium WebElement
	 * 
	 * @author Mohit Gupta
	 * 
	 * @param elements List of Selenium WebElement
	 * @throws Exception
	 */
	public void waitForAllElementToBeVisibleUsingWebElement(List<WebElement> elements) throws Exception {
		try {
			wait.until(ExpectedConditions.visibilityOfAllElements(elements));
		}
		catch(TimeoutException e) {
			throw new TimeoutException("All elements " + elements + " is not visible after " +
												WAIT_TIMEOUT + " seconds");
		}
		catch(Exception e) {
			throw new Exception(e.getCause().toString());
		}
	}
	
	/**
	 * Wait for alert to be present on screen
	 * 
	 * @author Mohit Gupta
	 * 
	 * @throws Exception
	 */
	public void waitForAlertToBePresent() throws Exception {
		try {
			wait.until(ExpectedConditions.alertIsPresent());
		}
		catch(TimeoutException e) {
			throw new TimeoutException("Alert is not present after " + WAIT_TIMEOUT + " seconds");
		}
		catch(Exception e) {
			throw new Exception(e.getCause().toString());
		}
	}
	
	/**
	 * Wait for frame having an index to be present and switch to it 
	 * 
	 * @author Mohit Gupta
	 * 
	 * @param index Index of Frame in HTML
	 * @throws Exception
	 */
	public void waitForFrameAndSwitchUsingIndex(int index) throws Exception {
		try {
			wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(index-1));
		}
		catch(TimeoutException e) {
			throw new TimeoutException("Frame with index " + index + " is not presnet after " + WAIT_TIMEOUT + " seconds");
		}
		catch(Exception e) {
			throw new Exception(e.getCause().toString());
		}
	}
	
	/**
	 * Wait for frame with name to be present and switch to it
	 * 
	 * @author Mohit Gupta
	 * 
	 * @param frameName Name of frame
	 * @throws Exception
	 */
	public void waitForFrameAndSwitchUsingString(String frameName) throws Exception {
		try {
			wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameName));
		}
		catch(TimeoutException e) {
			throw new TimeoutException("Frame with name " + frameName + " is not presnet after " + WAIT_TIMEOUT + " seconds");
		}
		catch(Exception e) {
			throw new Exception(e.getCause().toString());
		}
	}
	
	/**
	 * Wait for frame with Selenium By locator to be present and switch to it
	 * 
	 * @author Mohit Gupta
	 * 
	 * @param byLocator Selenium By locator
	 * @throws Exception
	 */
	public void waitForFrameAndSwitchUsingIndexUsingBy(By byLocator) throws Exception {
		try {
			wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(byLocator));
		}
		catch(TimeoutException e) {
			throw new TimeoutException("Frame with locator " + byLocator + " is not presnet after " + WAIT_TIMEOUT + " seconds");
		}
		catch(Exception e) {
			throw new Exception(e.getCause().toString());
		}
	}
	
	/**
	 * Wait for frame with Selenium WebElement to be present and switch to it
	 * 
	 * @author Mohit Gupta
	 * 
	 * @param elementLocator Selenium WebElement
	 * @throws Exception
	 */
	public void waitForFrameAndSwitchUsingIndexUsingWebElement(WebElement elementLocator) throws Exception {
		try {
			wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(elementLocator));
		}
		catch(TimeoutException e) {
			throw new TimeoutException("Frame with element " + elementLocator + " is not presnet after " + WAIT_TIMEOUT + " seconds");
		}
		catch(Exception e) {
			throw new Exception(e.getCause().toString());
		}
	}
	
	/**
	 * Wait for attribute to contain specific value using Selenium By locator
	 * 
	 * @author Mohit Gupta
	 * 
	 * @param byLocator Selenium By locator
	 * @param attribute HTML attribute of web element
	 * @param value Value to be present in attribute
	 * @throws Exception
	 */
	public void waitForAttributeInElementUsingBy(By byLocator, String attribute, String value) throws Exception {
		try {
			wait.until(ExpectedConditions.attributeContains(byLocator, attribute, value));
		}
		catch(TimeoutException e) {
			throw new TimeoutException("Value " + value + " is not found in attribute " + attribute + " after " +
												WAIT_TIMEOUT + " seconds");
		}
		catch(Exception e) {
			throw new Exception(e.getCause().toString());
		}
	}
	
	/**
	 * Wait for attribute to contain specific value using Selenium WebElement
	 * 
	 * @author Mohit Gupta
	 * 
	 * @param elementLocator Selenium WebElement
	 * @param attribute HTML attribute of web element
	 * @param value Value to be present in attribute
	 * @throws Exception
	 */
	public void waitForAttributeInElementUsingWebElement(WebElement elementLocator, String attribute, String value) throws Exception {
		try {
			wait.until(ExpectedConditions.attributeContains(elementLocator, attribute, value));
		}
		catch(TimeoutException e) {
			throw new TimeoutException("Value " + value + " is not found in attribute " + attribute + " after " +
												WAIT_TIMEOUT + " seconds");
		}
		catch(Exception e) {
			throw new Exception(e.getCause().toString());
		}
	}
	
	/**
	 * Wait for attribute to have exact value using Selenium By locator
	 * 
	 * @author Mohit Gupta
	 * 
	 * @param byLocator Selenium By locator
	 * @param attribute HTML attribute of web element
	 * @param value Value to be present in attribute
	 * @throws Exception
	 */
	public void waitForExactAttributeInElementUsingBy(By byLocator, String attribute, String value) throws Exception {
		try {
			wait.until(ExpectedConditions.attributeToBe(byLocator, attribute, value));
		}
		catch(TimeoutException e) {
			throw new TimeoutException("Value " + value + " is not found in attribute " + attribute + " after " +
												WAIT_TIMEOUT + " seconds");
		}
		catch(Exception e) {
			throw new Exception(e.getCause().toString());
		}
	}
	
	/**
	 * Wait for attribute to have exact value using Selenium WebElement
	 * 
	 * @author Mohit Gupta
	 * 
	 * @param elementLocator Selenium WebElement
	 * @param attribute HTML attribute of web element
	 * @param value Value to be present in attribute
	 * @throws Exception
	 */
	public void waitForExactAttributeInElementUsingWebElement(WebElement elementLocator, String attribute, String value) throws Exception {
		try {
			wait.until(ExpectedConditions.attributeToBe(elementLocator, attribute, value));
		}
		catch(TimeoutException e) {
			throw new TimeoutException("Value " + value + " is not found in attribute " + attribute + " after " +
												WAIT_TIMEOUT + " seconds");
		}
		catch(Exception e) {
			throw new Exception(e.getCause().toString());
		}
	}

	/**
	 * Wait for element to be clickable using Selenium By locator
	 * 
	 * @author Mohit Gupta
	 * 
	 * @param byLocator Selenium by locator
	 * @throws Exception
	 */
	public void waitForElementToBeClickable(By byLocator) throws Exception {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(byLocator));
		}
		catch(TimeoutException e) {
			throw new TimeoutException("WebElement using locator " + byLocator + " is not clickable on web page");
		}
		catch(Exception e) {
			throw new Exception(e.getCause().toString());
		}
	}
	
	/**
	 * Wait for element to be clickable using Selenium WebElement
	 * 
	 * @author Mohit Gupta
	 * 
	 * @param byLocator Selenium WebElement
	 * @throws Exception
	 */
	public void waitForElementToBeClickable(WebElement elementLocator) throws Exception {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(elementLocator));
		}
		catch(TimeoutException e) {
			throw new TimeoutException("WebElement using locator " + elementLocator + " is not clickable on web page");
		}
		catch(Exception e) {
			throw new Exception(e.getCause().toString());
		}
	}

	/**
	 * Set Implicit Wait at WebDriver instance
	 * @param driver Selenium WebDriver
	 */
	public void setImplicitWait(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(WAIT_TIMEOUT, TimeUnit.SECONDS);
	}
}
