package com.labsshop.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LabsshopCheckoutPage {
	

	WebDriver driver;
	
	
	@FindBy(xpath="//*[@id=\"firstname\"]")
	WebElement firstnamefield;
	
	@FindBy(xpath="//*[@id=\"lastname\"]")
	WebElement lastnamefield;
	
	@FindBy(xpath="//*[@id=\"email\"]")
	WebElement emailfield;
	
	@FindBy(xpath="//*[@id=\"phone\"]")
	WebElement number;
	
	@FindBy(id="address")
	WebElement addressfield;
	
	@FindBy(xpath="//*[@id=\"states\"]")
	WebElement statefield;
	
	@FindBy(xpath="//*[@id=\"city\"]")
	WebElement cityfield;
	
	@FindBy(xpath="//*[@id=\"pincode\"]")
	WebElement pincodefield;
	
	@FindBy(xpath="//*[@id=\"continue\"]")
	WebElement continuebtn;
	
	@FindBy(xpath="//*[@id=\"userForm\"]/div/div/div[2]/div[1]/div/a")
	WebElement placeorder;
	
	@FindBy(xpath="//*[@id=\"userForm\"]/div/div/div/h1")
	WebElement successmsg;
	
	@FindBy(xpath="//*[@id=\"userForm\"]/div/div/div/a")
	WebElement shopagain;
	
	
	
	public LabsshopCheckoutPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	public void setValues(String firstname,String lastname,String email,String phoneno,String address,String state,String city,String pincode  ) {
	firstnamefield.sendKeys(firstname);
	lastnamefield.sendKeys(lastname);
	emailfield.sendKeys(email);
	number.sendKeys(phoneno);
	addressfield.sendKeys(address);
	statefield.sendKeys(state);
	cityfield.sendKeys(city);
	pincodefield.sendKeys(pincode);
	
	}
	
	public void continuebutton() {
		continuebtn.click();
	}
	
	public void placeorderbtn() {
		placeorder.click();
	}
	
	public boolean thankumsg() {
		return successmsg.isDisplayed();
	}
	
	public void shopagainbtn() {
		shopagain.click();
	}

}
