package com.generic.library;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.pagefactory.AmazonPagefactory;

public class GenericClass {
	WebDriver driver;//webdriver is interface or class, driver is variable which is instance of webdriver.
	AmazonPagefactory pf; // AmazonPagefactory is class and pf is instance of variable.
	
	
	public void getSetup() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sumon\\eclipse-workspace\\Amazon\\Driver\\chromedriver.exe");
		driver =new ChromeDriver();
		pf=PageFactory.initElements(driver, AmazonPagefactory.class);
		driver.manage().window().maximize();
		driver.get(pf.getUrl());
		
	}
	
	public void getLogin() {
		pf.getSignIn().click();
		pf.getEmail().sendKeys(pf.getUsername());
		pf.getPassword().sendKeys(pf.getPass());
		pf.getClickButton().click();
		
		
	}
	
	

}
