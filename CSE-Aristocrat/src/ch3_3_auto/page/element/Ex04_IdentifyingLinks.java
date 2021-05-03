package ch3_3_auto.page.element;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import common.BaseTest1;
import common.SeleniumUtils;

class Ex04_IdentifyingLinks extends BaseTest1{

	/*
	 * Identify Lost your password link with LinkText
	 */
	@Test
	void test01() {
		WebElement element = getDriver().findElement(By.linkText("Lost your password?"));
		SeleniumUtils.printElementInfo("Lost your password?", element);
		
	}

	/*
	 * Identify Go to blog link with Partial Link Text
	 * Contains <- and the name of the blog changes with the blog :)
	 */
	@Test
	void test02() {
		WebElement element = getDriver().findElement(By.partialLinkText("Go to"));
		SeleniumUtils.printElementInfo("Go to Blog Link", element);
		
	}
}
