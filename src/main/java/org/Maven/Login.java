package org.Maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Login {
	public WebDriver driver;
	
	public Login(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@name=\"username\"]")
	private WebElement username;

	public WebElement getUsername() {
		return username;
	}
	
	@FindBy(xpath="//input[@name=\"password\"]")
	private WebElement password;

	public WebElement getPassword() {
		return password;
	}
	
	@FindBy(xpath="//input[@name=\"login\"]")
	private WebElement Login;

	public WebElement getLogin() {
		return Login;
	}
	}

