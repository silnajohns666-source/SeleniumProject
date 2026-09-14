package com.labsshop.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.labsshop.base.LabsshopBaseClass;

public class LabsshopCartTest extends LabsshopBaseClass{
	
	
	@Test(priority=1)
	public void cartbutton() {
		cp.cartbtn();
	}
	
	@Test(priority=2)
	public void removebutton() {
		cp.removebtn();
	}
	
	@Test(priority=3)
	public void quantityup() {
		cp.quantityincrease();
	}
	
	@Test(priority=4)
	public void Totalamount() {
		String aftertotal=cp.totalamt();
		Assert.assertEquals(aftertotal,"$960");
	}
	
	@Test(priority=5)
	public void checkoutbutton() {
		cp.checkoutbtn();
	}

}
