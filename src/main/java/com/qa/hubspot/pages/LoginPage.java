package com.qa.hubspot.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.qa.hubspot.base.BasePage;

public class LoginPage extends BasePage{
	
	@FindBy(id = "username")
	WebElement username;
	
	@FindBy(id = "password")
	WebElement password;
	
	@FindBy(id = "loginBtn")
	WebElement loginbtn;
	
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		
	}
	
	public String gettitle() {
		
		String title = driver.getTitle();
		
		return title;
		
	}
	
	public void LoginBtnClick() {
		
		loginbtn.click();
	}
	
	public void Login() {
		
		username.sendKeys(prop.getProperty("username"));
		password.sendKeys(prop.getProperty("password"));
		loginbtn.click();
		
	}

}
