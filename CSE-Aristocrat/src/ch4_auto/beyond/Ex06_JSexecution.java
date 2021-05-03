package ch4_auto.beyond;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import common.BaseTest2;

class Ex06_JSexecution extends BaseTest2 {

	@Test
	void test() {
		JavascriptExecutor jsExec = (JavascriptExecutor) getDriver();
		
		//Execute find and Click event in JavaScript
		jsExec.executeScript("document.getElementsByClassName('welcome-view-site')[0].click();");
		getDriver().navigate().back();
		
		//Find in WebDriver, click in JavaScript
		WebElement viewSiteLink = getDriver().findElement(By.className("welcome-view-site"));
		jsExec.executeScript("arguments[0].click();", viewSiteLink);
		getDriver().navigate().back();
		
		//Find in JavaScript and return the web element -  and click in Java
		WebElement siteLink = 
				(WebElement) jsExec.executeScript("return document.getElementsByClassName('welcome-view-site')[0]");
		siteLink.click();
		getDriver().navigate().back();
	}
	

}