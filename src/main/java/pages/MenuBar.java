package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.PageBase;

public class MenuBar extends PageBase{
	
	@FindBy(linkText = "Signin")
	public WebElement signInLink;
	

	@FindBy(linkText = "Logout")
	public WebElement logoutLink;
	
	
	@FindBy(linkText = "Register")
	public WebElement registrationLink;


	@FindBy(linkText = "Job Search")
	public WebElement jobsearchLink;
	
	@FindBy(linkText = "Hi, SHAKIL KHAN")
	public WebElement shakilKhanLink;


	
}
