package com.seleniummadeeasy.webactions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.seleniummadeeasy.findelement.FindAngularElement;
import com.seleniummadeeasy.locators.AngularLocators.AngularLocator;

public class TableActionsOnAngularApp {
	
	WebDriver driver;
	FindAngularElement findAngularElement;
	TableActions tableActions;
	
	public TableActionsOnAngularApp(WebDriver driver) {
		this.driver = driver;
		findAngularElement = new FindAngularElement(this.driver);
		tableActions = new TableActions(this.driver);
	}
	
	public int getRecordCountp(AngularLocator angularRowLocator, String rowLocatorValue, Boolean isFirstRowHeader) throws Exception {
		int countOfRecords = 0;
		List<WebElement> elements;
		try {
			elements = findAngularElement.getWebElementsFromAngularLocator(angularRowLocator, rowLocatorValue);
			if(isFirstRowHeader) {
				countOfRecords = elements.size()-1;
			}
			else {
				countOfRecords = elements.size();
			}
		}
		catch(Exception e) {
			throw new Exception(e.getCause().toString());
		}
		return countOfRecords;
	}
	
	public void enterTextInAColumnBasedOnRowNumber(AngularLocator angularRowLocator, String rowLocatorValue, AngularLocator  angularColumnLocator, String columnLocatorValue, int rowNumber, Boolean isFirstRowHeader, String text) throws Exception {
		List<WebElement> rowsLocator;
		By byColumnLocator;
		try {
			rowsLocator = findAngularElement.getWebElementsFromAngularLocator(angularRowLocator, rowLocatorValue);
			byColumnLocator = findAngularElement.getByLocatorFromAngularLocator(angularColumnLocator, columnLocatorValue);
			tableActions.enterTextInAColumnBasedOnRowNumberUsingWebElements(rowsLocator, byColumnLocator, rowNumber, isFirstRowHeader, text);
		}
		catch(Exception e) {
			throw new Exception(e.getCause().toString());
		}
	}
	
	public void enterTextInAColumnBasedOnRowNumber(AngularLocator angularRowLocator, String rowLocatorValue, By byColumnLocator, int rowNumber, Boolean isFirstRowHeader, String text) throws Exception {
		List<WebElement> rowsLocator;
		try {
			rowsLocator = findAngularElement.getWebElementsFromAngularLocator(angularRowLocator, rowLocatorValue);
			tableActions.enterTextInAColumnBasedOnRowNumberUsingWebElements(rowsLocator, byColumnLocator, rowNumber, isFirstRowHeader, text);
		}
		catch(Exception e) {
			throw new Exception(e.getCause().toString());
		}
	}
	
	public void enterTextInAColumnBasedOnRowNumber(List<WebElement> rowsLocator, AngularLocator  angularColumnLocator, String columnLocatorValue, int rowNumber, Boolean isFirstRowHeader, String text) throws Exception {
		By byColumnLocator;
		try {
			byColumnLocator = findAngularElement.getByLocatorFromAngularLocator(angularColumnLocator, columnLocatorValue);
			tableActions.enterTextInAColumnBasedOnRowNumberUsingWebElements(rowsLocator, byColumnLocator, rowNumber, isFirstRowHeader, text);
		}
		catch(Exception e) {
			throw new Exception(e.getCause().toString());
		}
	}
	
	public void clickInAColumnBasedOnRowNumber(AngularLocator angularRowLocator, String rowLocatorValue, AngularLocator  angularColumnLocator, String columnLocatorValue, int rowNumber, Boolean isFirstRowHeader) throws Exception {
		List<WebElement> rowsLocator;
		By byColumnLocator;
		try {
			rowsLocator = findAngularElement.getWebElementsFromAngularLocator(angularRowLocator, rowLocatorValue);
			byColumnLocator = findAngularElement.getByLocatorFromAngularLocator(angularColumnLocator, columnLocatorValue);
			tableActions.clickInAColumnBasedOnRowNumberUsingWebElements(rowsLocator, byColumnLocator, rowNumber, isFirstRowHeader);
		}
		catch(Exception e) {
			throw new Exception(e.getCause().toString());
		}
	}
	
