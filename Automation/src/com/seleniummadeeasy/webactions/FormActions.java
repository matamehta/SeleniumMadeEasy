package com.seleniummadeeasy.webactions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.InvalidSelectorException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.seleniummadeeasy.exceptions.NoSuchAttributeException;

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
	
	public void enterTextUsingWebElement(WebElement elementLocator, String text) throws Exception {
		try {
			action.sendKeys(elementLocator, text).build().perform();
			waitForPageToLoad();
		}
		catch(Exception e) {
			throw new Exception(e.getCause().toString());
		}
	}
	
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
	
	public void checkUsingBy(By byLocator) throws Exception {
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
	
	public void checkUsingWebElement(WebElement elementLocator) throws Exception {
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
	
	public void unCheckUsingBy(By byLocator) throws Exception {
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
	
	public void unCheckUsingWebElement(WebElement elementLocator) throws Exception {
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
	
	public void selectDropdownByTextUsinWebElement(Select dropdownElement, String option) throws Exception {
		try {
			dropdownElement.selectByVisibleText(option);
			waitForPageToLoad();
		}
		catch(Exception e) {
			throw new Exception(e.getCause().toString());
		}
	}
	
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
	
	public void selectDropdownByIndexUsinWebElement(Select dropdownElement, int index) throws Exception {
		try {
			dropdownElement.selectByIndex(index-1);
			waitForPageToLoad();
		}
		catch(Exception e) {
			throw new Exception(e.getCause().toString());
		}
	}
	
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
	
	public void selectDropdownByValueUsinWebElement(Select dropdownElement, String value) throws Exception {
		try {
			dropdownElement.selectByValue(value);
			waitForPageToLoad();
		}
		catch(Exception e) {
			throw new Exception(e.getCause().toString());
		}
	}
	
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
	
	public void hoverUsingWebElement(WebElement elementLocator) throws Exception {
		try {
			action.moveToElement(elementLocator).build().perform();
			waitForPageToLoad();
		}
		catch(Exception e) {
			throw new Exception(e.getCause().toString());
		}
	}
	
	public String getTextUsingBy(By byLocator) throws Exception {
		String textToReturn = null;
		try {
			WebElement element = findElement.findWebElement(byLocator);
			textToReturn = element.getText();
		}
		catch(Exception e) {
			throw new Exception(e.getCause().toString());
		}
		
		return textToReturn;
	}
	
	public String getTextUsingBy(WebElement elementLocator) throws Exception {
		String textToReturn = null;
		try {
			textToReturn = elementLocator.getText();
		}
		catch(Exception e) {
			throw new Exception(e.getCause().toString());
		}
		
		return textToReturn;
	}
	
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
	
	public ArrayList<String> getAllAttributes(WebElement elementLocator) throws Exception {
		ArrayList<String> attributes;
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			attributes = (ArrayList<String>) js.executeScript(
					"var items = {};"
				  + "for (index = 0; index < arguments[0].attributes.length; ++index)"
				  + "{ "
				  + "items[arguments[0].attributes[index].name] = arguments[0].attributes[index].value"
				  + " };"
				  + " return items;",
				  elementLocator);
		}
		catch(Exception e) {
			throw new Exception(e.getCause().toString());
		}
		return attributes;
	}
	
	public String getAttributeUsingBy(By byLocator, String attributeName) throws Exception {
		String attributeValue = null;
		try {
			WebElement element = findElement.findWebElement(byLocator);
			ArrayList<String> attributes = getAllAttributes(element);
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
	
	public String getAttributeUsingWebElement(WebElement elementLocator, String attributeName) throws Exception {
		String attributeValue = null;
		try {
			ArrayList<String> attributes = getAllAttributes(elementLocator);
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
	
	public Boolean isElementVisibleUsingBy(By byLocator) throws Exception {
		Boolean isElementVisible = false;
		try {
			WebElement element = findElement.findWebElement(byLocator);
			isElementVisible = element.isDisplayed();
		}
		catch(Exception e) {
			if(e instanceof NoSuchElementException) {
				isElementVisible = false;
			}
			else if(e instanceof ElementNotVisibleException) {
				isElementVisible = false;
			}
			else {
				throw new Exception(e.getCause().toString());
			}
		}
		return isElementVisible;
	}
	
	public Boolean isElementVisibleUsingWebElement(WebElement elementLocator) throws Exception {
		Boolean isElementVisible = false;
		try {
			isElementVisible = elementLocator.isDisplayed();
		}
		catch(Exception e) {
			throw new Exception(e.getCause().toString());
		}
		
		return isElementVisible;
	}
	
	public Boolean isElementEnableUsingBy(By byLocator) throws Exception {
		Boolean isElementEnable = false;
		try {
			WebElement element = findElement.findWebElement(byLocator);
			isElementEnable = element.isEnabled();
		}
		catch(Exception e) {
			throw new Exception(e.getCause().toString());
		}
		return isElementEnable;
	}
	
	public Boolean isElementEnableUsingWebElement(WebElement elementLocator) throws Exception {
		Boolean isElementEnable = false;
		try {
			isElementEnable = elementLocator.isEnabled();
		}
		catch(Exception e) {
			throw new Exception(e.getCause().toString());
		}
		return isElementEnable;
	}
	
	public Boolean isElementPresentUsingBy(By byLocator) throws Exception {
		Boolean isElementPresent = false;
		try {
			List<WebElement> elements = driver.findElements(byLocator);
			if(elements.size() > 0) {
				isElementPresent = true;
			}
		}
		catch(InvalidSelectorException e) {
			throw new InvalidSelectorException("Locator provided in locator " + byLocator + " is invalid");
		}
		catch(Exception e) {
		 throw new Exception(e.getCause().toString());
		}
		
		return isElementPresent;
	}
	
	public void waitForPageToLoad() {
		
		String pageLocadStatus = null;
		
		do {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			pageLocadStatus = (String) js.executeScript("return document.readyState");
		}while(!pageLocadStatus.equals("complete"));
	}
}