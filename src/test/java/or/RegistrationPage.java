/**
 * 
 */
package or;

import org.openqa.selenium.By;

/**
 * @author akshARA
 *
 */
public class RegistrationPage {

	
	public static By accountsList=By.xpath("//a[@id='nav-link-accountList']");
	public static By startHereLink=By.xpath("//a[@rel='nofollow' and @class='nav-a']");
	public static By custName=By.id("ap_customer_name");
	public static By countryCode=By.xpath("//span[@class='a-button-text a-declarative']");
	public static By countryCode1=By.xpath("//ul[@role='application']//li/a[contains(text(),'United States +1')]");
	public static By phone=By.id("ap_phone_number");
	public static By pwd=By.id("ap_password");
	public static By continueBttn=By.id("continue");
	
	
	
}
