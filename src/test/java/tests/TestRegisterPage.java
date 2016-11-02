package tests;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.TestBase;

public class TestRegisterPage extends TestBase {
	@BeforeClass
	public void classSetUp() {
		menuBar.registrationLink.click();
	}

	@Test
	public void testFirstNameWithOneCharacter() {
		registerPage.firstNameField.clear();
		registerPage.firstNameField.sendKeys("a");
		registerPage.submitButton.click();

		Assert.assertEquals(registerPage.errorWebElementList.get(0).getText(),
				"* FirstName can not be less than 2 character.");

	}

	@Test
	public void testFirstNameWithTwoCharacter() {
		registerPage.firstNameField.clear();
		registerPage.firstNameField.sendKeys("na");
		registerPage.submitButton.click();
		Assert.assertEquals(registerPage.errorWebElementList.get(0).getText(), "*");

	}

	@Test
	public void testFirstNameWithThirtyCharacter() {
		registerPage.firstNameField.clear();
		registerPage.firstNameField.sendKeys("mynameisDewanNadiaSultanaShumi");
		registerPage.submitButton.click();
		Assert.assertEquals(registerPage.errorWebElementList.get(0).getText(), "*");

	}

	@Test
	public void testFirstNameWithThirtyOneCharacter() {
		registerPage.firstNameField.clear();
		registerPage.firstNameField.sendKeys("My name is Dewan Nadia Sultanaa");
		registerPage.submitButton.click();
		Assert.assertEquals(registerPage.errorWebElementList.get(0).getText(),
				"* FirstName can not be greater than 30 character.");

	}

	@Test
	public void testFirstNameWithNoCharacter() {
		registerPage.submitButton.click();
		Assert.assertEquals(registerPage.errorWebElementList.get(0).getText(), "* FirstName can not be empty.");

	}

	@Test
	public void testFirstNameWithThirtyDigitNumber() {
		registerPage.firstNameField.clear();
		registerPage.firstNameField.sendKeys("345265789345678123456789876543");
		registerPage.submitButton.click();
		Assert.assertEquals(registerPage.errorWebElementList.get(0).getText(), "*");
	}

	@Test
	public void testLastNameWithOneCharacter() {
		registerPage.lastNameField.clear();
		registerPage.lastNameField.sendKeys("a");
		registerPage.submitButton.click();

		Assert.assertEquals(registerPage.errorWebElementList.get(1).getText(),
				"* LastName can not be less than 2 character.");

	}

	@Test
	public void testLastNameWithTwoCharacter() {
		registerPage.lastNameField.clear();
		registerPage.lastNameField.sendKeys("na");
		registerPage.submitButton.click();
		Assert.assertEquals(registerPage.errorWebElementList.get(1).getText(), "*");

	}

	@Test
	public void testLastNameWithThirtyCharacter() {
		registerPage.lastNameField.clear();
		registerPage.lastNameField.sendKeys("mynameisDewanNadiaSultanaShumi");
		registerPage.submitButton.click();
		Assert.assertEquals(registerPage.errorWebElementList.get(1).getText(), "*");

	}

	@Test
	public void testLastNameWithThirtyOneCharacter() {
		registerPage.lastNameField.clear();
		registerPage.lastNameField.sendKeys("my name is Dewan Nadia Sultanaa");
		registerPage.submitButton.click();
		Assert.assertEquals(registerPage.errorWebElementList.get(1).getText(),
				"* LastName can not be greater than 30 character.");

	}

	@Test
	public void testLastNameWithNoCharacter() {
		registerPage.submitButton.click();
		Assert.assertEquals(registerPage.errorWebElementList.get(1).getText(), "* LastName can not be empty.");

	}

	@Test
	public void testLastNameWithThirtyDigitNumber() {
		registerPage.lastNameField.clear();
		registerPage.lastNameField.sendKeys("3452657893456712345678987653");
		registerPage.submitButton.click();
		Assert.assertEquals(registerPage.errorWebElementList.get(1).getText(), "*");
	}

	@Test
	public void testGenderWithNoOption() {
		registerPage.submitButton.click();
		Assert.assertEquals(registerPage.errorWebElementList.get(2).getText(), "* Gender can not be empty.");

	}

	@Test
	public void testDateOfBirthWithNoDate() {
		registerPage.dateOfBirthField.clear();
		registerPage.submitButton.click();
		Assert.assertEquals(registerPage.errorWebElementList.get(3).getText(), "* DateOfBirth can not be empty.");

	}

	@Test
	public void testDateOfBirthWithFutureDate() {
		registerPage.dateOfBirthField.clear();
		registerPage.dateOfBirthField.sendKeys("2018-12-19");
		registerPage.submitButton.click();
		Assert.assertEquals(registerPage.errorWebElementList.get(3).getText(), "*");

	}

	@Test
	public void testPhoneNoWithTwoDigitNumber() {
		registerPage.phoneNoField.clear();
		registerPage.phoneNoField.sendKeys("34");
		registerPage.submitButton.click();
		Assert.assertEquals(registerPage.errorWebElementList.get(4).getText(), "*");

	}

	@Test
	public void testPhoneNoWithThirtyOneDigitNumber() {
		registerPage.phoneNoField.clear();
		registerPage.phoneNoField.sendKeys("1234567890123456789009876543211");
		registerPage.submitButton.click();
		Assert.assertEquals(registerPage.errorWebElementList.get(4).getText(),
				"* PhoneNo can not be greater than 30 character.");

	}

