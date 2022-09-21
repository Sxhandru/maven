package org.Maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HotelType {
public WebDriver driver;
	
	public HotelType(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@name=\"radiobutton_1\"]")
	private WebElement radiobutton;

	public WebElement getRadiobutton() {
		return radiobutton;
	}
	
	
	@FindBy(xpath="//input[@type=\"submit\"]")
	private WebElement submit;

	public WebElement getSubmit() {
		return submit;
	}
	
	
	
	
	

}
