package xp.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import xp.base.TestBase;

public class TestUtil extends TestBase{	
	public static long PAGE_LOAD_TIMEOUT =120;
	public static long IMPLICIT_WAIT = 30;
	
	public static WebElement waitToLoadPage(WebElement ele, String selectorName) {
		WebElement rClientElement = null;
		try {
			WebDriverWait wait = new WebDriverWait(driver,500);
			rClientElement = wait.until((ExpectedConditions.visibilityOfElementLocated((By) ele)));

		} catch (Exception e) {
			System.out.println("ERROR: Element " + selectorName + "  not found");
		}

		return rClientElement;
	}

}
