package tests;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.TestBase;

public class TestAddNewEducation extends TestBase {
	@BeforeClass
	public void classSetUp() {

		menuBar.signInLink.click();
		signinPage.signIn("nurul@yahoo.com", "365827");
		jobSeekerProfileMenu.addEducationLink.click();
		

	}

	@Test
	public void testDegreeTypeWithSelectOption() {
		addNewEducation.degreeType.sendKeys("High School Diploma/GED");
		addNewEducation.submitButton.click();

		Assert.assertEquals(addNewEducation.errorWebElementList.get(0).getText(), "*");

	}


	@Test
	public void testDegreeTypeWithNoOption() {
		addNewEducation.submitButton.click();
		Assert.assertEquals(addNewEducation.errorWebElementList.get(0).getText(), "* DegreeType can not be empty.");

	}

	@Test
	public void testDegreeNameWithEmpty() {
		addNewEducation.submitButton.click();
		Assert.assertEquals(addNewEducation.errorWebElementList.get(1).getText(), "* DegreeName can not be empty.");

	}
	@Test
	public void testStartingYearWithEmpty() {
		addNewEducation.submitButton.click();
		Assert.assertEquals(addNewEducation.errorWebElementList.get(2).getText(), "* StartingYear can not be empty.");

	}
	@Test
	public void testGraduationYearWithEmpty() {
		addNewEducation.submitButton.click();
		Assert.assertEquals(addNewEducation.errorWebElementList.get(3).getText(), "* GraduationYear can not be empty.");

	}
	@Test
	public void testSchoolNameWithEmpty() {
		addNewEducation.submitButton.click();
		Assert.assertEquals(addNewEducation.errorWebElementList.get(4).getText(), "* SchoolName can not be empty.");

	}
	@Test
	public void testCityWithEmpty() {
		addNewEducation.submitButton.click();
		Assert.assertEquals(addNewEducation.errorWebElementList.get(5).getText(), "* City can not be empty.");

	}
	@Test
	public void testStateWithEmpty() {
		addNewEducation.submitButton.click();
		Assert.assertEquals(addNewEducation.errorWebElementList.get(6).getText(), "* State can not be empty.");

	}
	@Test
	public void testCountryWithEmpty() {
		addNewEducation.submitButton.click();
		Assert.assertEquals(addNewEducation.errorWebElementList.get(7).getText(), "* Country can not be empty.");

	}
	@Test
	public void testZipCodeWithEmpty() {
		addNewEducation.zipCodeField.clear();
		addNewEducation.submitButton.click();
		Assert.assertEquals(addNewEducation.errorWebElementList.get(8).getText(), "* ZipCode can not be empty.");

	}
	//@Test
	//public void testDegreeTypeWithN() {
	//	addNewEducation.submitButton.click();
	//	Assert.assertEquals(addNewEducation.errorWebElementList.get().getText(), ".");

	//}
	//@Test
//	public void testDegreeTypeWithN() {
	//	addNewEducation.submitButton.click();
		//Assert.assertEquals(addNewEducation.errorWebElementList.get().getText(), ".");

	//}
	@Test
	public void testZipCodeWithChar() {
		addNewEducation.zipCodeField.sendKeys("asdf");
		addNewEducation.submitButton.click();
		Assert.assertEquals(addNewEducation.errorWebElementList.get(8).getText(), "*");

	}

	@AfterClass
	public void classTearDown() {
		//menuBar.logoutLink.click();
		menuBar.jobsearchLink.click();
	}

}
