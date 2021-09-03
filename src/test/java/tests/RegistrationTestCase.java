package tests;

import org.testng.annotations.Test;

import config.StartBrowser;
import reuse.CommonMethods;

public class RegistrationTestCase extends StartBrowser {
  @Test
  public void register() throws Exception {
	  
	 CommonMethods cm=new CommonMethods();
	  cm.registration();
  }
	  
	  
 
}
