package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.TestBase;

public class TestSigninPage extends TestBase {
	
	@BeforeClass
	public void classSetUp(){
		menuBar.signInLink.click();
	}
	
	@Test
	public void testSignInWithValidCredentials(){
		signinPage.signIn(getProperty("email"), getProperty("password"));
		String  url = signinPage.getCurrentUrl();
		Assert.assertTrue(url.contains("/profiles.php"));
		
	}

}
