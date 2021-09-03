package tests;

import org.testng.annotations.Test;

import config.StartBrowser;
import reuse.CommonMethods;

public class AmazonTestCases extends StartBrowser {
	
	
  @Test(priority=0)
  public void Registration() throws Exception {
	  CommonMethods cm=new CommonMethods();
	  cm.registration();
	
  }
	
  @Test(dependsOnMethods= {"Registration"})
  public void login() throws Exception {
	  CommonMethods cm=new CommonMethods();
	  cm.login();
	
  }
  
  
  @Test(dependsOnMethods= {"login"})
  public void addToCart() throws Exception {
	  CommonMethods cm=new CommonMethods();
	  cm.addToCart();
	
  }
  
   
  
}
