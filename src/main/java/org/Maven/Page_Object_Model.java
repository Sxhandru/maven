package org.Maven;

import org.openqa.selenium.WebDriver;

public class Page_Object_Model {
	public WebDriver driver;
	
	private Login ln;
	
	private PersonalDetails pd;
	
	private HotelType Ht;
	
	private Biodata Bd;
	
	public Page_Object_Model(WebDriver driver2) {
		this.driver=driver2;
	}
	
	public Login get_instance_ln() {
		if (ln==null) {
			ln = new Login(driver); 
		}
		return ln;
	}
	
	
	public PersonalDetails get_instance_pd() {
		if (pd==null) {
			pd=new PersonalDetails(driver);
			
		}
		return pd;
	}
	
	public HotelType get_instance_Ht() {
		if (Ht==null) {
			Ht = new HotelType(driver);
			
		}
		return Ht;
	}
	
	public Biodata get_instance_Bd() {
		if (Bd==null) {
			Bd=new Biodata(driver);
			
		}
		return Bd;
	}

	
}
