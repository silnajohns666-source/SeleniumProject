package com.labsshop.test;

import org.testng.annotations.Test;

import com.labsshop.base.LabsshopBaseClass;

public class LabsshopRegisterTest extends LabsshopBaseClass {
	
	
	@Test(priority=1)
	public void register() {
		rp.reisterlink();
	}
	
	@Test(priority=2)
	public void form() {
		rp.fieldvalues("silna", "KJ", "johns@gmail.com", "7559947487", "01-02-2000", "India");
	}
	
	@Test(priority=3)
	public void pw() {
		rp.pwcreate("test@2026", "test@2026");
		
	}
	
	@Test(priority=4)
	public void regbutton() {
		rp.reg();
	}

}
