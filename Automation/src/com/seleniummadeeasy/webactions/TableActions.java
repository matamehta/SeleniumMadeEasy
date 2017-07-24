package com.seleniummadeeasy.webactions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.seleniummadeeasy.exceptions.NoHeaderFoundException;
import com.seleniummadeeasy.findelement.FindWebElement;

public class TableActions {
	
	WebDriver driver;
	FindWebElement findElement;
	FormActions formAction;
	
	public TableActions(WebDriver driver) {
		this.driver = driver;
		findElement = new FindWebElement(this.driver);
		formAction = new FormActions(this.driver);
	}
	
	/**
	 * Get count of records present in list/table using Selenium By locator
	 * 
	 * @author Mohit Gupta
	 * 
	 * @param byLocator Selenium By locator of rows in list/table
	 * @param isFirstRowHeader true if first row is header, false otherwise
	 * @return				   Count of records present in list/table
	 * @throws Exception
	 */
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
	
	
	/**
	 * Get count of records present in list/table using list of Selenium WebElements
	 * 
	 * @author Mohit Gupta
	 * 
	 * @param elements List of Selenium WebElements of rows in list/table
	 * @param isFirstRowHeader true if first row is header, false otherwise
	 * @return				   Count of records present in list/table
	 * @throws Exception
	 */
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
	
	/**
	 * Enter text in textbox using Selenium By locator on a given row number
	 * 
	 * @author Mohit Gupta
	 * 
	 * @param byRowLocator Selenium By locator of rows in list/table
	 * @param byColumnLocator Selenium By locator of column in list/table
	 * @param rowNumber Row number on which action has to be performed
	 * @param isFirstRowHeader true if first row is header, false otherwise 
	 * @param text Text to enter in textbox
	 * @throws Exception
	 */
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
	
	/**
	 * Enter text in textbox using List of Selenium WebElements on a given row number
	 * 
	 * @author Mohit Gupta
	 * 
	 * @param rowsLocator List of Selenium WebElements of rows in list/table
	 * @param byColumnLocator Selenium By locator of column in list/table
	 * @param rowNumber Row number on which action has to be performed
	 * @param isFirstRowHeader true if first row is header, false otherwise 
	 * @param text Text to enter in textbox
	 * @throws Exception
	 */
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
	
	/**
	 * Click on web element using Selenium By locator on a given row number
	 * 
	 * @author Mohit Gupta
	 * 
	 * @param byRowLocator Selenium By locator of rows in list/table
     * @param byColumnLocator Selenium By locator of column in list/table
	 * @param rowNumber Row number on which action has to be performed
	 * @param isFirstRowHeader true if first row is header, false otherwise 
	 * @throws Exception
	 */
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
	
	/**
	 * Click on web element using List of Selenium WebElements on a given row number
	 * 
	 * @author Mohit Gupta
	 * 
	 * @param rowsLocator List of Selenium WebElements of rows in list/table
	 * @param byColumnLocator Selenium By locator of column in list/table
	 * @param rowNumber Row number on which action has to be performed
	 * @param isFirstRowHeader true if first row is header, false otherwise 
	 * @throws Exception
	 */
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
	
	/**
	 * Check web element using Selenium By locator on a given row number
	 * 
	 * @author Mohit Gupta
	 * 
	 * @param byRowLocator Selenium By locator of rows in list/table
	 * @param byColumnLocator Selenium By locator of column in list/table
	 * @param rowNumber Row number on which action has to be performed
	 * @param isFirstRowHeader true if first row is header, false otherwise 
	 * @throws Exception
	 */
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

	/**
	 * Check web element using Selenium WebElement
	 * 
	 * @author Mohit Gupta
	 * 
	 * @param rowsLocator List of Selenium WebElements of rows in list/table
	 * @param byColumnLocator Selenium By locator of column in list/table
	 * @param rowNumber Row number on which action has to be performed
	 * @param isFirstRowHeader true if first row is header, false otherwise 
	 * @throws Exception
	 */
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

