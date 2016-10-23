package tests;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.TestBase;
import pages.SigninPage;

public class TestSigninPage extends TestBase {

	@BeforeClass
	public void classSetUp() {
		menuBar.signInLink.click();
	}

	@Test
	public void testSignInWithValidCredentials() {
		signinPage.signIn(getProperty("email"), getProperty("password"));
		String url = signinPage.getCurrentUrl();

		menuBar.logoutLink.click();
		menuBar.signInLink.click();

		Assert.assertTrue(url.contains("/profile.php"));

	}

	@Test
	public void testSignInWithInvalidEmailAndValidPassword() {
		signinPage.signIn("sakil@yah.com", "365827");
		String url = signinPage.getCurrentUrl();
		Assert.assertTrue(url.contains("/signin.php"));

	}

	@Test
	public void testSignInWithValidEmailAndInvalidPassword() {
		signinPage.signIn("shakil_ipe@yahoo.com", "867453");
		String url = signinPage.getCurrentUrl();
		Assert.assertTrue(url.contains("/signin.php"));

	}

	@Test
	public void testSignInWithInvalidEmailAndInvalidPassword() {
		signinPage.signIn("sdfg@fgh.dfg.com", "346787");
		String url = signinPage.getCurrentUrl();
		Assert.assertTrue(url.contains("/signin.php"));

	}

	@Test
	public void testSignInWithEmptyEmailAndValidPassword() {
		signinPage.signIn("", "365827");
		String url = signinPage.getCurrentUrl();
		Assert.assertTrue(url.contains("/signin.php"));

	}

	@Test
	public void testSignInWithValidEmailAndEmptyPassword() {
		signinPage.signIn("shakil_ipe@yahoo.com", "");
		String url = signinPage.getCurrentUrl();
		Assert.assertTrue(url.contains("/signin.php"));

	}

	@Test
	public void testSignInWithEmptyEmailAndEmptyPassword() {
		signinPage.signIn("", "");
		String url = signinPage.getCurrentUrl();
		Assert.assertTrue(url.contains("/signin.php"));

	}

	@AfterClass
	public void classTearDown() {
		 menuBar.jobsearchLink.click();
	}

}
