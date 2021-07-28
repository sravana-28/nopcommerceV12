package com.nopcommerce.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.mopcommerce.testBase.BaseClass;
import com.nopcommerce.pageObjects.LoginPage;

public class dummy extends BaseClass{
	
	@Test
	public void loginTest()
	{
		driver.get("http://admin-demo.nopcommerce.com");
		LoginPage lp=new LoginPage(driver);
		
		lp.setUserName("admin@yourstore.com");
		lp.setPassword("admin");
		lp.clickLogin();
		
		String exp_title="Dashboard / nopCommerce administration";
		String act_title=driver.getTitle();
		
		if(exp_title.equals(act_title))
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);

		}
		
	}

}
