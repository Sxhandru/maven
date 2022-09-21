package org.Maven;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Baseclass {
	private static WebDriver driver;

	public static WebDriver broswer_configuration(String type) {
		if (type.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "E:\\Shanmugam\\Chandru\\Chandru\\Driver\\chromedriver.exe");
			
			driver= new ChromeDriver();
		}
		
		else if (type.equalsIgnoreCase("FireBox")) {
			System.setProperty("webdriver.gecko.driver", "");
			
			driver= new FirefoxDriver();
			
		}
		return driver;
	}
	public static void geturl(String Url) {
		driver.get(Url);
	}
	
	public static void inputValueElement(WebElement element, String data) {
		element.sendKeys(data);
	}
	public static void clickdataelement(WebElement data) {
		data.click();
	}
	public static void close() {
		driver.quit();
	}
}
