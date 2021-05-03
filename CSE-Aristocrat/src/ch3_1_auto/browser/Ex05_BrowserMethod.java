package ch3_1_auto.browser;

import org.openqa.selenium.WebDriver;

import common.Configuration;

public class Ex05_BrowserMethod {

	public static void main(String[] args) throws Exception {
		WebDriver driver = Configuration.createChromeDriver();
		driver.manage().window().maximize();
		driver.get(Configuration.BLOG_URL);
		Thread.sleep(5000);
		driver.navigate().back();
		driver.navigate().forward();
		Thread.sleep(5000);
		driver.navigate().refresh();
		Thread.sleep(5000);

		System.out.println("Window Handle: " + driver.getWindowHandle());

		for (String win : driver.getWindowHandles()) {
			System.out.println("Handle: " + win);

		}

		driver.quit();

	}

}
