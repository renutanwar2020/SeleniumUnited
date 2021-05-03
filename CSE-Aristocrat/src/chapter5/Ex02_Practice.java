package chapter5;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import common.BaseTest2;

class Ex02_Practice extends BaseTest2 {

	@Test
	void addNewPost() {
		getDriver().findElement(By.linkText("Posts")).click();
		getDriver().findElement(By.linkText("Add New")).click();

		WebElement publish = getWaiter().until(ExpectedConditions.presenceOfElementLocated(By.id("publish")));
		String title = "Sample Title";
		WebElement titleBox = getDriver().findElement(By.id("title"));
		titleBox.sendKeys(title);
		assertEquals(title, titleBox.getAttribute("value"), "Assert post title");

		getDriver().switchTo().frame("content_ifr");
		String text = "Sample Content";
		WebElement content = getDriver().findElement(By.id("tinymce"));
		content.sendKeys(text);
		assertEquals(text, content.getText(), "Assert post content");

		getDriver().switchTo().defaultContent();

		// getWaiter().until(ExpectedConditions.visibilityOfElementLocated(By.className("edit-slug")));
		publish.click();

		/*
		 * WebElement previewChanges = getDriver().findElement(By.id("post-preview"));
		 * previewChanges.click();
		 */
	// 	System.out.println("");
		getDriver().findElement(By.id("post-preview")).click();

		String mainWin = getDriver().getWindowHandle();
		for (String handle : getDriver().getWindowHandles()) {
			if (!handle.equals(mainWin)) {
				getDriver().switchTo().window(handle);
				getDriver().close();
			}
		}
		//Add assertion
		getDriver().switchTo().window(mainWin);
		WebElement trash = 	getWaiter().until(ExpectedConditions.visibilityOfElementLocated(By.className("submitdelete")));

		//WebElement trash = getDriver().findElement(By.className("submitdelete"));
		trash.click();

	}
}
