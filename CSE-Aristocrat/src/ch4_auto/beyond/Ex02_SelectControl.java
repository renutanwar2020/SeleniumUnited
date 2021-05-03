package ch4_auto.beyond;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import common.BaseTest2;

class Ex02_SelectControl extends BaseTest2 {

	/*
	 * Handling a drop down list with clicks.
	 */
	@Test
	void test01() {
		this.getDriver().findElement(By.linkText("Settings")).click();
		this.getWaiter().until(ExpectedConditions.visibilityOfElementLocated(By.id("blogname")));
		
		WebElement rawDropDown = getDriver().findElement(By.id("start_of_week"));
		rawDropDown.click();

		String expectedDay = "Monday";
		String xFinder = String.format("//option[text()='%s']", expectedDay);

		WebElement option = getDriver().findElement(By.xpath(xFinder));
		option.click();

		assertTrue(option.isSelected(), "Assert that Monday is selected as start of the week");

	}
	
	/*
	 * Handling a drop down as a text box
	 */
	@Test
	void test02() {
		this.getDriver().findElement(By.linkText("Settings")).click();
		this.getWaiter().until(ExpectedConditions.visibilityOfElementLocated(By.id("blogname")));

		WebElement rawDropDown = getDriver().findElement(By.id("start_of_week"));
		String expectedDay = "Monday";
		rawDropDown.sendKeys(expectedDay);

		
		String xFinder = String.format("//option[text()='%s']", expectedDay);
		WebElement option = getDriver().findElement(By.xpath(xFinder));
	
		assertTrue(option.isSelected(), "Assert that Monday is selected as start of the week");

	}
	
	/*
	 * Handling a drop down as a Select Control
	 * 
	 */
	@Test
	void test03() throws Exception {
		this.getDriver().findElement(By.linkText("Settings")).click();
		this.getWaiter().until(ExpectedConditions.visibilityOfElementLocated(By.id("blogname")));

		String expectedDay = "Tuesday";
		Select weekStart = new Select(getDriver().findElement(By.id("start_of_week")));
		weekStart.selectByVisibleText(expectedDay);
		
		String actualDay = weekStart.getFirstSelectedOption().getText();
		assertEquals(expectedDay, actualDay, "Verify Selected start of the week");
		
		Thread.sleep(5000);

	}

}
