// A seperate login page class. This is to initialize login related elements seperately.

package pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testBase.TestBase;

public class LoginPage extends TestBase{
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	//Login ID
	@FindBy(xpath="//input[@id='email']") 
	private static WebElement emailField;  		
		  
	public static void enterEmail(String email)		
	 	{ 
		emailField.sendKeys(email);
	  	}
	//====================================================================
	//Password
	@FindBy(xpath="//input[@id='password']") 
	private static WebElement password;  		
		  
	public static void enterPassword(String pass)		
	 	{ 
		  	password.sendKeys(pass);
	  	}
	//=====================================================================
	//LoginButton Click
	@FindBy(xpath="//button[@type='submit']") 
	private static WebElement loginButton;  		
		  
	public static void clickOnLogin()		
		{ 
		loginButton.click();
		}
	//=====================================================================
	
	//=====================================================================
		//Verify Login 
		@FindBy(xpath="//span[contains(text(),'Dashboard')]") 
		private static WebElement dashboardMenu;  		
			  
		public static String getDashboardText()		
			{ 
			String dashboardText = dashboardMenu.getText();
			return dashboardText;
			}

	
	
	
	
	
	
	
	
	
	
	
	
	

}