	@Test
	public void testPhoneNoWithNoNumber() {
		registerPage.submitButton.click();
		Assert.assertEquals(registerPage.errorWebElementList.get(4).getText(), "* PhoneNo can not be empty.");

	}

	@Test
	public void testUserTypeWithNoOption() {
		registerPage.submitButton.click();
		Assert.assertEquals(registerPage.errorWebElementList.get(5).getText(), "* UserType can not be empty.");

	}

	@Test
	public void testEmailWithInvalidEmail() {
		registerPage.emailField.clear();
		registerPage.emailField.sendKeys("sultana1@gmailcom");
		registerPage.submitButton.click();
		Assert.assertEquals(registerPage.errorWebElementList.get(6).getText(), "* Invalid Email");

	}

	@Test
	public void testEmailWithEmptyEmailField() {
		registerPage.submitButton.click();
		Assert.assertEquals(registerPage.errorWebElementList.get(6).getText(), "* Email can not be empty.");

	}

	@Test
	public void testPasswordWithInvalidPassword() {
		registerPage.passwordField.clear();
		registerPage.passwordField.sendKeys("InvalidPassword");
		registerPage.submitButton.click();
		Assert.assertEquals(registerPage.errorWebElementList.get(7).getText(), "*");

	}

	@Test
	public void testPasswordWithEmptyPassword() {
		registerPage.submitButton.click();
		Assert.assertEquals(registerPage.errorWebElementList.get(7).getText(), "* Password can not be empty.");

	}

	@Test
	public void testPasswordWithFiveCharacter() {
		registerPage.passwordField.clear();
		registerPage.passwordField.sendKeys("hgfds");
		registerPage.submitButton.click();
		Assert.assertEquals(registerPage.errorWebElementList.get(7).getText(), "* Password can not be less than 6 character.");

	}

	@Test
	public void testPasswordWithSixToTwentyDigitNumber() {
		registerPage.passwordField.clear();
		registerPage.passwordField.sendKeys("12345678900987654321");
		registerPage.submitButton.click();
		Assert.assertEquals(registerPage.errorWebElementList.get(7).getText(), "*");

	}

	@Test
	public void testPasswordWithTwentyOneCharacter() {
		registerPage.passwordField.clear();
		registerPage.passwordField.sendKeys("asdfghjklpoiuytrewqzx");
		registerPage.submitButton.click();
		Assert.assertEquals(registerPage.errorWebElementList.get(7).getText(), "* Password can not be greater than 20 character.");

	}
	

	@Test
	public void testConfirmPasswordWithInvalidPassword() {
		registerPage.confirmPasswordField.clear();
		registerPage.confirmPasswordField.sendKeys("InvalidPassword");
		registerPage.submitButton.click();
		Assert.assertEquals(registerPage.errorWebElementList.get(8).getText(), "* ConfirmPassword did not match.");

	}

	@Test
	public void testConfirmPasswordWithEmptyPassword() {
		registerPage.submitButton.click();
		Assert.assertEquals(registerPage.errorWebElementList.get(8).getText(), "* ConfirmPassword can not be empty.");

	}


	@Test
	public void testCaptchaImageWithEmpty() {
		registerPage.submitButton.click();
		Assert.assertEquals(registerPage.errorWebElementList.get(9).getText(), "* Captcha can not be empty.");

	}

	@Test
	public void testCaptchaImageWithInvalidInput() {
		registerPage.captchaImageField.sendKeys("Invalid Image");
		registerPage.submitButton.click();
		Assert.assertEquals(registerPage.errorWebElementList.get(9).getText(), "* Wrong Code Entered");

	}
	
	@Test
	public void testPrivacyPolicyWithEmpty() {
		registerPage.privacyCheckBox.click();
		registerPage.submitButton.click();
		Assert.assertEquals(registerPage.errorWebElementList.get(10).getText(), "* Privacy can not be empty.");

	}
	
//	@Test
//	public void testRegistrationPageWithAllEmptyField() {
//		registerPage.pageRefresh();
//		registerPage.privacyCheckBox.click();
//		registerPage.subscribeCheckBox.click();
//		registerPage.submitButton.click();
//		Assert.assertEquals(registerPage.errorWebElementList.get(0).getText(), "* FirstName can not be empty.");
//		Assert.assertEquals(registerPage.errorWebElementList.get(1).getText(), "* LastName can not be empty.");
//		Assert.assertEquals(registerPage.errorWebElementList.get(2).getText(), "* Gender can not be empty.");
//		Assert.assertEquals(registerPage.errorWebElementList.get(3).getText(), "* DateOfBirth can not be empty.");
//		Assert.assertEquals(registerPage.errorWebElementList.get(4).getText(), "* PhoneNo can not be empty.");
//		Assert.assertEquals(registerPage.errorWebElementList.get(5).getText(), "* UserType can not be empty.");
//		Assert.assertEquals(registerPage.errorWebElementList.get(6).getText(), "* Email can not be empty.");
//		Assert.assertEquals(registerPage.errorWebElementList.get(7).getText(), "* Password can not be empty.");
//		Assert.assertEquals(registerPage.errorWebElementList.get(8).getText(), "* ConfirmPassword can not be empty.");
//		Assert.assertEquals(registerPage.errorWebElementList.get(9).getText(), "* Captcha can not be empty.");
//		Assert.assertEquals(registerPage.errorWebElementList.get(10).getText(), "* Privacy can not be empty.");
//
//
//	}


	@AfterClass
	public void classTearDown() {
		menuBar.jobsearchLink.click();
	}

}
