package ch3_1_auto.browser;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ex02_02_FirefoxLaunch {

	public static void main(String[] args) throws InterruptedException {
		String driverPath = System.getProperty("user.dir")
				+ File.separator
				+ "drivers"
				+ File.separator
				+ "geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", driverPath);
		WebDriver driver = new FirefoxDriver();
		Thread.sleep(3000);
		
		driver.quit();

	}

}
