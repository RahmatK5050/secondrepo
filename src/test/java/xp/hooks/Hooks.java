package xp.hooks;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import xp.base.TestBase;

public class Hooks {

    TestBase test = new TestBase(); 
	
	public Hooks()
	{
		super();
	}
		
	@Before(order = 0)
	public void lunchbrowser() throws InterruptedException
	{
		test.intialization();
	}
	
	@After(order = 0)
	public void quit_browser()
	{
		TestBase.driver.quit();
	}
	
	@After(order = 1)
	public void tear_down(Scenario sc)
	{
	    if(sc.isFailed())
	    {
	    	String screenshotname = sc.getName().replaceAll(" ","_");
	    	byte [] sourcepath = ((TakesScreenshot)TestBase.driver).getScreenshotAs(OutputType.BYTES);
	    	sc.attach(sourcepath, "image/png",screenshotname);
	    }
	}
	
}
