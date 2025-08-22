package pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testBase.TestBase;

public class newAccount extends TestBase {

	public newAccount() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='name']") 
	private static WebElement nameField;  		
		  
	public void enterName(String username)		
	 	{ 
		nameField.sendKeys(username);
	  	}
	//////////////////////////
	
	@FindBy(xpath="//input[@id='email']") 
	private static WebElement emailField;  		
		  
	public void enterEmail(String email)		
	 	{ 
		emailField.sendKeys(email);
	  	}
//////////////////////////
	@FindBy(xpath="//input[@id='number']") 
	private static WebElement numberField;  		
		  
	public void enterNumber(String number)		
	 	{ 
		numberField.sendKeys(number);
	  	}
	
		//////////////////////////
		@FindBy(xpath="//input[@id='password']") 
		private static WebElement passField;  		
		
		public void enterPass(String pass)		
		{ 
			passField.sendKeys(pass);
		}
	
		//////////////////////////
		@FindBy(xpath="//button[@type='submit']/span") 
		private static WebElement submitButton;  		
		
		public void clickOnSubmit()		
		{ 
			submitButton.click();
		}
}
