package org.Maven;

import javax.management.loading.PrivateClassLoader;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PersonalDetails {
	public WebDriver driver;
	
	public PersonalDetails(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//select[@name=\"location\"]")
	private WebElement location;

	public WebElement getLocation() {
		return location;
	}
	
	@FindBy(xpath = "//select[@name=\"hotels\"]")
	private WebElement hotels;

	public WebElement getHotels() {
		return hotels;
	}
	
	@FindBy(xpath = "//select[@name=\"room_type\"]")
	private WebElement roomtype;

	public WebElement getRoomtype() {
		return roomtype;
	}
	
	@FindBy(xpath = "//select[@name=\"room_nos\"]")
	private WebElement roomnos;

	public WebElement getRoomnos() {
		return roomnos;
	}
	
	@FindBy(xpath = "//input[@name=\"datepick_in\"]")
	private WebElement datepickin;

	public WebElement getDatepickin() {
		return datepickin;
	}
	
	@FindBy(xpath = "//input[@name=\"datepick_out\"]")
	private WebElement datepickout;

	public WebElement getDatepickout() {
		return datepickout;
	}
	
	@FindBy(xpath = "//select[@name=\"adult_room\"]")
	private WebElement adultroom;

	public WebElement getAdultroom() {
		return adultroom;
	}
	
	@FindBy(xpath="//select[@name=\"child_room\"]")
	private WebElement childroom;

	public WebElement getChildroom() {
		return childroom;
	}
	
	@FindBy(xpath="//input[@type=\"submit\"]")
	private WebElement submit;

	public WebElement getSubmit() {
		return submit;
	}

	
	

}
