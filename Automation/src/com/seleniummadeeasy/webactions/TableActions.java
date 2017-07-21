package com.seleniummadeeasy.webactions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.seleniummadeeasy.exceptions.NoHeaderFoundException;

public class TableActions {
	
	WebDriver driver;
	FindWebElement findElement;
	FormActions formAction;
	
	public TableActions(WebDriver driver) {
		this.driver = driver;
		findElement = new FindWebElement(this.driver);
		formAction = new FormActions(this.driver);
	}
	
	public int getRecordCountUsingBy(By byLocator, Boolean isFirstRowHeader) throws Exception {
		int countOfRecords = 0;
		try {
			List<WebElement> elements = findElement.findWebElements(byLocator);
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
	
	public int getRecordCountUsingWebElement(List<WebElement> elements, Boolean isFirstRowHeader) throws Exception {
		int countOfRecords = 0;
		try {
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
	
	public void enterTextInAColumnBasedOnRowNumberUsingBy(By byRowLocator, By byColumnLocator, int rowNumber, Boolean isFirstRowHeader, String text) throws Exception {
		WebElement column;
		try {
			column = getColumnLocatorBasedOnRowNumber(byRowLocator, byColumnLocator, rowNumber, isFirstRowHeader);
			formAction.enterTextUsingWebElement(column, text);
		}
		catch(Exception e) {
			throw new Exception(e.getCause().toString());
		}
	}
	
	public void enterTextInAColumnBasedOnRowNumberUsingWebElements(List<WebElement> rowsLocator, By byColumnLocator, int rowNumber, Boolean isFirstRowHeader, String text) throws Exception {
		WebElement column;
		try {
			column = getColumnLocatorBasedOnRowNumber(rowsLocator, byColumnLocator, rowNumber, isFirstRowHeader);
			formAction.enterTextUsingWebElement(column, text);
		}
		catch(Exception e) {
			throw new Exception(e.getCause().toString());
		}
	}
	
	public void clickInAColumnBasedOnRowNumberUsingBy(By byRowLocator, By byColumnLocator,
										int rowNumber, Boolean isFirstRowHeader) throws Exception {
		WebElement column;
		try {
			column = getColumnLocatorBasedOnRowNumber(byRowLocator, byColumnLocator, rowNumber, isFirstRowHeader);
			formAction.clickUsingWebElement(column);
		}
		catch(Exception e) {
			throw new Exception(e.getCause().toString());
		}
	}
	
	public void clickInAColumnBasedOnRowNumberUsingWebElements(List<WebElement> rowsLocator, By byColumnLocator,
										int rowNumber, Boolean isFirstRowHeader) throws Exception {
		WebElement column;
		try {
			column = getColumnLocatorBasedOnRowNumber(rowsLocator, byColumnLocator, rowNumber, isFirstRowHeader);
			formAction.clickUsingWebElement(column);
		}
		catch(Exception e) {
			throw new Exception(e.getCause().toString());
		}
	}
	
	public void checkInAColumnBasedOnRowNumberUsingBy(By byRowLocator, By byColumnLocator, int rowNumber, Boolean isFirstRowHeader) throws Exception {
		WebElement column;
		try {
			column = getColumnLocatorBasedOnRowNumber(byRowLocator, byColumnLocator, rowNumber, isFirstRowHeader);
			formAction.checkUsingWebElement(column);
		}
		catch(Exception e) {
			throw new Exception(e.getCause().toString());
		}
	}
	
	public void checkInAColumnBasedOnRowNumberUsingWebElements(List<WebElement> rowsLocator, By byColumnLocator, int rowNumber, Boolean isFirstRowHeader) throws Exception {
		WebElement column;
		try {
			column = getColumnLocatorBasedOnRowNumber(rowsLocator, byColumnLocator, rowNumber, isFirstRowHeader);
			formAction.checkUsingWebElement(column);
		}
		catch(Exception e) {
			throw new Exception(e.getCause().toString());
		}
	}
	
	public void unCheckInAColumnBasedOnRowNumberUsingBy(By byRowLocator, By byColumnLocator, int rowNumber, Boolean isFirstRowHeader) throws Exception {
		WebElement column;
		try {
			column = getColumnLocatorBasedOnRowNumber(byRowLocator, byColumnLocator, rowNumber, isFirstRowHeader);
			formAction.unCheckUsingWebElement(column);
		}
		catch(Exception e) {
			throw new Exception(e.getCause().toString());
		}
	}
	
	public void unCheckInAColumnBasedOnRowNumberUsingWebElements(List<WebElement> rowsLocator, By byColumnLocator, int rowNumber, Boolean isFirstRowHeader) throws Exception {
		WebElement column;
		try {
			column = getColumnLocatorBasedOnRowNumber(rowsLocator, byColumnLocator, rowNumber, isFirstRowHeader);
			formAction.unCheckUsingWebElement(column);
		}
		catch(Exception e) {
			throw new Exception(e.getCause().toString());
		}
	}
	
	public void selectRadioInAColumnBasedOnRowNumberUsingBy(By byRowLocator, By byColumnLocator, int rowNumber, Boolean isFirstRowHeader) throws Exception {
		WebElement column;
		try {
			column = getColumnLocatorBasedOnRowNumber(byRowLocator, byColumnLocator, rowNumber, isFirstRowHeader);
			formAction.selectRadioUsingWebElement(column);
		}
		catch(Exception e) {
			throw new Exception(e.getCause().toString());
		}
	}
	
	public void selectRadioInAColumnBasedOnRowNumberUsingWebElements(List<WebElement> rowsLocator, By byColumnLocator, int rowNumber, Boolean isFirstRowHeader) throws Exception {
		WebElement column;
		try {
			column = getColumnLocatorBasedOnRowNumber(rowsLocator, byColumnLocator, rowNumber, isFirstRowHeader);
			formAction.selectRadioUsingWebElement(column);
		}
		catch(Exception e) {
			throw new Exception(e.getCause().toString());
		}
	}
	
	public void selectDropdownByTextInAColumnBasedOnRowNumberUsingBy(By byRowLocator, By byColumnLocator, int rowNumber, Boolean isFirstRowHeader, String option) throws Exception {
		Select column;
		try {
			column = new Select (getColumnLocatorBasedOnRowNumber(byRowLocator, byColumnLocator, rowNumber, isFirstRowHeader));
			formAction.selectDropdownByTextUsinWebElement(column, option);
		}
		catch(Exception e) {
			throw new Exception(e.getCause().toString());
		}
	}
	
	public void selectDropdownByTextInAColumnBasedOnRowNumberUsingWebElements(List<WebElement> rowsLocator, By byColumnLocator, int rowNumber, Boolean isFirstRowHeader, String option) throws Exception {
		Select column;
		try {
			column = new Select (getColumnLocatorBasedOnRowNumber(rowsLocator, byColumnLocator, rowNumber, isFirstRowHeader));
			formAction.selectDropdownByTextUsinWebElement(column, option);
		}
		catch(Exception e) {
			throw new Exception(e.getCause().toString());
		}
	}
	
	public void selectDropdownByIndexInAColumnBasedOnRowNumberUsingBy(By byRowLocator, By byColumnLocator, int rowNumber, Boolean isFirstRowHeader, int index) throws Exception {
		Select column;
		try {
			column = new Select (getColumnLocatorBasedOnRowNumber(byRowLocator, byColumnLocator, rowNumber, isFirstRowHeader));
			formAction.selectDropdownByIndexUsinWebElement(column, index);
		}
		catch(Exception e) {
			throw new Exception(e.getCause().toString());
		}
	}
	
	public void selectDropdownByIndexInAColumnBasedOnRowNumberUsingWebElements(List<WebElement> rowsLocator, By byColumnLocator, int rowNumber, Boolean isFirstRowHeader, int index) throws Exception {
		Select column;
		try {
			column = new Select (getColumnLocatorBasedOnRowNumber(rowsLocator, byColumnLocator, rowNumber, isFirstRowHeader));
			formAction.selectDropdownByIndexUsinWebElement(column, index);
		}
		catch(Exception e) {
			throw new Exception(e.getCause().toString());
		}
	}

	public void selectDropdownByValueInAColumnBasedOnRowNumberUsingBy(By byRowLocator, By byColumnLocator, int rowNumber, Boolean isFirstRowHeader, String value) throws Exception {
		Select column;
		try {
			column = new Select (getColumnLocatorBasedOnRowNumber(byRowLocator, byColumnLocator, rowNumber, isFirstRowHeader));
			formAction.selectDropdownByValueUsinWebElement(column, value);
		}
		catch(Exception e) {
			throw new Exception(e.getCause().toString());
		}
	}
	
	public void selectDropdownByValueInAColumnBasedOnRowNumberUsingWebElements(List<WebElement> rowsLocator, By byColumnLocator, int rowNumber, Boolean isFirstRowHeader, String value) throws Exception {
		Select column;
		try {
			column = new Select (getColumnLocatorBasedOnRowNumber(rowsLocator, byColumnLocator, rowNumber, isFirstRowHeader));
			formAction.selectDropdownByValueUsinWebElement(column, value);
		}
		catch(Exception e) {
			throw new Exception(e.getCause().toString());
		}
	}

	public void hoverInAColumnBasedOnRowNumberUsingBy(By byRowLocator, By byColumnLocator, int rowNumber, Boolean isFirstRowHeader) throws Exception {
		WebElement column;
		try {
			column = getColumnLocatorBasedOnRowNumber(byRowLocator, byColumnLocator, rowNumber, isFirstRowHeader);
			formAction.hoverUsingWebElement(column);
		}
		catch(Exception e) {
			throw new Exception(e.getCause().toString());
		}
	}
	
	public void hoverInAColumnBasedOnRowNumberUsingWebElements(List<WebElement> rowsLocator, By byColumnLocator, int rowNumber, Boolean isFirstRowHeader) throws Exception {
		WebElement column;
		try {
			column = getColumnLocatorBasedOnRowNumber(rowsLocator, byColumnLocator, rowNumber, isFirstRowHeader);
			formAction.hoverUsingWebElement(column);
		}
		catch(Exception e) {
			throw new Exception(e.getCause().toString());
		}
	}
	
	public String getTextOnAColumnBasedOnRowNumberUsingBy(By byRowLocator, By byColumnLocator, int rowNumber, Boolean isFirstRowHeader) throws Exception {
		WebElement column;
		String textToReturn = null;
		try {
			column = getColumnLocatorBasedOnRowNumber(byRowLocator, byColumnLocator, rowNumber, isFirstRowHeader);
			textToReturn = formAction.getTextUsingWebElement(column);
		}
		catch(Exception e) {
			throw new Exception(e.getCause().toString());
		}
		
		return textToReturn;
	}
	
	public String getTextOnAColumnBasedOnRowNumberUsingWebElements(List<WebElement> rowsLocator, By byColumnLocator, int rowNumber, Boolean isFirstRowHeader) throws Exception {
		WebElement column;
		String textToReturn = null;
		try {
			column = getColumnLocatorBasedOnRowNumber(rowsLocator, byColumnLocator, rowNumber, isFirstRowHeader);
			textToReturn = formAction.getTextUsingWebElement(column);
		}
		catch(Exception e) {
			throw new Exception(e.getCause().toString());
		}
		
		return textToReturn;
	}
	
	public String getTextFromTextboxOnAColumnBasedOnRowNumberUsingBy(By byRowLocator, By byColumnLocator, int rowNumber, Boolean isFirstRowHeader) throws Exception {
		WebElement column;
		String textToReturn = null;
		try {
			column = getColumnLocatorBasedOnRowNumber(byRowLocator, byColumnLocator, rowNumber, isFirstRowHeader);
			textToReturn = formAction.getTextFromTextboxUsingWebElement(column);
		}
		catch(Exception e) {
			throw new Exception(e.getCause().toString());
		}
		
		return textToReturn;
	}
	
	public String getTextFromTextBoxOnAColumnBasedOnRowNumberUsingWebElements(List<WebElement> rowsLocator, By byColumnLocator, int rowNumber, Boolean isFirstRowHeader) throws Exception {
		WebElement column;
		String textToReturn = null;
		try {
			column = getColumnLocatorBasedOnRowNumber(rowsLocator, byColumnLocator, rowNumber, isFirstRowHeader);
			textToReturn = formAction.getTextFromTextboxUsingWebElement(column);
		}
		catch(Exception e) {
			throw new Exception(e.getCause().toString());
		}
		
		return textToReturn;
	}
	
	public String getAttributeOfAColumnBasedOnRowNumberUsingBy(By byRowLocator, By byColumnLocator, int rowNumber, Boolean isFirstRowHeader, String attributeName) throws Exception {
		WebElement column;
		String attribute = null;
		try {
			column = getColumnLocatorBasedOnRowNumber(byRowLocator, byColumnLocator, rowNumber, isFirstRowHeader);
			attribute = formAction.getAttributeUsingWebElement(column, attributeName);
		}
		catch(Exception e) {
			throw new Exception(e.getCause().toString());
		}
		
		return attribute;
	}
	
	public String getAttrtibuteOfAColumnBasedOnRowNumberUsingWebElements(List<WebElement> rowsLocator, By byColumnLocator, int rowNumber, Boolean isFirstRowHeader, String attributeName) throws Exception {
		WebElement column;
		String attribute = null;
		try {
			column = getColumnLocatorBasedOnRowNumber(rowsLocator, byColumnLocator, rowNumber, isFirstRowHeader);
			attribute = formAction.getAttributeUsingWebElement(column, attributeName);
		}
		catch(Exception e) {
			throw new Exception(e.getCause().toString());
		}
	
		return attribute;
	}
	
	public Boolean isElementVisibleOnAColumnBasedOnRowNumberUsingBy(By byRowLocator, By byColumnLocator, int rowNumber, Boolean isFirstRowHeader) throws Exception {
		WebElement column;
		Boolean isElementVisible= false;
		try {
			column = getColumnLocatorBasedOnRowNumber(byRowLocator, byColumnLocator, rowNumber, isFirstRowHeader);
			isElementVisible = formAction.isElementVisibleUsingWebElement(column);
		}
		catch(Exception e) {
			throw new Exception(e.getCause().toString());
		}
		
		return isElementVisible;
	}
	
	public Boolean isElementVisibleOnAColumnBasedOnRowNumberUsingWebElements(List<WebElement> rowsLocator, By byColumnLocator, int rowNumber, Boolean isFirstRowHeader) throws Exception {
		WebElement column;
		Boolean isElementVisible= false;
		try {
			column = getColumnLocatorBasedOnRowNumber(rowsLocator, byColumnLocator, rowNumber, isFirstRowHeader);
			isElementVisible = formAction.isElementVisibleUsingWebElement(column);
		}
		catch(Exception e) {
			throw new Exception(e.getCause().toString());
		}
	
		return isElementVisible;
	}
	
	public Boolean isElementEnableOnAColumnBasedOnRowNumberUsingBy(By byRowLocator, By byColumnLocator, int rowNumber, Boolean isFirstRowHeader) throws Exception {
		WebElement column;
		Boolean isElementEnable= false;
		try {
			column = getColumnLocatorBasedOnRowNumber(byRowLocator, byColumnLocator, rowNumber, isFirstRowHeader);
			isElementEnable = formAction.isElementEnableUsingWebElement(column);
		}
		catch(Exception e) {
			throw new Exception(e.getCause().toString());
		}
		
		return isElementEnable;
	}
	
	public Boolean isElementEnableOnAColumnBasedOnRowNumberUsingWebElements(List<WebElement> rowsLocator, By byColumnLocator, int rowNumber, Boolean isFirstRowHeader) throws Exception {
		WebElement column;
		Boolean isElementEnable= false;
		try {
			column = getColumnLocatorBasedOnRowNumber(rowsLocator, byColumnLocator, rowNumber, isFirstRowHeader);
			isElementEnable = formAction.isElementEnableUsingWebElement(column);
		}
		catch(Exception e) {
			throw new Exception(e.getCause().toString());
		}
	
		return isElementEnable;
	}
			
	public List<WebElement> getDataRows(List<WebElement> rows, Boolean isFirstRowHeader) {
		List<WebElement> dataRows;
		if(isFirstRowHeader) {
			dataRows = rows.subList(1, rows.size()-1);
		}
		else {
			dataRows = rows;
		}
		return dataRows;
	}
	
	public List<WebElement> getHeaderRow(List<WebElement> rows, Boolean isFirstRowHeader) throws Exception {
		List<WebElement> headerRow;
		try {
			if(rows.size() > 0) {
				if(isFirstRowHeader) {
					headerRow = rows.subList(0, 1);
				}
				else {
					throw new NoHeaderFoundException("First Header is defined as false, hence header could not be retrieved");
				}
			}
			else {
				throw new NoHeaderFoundException("Rows locator does not evaluate to any table");
			}
		}
		catch(Exception e) {
			throw new Exception(e.getCause().toString());
		}
		
		return headerRow;
	}
	
	public WebElement getColumnLocatorBasedOnRowNumber(By byRowLocator, By byColumnLocator,
									int rowNumber, Boolean isFirstRowHeader) throws Exception {
		List<WebElement> rows;
		List<WebElement> dataRows;
		
		WebElement column;
		try {
			rows = findElement.findWebElements(byRowLocator);
			dataRows = getDataRows(rows, isFirstRowHeader);
			column = findElement.findNestedWebElement(dataRows.get(rowNumber-1), byColumnLocator);
		}
		catch(Exception e) {
			throw new Exception(e.getCause().toString());
		}
		
		return column;
	}
	
	public WebElement getColumnLocatorBasedOnRowNumber(List<WebElement> rowsLocator, By byColumnLocator,
								int rowNumber, Boolean isFirstRowHeader) throws Exception {
		List<WebElement> dataRows;
		
		WebElement column;
		try {
		dataRows = getDataRows(rowsLocator, isFirstRowHeader);
		column = findElement.findNestedWebElement(dataRows.get(rowNumber-1), byColumnLocator);
		}
		catch(Exception e) {
		throw new Exception(e.getCause().toString());
		}
		
		return column;
	}
}