package common;

import org.openqa.selenium.WebElement;

public class SeleniumUtils {
public static void printElementInfo(String name, WebElement element) {
	
	String marker = "------------------------------";

	System.out.println(marker);
	System.out.println("Element Meta-Data: " + name);
	System.out.println(marker);
	System.out.println("WebElement Object: " + element);
	System.out.println("Outer HTML: " + element.getAttribute("outerHTML"));
	System.out.println("Inner HTML: " + element.getAttribute("innerHTML"));

	System.out.println("Text: " + element.getText());
	System.out.println("Value: " + element.getAttribute("value"));
	System.out.println("Tag: " + element.getTagName());
	System.out.println("Is Displayed? " + element.isDisplayed());
	System.out.println("Is Selected? " + element.isSelected());
	System.out.println("Is Enabled? " + element.isEnabled());
	System.out.println(marker);
}
}
