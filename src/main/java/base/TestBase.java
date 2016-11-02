package base;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;

import pages.AddNewEducation;
import pages.AddNewExperience;
import pages.JobSeekerProfileMenu;
import pages.MenuBar;
import pages.RegisterPage;
import pages.SigninPage;

@Listeners(listener.EliteListener.class)
public class TestBase extends Driver{
	
	String browserType = getProperty("browser");
	String appUrl = getProperty("appUrl");
	
	
	// object for all classes in 'pages' package
	
	protected static SigninPage  signinPage;
	protected static MenuBar  menuBar;
	protected static RegisterPage  registerPage ;
	protected static JobSeekerProfileMenu  jobSeekerProfileMenu;
	protected static AddNewEducation  addNewEducation ;
	protected static AddNewExperience addNewExperience;
	
	
	@BeforeSuite
	public void setUp(){
		try{
			
			setDriver(browserType, appUrl);
			
		}catch (Exception  e){
			e.printStackTrace();
		}
		//
		signinPage =  PageFactory.initElements(driver, SigninPage.class);
		menuBar = PageFactory.initElements(driver, MenuBar.class);
		registerPage = PageFactory.initElements(driver, RegisterPage.class);
		jobSeekerProfileMenu = PageFactory.initElements(driver, JobSeekerProfileMenu.class);
		addNewEducation = PageFactory.initElements(driver, AddNewEducation.class);
		addNewExperience= PageFactory.initElements(driver, AddNewExperience.class);
	}
	@AfterSuite
	public void tearDown(){
		driver.quit();
	}

}
