package com.seleniummadeeasy.findelement;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.seleniummadeeasy.locators.AngularLocators.AngularLocator;

public class FindAngularElement {
	
	WebDriver driver;
	FindWebElement findWebElement;
	
	public FindAngularElement(WebDriver driver) {
		this.driver = driver;
		findWebElement = new FindWebElement(this.driver);
	}
	
	/**
	 * Get selenium WebElement from Angular specific locators
	 * 
	 * @author Mohit Gupta
	 * 
	 * @param angualarLocator Angular locator
	 * @param locatorValue	Value of angular attribute 
	 * @return				Selenium WebElement
	 * @throws Exception
	 */
	public WebElement getWebElementFromAngularLocator(AngularLocator angualarLocator, String locatorValue) throws Exception {
		WebElement element = null;
		String locator = null;
		try {
			switch(angualarLocator) {
				case ngModel:
					locator = "ng-model";
					element = getAngularWebElement(locator, locatorValue);
					break;
				case ngBind:
					locator = "ng-bind";
					element = getAngularWebElement(locator, locatorValue);
					break;
				case ngOptions:
					locator = "ng-options";
					element = getAngularWebElement(locator, locatorValue);
					break;
				case ngSwitch:
					locator = "ng-switch";
					element = getAngularWebElement(locator, locatorValue);
					break;
				default: 
					break;
			}
		}
		catch(NoSuchElementException e) {
			throw new Exception(e.getCause().toString());
		}
		catch(ElementNotVisibleException e) {
			throw new Exception(e.getCause().toString());
		}
		catch(ElementNotInteractableException e) {
			throw new Exception(e.getCause().toString());
		}
		catch(Exception e) {
			throw new Exception(e.getCause().toString());
		}
		return element;
	}
	
	/**
	 * Get Selenium By locator from Angular specific locator
	 * 
	 * @author Mohit Gupta
	 * 
	 * @param angualarLocator Angular locator
	 * @param locatorValue	Value of angular attribute 
	 * @return				Selenium By locator
	 * @throws Exception
	 */
	public By getByLocatorFromAngularLocator(AngularLocator angualarLocator, String locatorValue) throws Exception {
		By byLocator = null;
		String locator = null;
		try {
			switch(angualarLocator) {
				case ngModel:
					locator = "ng-model";
					byLocator = getAngularElementByLocator(locator, locatorValue);
					break;
				case ngBind:
					locator = "ng-bind";
					byLocator = getAngularElementByLocator(locator, locatorValue);
					break;
				case ngOptions:
					locator = "ng-options";
					byLocator = getAngularElementByLocator(locator, locatorValue);
					break;
				case ngSwitch:
					locator = "ng-switch";
					byLocator = getAngularElementByLocator(locator, locatorValue);
					break;
				default: 
					break;
			}
		}
		catch(NoSuchElementException e) {
			throw new Exception(e.getCause().toString());
		}
		catch(ElementNotVisibleException e) {
			throw new Exception(e.getCause().toString());
		}
		catch(ElementNotInteractableException e) {
			throw new Exception(e.getCause().toString());
		}
		catch(Exception e) {
			throw new Exception(e.getCause().toString());
		}
		return byLocator;
	}
	
	/**
	 * Get list of Selenium WebElements using Angular specific locator
	 * 
	 * @author Mohit Gupta
	 * 
	 * @param angualarLocator Angular locator
	 * @param locatorValue	Value of angular attribute 
	 * @return				List of Selenium WebElements
	 * @throws Exception
	 */
	public List<WebElement> getWebElementsFromAngularLocator(AngularLocator angularLocator, String locatorValue) throws Exception {
		List<WebElement> elements = null;
		String locator = null;
		try {
			switch(angularLocator) {
				case ngRepeater:
					locator = "ng-repeat";
					elements = getAngularWebElements(locator, locatorValue);
					break;
				default: 
					break;
			}
			
		}
		catch(Exception e) {
			throw new Exception(e.getCause().toString());
		}
		return elements;
	}
	
