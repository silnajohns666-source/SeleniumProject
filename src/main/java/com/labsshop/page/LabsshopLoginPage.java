package com.labsshop.page;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LabsshopLoginPage {
	
	
WebDriver driver;
WebDriverWait wait;
	
	
	@FindBy(id="email")
	WebElement emailsection;
	
	@FindBy(id="password")
	WebElement passwordfield;
	
	@FindBy(id="loginBtn")
	WebElement loginbutton;
	
	
	
	public LabsshopLoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver,this);
		this.wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		
	}
	
	public void setValues(String email,String password) {
		wait.until(ExpectedConditions.visibilityOf(emailsection));
		emailsection.sendKeys(email);
		passwordfield.sendKeys(password);
	}
	
	public void loginClick() {
		loginbutton.click();
	}
	

}
