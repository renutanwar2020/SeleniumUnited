package ch4_auto.beyond;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import common.BaseTest2;

class Ex11_ActionChains extends BaseTest2 {

	@Test
	void hoverAndClick() {

		WebElement menuBar = getDriver().findElement(By.id("wp-admin-bar-site-name"));

		Actions builder = new Actions(getDriver());
		builder.moveToElement(menuBar).pause(1000).click(getDriver().findElement(By.id("wp-admin-bar-view-site")));//.perform yahan bhi laga sakte hain

		Action compAction = builder.build();// explore this after exam
		compAction.perform();

		
	}

}