	/**
	 * Get Selenium WebElement from Angular attribute
	 * 
	 * @author Mohit Gupta
	 * 
	 * @param angualarLocator HTML Attribute of angular element
	 * @param locatorValue	Value of angular attribute 
	 * @return				Selenium WebElement
	 * @throws Exception
	 */
	private WebElement getAngularWebElement(String angularLocator, String locatorValue) throws Exception {
		WebElement element = null;
		List<WebElement> elements;
		ArrayList<String> attributes = new ArrayList<String>();
		try {
			String queryToFindAllNodesInHTML = "return document.querySelectorAll(*)";
			elements = (List<WebElement>) ((JavascriptExecutor)driver).executeScript(queryToFindAllNodesInHTML);
			for(WebElement ele : elements) {
				attributes = findWebElement.getAllAttributes(ele);
				for(String attr : attributes) {
					if(attr.contains(angularLocator)) {
						if(ele.getAttribute(attr) == locatorValue) {
							element = ele;
							break;	
						}
					}
				}
				if(element != null) {
					break;
				}
			}
			if(element == null) {
				throw new NoSuchElementException("No Angular element with locator " + angularLocator + "=" +
										locatorValue + "is found");
			}
			if(!element.isDisplayed()) {
				throw new ElementNotVisibleException("Angular element with locator " + angularLocator + "=" +
						locatorValue + "is not visible");
			}
			if(!element.isEnabled()){
				throw new ElementNotVisibleException("Angular element with locator " + angularLocator + "=" +
						locatorValue + "is not enable");
			}
		}
		catch(NoSuchElementException e) {
			throw new Exception(e.getCause().toString());
		}
		catch(ElementNotVisibleException e) {
			throw new Exception(e.getCause().toString());
		}
		catch(ElementNotInteractableException e) {
			throw new Exception(e.getCause().toString());
		}
		catch(Exception e) {
			throw new Exception(e.getCause().toString());
		}
		return element;
	}
	
	/**
	 * Get Selenium By locator from Angular attribute
	 * 
	 * @author Mohit Gupta
	 * 
	 * @param angualarLocator HTML Attribute of angular element
	 * @param locatorValue	Value of angular attribute 
	 * @return				Selenium By locator
	 * @throws Exception
	 */
	private By getAngularElementByLocator(String angularLocator, String locatorValue) throws Exception {
		WebElement element = null;
		By byLocator = null;
		List<WebElement> elements;
		ArrayList<String> attributes = new ArrayList<String>();
		try {
			String queryToFindAllNodesInHTML = "return document.querySelectorAll(*)";
			elements = (List<WebElement>) ((JavascriptExecutor)driver).executeScript(queryToFindAllNodesInHTML);
			for(WebElement ele : elements) {
				attributes = findWebElement.getAllAttributes(ele);
				for(String attr : attributes) {
					if(attr.contains(angularLocator)) {
						if(ele.getAttribute(attr) == locatorValue) {
							element = ele;
							byLocator = By.cssSelector(ele.getTagName() + "[" + attr + "*=" + locatorValue + "]");
							break;	
						}
					}
				}
				if(element != null) {
					break;
				}
			}
			if(element == null) {
				throw new NoSuchElementException("No Angular element with locator " + angularLocator + "=" +
										locatorValue + "is found");
			}
			if(!element.isDisplayed()) {
				throw new ElementNotVisibleException("Angular element with locator " + angularLocator + "=" +
						locatorValue + "is not visible");
			}
			if(!element.isEnabled()){
				throw new ElementNotVisibleException("Angular element with locator " + angularLocator + "=" +
						locatorValue + "is not enable");
			}
		}
		catch(NoSuchElementException e) {
			throw new Exception(e.getCause().toString());
		}
		catch(ElementNotVisibleException e) {
			throw new Exception(e.getCause().toString());
		}
		catch(ElementNotInteractableException e) {
			throw new Exception(e.getCause().toString());
		}
		catch(Exception e) {
			throw new Exception(e.getCause().toString());
		}
		return byLocator;
	}
	
	/**
	 * Get List of Selenium WebElements from Angular attribute
	 * 
	 * @author Mohit Gupta
	 * 
	 * @param angualarLocator HTML Attribute of angular element
	 * @param locatorValue	Value of angular attribute 
	 * @return				List of Selenium WebElements
	 * @throws Exception
	 */
	private List<WebElement> getAngularWebElements(String angularLocator, String locatorValue) throws Exception {
		List<WebElement> elements;
		List<WebElement> elementsToReturn = null;
		ArrayList<String> attributes = new ArrayList<String>();
		try {
			String queryToFindAllNodesInHTML = "return document.querySelectorAll(*)";
			elements = (List<WebElement>) ((JavascriptExecutor)driver).executeScript(queryToFindAllNodesInHTML);
			for(WebElement ele : elements) {
				attributes = findWebElement.getAllAttributes(ele);
				for(String attr : attributes) {
					if(attr.contains(angularLocator)) {
						if(ele.getAttribute(attr) == locatorValue) {
							elementsToReturn.add(ele);
							break;	
						}
					}
				}
			}
		}
		catch(Exception e) {
			throw new Exception(e.getCause().toString());
		}
		return elements;
	}

}
