package ch3_1_auto.browser;

import static org.junit.jupiter.api.Assertions.*;



import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import common.Configuration;

class Ex05_JUnitVerifyTitle {

	@Test
	void testSiteTitle() {
		WebDriver driver = Configuration.createChromeDriver();
		driver.get(Configuration.BLOG_URL);
		String expectedTitle = "Dummy";
		String actualTitle = driver.getTitle();
		assertEquals(expectedTitle, actualTitle);
//assert.assertEquals(expected, actual)
		System.out.println("PASS");
		driver.quit();
	}

}
