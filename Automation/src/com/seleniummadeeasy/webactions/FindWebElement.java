package com.seleniummadeeasy.webactions;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.InvalidSelectorException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FindWebElement {
	
	WebDriver driver;
	WebDriverWait wait;
	
	final int WAIT_TIMEOUT = 60;
	
	public FindWebElement(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(this.driver, WAIT_TIMEOUT);
	}
	
	public WebElement findWebElement(By byLocator) throws Exception {
		WebElement element;
		try {
			element = driver.findElement(byLocator);
			scrollToWebElement(element);
		}
		catch(InvalidSelectorException e) {
			throw new InvalidSelectorException("Locator provided in locator " + byLocator + " is invalid");
		}
		catch(NoSuchElementException e) {
			throw new NoSuchElementException("WebElement using locator " + byLocator + " is not found on web page");
		}
		catch(ElementNotVisibleException e) {
			throw new ElementNotVisibleException("WebElement using locator " + byLocator + " is not visible on web page");
		}
		catch(ElementNotInteractableException e) {
			throw new ElementNotInteractableException("WebElement using locator " + byLocator + " is not interactable on web page");
		}
		catch(Exception e) {
			throw new Exception(e.getCause().toString());
		}
		
		return element;
	}
	
	public Select findDropdownElement(By byLocator) throws Exception {
		Select element;
		try {
			WebElement elementLocator = driver.findElement(byLocator);
			element = new Select(elementLocator);
			scrollToWebElement(elementLocator);
		}
		catch(InvalidSelectorException e) {
			throw new InvalidSelectorException("Locator provided in locator " + byLocator + " is invalid");
		}
		catch(NoSuchElementException e) {
			throw new NoSuchElementException("WebElement using locator " + byLocator + " is not found on web page");
		}
		catch(ElementNotVisibleException e) {
			throw new ElementNotVisibleException("WebElement using locator " + byLocator + " is not visible on web page");
		}
		catch(ElementNotInteractableException e) {
			throw new ElementNotInteractableException("WebElement using locator " + byLocator + " is not interactable on web page");
		}
		catch(Exception e) {
			throw new Exception(e.getCause().toString());
		}
		
		return element;
	}
	
	public void scrollToWebElement(WebElement elementLocator) {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true)", elementLocator);
	}
}