	/**
	 * UnCheck web element using Selenium By locator on a given row number
	 * 
	 * @author Mohit Gupta
	 * 
	 * @param byRowLocator Selenium By locator of rows in list/table
	 * @param byColumnLocator Selenium By locator of column in list/table
	 * @param rowNumber Row number on which action has to be performed
	 * @param isFirstRowHeader true if first row is header, false otherwise 
	 * @throws Exception
	 */
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
	
	/**
	 * UnCheck web element using List of Selenium WebElements on a given row number
	 * 
	 * @author Mohit Gupta
	 * 
	 * @param rowsLocator List of Selenium WebElements of rows in list/table
	 * @param byColumnLocator Selenium By locator of column in list/table
	 * @param rowNumber Row number on which action has to be performed
	 * @param isFirstRowHeader true if first row is header, false otherwise 
	 * @throws Exception
	 */
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
	
	/**
	 * Select radio button using Selenium By locator on a given row number
	 * 
	 * @author Mohit Gupta
	 * 
	 * @param byRowLocator Selenium By locator of rows in list/table
	 * @param byColumnLocator Selenium By locator of column in list/table
	 * @param rowNumber Row number on which action has to be performed
	 * @param isFirstRowHeader true if first row is header, false otherwise 
	 * @throws Exception
	 */
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

	/**
	 * Select radio button using List of Selenium WebElements on a given row number
	 * 
	 * @author Mohit Gupta
	 * 
	 * @param rowsLocator List of Selenium WebElements of rows in list/table
	 * @param byColumnLocator Selenium By locator of column in list/table
	 * @param rowNumber Row number on which action has to be performed
	 * @param isFirstRowHeader true if first row is header, false otherwise
	 * @throws Exception
	 */
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
	
	/**
	 * Select dropdown via option text using Selenium By locator of rows in list/table on a given row number
	 * 
	 * @author Mohit Gupta
	 * 
	 * @param byRowLocator Selenium By locator of rows in list/table
	 * @param byColumnLocator Selenium By locator of column in list/table
	 * @param rowNumber Row number on which action has to be performed
	 * @param isFirstRowHeader true if first row is header, false otherwise 
	 * @param option text to select from dropdown
	 * @throws Exception
	 */
	public void selectDropdownByTextInAColumnBasedOnRowNumberUsingBy(By byRowLocator, By byColumnLocator, int rowNumber, Boolean isFirstRowHeader, String option) throws Exception {
		Select column;
		try {
			column = new Select (getColumnLocatorBasedOnRowNumber(byRowLocator, byColumnLocator, rowNumber, isFirstRowHeader));
			formAction.selectDropdownByTextUsingWebElement(column, option);
		}
		catch(Exception e) {
			throw new Exception(e.getCause().toString());
		}
	}
	
	/**
	 * Select dropdown via option text using List of Selenium WebElements of rows in list/table on a given row number
	 * 
	 * @author Mohit Gupta
	 * 
	 * @param rowsLocator List of Selenium WebElements
	 * @param byColumnLocator Selenium By locator of column in list/table
	 * @param rowNumber Row number on which action has to be performed
	 * @param isFirstRowHeader true if first row is header, false otherwise 
	 * @param option text to select from dropdown
	 * @throws Exception
	 */
	public void selectDropdownByTextInAColumnBasedOnRowNumberUsingWebElements(List<WebElement> rowsLocator, By byColumnLocator, int rowNumber, Boolean isFirstRowHeader, String option) throws Exception {
		Select column;
		try {
			column = new Select (getColumnLocatorBasedOnRowNumber(rowsLocator, byColumnLocator, rowNumber, isFirstRowHeader));
			formAction.selectDropdownByTextUsingWebElement(column, option);
		}
		catch(Exception e) {
			throw new Exception(e.getCause().toString());
		}
	}
	
