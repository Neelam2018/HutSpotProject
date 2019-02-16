package com.qa.hubspot.test;

import org.testng.annotations.Test;

import com.qa.hubspot.pages.LoginPage;

public class LoginTest {
	
	LoginPage loginpage = new LoginPage();
  @Test
  public void f() {
	  
	String title =   loginpage.gettitle();
	  
	 System.out.println(title);
	  
	  
  }
}