	public void clickInAColumnBasedOnRowNumber(AngularLocator angularRowLocator, String rowLocatorValue, By byColumnLocator, int rowNumber, Boolean isFirstRowHeader) throws Exception {
		List<WebElement> rowsLocator;
		try {
			rowsLocator = findAngularElement.getWebElementsFromAngularLocator(angularRowLocator, rowLocatorValue);
			tableActions.clickInAColumnBasedOnRowNumberUsingWebElements(rowsLocator, byColumnLocator, rowNumber, isFirstRowHeader);
		}
		catch(Exception e) {
			throw new Exception(e.getCause().toString());
		}
	}
	
	public void clickInAColumnBasedOnRowNumber(List<WebElement> rowsLocator, AngularLocator  angularColumnLocator, String columnLocatorValue, int rowNumber, Boolean isFirstRowHeader) throws Exception {
		By byColumnLocator;
		try {
			byColumnLocator = findAngularElement.getByLocatorFromAngularLocator(angularColumnLocator, columnLocatorValue);
			tableActions.clickInAColumnBasedOnRowNumberUsingWebElements(rowsLocator, byColumnLocator, rowNumber, isFirstRowHeader);
		}
		catch(Exception e) {
			throw new Exception(e.getCause().toString());
		}
	}
	
	public void checkInAColumnBasedOnRowNumber(AngularLocator angularRowLocator, String rowLocatorValue, AngularLocator  angularColumnLocator, String columnLocatorValue, int rowNumber, Boolean isFirstRowHeader) throws Exception {
		List<WebElement> rowsLocator;
		By byColumnLocator;
		try {
			rowsLocator = findAngularElement.getWebElementsFromAngularLocator(angularRowLocator, rowLocatorValue);
			byColumnLocator = findAngularElement.getByLocatorFromAngularLocator(angularColumnLocator, columnLocatorValue);
			tableActions.checkInAColumnBasedOnRowNumberUsingWebElements(rowsLocator, byColumnLocator, rowNumber, isFirstRowHeader);
		}
		catch(Exception e) {
			throw new Exception(e.getCause().toString());
		}
	}
	
	public void checkInAColumnBasedOnRowNumber(AngularLocator angularRowLocator, String rowLocatorValue, By byColumnLocator, int rowNumber, Boolean isFirstRowHeader) throws Exception {
		List<WebElement> rowsLocator;
		try {
			rowsLocator = findAngularElement.getWebElementsFromAngularLocator(angularRowLocator, rowLocatorValue);
			tableActions.checkInAColumnBasedOnRowNumberUsingWebElements(rowsLocator, byColumnLocator, rowNumber, isFirstRowHeader);
		}
		catch(Exception e) {
			throw new Exception(e.getCause().toString());
		}
	}
	
	public void checkInAColumnBasedOnRowNumber(List<WebElement> rowsLocator, AngularLocator  angularColumnLocator, String columnLocatorValue, int rowNumber, Boolean isFirstRowHeader) throws Exception {
		By byColumnLocator;
		try {
			byColumnLocator = findAngularElement.getByLocatorFromAngularLocator(angularColumnLocator, columnLocatorValue);
			tableActions.checkInAColumnBasedOnRowNumberUsingWebElements(rowsLocator, byColumnLocator, rowNumber, isFirstRowHeader);
		}
		catch(Exception e) {
			throw new Exception(e.getCause().toString());
		}
	}
	
	public void unCheckInAColumnBasedOnRowNumber(AngularLocator angularRowLocator, String rowLocatorValue, AngularLocator  angularColumnLocator, String columnLocatorValue, int rowNumber, Boolean isFirstRowHeader) throws Exception {
		List<WebElement> rowsLocator;
		By byColumnLocator;
		try {
			rowsLocator = findAngularElement.getWebElementsFromAngularLocator(angularRowLocator, rowLocatorValue);
			byColumnLocator = findAngularElement.getByLocatorFromAngularLocator(angularColumnLocator, columnLocatorValue);
			tableActions.unCheckInAColumnBasedOnRowNumberUsingWebElements(rowsLocator, byColumnLocator, rowNumber, isFirstRowHeader);
		}
		catch(Exception e) {
			throw new Exception(e.getCause().toString());
		}
	}
	
	public void unCheckInAColumnBasedOnRowNumber(AngularLocator angularRowLocator, String rowLocatorValue, By byColumnLocator, int rowNumber, Boolean isFirstRowHeader) throws Exception {
		List<WebElement> rowsLocator;
		try {
			rowsLocator = findAngularElement.getWebElementsFromAngularLocator(angularRowLocator, rowLocatorValue);
			tableActions.unCheckInAColumnBasedOnRowNumberUsingWebElements(rowsLocator, byColumnLocator, rowNumber, isFirstRowHeader);
		}
		catch(Exception e) {
			throw new Exception(e.getCause().toString());
		}
	}
	
