package utils;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CustomKeywords {
	private static JavascriptExecutor js;
	 private static Actions actions;
	
	 public static void initializeObjects() {
	        WebDriver driver = HelperClass.getDriver();
	        new WebDriverWait(driver, Duration.ofSeconds(10));
	        js = (JavascriptExecutor) driver;
	        actions = new Actions(driver);
	    }
	    
	    public void customClick(WebElement element) {
	    	try {
				element.click();
			} catch (Exception e) {
				js.executeScript("arguments[0].click()", element);
			}
	    }
	    
	    public void moveToElement(WebElement element) {
	    	actions.moveToElement(element);
	    }
	    
	    public boolean isElementPresent(WebElement element) {
	        try {
	            return element.isDisplayed(); // Check if the element is displayed
	        } catch (NoSuchElementException | NullPointerException | org.openqa.selenium.StaleElementReferenceException e) {
	            return false;
	        }
	    }
}
