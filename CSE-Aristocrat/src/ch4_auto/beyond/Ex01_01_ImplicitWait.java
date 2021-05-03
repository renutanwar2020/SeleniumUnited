package ch4_auto.beyond;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import common.Configuration;

class Ex01_01_ImplicitWait {

	@Test
	void test() {
		WebDriver driver = Configuration.createChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get(Configuration.ADMIN_URL);

		WebElement userTxtBox = driver.findElement(By.name("log"));
		userTxtBox.sendKeys(Configuration.USER_NAME);

		WebElement pwdTxtBox = driver.findElement(By.name("pwd"));
		pwdTxtBox.sendKeys(Configuration.PASSWORD);
		pwdTxtBox.submit();

		boolean dashBoardLoaded = driver.findElement(By.id("wpadminbar")).isDisplayed();
		assertTrue(dashBoardLoaded, "Assert that dashboard is loaded");

		WebElement logOut = driver.findElement(By.xpath("//*[text()='Log Out']"));

		driver.get(logOut.getAttribute("href"));

		WebElement logOutMsg = driver.findElement(By.xpath("//*[contains(text(), 'logged out')]"));
		assertTrue(logOutMsg.isDisplayed(), "Assert successfull logout");
		
		driver.quit();

	}

}
