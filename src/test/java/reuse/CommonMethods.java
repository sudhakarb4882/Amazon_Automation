/**
 * 
 */
package reuse;

import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;
import java.io.FileInputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import config.StartBrowser;
import or.AddToCartPage;
import or.LoginPage;
import or.RegistrationPage;
import utility.ActionsOnDriver;

/**
 * @author akshARA
 *
 */
public class CommonMethods {

	public static WebDriver driver;
	public static ActionsOnDriver aDriver;
	public static Properties prop;
	public static InputStream input;
	
	public CommonMethods() throws IOException 	{
		driver=StartBrowser.driver;
		aDriver=new ActionsOnDriver();
		prop=new Properties();
		input=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\config\\config.properties");
		prop.load(input);
	}
	
	
	public void registration()
	{
		
		aDriver.navigatetoAmazon(prop.getProperty("url"));
		aDriver.move(RegistrationPage.accountsList,RegistrationPage.startHereLink);
		aDriver.type(RegistrationPage.custName, prop.getProperty("username"));
		aDriver.click(RegistrationPage.continueBttn);
		aDriver.click(RegistrationPage.countryCode);
		aDriver.click(RegistrationPage.countryCode1);
		aDriver.type(RegistrationPage.phone, prop.getProperty("phone"));
		aDriver.type(RegistrationPage.pwd, prop.getProperty("pwd"));
		aDriver.click(RegistrationPage.continueBttn);
		
		
	}
	
	public void login()
	{
		
		aDriver.navigatetoAmazon(prop.getProperty("url"));
		aDriver.movelogin(LoginPage.accountsList);
		aDriver.type(LoginPage.email, prop.getProperty("phone1"));
		aDriver.click(LoginPage.continueBttn);
		aDriver.type(LoginPage.pwd, prop.getProperty("pwd"));
		aDriver.click(LoginPage.signIn);
		
		
	}
	
	public void addToCart()
	{
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys( prop.getProperty("item"));
		
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']")).click();
		
		//aDriver.type(AddToCartPage.searchbox, prop.getProperty("item"));
		//aDriver.click(AddToCartPage.searchbtn);
		
		
		//aDriver.click(AddToCartPage.item);
		
		//String parent=driver.getWindowHandle();

		Set<String>s=driver.getWindowHandles();

		// Now iterate using Iterator
		Iterator<String> itr= s.iterator();
		itr.next();
		String child_window=itr.next();
		driver.switchTo().window(child_window);
		aDriver.click(AddToCartPage.cartbtn);
		
		
	   }
	

}