	public void unCheckInAColumnBasedOnRowNumber(List<WebElement> rowsLocator, AngularLocator  angularColumnLocator, String columnLocatorValue, int rowNumber, Boolean isFirstRowHeader) throws Exception {
		By byColumnLocator;
		try {
			byColumnLocator = findAngularElement.getByLocatorFromAngularLocator(angularColumnLocator, columnLocatorValue);
			tableActions.unCheckInAColumnBasedOnRowNumberUsingWebElements(rowsLocator, byColumnLocator, rowNumber, isFirstRowHeader);
		}
		catch(Exception e) {
			throw new Exception(e.getCause().toString());
		}
	}
	
	public void selectRadioInAColumnBasedOnRowNumber(AngularLocator angularRowLocator, String rowLocatorValue, AngularLocator  angularColumnLocator, String columnLocatorValue, int rowNumber, Boolean isFirstRowHeader) throws Exception {
		List<WebElement> rowsLocator;
		By byColumnLocator;
		try {
			rowsLocator = findAngularElement.getWebElementsFromAngularLocator(angularRowLocator, rowLocatorValue);
			byColumnLocator = findAngularElement.getByLocatorFromAngularLocator(angularColumnLocator, columnLocatorValue);
			tableActions.selectRadioInAColumnBasedOnRowNumberUsingWebElements(rowsLocator, byColumnLocator, rowNumber, isFirstRowHeader);
		}
		catch(Exception e) {
			throw new Exception(e.getCause().toString());
		}
	}
	
	public void selectRadioInAColumnBasedOnRowNumber(AngularLocator angularRowLocator, String rowLocatorValue, By byColumnLocator, int rowNumber, Boolean isFirstRowHeader) throws Exception {
		List<WebElement> rowsLocator;
		try {
			rowsLocator = findAngularElement.getWebElementsFromAngularLocator(angularRowLocator, rowLocatorValue);
			tableActions.selectRadioInAColumnBasedOnRowNumberUsingWebElements(rowsLocator, byColumnLocator, rowNumber, isFirstRowHeader);
		}
		catch(Exception e) {
			throw new Exception(e.getCause().toString());
		}
	}
	
	public void selectRadioInAColumnBasedOnRowNumber(List<WebElement> rowsLocator, AngularLocator  angularColumnLocator, String columnLocatorValue, int rowNumber, Boolean isFirstRowHeader) throws Exception {
		By byColumnLocator;
		try {
			byColumnLocator = findAngularElement.getByLocatorFromAngularLocator(angularColumnLocator, columnLocatorValue);
			tableActions.selectRadioInAColumnBasedOnRowNumberUsingWebElements(rowsLocator, byColumnLocator, rowNumber, isFirstRowHeader);
		}
		catch(Exception e) {
			throw new Exception(e.getCause().toString());
		}
	}
	
	public void selectDropdownByTextInAColumnBasedOnRowNumber(AngularLocator angularRowLocator, String rowLocatorValue, AngularLocator  angularColumnLocator, String columnLocatorValue, int rowNumber, Boolean isFirstRowHeader, String option) throws Exception {
		List<WebElement> rowsLocator;
		By byColumnLocator;
		try {
			rowsLocator = findAngularElement.getWebElementsFromAngularLocator(angularRowLocator, rowLocatorValue);
			byColumnLocator = findAngularElement.getByLocatorFromAngularLocator(angularColumnLocator, columnLocatorValue);
			tableActions.selectDropdownByTextInAColumnBasedOnRowNumberUsingWebElements(rowsLocator, byColumnLocator, rowNumber, isFirstRowHeader, option);
		}
		catch(Exception e) {
			throw new Exception(e.getCause().toString());
		}
	}
	
