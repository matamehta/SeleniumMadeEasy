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

	public void setImplicitWait() {
		driver.manage().timeouts().implicitlyWait(WAIT_TIMEOUT, TimeUnit.SECONDS);
	}
}
