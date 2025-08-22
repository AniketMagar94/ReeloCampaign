// A seperate login page class. This is to initialize login related elements seperately.

package pageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testBase.TestBase;

//Public Actions actions;
public class CampaignPage extends TestBase{
	static Actions actions = new Actions(driver);
	public CampaignPage() {
		PageFactory.initElements(driver, this);
	}
	
	//=====================================================================
	//Click on Campaigns
		@FindBy(xpath="(//span[contains(text(),'Campaigns')])[1]") 
		private static WebElement campaignTab;  		
				  
		public static void ClickOnCampaigns()		
		{ 
			campaignTab.click();
		}
		
		//=====================================================================
		//Select Ganesh Chaturthi
			@FindBy(xpath="//div/h5[contains(text(),'Ganesh Chaturthi')]") 
			private static WebElement selectEvent ;  		
					  
			public static void ClickOnGaneshChaturthi()		
			{ 
				selectEvent.click();
			}
			
		//=====================================================================
		//Select Template
			@FindBy(xpath="//h4[contains(text(),'Save Rs.75 This Wednesday!')]") 
			private static WebElement template ;  		
						  
			public static void selectTemplate()		
			{ 
				template.click();
			}
	
	
			
			//=====================================================================
			//Select SMS Communication
				@FindBy(xpath="//div[contains(text(),'SMS')]") 
				private static WebElement SMSOption ;  		
							  
				public static void selectSMSOption()		
				{ 
					SMSOption.click();
				}	
			
			//=====================================================================
			//CLick on Customise and Send
			@FindBy(xpath="//button[@type=\"submit\"]") 
			private static WebElement CustomiseAndSend ;  		
								  
			public static void clickOnCustomiseAndSend()		
			{ 
				CustomiseAndSend.click();
			}

			
			
			//=====================================================================
			//Remove Email checkbox
			@FindBy(xpath="(//div/h6[contains(text(),'Email')]/../..//div)[2]") 
			private static WebElement emailCheckbox ;  		
								  
			public static void removeEmailCheckbox()		
			{ 
				emailCheckbox.click();
			}	
			
			
			//=====================================================================
			//Click on Next
			@FindBy(xpath="//button[@type='submit']") 
			private static WebElement NextButton ;  		
								  
			public static void clickOnNextButton()		
			{ 
//				NextButton.click();
				actions.moveToElement(NextButton).click().perform();
				
			}
			
			
			//=====================================================================
			//Change Campaign title
			@FindBy(xpath="//input[@placeholder='Enter Title']") 
			private static WebElement titleTextBox;  		
								  
			public static String changeTitle(String newTitle)		
			{ 
//				titleTextBox.clear();
				titleTextBox.sendKeys(Keys.CONTROL + "a");
				titleTextBox.sendKeys(Keys.DELETE);
				titleTextBox.sendKeys(newTitle);
				return newTitle;
			}
			
			//=====================================================================
			//Change Store Name
			@FindBy(xpath="(//div[@class='textarea']/input)[1]") 
			private static WebElement storeNameField;  		
										  
			public static String changeStoreName(String newStoreName)		
			{ 
			//titleTextBox.clear();
			storeNameField.sendKeys(Keys.CONTROL + "a");
			storeNameField.sendKeys(Keys.DELETE);
			storeNameField.sendKeys(newStoreName);
			return newStoreName;
			}
	
			
	
			//=====================================================================
			//Click on Test Campaign
			@FindBy(xpath="//span[contains(text(),'Test campaign')]") 
			private static WebElement TestCampaignButton ;  		
								  
			public static void clickOnTestCampaign()		
			{ 
				TestCampaignButton.click();
			}
			
			//=====================================================================
			//Verify Test Campaign 
			@FindBy(xpath="//div[contains(text(),'Test message sent successfully')]") 
			private static WebElement toastMessage;  		
				  
			public static String getToastMessageText()		
				{ 
				String dashboardText = toastMessage.getText();
				return dashboardText;
				}
	

}
