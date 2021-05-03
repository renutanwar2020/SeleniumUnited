package ch3_3_auto.elemactions;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import common.BaseTest1;
import common.Configuration;



	public class Ex02_LoginLogout extends BaseTest1{

		@Test
		void test() throws Exception {
			WebElement userTextBox = getDriver().findElement(By.name("log"));
			userTextBox.sendKeys(Configuration.USER_NAME);
					
			WebElement pwdTextBox = getDriver().findElement(By.name("pwd"));
			pwdTextBox.sendKeys(Configuration.PASSWORD);
			pwdTextBox.submit();
			
			boolean dashBoardLoaded = getDriver().findElement(By.id("wpadminbar")).isDisplayed();
			assertTrue(dashBoardLoaded, "Assert that dashboard is loaded");
			
			WebElement logOut = getDriver().findElement(By.xpath("//*[text()='Log Out']"));
			
			getDriver().get(logOut.getAttribute("href"));
			Thread.sleep(1000); 
			
			WebElement logOutMsg = getDriver().findElement(By.xpath("//*[contains(text(), 'logged out')]"));
			assertTrue(logOutMsg.isDisplayed(), "Assert successfull logout");
			
			
		}


}
