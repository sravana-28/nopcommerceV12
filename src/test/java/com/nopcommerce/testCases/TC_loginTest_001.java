package com.nopcommerce.testCases;


import java.io.IOException;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.mopcommerce.testBase.BaseClass;
import com.nopcommerce.pageObjects.LoginPage;

public class TC_loginTest_001 extends BaseClass{
	
	
	@Test
	public void logintest() throws IOException, InterruptedException
	
	{
        logger.info("**************** Starting TC_LoginTest_001 ************* ");

		driver.get(configPropObj.getProperty("baseURL"));
		LoginPage lp=new LoginPage(driver);
		
		logger.info("**************** Providing login details ************* ");
		lp.setUserName(configPropObj.getProperty("useremail"));
		lp.setPassword(configPropObj.getProperty("password"));
		lp.clickLogin();
		Thread.sleep(3000);
		
		String exp_title="Dashboard / nopCommerce administration123";
		String act_title=driver.getTitle();
		
		if(exp_title.equals(act_title))
		{
			logger.info("**************** loginTest is Passed ************* ");
			Assert.assertTrue(true);
			
		}
		else
		{
			logger.warn("**************** loginTest is Failed************* ");
			captureScreen(driver,"logintest");
			Assert.assertTrue(false);
		}
		logger.info("**************** Finished TC_LoginTest_001 ************* ");
				
	
	}

	
}
