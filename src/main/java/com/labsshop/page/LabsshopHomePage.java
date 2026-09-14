package com.labsshop.page;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LabsshopHomePage {

	WebDriver driver;
	
	@FindBy(xpath="/html/body/div[2]/div/div[2]/div/div/a")
	WebElement shopnowwomens;
	
	@FindBy(xpath="/html/body/div[1]/div/div[2]/a")
	WebElement gobackbutton;
	

	@FindBy(tagName="a")          
	List<WebElement>a_tag;
	
	@FindBy(xpath="//*[@id=\"qa-site-header\"]/div/a/img")
	WebElement logoname;
	
	
	@FindBy(xpath="/html/body/div[2]/div/div[4]/div/div/a")
	WebElement shopelectronics;
	
	
	
	public LabsshopHomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	
	}
	
	
	public void shopnow() {
		shopnowwomens.click();
	}
	
	public void backbutton() {
		gobackbutton.click();
	}
	
	 public int getLinkCount() {
		 return a_tag.size();	
	}
	
	 public String getlogoname() {
		 return logoname.getAttribute("alt");
	 }
	 
	 public void electronicsshop() {
		 shopelectronics.click();
	 }

}
