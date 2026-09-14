package com.labsshop.page;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LabsshopCartPage {
	
	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"cartdesk\"]")
	WebElement cart;
	
	@FindBy(xpath="//*[@id=\"cartTable\"]/tbody/tr/td[5]/button/i")
	WebElement remove;
	
	@FindBy(xpath="//*[@id=\"cartTable\"]/tbody/tr/td[3]/input")
	WebElement quantity;
	
	@FindBy(xpath="//*[@id=\"cartTable\"]/tbody/tr/td[4]")
	WebElement total;
	
	@FindBy(xpath="//*[@id=\"checkoutBtn\"]")
	WebElement checkout;
	
	
	public LabsshopCartPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	
	

	public void cartbtn() {
		cart.click();
	}
	
	public boolean removebtn() {
		return remove.isEnabled();
	}
	
	public void quantityincrease() {
		quantity.sendKeys(Keys.ARROW_UP);
	}
	
	public String totalamt() {
		return total.getText();
	}
	
	public void checkoutbtn() {
		checkout.click();
	}

}
