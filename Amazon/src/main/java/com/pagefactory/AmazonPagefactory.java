package com.pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AmazonPagefactory {
	
	private String url="https://www.amazon.com/";
	private String pass="test1234";
	private String username="mmrsd2k@gmail.com";
   
	@FindBy(xpath="(//*[@class='nav-line-2'])[3]")
	private WebElement SignIn;
	
	@FindBy(xpath="//*[@type='email']")
	private WebElement Email;
	
	@FindBy(xpath="//*[@type='password']")
	private WebElement password;

	
	@FindBy(xpath="//*[@type='submit']")
	private WebElement ClickButton;
	
	
	
	

	public WebElement getSignIn() {
		return SignIn;
	}

	public WebElement getEmail() {
		return Email;
	}

	

	public WebElement getPassword() {
		return password;
	}

	public WebElement getClickButton() {
		return ClickButton;
	}
	
	public String  getUrl() {
		return url;
	}
	
	public String getUsername() {
		return username;
	}
	public String getPass() {
		return pass;
	}
	
	
	
	
	
	

}
