package ch3_3_auto.elemactions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import common.BaseTest1;
import common.Configuration;

class Ex01_EnterAndVerifyText extends BaseTest1{

	@Test
	void enterUserName() {
		String expectedUserName = Configuration.USER_NAME;
		WebElement userTextBox = getDriver().findElement(By.id("user_login"));
		assertTrue(userTextBox.isEnabled(), "Assert that user name is enabled");
		userTextBox.sendKeys(expectedUserName);
		
		String actualUserName = userTextBox.getAttribute("value");
		assertEquals(expectedUserName, actualUserName, "Assert that user name is entered correctly");
	
	}

}