	/**
	 * Select dropdown via indexing using Selenium By locator of rows in list/table on a given row number
	 * 
	 * @author Mohit Gupta
	 * 
	 * @param byRowLocator Selenium By locator of rows in list/table
	 * @param byColumnLocator Selenium By locator of column in list/table
	 * @param rowNumber Row number on which action has to be performed
	 * @param isFirstRowHeader true if first row is header, false otherwise 
	 * @param index Index of value to select from dropdown
	 * @throws Exception
	 */
	public void selectDropdownByIndexInAColumnBasedOnRowNumberUsingBy(By byRowLocator, By byColumnLocator, int rowNumber, Boolean isFirstRowHeader, int index) throws Exception {
		Select column;
		try {
			column = new Select (getColumnLocatorBasedOnRowNumber(byRowLocator, byColumnLocator, rowNumber, isFirstRowHeader));
			formAction.selectDropdownByIndexUsingWebElement(column, index);
		}
		catch(Exception e) {
			throw new Exception(e.getCause().toString());
		}
	}
	
	/**
	 * Select dropdown via indexing using List of Selenium WebElements of rows in list/table on a given row number
	 * 
	 * @author Mohit Gupta
	 * 
	 * @param rowsLocator List of Selenium WebElements
	 * @param byColumnLocator Selenium By locator of column in list/table
	 * @param rowNumber Row number on which action has to be performed
	 * @param isFirstRowHeader true if first row is header, false otherwise 
	 * @param index Index of value to select from dropdown
	 * @throws Exception
	 */
	public void selectDropdownByIndexInAColumnBasedOnRowNumberUsingWebElements(List<WebElement> rowsLocator, By byColumnLocator, int rowNumber, Boolean isFirstRowHeader, int index) throws Exception {
		Select column;
		try {
			column = new Select (getColumnLocatorBasedOnRowNumber(rowsLocator, byColumnLocator, rowNumber, isFirstRowHeader));
			formAction.selectDropdownByIndexUsingWebElement(column, index);
		}
		catch(Exception e) {
			throw new Exception(e.getCause().toString());
		}
	}

	/**
	 * Select dropdown via value using Selenium By locator of rows in list/table on a given row number
	 * 
	 * @author Mohit Gupta
	 * 
	 * @param byRowLocator Selenium By locator of rows in list/table
	 * @param byColumnLocator Selenium By locator of column in list/table
	 * @param rowNumber Row number on which action has to be performed
	 * @param isFirstRowHeader true if first row is header, false otherwise 
	 * @param value Text of value to select from dropdown
	 * @throws Exception
	 */
	public void selectDropdownByValueInAColumnBasedOnRowNumberUsingBy(By byRowLocator, By byColumnLocator, int rowNumber, Boolean isFirstRowHeader, String value) throws Exception {
		Select column;
		try {
			column = new Select (getColumnLocatorBasedOnRowNumber(byRowLocator, byColumnLocator, rowNumber, isFirstRowHeader));
			formAction.selectDropdownByValueUsingWebElement(column, value);
		}
		catch(Exception e) {
			throw new Exception(e.getCause().toString());
		}
	}
	
	/**
	 * Select dropdown via value using List of Selenium WebElements of rows in list/table on a given row number
	 * 
	 * @author Mohit Gupta
	 * 
	 * @param rowsLocator List of Selenium WebElements
	 * @param byColumnLocator Selenium By locator of column in list/table
	 * @param rowNumber Row number on which action has to be performed
	 * @param isFirstRowHeader true if first row is header, false otherwise 
	 * @param value Text of value to select from dropdown
	 * @throws Exception
	 */
	public void selectDropdownByValueInAColumnBasedOnRowNumberUsingWebElements(List<WebElement> rowsLocator, By byColumnLocator, int rowNumber, Boolean isFirstRowHeader, String value) throws Exception {
		Select column;
		try {
			column = new Select (getColumnLocatorBasedOnRowNumber(rowsLocator, byColumnLocator, rowNumber, isFirstRowHeader));
			formAction.selectDropdownByValueUsingWebElement(column, value);
		}
		catch(Exception e) {
			throw new Exception(e.getCause().toString());
		}
	}

