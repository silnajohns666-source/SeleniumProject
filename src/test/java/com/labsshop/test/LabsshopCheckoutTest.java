package com.labsshop.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.labsshop.base.LabsshopBaseClass;

public class LabsshopCheckoutTest extends LabsshopBaseClass{
	
	@Test(priority=1)
	public void fieldvalues() {
		ck.setValues("silna", "johns", "silnajohns@gmail.com", "7559947487", "Kunnummel,Ponganamkad", "Kerala","thrissur", "680028");
		
	}
	
	@Test(priority=2)
	public void next() {
		ck.continuebutton();
	}
	
	@Test(priority=3)
	public void orderbtn() {
		ck.placeorderbtn();
	}
	
	@Test(priority=4)

	public void msg() {
		Assert.assertTrue(ck.thankumsg(),"Thankyou message is not displayed");
	}
	
	@Test(priority=5)
	public void shop() {
		ck.shopagainbtn();
	}
}
