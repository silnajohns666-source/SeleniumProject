package com.labsshop.test;

import org.testng.annotations.Test;

import com.labsshop.base.LabsshopBaseClass;

public class LabsshopLoginTest extends LabsshopBaseClass{
	
	
	@Test(priority=1)
	public void login() {
		
		lp.setValues("johns@gmail.com", "test@2026");
		lp.loginClick();

}
}