	public void selectDropdownByTextInAColumnBasedOnRowNumber(AngularLocator angularRowLocator, String rowLocatorValue, By byColumnLocator, int rowNumber, Boolean isFirstRowHeader, String option) throws Exception {
		List<WebElement> rowsLocator;
		try {
			rowsLocator = findAngularElement.getWebElementsFromAngularLocator(angularRowLocator, rowLocatorValue);
			tableActions.selectDropdownByTextInAColumnBasedOnRowNumberUsingWebElements(rowsLocator, byColumnLocator, rowNumber, isFirstRowHeader, option);
		}
		catch(Exception e) {
			throw new Exception(e.getCause().toString());
		}
	}
	
	public void selectDropdownByTextInAColumnBasedOnRowNumber(List<WebElement> rowsLocator, AngularLocator  angularColumnLocator, String columnLocatorValue, int rowNumber, Boolean isFirstRowHeader, String option) throws Exception {
		By byColumnLocator;
		try {
			byColumnLocator = findAngularElement.getByLocatorFromAngularLocator(angularColumnLocator, columnLocatorValue);
			tableActions.selectDropdownByTextInAColumnBasedOnRowNumberUsingWebElements(rowsLocator, byColumnLocator, rowNumber, isFirstRowHeader, option);
		}
		catch(Exception e) {
			throw new Exception(e.getCause().toString());
		}
	}
	
	public void selectDropdownByValueInAColumnBasedOnRowNumber(AngularLocator angularRowLocator, String rowLocatorValue, AngularLocator  angularColumnLocator, String columnLocatorValue, int rowNumber, Boolean isFirstRowHeader, String value) throws Exception {
		List<WebElement> rowsLocator;
		By byColumnLocator;
		try {
			rowsLocator = findAngularElement.getWebElementsFromAngularLocator(angularRowLocator, rowLocatorValue);
			byColumnLocator = findAngularElement.getByLocatorFromAngularLocator(angularColumnLocator, columnLocatorValue);
			tableActions.selectDropdownByValueInAColumnBasedOnRowNumberUsingWebElements(rowsLocator, byColumnLocator, rowNumber, isFirstRowHeader, value);
		}
		catch(Exception e) {
			throw new Exception(e.getCause().toString());
		}
	}
	
	public void selectDropdownByValueInAColumnBasedOnRowNumber(AngularLocator angularRowLocator, String rowLocatorValue, By byColumnLocator, int rowNumber, Boolean isFirstRowHeader, String value) throws Exception {
		List<WebElement> rowsLocator;
		try {
			rowsLocator = findAngularElement.getWebElementsFromAngularLocator(angularRowLocator, rowLocatorValue);
			tableActions.selectDropdownByValueInAColumnBasedOnRowNumberUsingWebElements(rowsLocator, byColumnLocator, rowNumber, isFirstRowHeader, value);
		}
		catch(Exception e) {
			throw new Exception(e.getCause().toString());
		}
	}
	
	public void selectDropdownByValueInAColumnBasedOnRowNumber(List<WebElement> rowsLocator, AngularLocator  angularColumnLocator, String columnLocatorValue, int rowNumber, Boolean isFirstRowHeader, String value) throws Exception {
		By byColumnLocator;
		try {
			byColumnLocator = findAngularElement.getByLocatorFromAngularLocator(angularColumnLocator, columnLocatorValue);
			tableActions.selectDropdownByValueInAColumnBasedOnRowNumberUsingWebElements(rowsLocator, byColumnLocator, rowNumber, isFirstRowHeader, value);
		}
		catch(Exception e) {
			throw new Exception(e.getCause().toString());
		}
	}
	
	public void selectDropdownByIndexInAColumnBasedOnRowNumber(AngularLocator angularRowLocator, String rowLocatorValue, AngularLocator  angularColumnLocator, String columnLocatorValue, int rowNumber, Boolean isFirstRowHeader, int index) throws Exception {
		List<WebElement> rowsLocator;
		By byColumnLocator;
		try {
			rowsLocator = findAngularElement.getWebElementsFromAngularLocator(angularRowLocator, rowLocatorValue);
			byColumnLocator = findAngularElement.getByLocatorFromAngularLocator(angularColumnLocator, columnLocatorValue);
			tableActions.selectDropdownByIndexInAColumnBasedOnRowNumberUsingWebElements(rowsLocator, byColumnLocator, rowNumber, isFirstRowHeader, index);
		}
		catch(Exception e) {
			throw new Exception(e.getCause().toString());
		}
	}
	
