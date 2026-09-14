package com.labsshop.test;

import org.testng.annotations.Test;

import com.labsshop.base.LabsshopBaseClass;

public class LabsshopProductTest extends LabsshopBaseClass {
	
	@Test(priority=1)
	public void filter1() {
		pp.typefilter();
	}
	
	@Test(priority=2)
	public void filter2() {
		pp.brandfilter();
	}
	
	@Test(priority=3)
	public void dropdown() {
		pp.dropdownclick();
		
	}
	
	@Test(priority=4)
	public void addcartbtn() {
		pp.addtocartbtn();
	}

}