	/**
	 * Hover on a web element using Selenium By locator on a given row number
	 * 
	 * @author Mohit Gupta
	 * 
	 * @param byRowLocator Selenium By locator of rows in list/table
	 * @param byColumnLocator Selenium By locator of column in list/table
	 * @param rowNumber Row number on which action has to be performed
	 * @param isFirstRowHeader true if first row is header, false otherwise
	 * @throws Exception
	 */
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
	
	/**
	 * Hover on web element using List of Selenium WebElements on a given row number
	 * 
	 * @author Mohit Gupta
	 * 
	 * @param rowsLocator List of Selenium WebElements of rows in list/table
	 * @param byColumnLocator Selenium By locator of column in list/table
	 * @param rowNumber Row number on which action has to be performed
	 * @param isFirstRowHeader true if first row is header, false otherwise
	 * @throws Exception
	 */
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
	
	/**
	 * Get text from a column using Selenium By locator on a given row number
	 * 
	 * @author Mohit Gupta
	 * 
	 * @param byRowLocator Selenium By locator of rows in list/table
	 * @param byColumnLocator Selenium By locator of column in list/table
	 * @param rowNumber Row number on which action has to be performed
	 * @param isFirstRowHeader true if first row is header, false otherwise
	 * @return				   Text to return from column
	 * @throws Exception
	 */
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

	/**
	 * Get text from a column using List of Selenium WebElements on a given row number
	 * 
	 * @author Mohit Gupta
	 * 
	 * @param rowsLocator List of Selenium WebElements of rows in list/table
	 * @param byColumnLocator Selenium By locator of column in list/table
	 * @param rowNumber Row number on which action has to be performed
	 * @param isFirstRowHeader true if first row is header, false otherwise
	 * @return				   Text to return from column
	 * @throws Exception
	 */
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

	/**
	 * Get text from a textbox in column using Selenium By locator on a given row number
	 * 
	 * @author Mohit Gupta
	 * 
	 * @param byRowLocator Selenium By locator of rows in list/table
	 * @param byColumnLocator Selenium By locator of column in list/table
	 * @param rowNumber Row number on which action has to be performed
	 * @param isFirstRowHeader true if first row is header, false otherwise
	 * @return				   Text retrieved from textbox	
	 * @throws Exception
	 */
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
	
	/**
	 * Get text from a textbox in column using List of Selenium WebElements on a given row number
	 * 
	 * @author Mohit Gupta
	 * 
	 * @param rowsLocator List of Selenium WebElements of rows in list/table
	 * @param byColumnLocator Selenium By locator of column in list/table
	 * @param rowNumber Row number on which action has to be performed
	 * @param isFirstRowHeader true if first row is header, false otherwise
	 * @return				   Text retrieved from textbox	
	 * @throws Exception
	 */
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
	
	/**
	 * Get value of attribute of a column using Selenium By locator on a given row number
	 * 
	 * @author Mohit Gupta
	 * 
	 * @param byRowLocator Selenium By locator of rows in list/table
	 * @param byColumnLocator Selenium By locator of column in list/table
	 * @param rowNumber Row number on which action has to be performed
	 * @param isFirstRowHeader true if first row is header, false otherwise
	 * @param attributeName Name of attribute whose value is to be fetched
	 * @return				Value of attribute
	 * @throws Exception
	 */
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
	
	/**
	 * Get value of attribute of a column using List of Selenium WebElements on a given row number
	 * 
	 * @author Mohit Gupta
	 * 
	 * @param rowsLocator List of Selenium WebElements in rows/table
	 * @param byColumnLocator Selenium By locator of column in list/table
	 * @param rowNumber Row number on which action has to be performed
	 * @param isFirstRowHeader true if first row is header, false otherwise
	 * @param attributeName Name of attribute whose value is to be fetched
	 * @return				Value of attribute
	 * @throws Exception
	 */
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
	
	/**
	 * Is web element visible on a column in list/table using Selenium By locator on a given row number
	 * 
	 * @author Mohit Gupta
	 * 
	 * @param byRowLocator Selenium By locator of rows in list/table
	 * @param byColumnLocator Selenium By locator of column in list/table
	 * @param rowNumber Row number on which action has to be performed
	 * @param isFirstRowHeader true if first row is header, false otherwise
	 * @return				   true if element is visible on column in list/table
	 * @throws Exception
	 */
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
	
