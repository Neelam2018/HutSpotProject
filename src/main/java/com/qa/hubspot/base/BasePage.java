package com.qa.hubspot.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {
	
	
	public WebDriver driver;
	public Properties prop; 
	
	
	public WebDriver Initialize_Driver() {
		
		driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","C:/Users/Neelu/workspace/libs/chromedriver.exe");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		return driver;
		
	}
	
	public void Initialize_Properties() {
		
		prop = new Properties();
		try {
			FileInputStream ip = new FileInputStream("C:\\Users\\bawas\\eclipse-workspace\\HubSpotProject\\src\\main\\java\\com\\qa\\hubspot\\config\\config.properties");
			try {
				prop.load(ip);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