	public void selectDropdownByIndexInAColumnBasedOnRowNumber(AngularLocator angularRowLocator, String rowLocatorValue, By byColumnLocator, int rowNumber, Boolean isFirstRowHeader, int index) throws Exception {
		List<WebElement> rowsLocator;
		try {
			rowsLocator = findAngularElement.getWebElementsFromAngularLocator(angularRowLocator, rowLocatorValue);
			tableActions.selectDropdownByIndexInAColumnBasedOnRowNumberUsingWebElements(rowsLocator, byColumnLocator, rowNumber, isFirstRowHeader, index);
		}
		catch(Exception e) {
			throw new Exception(e.getCause().toString());
		}
	}
	
	public void selectDropdownByIndexInAColumnBasedOnRowNumber(List<WebElement> rowsLocator, AngularLocator  angularColumnLocator, String columnLocatorValue, int rowNumber, Boolean isFirstRowHeader, int index) throws Exception {
		By byColumnLocator;
		try {
			byColumnLocator = findAngularElement.getByLocatorFromAngularLocator(angularColumnLocator, columnLocatorValue);
			tableActions.selectDropdownByIndexInAColumnBasedOnRowNumberUsingWebElements(rowsLocator, byColumnLocator, rowNumber, isFirstRowHeader, index);
		}
		catch(Exception e) {
			throw new Exception(e.getCause().toString());
		}
	}
	
	public void hoverInAColumnBasedOnRowNumber(AngularLocator angularRowLocator, String rowLocatorValue, AngularLocator  angularColumnLocator, String columnLocatorValue, int rowNumber, Boolean isFirstRowHeader) throws Exception {
		List<WebElement> rowsLocator;
		By byColumnLocator;
		try {
			rowsLocator = findAngularElement.getWebElementsFromAngularLocator(angularRowLocator, rowLocatorValue);
			byColumnLocator = findAngularElement.getByLocatorFromAngularLocator(angularColumnLocator, columnLocatorValue);
			tableActions.hoverInAColumnBasedOnRowNumberUsingWebElements(rowsLocator, byColumnLocator, rowNumber, isFirstRowHeader);
		}
		catch(Exception e) {
			throw new Exception(e.getCause().toString());
		}
	}
	
	public void hoverInAColumnBasedOnRowNumber(AngularLocator angularRowLocator, String rowLocatorValue, By byColumnLocator, int rowNumber, Boolean isFirstRowHeader) throws Exception {
		List<WebElement> rowsLocator;
		try {
			rowsLocator = findAngularElement.getWebElementsFromAngularLocator(angularRowLocator, rowLocatorValue);
			tableActions.hoverInAColumnBasedOnRowNumberUsingWebElements(rowsLocator, byColumnLocator, rowNumber, isFirstRowHeader);
		}
		catch(Exception e) {
			throw new Exception(e.getCause().toString());
		}
	}
	
	public void hoverInAColumnBasedOnRowNumber(List<WebElement> rowsLocator, AngularLocator  angularColumnLocator, String columnLocatorValue, int rowNumber, Boolean isFirstRowHeader) throws Exception {
		By byColumnLocator;
		try {
			byColumnLocator = findAngularElement.getByLocatorFromAngularLocator(angularColumnLocator, columnLocatorValue);
			tableActions.hoverInAColumnBasedOnRowNumberUsingWebElements(rowsLocator, byColumnLocator, rowNumber, isFirstRowHeader);
		}
		catch(Exception e) {
			throw new Exception(e.getCause().toString());
		}
	}
	
	public String getTextOnAColumnBasedOnRowNumber(AngularLocator angularRowLocator, String rowLocatorValue, AngularLocator  angularColumnLocator, String columnLocatorValue, int rowNumber, Boolean isFirstRowHeader) throws Exception {
		String textToReturn= null;
		List<WebElement> rowsLocator;
		By byColumnLocator;
		try {
			rowsLocator = findAngularElement.getWebElementsFromAngularLocator(angularRowLocator, rowLocatorValue);
			byColumnLocator = findAngularElement.getByLocatorFromAngularLocator(angularColumnLocator, columnLocatorValue);
			textToReturn = tableActions.getTextOnAColumnBasedOnRowNumberUsingWebElements(rowsLocator, byColumnLocator, rowNumber, isFirstRowHeader);
		}
		catch(Exception e) {
			throw new Exception(e.getCause().toString());
		}
		return textToReturn;
	}
	
