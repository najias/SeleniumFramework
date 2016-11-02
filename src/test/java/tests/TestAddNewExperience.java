package tests;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.TestBase;

public class TestAddNewExperience extends TestBase{
	@BeforeClass
    public void ClassSetUp(){
		menuBar.signInLink.click();
		signinPage.signIn("nurul@yahoo.com", "365827");
		jobSeekerProfileMenu.addExperienceLink.click();
		
		
	}
	@Test
	public void testJobTitleWithTitle() {
		addNewExperience.jobTitleField.sendKeys("jhgfdgfsadtfyg");
		addNewExperience.submitButton.click();
        Assert.assertEquals(addNewExperience.errorWebElementList.get(0).getText(), "*");

	}

	@Test
	public void testJobTitleWithEmpty() {
		addNewExperience.submitButton.click();
        Assert.assertEquals(addNewExperience.errorWebElementList.get(0).getText(), "* JobTitle can not be empty.");

	}
	@Test
	public void testSelectYourCompanyWithSelectOption() {
		addNewExperience.companyField.sendKeys("EliteCareer");
		addNewExperience.submitButton.click();
        Assert.assertEquals(addNewExperience.errorWebElementList.get(1).getText(), "*");

	}
	
	
	
	@Test
	public void testSelectYourCompanyWithEmpty() {
		addNewExperience.submitButton.click();
        Assert.assertEquals(addNewExperience.errorWebElementList.get(1).getText(), "* Company can not be empty.");

	}

	@Test
	public void testJoiningDateWithValidDate() {
		addNewExperience.joiningDateField.clear();
		addNewExperience.joiningDateField.sendKeys("2016-01-15");
		addNewExperience.submitButton.click();
        Assert.assertEquals(addNewExperience.errorWebElementList.get(2).getText(), "*");

	}

	@Test
	public void testJoiningDateWithEmpty() {
		addNewExperience.joiningDateField.clear();
		addNewExperience.submitButton.click();
        Assert.assertEquals(addNewExperience.errorWebElementList.get(2).getText(), "* JoiningDate can not be empty.");

	}
	
	@AfterClass 
	public void classTearDown() {
		//menuBar.logoutLink.click();
		//menuBar.jobsearchLink.click();
	}


}
