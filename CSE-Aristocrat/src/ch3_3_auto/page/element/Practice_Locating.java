package ch3_3_auto.page.element;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import common.BaseTest1;
import common.SeleniumUtils;

class Practice_Locating extends BaseTest1{

	
	@Test
	void UsingName() {
		WebElement name = getDriver().findElement(By.name("log"));
		System.out.println(name.isDisplayed());
		SeleniumUtils.printElementInfo("Username text field", name );
		
	}
	@Test
	void test02() {
		WebElement element = getDriver().findElement(By.id("user_login"));
		SeleniumUtils.printElementInfo("Username text field", element );
		}
	@Test
	void test03() {
		WebElement element = getDriver().findElement(By.tagName("input"));
		SeleniumUtils.printElementInfo("Username text field", element );
		}
	@Test
	void test04() {
		WebElement element = getDriver().findElement(By.className("input"));
		SeleniumUtils.printElementInfo("Username text field", element );
		}
	@Test
	void submitButton() {
		WebElement element = getDriver().findElement(By.className("button-primary"));
		SeleniumUtils.printElementInfo("Username text field", element );
		}
	@Test
	void goTo() throws Exception {
		getDriver().findElement(By.partialLinkText("Go to")).click();
		Thread.sleep(5000);
	}
	@Test
	void forgotPwd() throws Exception {
		getDriver().findElement(By.className("dashicons-visibility")).click();
		Thread.sleep(5000);
	}

}