	public String getTextOnAColumnBasedOnRowNumber(AngularLocator angularRowLocator, String rowLocatorValue, By byColumnLocator, int rowNumber, Boolean isFirstRowHeader) throws Exception {
		String textToReturn = null;
		List<WebElement> rowsLocator;
		try {
			rowsLocator = findAngularElement.getWebElementsFromAngularLocator(angularRowLocator, rowLocatorValue);
			textToReturn = tableActions.getTextOnAColumnBasedOnRowNumberUsingWebElements(rowsLocator, byColumnLocator, rowNumber, isFirstRowHeader);
		}
		catch(Exception e) {
			throw new Exception(e.getCause().toString());
		}
		return textToReturn;
	}
	
	public String getTextOnAColumnBasedOnRowNumber(List<WebElement> rowsLocator, AngularLocator  angularColumnLocator, String columnLocatorValue, int rowNumber, Boolean isFirstRowHeader) throws Exception {
		String textToReturn = null;
		By byColumnLocator;
		try {
			byColumnLocator = findAngularElement.getByLocatorFromAngularLocator(angularColumnLocator, columnLocatorValue);
			textToReturn = tableActions.getTextOnAColumnBasedOnRowNumberUsingWebElements(rowsLocator, byColumnLocator, rowNumber, isFirstRowHeader);
		}
		catch(Exception e) {
			throw new Exception(e.getCause().toString());
		}
		return textToReturn;
	}
	
	public String getTextFromTextboxOnAColumnBasedOnRowNumber(AngularLocator angularRowLocator, String rowLocatorValue, AngularLocator  angularColumnLocator, String columnLocatorValue, int rowNumber, Boolean isFirstRowHeader) throws Exception {
		String textToReturn= null;
		List<WebElement> rowsLocator;
		By byColumnLocator;
		try {
			rowsLocator = findAngularElement.getWebElementsFromAngularLocator(angularRowLocator, rowLocatorValue);
			byColumnLocator = findAngularElement.getByLocatorFromAngularLocator(angularColumnLocator, columnLocatorValue);
			textToReturn = tableActions.getTextFromTextBoxOnAColumnBasedOnRowNumberUsingWebElements(rowsLocator, byColumnLocator, rowNumber, isFirstRowHeader);
		}
		catch(Exception e) {
			throw new Exception(e.getCause().toString());
		}
		return textToReturn;
	}
	
	public String getTextFromTextboxOnAColumnBasedOnRowNumber(AngularLocator angularRowLocator, String rowLocatorValue, By byColumnLocator, int rowNumber, Boolean isFirstRowHeader) throws Exception {
		String textToReturn = null;
		List<WebElement> rowsLocator;
		try {
			rowsLocator = findAngularElement.getWebElementsFromAngularLocator(angularRowLocator, rowLocatorValue);
			textToReturn = tableActions.getTextFromTextBoxOnAColumnBasedOnRowNumberUsingWebElements(rowsLocator, byColumnLocator, rowNumber, isFirstRowHeader);
		}
		catch(Exception e) {
			throw new Exception(e.getCause().toString());
		}
		return textToReturn;
	}
	
	public String getTextFromTextboxOnAColumnBasedOnRowNumber(List<WebElement> rowsLocator, AngularLocator  angularColumnLocator, String columnLocatorValue, int rowNumber, Boolean isFirstRowHeader) throws Exception {
		String textToReturn = null;
		By byColumnLocator;
		try {
			byColumnLocator = findAngularElement.getByLocatorFromAngularLocator(angularColumnLocator, columnLocatorValue);
			textToReturn = tableActions.getTextFromTextBoxOnAColumnBasedOnRowNumberUsingWebElements(rowsLocator, byColumnLocator, rowNumber, isFirstRowHeader);
		}
		catch(Exception e) {
			throw new Exception(e.getCause().toString());
		}
		return textToReturn;
	}
	
	public Boolean isElementVisibleOnAColumnBasedOnRowNumber(AngularLocator angularRowLocator, String rowLocatorValue, AngularLocator  angularColumnLocator, String columnLocatorValue, int rowNumber, Boolean isFirstRowHeader) throws Exception {
		Boolean isElementVisible = false;
		List<WebElement> rowsLocator;
		By byColumnLocator;
		try {
			rowsLocator = findAngularElement.getWebElementsFromAngularLocator(angularRowLocator, rowLocatorValue);
			byColumnLocator = findAngularElement.getByLocatorFromAngularLocator(angularColumnLocator, columnLocatorValue);
			isElementVisible = tableActions.isElementVisibleOnAColumnBasedOnRowNumberUsingWebElements(rowsLocator, byColumnLocator, rowNumber, isFirstRowHeader);
		}
		catch(Exception e) {
			throw new Exception(e.getCause().toString());
		}
		return isElementVisible;
	}
	
