package com.selenium.onlineshopingpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.selenium.startup.BaseClass;

public class OnlineShoppingPage {
	WebDriver driver;
	
	
	public OnlineShoppingPage(WebDriver driver) {
		
		  this.driver=driver;
	}

	@FindBy(xpath="//a[contains(text(),'Shop')]")
	public WebElement shop;
	
	@FindBy(xpath="//a[contains(text(),'Home')]")
	public  WebElement home;
	
	
	
	
	
	
	

	}


