package ch3_1_auto.browser;

import org.openqa.selenium.WebDriver;

import common.Configuration;

public class Ex04_Browser {

	public static void main(String[] args) throws Exception {
		WebDriver driver = Configuration.createFireFoxDriver();
		System.out.println("All went fine");
		Thread.sleep(3000);
		driver.quit();

	}

}
