package com.labsshop.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.labsshop.base.LabsshopBaseClass;

public class LabsshopHomeTest extends LabsshopBaseClass {

	
	@Test(priority=1)
	public void shopnowbtn() {
		hp.shopnow();
	}
	
	@Test(priority=2)
	public void goback() {
		hp.backbutton();
	}
	
	@Test(priority=3)
	public void linkcount() {
		hp.getLinkCount();
	}
	
	
	@Test(priority=4)
	public void logoname() {
		
		String actualText=hp.getlogoname();
		Assert.assertEquals(actualText,"QA Automation Labs");
		
	}
	
	@Test(priority=5)
	public void shopelectrnow() {
		hp.electronicsshop();
	}
}
