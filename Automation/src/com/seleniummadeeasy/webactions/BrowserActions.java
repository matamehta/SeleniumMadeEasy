package com.seleniummadeeasy.webactions;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;

public class BrowserActions {
	
	WebDriver driver;
	
	public BrowserActions(WebDriver driver) {
		this.driver = driver;
	}
	
	public void openUrl(String url) {
		driver.get(url);
	}
	
	public String getTitleOfBrowser() {
		String browserTitle = null;
		browserTitle = driver.getTitle();
		return browserTitle;
	}
	
	public void closeBrowserWindowOrTab() {
		driver.close();
	}
	
	public void closeSeleniumInstance() {
		driver.quit();
	}
	
	public String getUrlOfBrowser() {
		String url = null;
		url = driver.getCurrentUrl();
		return url;
	}
	
	public void navigateBackInBrowserHistory() {
		driver.navigate().back();
	}
	
	public void navigateForwardInBrowserHistory() {
		driver.navigate().forward();
	}
	
	public void refreshBrowser() {
		driver.navigate().refresh();
	}
	
	public void addCookieInBrowser(Cookie cookie) {
		driver.manage().addCookie(cookie);
	}
	
	public Cookie getBrowserCookieWithName(String name) {
		Cookie browserCookie = null;
		browserCookie = driver.manage().getCookieNamed(name);
		return browserCookie;
	}
	
	public Set<Cookie> getAllCookiesPresentInBrowser() {
		Set<Cookie> allCookies = null;
		allCookies = driver.manage().getCookies();
		return allCookies;
	}
	
	public void deleteCookieInBrowserWithName(String name) {
		driver.manage().deleteCookieNamed(name);
	}
	
	public void deleteCookieInBrowser(Cookie cookie) {
		driver.manage().deleteCookie(cookie);
	}
	
	public void deleteAllCookieInBrowser() {
		driver.manage().deleteAllCookies();
	}
}
