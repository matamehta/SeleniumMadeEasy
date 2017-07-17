package WebActions;

import java.util.List;

import org.openqa.selenium.By;
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
	
	public void waitForTextInElementUsingBy(By byLocator, String text) {
		wait.until(ExpectedConditions.textToBePresentInElementLocated(byLocator, text));
	}
	
	public void waitForTextInElementUsingWebElement(WebElement elementLocator, String text) {
		wait.until(ExpectedConditions.textToBePresentInElementValue(elementLocator, text));
	}
	
	public void waitForExactTextInElementUsingBy(By byLocator, String text) {
		wait.until(ExpectedConditions.textToBe(byLocator, text));
	}
	
	public void waitForElementToBeVisibleUsingBy(By byLocator) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(byLocator));
	}
	
	public void waitForElementToBeVisibleUsingWebElement(WebElement elementLocator) {
		wait.until(ExpectedConditions.visibilityOf(elementLocator));
	}
	
	public void waitForAllElementToBeVisibleUsingBy(By byLocator) {
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(byLocator));
	}
	
	public void waitForAllElementToBeVisibleUsingWebElement(List<WebElement> elements) {
		wait.until(ExpectedConditions.visibilityOfAllElements(elements));
	}
	
	public void waitForAlertToBePresent() {
		wait.until(ExpectedConditions.alertIsPresent());
	}
	
	public void waitForFrameAndSwitchUsingIndex(int index) {
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(index-1));
	}
	
	public void waitForFrameAndSwitchUsingString(String frameName) {
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameName));
	}
	
	public void waitForFrameAndSwitchUsingIndexUsingBy(By byLocator) {
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(byLocator));
	}
	
	public void waitForFrameAndSwitchUsingIndexUsingWebElement(WebElement elementLocator) {
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(elementLocator));
	}
	
	public void waitForAttributeInElementUsingBy(By byLocator, String attribute, String value) {
		wait.until(ExpectedConditions.attributeContains(byLocator, attribute, value));
	}
	
	public void waitForAttributeInElementUsingWebElement(WebElement elementLocator, String attribute, String value) {
		wait.until(ExpectedConditions.attributeContains(elementLocator, attribute, value));
	}
	
	public void waitForExactAttributeInElementUsingBy(By byLocator, String attribute, String value) {
		wait.until(ExpectedConditions.attributeToBe(byLocator, attribute, value));
	}
	
	public void waitForExactAttributeInElementUsingWebElement(WebElement elementLocator, String attribute, String value) {
		wait.until(ExpectedConditions.attributeToBe(elementLocator, attribute, value));
	}
}
