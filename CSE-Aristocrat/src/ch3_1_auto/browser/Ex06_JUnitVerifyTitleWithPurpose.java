package ch3_1_auto.browser;

import static org.junit.jupiter.api.Assertions.*;



import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import common.Configuration;

class Ex06_JUnitVerifyTitleWithPurpose {

	@Test
	void testSiteTitle() {
		WebDriver driver = Configuration.createChromeDriver();
		driver.get(Configuration.BLOG_URL);
		String expectedTitle = "Dummy";
		String actualTitle = driver.getTitle();
		assertEquals(expectedTitle, actualTitle, "Verify Site Title");

		driver.quit();
	}

}
