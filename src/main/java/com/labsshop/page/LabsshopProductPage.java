package com.labsshop.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LabsshopProductPage {
	
	
	WebDriver driver;

	@FindBy(xpath="/html/body/div[2]/div/div[1]/div[1]/div[2]/label")
	WebElement filtertype;
	
	
	@FindBy(xpath="/html/body/div[2]/div/div[1]/div[3]/div[4]/label")
	WebElement filterbrand;
	
	@FindBy(xpath="//*[@id=\"sort-select\"]")
	WebElement sortdropdown;
	
	
	
	@FindBy(xpath="//*[@id=\"product-list\"]/div/div/div[2]/button")
	WebElement addtocart;
	
	public LabsshopProductPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	
	public void typefilter() {
		filtertype.click();
	}
	
	public void brandfilter() {
		filterbrand.click();
	}
	
	
	
	public void dropdownclick() {
		sortdropdown.click();
	}

	public void prodtsort() {
		Select option=new Select(sortdropdown);
		option.selectByValue("price-asc");
		
	}
	
	
	public void addtocartbtn() {
		addtocart.click();
	}
	
}
