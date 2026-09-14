package com.labsshop.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LabsshopRegisterPage {
	
	
	WebDriver driver;
	
	
	
	
	@FindBy(xpath="//*[@id=\"registerLink\"]")
	WebElement register;
	
	
	@FindBy(xpath="//*[@id=\"regfirstname\"]")
	WebElement fname;
	
	@FindBy(xpath="//*[@id=\"reglastname\"]")
	WebElement lname;
	
	@FindBy(xpath="//*[@id=\"regemail\"]")
	WebElement regemail;
	
	@FindBy(xpath="//*[@id=\"regphone\"]")
	WebElement regphone;
	
	@FindBy(xpath="//*[@id=\"genderFemale\"]")
	WebElement genderfemale;
	
	@FindBy(xpath="//*[@id=\"regdob\"]")
	WebElement dobdropdown;
	
	@FindBy(xpath="//*[@id=\"regcountry\"]")
	WebElement countrydropdown;
	
	@FindBy(xpath="//*[@id=\"regpassword\"]")
	WebElement regpassword;
	
	@FindBy(xpath="//*[@id=\"regconfirmpassword\"]")
	WebElement confirmpassword;
	
	@FindBy(xpath="//*[@id=\"registerBtn\"]")
	WebElement regbtn;
	

	public LabsshopRegisterPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void reisterlink() {
		register.click();
	}
	
	public void fieldvalues(String firstname,String lastname,String emailfield,String telephone,String dob,String countryname) {
		fname.sendKeys(firstname);
		lname.sendKeys(lastname);
		regemail.sendKeys(emailfield);
		
		regphone.sendKeys(telephone);
		dobdropdown.sendKeys(dob);
		
		Select select=new Select(countrydropdown);
		select.selectByVisibleText(countryname);
		
		genderfemale.click();
		
		
	}
	public void pwcreate(String regpw,String confrmpw) {
		regpassword.sendKeys(regpw);
		confirmpassword.sendKeys(confrmpw);
	}
		
		public void reg() {
			regbtn.click();
		}
		
	

	

}
