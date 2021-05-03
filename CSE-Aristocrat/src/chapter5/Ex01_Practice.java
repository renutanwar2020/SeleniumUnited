package chapter5;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import common.BaseTest2;

class Ex01_Practice extends BaseTest2{

	@Test
	void settings_update() {
		
		WebElement sett = getDriver().findElement(By.linkText("Settings"));
		sett.click();
		
		WebElement title = getDriver().findElement(By.id("blogname"));
		title.clear();
		String title_val = "Selenium Blog";
		title.sendKeys(title_val);
		
		WebElement check_box = getDriver().findElement(By.id("users_can_register"));
		check_box.click();
		
		WebElement radiobtn = getDriver().findElement(By.cssSelector("input[value='m/d/Y']"));
		radiobtn.click();
		
		WebElement week = getDriver().findElement(By.id("start_of_week"));
		week.click();

		String expectedDay = "Monday";
		String xFinder = String.format("//option[text()='%s']", expectedDay);

		WebElement option = getDriver().findElement(By.xpath(xFinder));
		option.click();
		
		
		
		
	}

}
