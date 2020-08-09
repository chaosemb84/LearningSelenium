package com.seleniumproject.training;

//import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class FirstTestCaseIE {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new InternetExplorerDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
//		try {
//			Runtime.getRuntime().exec("taskkill /F /IM IEDriverServer.exe");
//		}catch (IOException e) {
//			e.printStackTrace();
//		}
		driver.quit();
	}

}
