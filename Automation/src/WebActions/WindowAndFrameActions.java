package WebActions;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WindowAndFrameActions {
	
	WebDriver driver;
	
	public WindowAndFrameActions(WebDriver driver) {
		this.driver = driver;
	}
	
	public void switchToWindowUsingExactTitle(String title) throws Exception {
		try {
			Set<String> windows = driver.getWindowHandles();
			Boolean windowFound = false;
			if(windows.size() > 0) {
				for(String window : windows) {
					if(window.equals(title)) {
						driver.switchTo().window(window);
						windowFound = true;
						break;
					}
				}
				if(!windowFound) {
					throw new NoSuchWindowException("Browser window with title " + title + " is not present");
				}
			}
			else {
				throw new Exception("No browser window is present");
			}
		}
		catch(Exception e) {
			throw new Exception(e.getCause().toString());
		}
		
	}
	
	public void switchToWindowContainingTextUsingTitle(String title) throws Exception {
		try {
			Set<String> windows = driver.getWindowHandles();
			Boolean windowFound = false;
			if(windows.size() > 0) {
				for(String window : windows) {
					if(window.contains(title)) {
						driver.switchTo().window(window);
						windowFound = true;
						break;
					}
				}
				if(!windowFound) {
					throw new NoSuchWindowException("Browser window containing title " + title + " is not present");
				}
			}
			else {
				throw new Exception("No browser window is present");
			}
		}
		catch(Exception e) {
			throw new Exception(e.getCause().toString());
		}
	}
	
	public void switchToWindowUsingIndex(int index) {
		try {
			Set<String> windows = driver.getWindowHandles();
			String window;
			
			if(windows.size() >= index && index > 0) {
				for(int i = 0; i < windows.size(); i++) {
					window = driver.getTitle();
					driver.switchTo().window(window);
					if(i == (index-1)) {
						break;
					}		
				}
			}
		}
		catch(Exception e) {
			
		}
	}
	
	public Set<String> getAllWindowsTitles() {
		Set<String> windows;
		windows = driver.getWindowHandles();
		return windows;
	}
	
	public void switchToFrameUsingIndex(int index) {
		driver.switchTo().frame(index-1);
	}
	
	public void switchToFrameUsingFrameName(String frameName) {
		driver.switchTo().frame(frameName);
	}
	
	public void switchToFrameUsingBy(By byLocator) {
		WebElement element = driver.findElement(byLocator);
		driver.switchTo().frame(element);
	}
	
	public void switchToFrameUsingWebElement(WebElement elementLocator) {
		driver.switchTo().frame(elementLocator);
	}
	
	public void switchFromFrame() {
		driver.switchTo().defaultContent();
	}
	
	public void switchFromFrameToParent() {
		driver.switchTo().parentFrame();
	}
	
	public void maximizeBrowserWindow() {
		driver.manage().window().maximize();
	}
	
	public void setBrowserSize(int x, int y) {
		Dimension d = new Dimension(x,y);
		driver.manage().window().setSize(d);
	}
}