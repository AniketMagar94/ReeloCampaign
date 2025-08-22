package testCases;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import testBase.TestBase;
import utility.TakeScreenshots;
import pageLayer.CampaignPage;
import pageLayer.LoginPage;
import pageLayer.newAccount;

public class TestCases extends testBase.TestBase{

 
//========================================================================
//	@Test 
	public void createAccount() throws InterruptedException {
		driver.get("https://dev.reelo.io/signup");
		newAccount.enterName("Aniket Magar");
		newAccount.enterEmail("aniketmagar29@gmail.com");
		newAccount.enterNumber("8625801994");
		newAccount.enterPass("aniket1994");
		newAccount.clickOnSubmit();
		Thread.sleep(20000);
		
		}

	
	//========================================================================
		@Test 
		public void login() throws InterruptedException {
			driver.get("https://dev.reelo.io/");
			LoginPage.enterEmail("aniketmagar29@gmail.com");
			LoginPage.enterPassword("aniket1994");
			LoginPage.clickOnLogin();		
			Assert.assertEquals(LoginPage.getDashboardText(), "Dashboard");
			System.out.println(LoginPage.getDashboardText());
			Thread.sleep(2000);
			TakeScreenshots.save("Login Successful");
			
			// Select Campaign
			CampaignPage.ClickOnCampaigns();
			CampaignPage.ClickOnGaneshChaturthi();
			Thread.sleep(1000);
			Actions action = new Actions(driver);
			action.sendKeys(Keys.ESCAPE).perform();
			Thread.sleep(2000);
			CampaignPage.selectTemplate();
			Thread.sleep(500);
			CampaignPage.selectSMSOption();
			CampaignPage.clickOnCustomiseAndSend();
			CampaignPage.removeEmailCheckbox();
			CampaignPage.clickOnNextButton();
			CampaignPage.changeTitle("On Ganesh Chaturthi – Save Rs.75 This Wednesday with us!");
			Thread.sleep(2000);
			CampaignPage.clickOnNextButton();
			Thread.sleep(2000);
			CampaignPage.clickOnNextButton();
			Thread.sleep(2000);
			CampaignPage.clickOnNextButton();
			Thread.sleep(2000);
			CampaignPage.clickOnNextButton();
			CampaignPage.changeStoreName("Aniket's Store");
			Thread.sleep(5000);
			CampaignPage.clickOnNextButton();
			CampaignPage.clickOnTestCampaign();
			Thread.sleep(1000);
			Assert.assertEquals(CampaignPage.getToastMessageText(),"Test message sent successfully");
			TakeScreenshots.save("Test Campaign Successful");
			Thread.sleep(8000);
			}		
		
		
		
		
		

	
	
	
	

}
