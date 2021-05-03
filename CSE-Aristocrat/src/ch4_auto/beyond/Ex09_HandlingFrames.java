package ch4_auto.beyond;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import common.BaseTest2;

class Ex09_HandlingFrames extends BaseTest2 {

	@Test
	void addPost() throws Exception {
		getDriver().findElement(By.linkText("Posts")).click();// this is for finding the 'post' link
		getDriver().findElement(By.linkText("Add New")).click();// this is for finding the 'Add new' link

		WebElement publish = getWaiter().until(ExpectedConditions.presenceOfElementLocated(By.id("publish")));
//this is waiting to check the publish btn nd verifying its presence 
		String title = "Sample Title"; // storing a value in string title
		WebElement titleBox = getDriver().findElement(By.id("title")); 
		// here finding the title textbox nd storing in webelement titleBox
		titleBox.sendKeys(title); // entering the value of title in the titlebox

		assertEquals(title, titleBox.getAttribute("value"), "Assert post title");
		// yahan par assertequal title ki value ko titlebox ki value se match kar raha hai agar match nahin hoga to 
		// fail karega but aage ke steps bhi execute ho jaayenge

		getDriver().switchTo().frame("content_ifr");// yahaan par hum iframe ke anadar switch ho rahe hain
/* yahaan par text m */
		String text = "Dummy text";
		WebElement content = getDriver().findElement(By.id("tinymce"));
		content.sendKeys(text);
		assertEquals(text, content.getText(), "Assert post content");

		// Once the iFrame is handled, switch back to default content (DOM root)
		getDriver().switchTo().defaultContent();

		getWaiter().until(ExpectedConditions.visibilityOfElementLocated(By.className("edit-slug")));
		publish.click();
		getWaiter().until(ExpectedConditions.visibilityOfElementLocated(By.linkText("View post")));
Thread.sleep(5000);
	}

}