	/**
	 * Is web element visible on a column in list/table using List of Selenium WebElements on a given row number
	 * 
	 * @author Mohit Gupta
	 * 
	 * @param rowsLocator List of Selenium WebElements of rows in list/table
	 * @param byColumnLocator Selenium By locator of column in list/table
	 * @param rowNumber Row number on which action has to be performed
	 * @param isFirstRowHeader true if first row is header, false otherwise
	 * @return				   true if element is visible on column in list/table
	 * @throws Exception
	 */
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
	
	/**
	 * Is web element enable on a column in list/table using Selenium By locator on a given row number
	 * 
	 * @author Mohit Gupta
	 * 
	 * @param byRowLocator Selenium By locator of rows in list/table
	 * @param byColumnLocator Selenium By locator of column in list/table
	 * @param rowNumber Row number on which action has to be performed
	 * @param isFirstRowHeader true if first row is header, false otherwise
	 * @return				   true if element is enable on column in list/table
	 * @throws Exception
	 */
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
	
	/**
	 * Is web element enable on a column in list/table using List of Selenium WebElements on a given row number
	 * 
	 * @author Mohit Gupta
	 * 
	 * @param rowsLocator List of Selenium WebElements of rows in list/table
	 * @param byColumnLocator Selenium By locator of column in list/table
	 * @param rowNumber Row number on which action has to be performed
	 * @param isFirstRowHeader true if first row is header, false otherwise
	 * @return				   true if element is enable on column in list/table
	 * @throws Exception
	 */
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
			
	/**
	 * Get data rows in list/table
	 * 
	 * @author Mohit Gupta
	 * 
	 * @param rowLocator List of Selenium WebElements of rows in list/table
	 * @param isFirstRowHeader true if first row is header, false otherwise
	 * @return				   List of Selenium WebElements of data rows
	 */
	public List<WebElement> getDataRows(List<WebElement> rowLocator, Boolean isFirstRowHeader) {
		List<WebElement> dataRows;
		if(isFirstRowHeader) {
			dataRows = rowLocator.subList(1, rowLocator.size()-1);
		}
		else {
			dataRows = rowLocator;
		}
		return dataRows;
	}
	
	/**
	 * Get Selenium WebElement of Header row
	 * 
	 * @author Mohit Gupta
	 * 
	 * @param rows List of Selenium WebElements in list/table
	 * @param isFirstRowHeader true if first row is header, false otherwise
	 * @return				   Selenium WebElement of header row
	 * @throws Exception
	 */
	public WebElement getHeaderRow(List<WebElement> rows, Boolean isFirstRowHeader) throws Exception {
		WebElement headerRow;
		try {
			if(rows.size() > 0) {
				if(isFirstRowHeader) {
					headerRow = rows.get(0);
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
	
	/**
	 * Get Selenium WebElement of column in a list/table using Selenium By locator of rows in list/table on a given row number
	 * 
	 * @author Mohit Gupta
	 * 
	 * @param byRowLocator Selenium By locator of rows in list/table
	 * @param byColumnLocator Selenium By locator of column in list/table
	 * @param rowNumber Row number on which action has to be performed
	 * @param isFirstRowHeader true if first row is header, false otherwise
	 * @return				   Selenium WebElement of column on which action has to be performed
	 * @throws Exception
	 */
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
	
	/**
	 * Get Selenium WebElement of column in a list/table using List of Selenium WebElements of rows in list/table on a given row number
	 * 
	 * @author Mohit Gupta
	 * 
	 * @param rowsLocator List of Selenium WebElements
	 * @param byColumnLocator Selenium By locator of column in list/table
	 * @param rowNumber Row number on which action has to be performed
	 * @param isFirstRowHeader true if first row is header, false otherwise
	 * @return				   Selenium WebElement of column on which action has to be performed
	 * @throws Exception
	 */
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