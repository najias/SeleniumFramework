package tests;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.TestBase;

public class TestApplicationStatus extends TestBase{
	
	@BeforeClass
	public void ClassSetUp() {
		menuBar.signInLink.click();
		signinPage.signIn("nurul@yahoo.com", "365827");
		jobSeekerProfileMenu.applicationStatusLink.click();
		applicationsStatus.jobTitleLink.click();
		
    }
	

	
	
	
	@AfterClass
	public void classTearDown() {
		menuBar.logoutLink.click();
		menuBar.jobsearchLink.click();
	}

}