	public Boolean isElementVisibleOnAColumnBasedOnRowNumber(AngularLocator angularRowLocator, String rowLocatorValue, By byColumnLocator, int rowNumber, Boolean isFirstRowHeader) throws Exception {
		Boolean isElementVisible = false;
		List<WebElement> rowsLocator;
		try {
			rowsLocator = findAngularElement.getWebElementsFromAngularLocator(angularRowLocator, rowLocatorValue);
			isElementVisible = tableActions.isElementVisibleOnAColumnBasedOnRowNumberUsingWebElements(rowsLocator, byColumnLocator, rowNumber, isFirstRowHeader);
		}
		catch(Exception e) {
			throw new Exception(e.getCause().toString());
		}
		return isElementVisible;
	}
	
	public Boolean isElementVisibleOnAColumnBasedOnRowNumber(List<WebElement> rowsLocator, AngularLocator  angularColumnLocator, String columnLocatorValue, int rowNumber, Boolean isFirstRowHeader) throws Exception {
		Boolean isElementVisible = false;
		By byColumnLocator;
		try {
			byColumnLocator = findAngularElement.getByLocatorFromAngularLocator(angularColumnLocator, columnLocatorValue);
			isElementVisible = tableActions.isElementVisibleOnAColumnBasedOnRowNumberUsingWebElements(rowsLocator, byColumnLocator, rowNumber, isFirstRowHeader);
		}
		catch(Exception e) {
			throw new Exception(e.getCause().toString());
		}
		return isElementVisible;
	}
	
	public Boolean isElementEnableOnAColumnBasedOnRowNumber(AngularLocator angularRowLocator, String rowLocatorValue, AngularLocator  angularColumnLocator, String columnLocatorValue, int rowNumber, Boolean isFirstRowHeader) throws Exception {
		Boolean isElementEnable = false;
		List<WebElement> rowsLocator;
		By byColumnLocator;
		try {
			rowsLocator = findAngularElement.getWebElementsFromAngularLocator(angularRowLocator, rowLocatorValue);
			byColumnLocator = findAngularElement.getByLocatorFromAngularLocator(angularColumnLocator, columnLocatorValue);
			isElementEnable = tableActions.isElementEnableOnAColumnBasedOnRowNumberUsingWebElements(rowsLocator, byColumnLocator, rowNumber, isFirstRowHeader);
		}
		catch(Exception e) {
			throw new Exception(e.getCause().toString());
		}
		return isElementEnable;
	}
	
	public Boolean isElementEnableOnAColumnBasedOnRowNumber(AngularLocator angularRowLocator, String rowLocatorValue, By byColumnLocator, int rowNumber, Boolean isFirstRowHeader) throws Exception {
		Boolean isElementEnable = false;
		List<WebElement> rowsLocator;
		try {
			rowsLocator = findAngularElement.getWebElementsFromAngularLocator(angularRowLocator, rowLocatorValue);
			isElementEnable = tableActions.isElementEnableOnAColumnBasedOnRowNumberUsingWebElements(rowsLocator, byColumnLocator, rowNumber, isFirstRowHeader);
		}
		catch(Exception e) {
			throw new Exception(e.getCause().toString());
		}
		return isElementEnable;
	}
	
	public Boolean isElementEnableOnAColumnBasedOnRowNumber(List<WebElement> rowsLocator, AngularLocator  angularColumnLocator, String columnLocatorValue, int rowNumber, Boolean isFirstRowHeader) throws Exception {
		Boolean isElementEnable = false;
		By byColumnLocator;
		try {
			byColumnLocator = findAngularElement.getByLocatorFromAngularLocator(angularColumnLocator, columnLocatorValue);
			isElementEnable = tableActions.isElementEnableOnAColumnBasedOnRowNumberUsingWebElements(rowsLocator, byColumnLocator, rowNumber, isFirstRowHeader);
		}
		catch(Exception e) {
			throw new Exception(e.getCause().toString());
		}
		return isElementEnable;
	}
}