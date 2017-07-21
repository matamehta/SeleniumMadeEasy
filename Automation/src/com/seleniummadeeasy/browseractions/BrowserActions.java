package com.seleniummadeeasy.browseractions;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

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
	
	public void openDeviceOnChromeEmulation(String deviceName) {
		Map<String, String> mobileEmulation = new HashMap<String, String>();
		mobileEmulation.put("deviceName", "iPad");

		Map<String, Object> chromeOptions = new HashMap<String, Object>();
		chromeOptions.put("mobileEmulation", mobileEmulation);
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
		openBrowser("chrome", capabilities);
	}
	
	public void openBrowser(String browserName) {
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	public void openBrowser(String browserName, DesiredCapabilities capabilites) {
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver(capabilites);
	}
	
	public void openBrowserWithCustomSize(String browserName, int width, int height) {
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		Dimension dim = new Dimension(width, height);
		driver.manage().window().setSize(dim);
	}
	
	public void openBrowserWithCustomSize(String browserName, int width, int height, DesiredCapabilities capabilites) {
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver(capabilites);
		Dimension dim = new Dimension(width, height);
		driver.manage().window().setSize(dim);
	}
	
	public DesiredCapabilities setDesiredCapabilities(HashMap<String, String> capabilities) {
		DesiredCapabilities dc = new DesiredCapabilities();
		if(capabilities.size() > 0) {
			for(Map.Entry<String, String> entry : capabilities.entrySet()) {
				dc.setCapability(entry.getKey(), entry.getValue());
			}
		}
		return dc;
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