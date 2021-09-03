/**
 * 
 */
package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import config.StartBrowser;

/**
 * @author akshARA
 *
 */
public class ActionsOnDriver  {

	public static WebDriver driver;

	public ActionsOnDriver()
	{
		driver=StartBrowser.driver;

	}

	public void navigatetoAmazon(String url)
	{
		
		driver.get(url);
		
	}
	public  void move(By locator1, By locator2)
	{
		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(locator1)).build().perform();
		driver.findElement(locator2).click();
	}
	public  void movelogin(By locator)
	{
		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(locator)).click().build().perform();
		//driver.findElement(locator2).click();
	}
	
	public  void type(By locator, String txt)
	{
		driver.findElement(locator).sendKeys(txt);
	}

	public  void click(By locator)
	{
		driver.findElement(locator).click();
	}



}
