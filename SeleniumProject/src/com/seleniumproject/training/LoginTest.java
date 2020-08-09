package com.seleniumproject.training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		//open the webpage
		driver.get("http://dbankdemo.com/login");
		//entering username, password and clicking login button
		driver.findElement(By.id("username")).sendKeys("ratish.jayemb@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Ratish@123");
		driver.findElement(By.id("submit")).click();
		
		//selecting Savings option in side bar
		driver.findElement(By.id("savings-menu")).click();
		driver.findElement(By.id("new-savings-menu-option")).click();
		
		//select savings radiobutton
		driver.findElement(By.id("Savings")).click();
		
		Thread.sleep(3000);
		//select individual radiobutton
		driver.findElement(By.id("Individual")).click();
		
		Thread.sleep(3000);
		//enter account number
		driver.findElement(By.id("name")).sendKeys("1122334455667788");
		
		//enter initial account balance
		driver.findElement(By.id("openingBalance")).sendKeys("5000");
		
		//click on submit button
		driver.findElement(By.id("newSavingsSubmit")).click();
		
		Thread.sleep(3000);
		
		driver.quit();
		
	}

}
