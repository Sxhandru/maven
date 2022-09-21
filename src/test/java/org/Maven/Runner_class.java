package org.Maven;

import org.Maven.Baseclass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Runner_class extends Baseclass {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\Shanmugam\\Chandru\\Chandru\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://google.com/");
		
		driver.get("http://adactinhotelapp.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("Chandrusrinivasan");
		
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("AOL8AG");
		
		driver.findElement(By.xpath("//input[@name=\"login\"]")).click();
		
		driver.findElement(By.xpath("//select[@name=\"location\"]")).sendKeys("London");
		
		driver.findElement(By.xpath("//select[@name=\"hotels\"]")).sendKeys("Hotel Sushine");
		
		driver.findElement(By.xpath("//select[@name=\"room_type\"]")).sendKeys("Double");
		
		driver.findElement(By.xpath("//select[@name=\"room_nos\"]")).sendKeys("2-Two");
		
		driver.findElement(By.xpath("//input[@name=\"datepick_in\"]")).sendKeys("03/09/2022");
		
		driver.findElement(By.xpath("//input[@name=\"datepick_out\"]")).sendKeys("04/09/2022");
		
		driver.findElement(By.xpath("//select[@name=\"adult_room\"]")).sendKeys("4-Four");
		
		driver.findElement(By.xpath("//select[@name=\"child_room\"]")).sendKeys("3-Three");
		
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		
		driver.findElement(By.xpath("//input[@name=\"radiobutton_0\"]")).click();
		
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		
		driver.findElement(By.xpath("//input[@name=\"first_name\"]")).sendKeys("Chandru");
		
		driver.findElement(By.xpath("//input[@name=\"last_name\"]")).sendKeys("Srinivasan");
		
		driver.findElement(By.xpath("//textarea[@name=\"address\"]")).sendKeys("5/1211 Pillayar Kovil Thottam, Lakshmi Nagar, Bhavani, Erode-638316");
		
		driver.findElement(By.xpath("//input[@name=\"cc_num\"]")).sendKeys("1234 5678 9876 4321");
		
		driver.findElement(By.xpath("//select[@name=\"cc_type\"]")).sendKeys("VISA");
		
		driver.findElement(By.xpath("//select[@name=\"cc_exp_month\"]")).sendKeys("August");
		
		driver.findElement(By.xpath("//select[@name=\"cc_exp_year\"]")).sendKeys("2022");
		
		driver.findElement(By.xpath("//input[@name=\"cc_cvv\"]")).sendKeys("123");
		
		driver.findElement(By.xpath("//input[@name=\"book_now\"]")).click();

		driver.findElement(By.xpath("//input[@name=\"my_itinerary\"]")).click();
	}
}
