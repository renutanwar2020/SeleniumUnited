package ch3_3_auto.page.element;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import common.BaseTest1;
import common.SeleniumUtils;

class Ex03_UsingOtherSimpleTechniques extends BaseTest1{

	/*
	 * Identify user Name field by Name
	 */
	@Test
	void test01() {
		WebElement userNameTextField = getDriver().findElement(By.name("log"));
		System.out.println(userNameTextField);
	}

	/*
	 * Identify User Name field by ID
	 */
	@Test
	void test02() {
		WebElement element = getDriver().findElement(By.id("user_login"));
		SeleniumUtils.printElementInfo("Username Text field", element);
	}

	/*
	 * Identify User Name field by Tag name
	 */
	@Test
	void test03() {
		WebElement element = getDriver().findElement(By.tagName("input"));
		SeleniumUtils.printElementInfo("Username Text field", element);
	}

	/*
	 * Identify User Name field by class name
	 */
	@Test
	void test04() {
		WebElement element = getDriver().findElement(By.className("input"));
		SeleniumUtils.printElementInfo("Username Text field", element);
	}

	/*
	 * Identify Submit button field by class name (using one class from multiple
	 * classes)
	 */
	@Test
	void test05() {
		WebElement element = getDriver().findElement(By.className("button-large"));
		SeleniumUtils.printElementInfo("Submit button", element);
	}

}

