package tests;

import org.testng.annotations.Test;

import config.StartBrowser;
import reuse.CommonMethods;

public class LoginTestCase extends StartBrowser{
	@Test
	public void logintest() throws Exception {

		CommonMethods cm=new CommonMethods();
		cm.login();


	}
}
