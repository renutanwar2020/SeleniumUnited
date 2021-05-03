package ch3_3_auto.page.element;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import common.BaseTest1;

class Ex01_UsingName extends BaseTest1{

	/*
	 * Identify user Name field by Name
	 */
	@Test
	void test() {
		WebElement userNameTextField = getDriver().findElement(By.name("log"));
		System.out.println(userNameTextField.isDisplayed());
	}
}
