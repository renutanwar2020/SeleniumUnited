package ch3_3_auto.page.element;


import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import common.BaseTest1;
import common.SeleniumUtils;

class Ex06_UsingXPath extends BaseTest1{

	/*
	 * Identify User Name text field using Absolute XPath (tag name)
	 * DO NOT EVER USE THIS IN PROFESSIONAL WORK 
	 * Absolute XPath are EVIL :(
	 */
	@Test
	void test00() {
		WebElement element = getDriver().findElement(By.xpath("/html/body/div[2]/form/p[1]/input"));
		SeleniumUtils.printElementInfo("User Name text field", element);
	}
	/*
	 * Now onwards we will stick with relative XPath. As Absolute XPath are brittle
	 * Identify User Name text field using XPath (tag name)
	 */
	@Test
	void test01() {
		WebElement element = getDriver().findElement(By.xpath("//input"));
		SeleniumUtils.printElementInfo("User Name text field", element);
	}
	/*
	 * Identify User Name text field using XPath (tag name and attribute name)
	 */
	@Test
	void test02() {
		WebElement element = getDriver().findElement(By.xpath("//input[@type]"));
		SeleniumUtils.printElementInfo("User Name text field", element);
	}
	/*
	 * Identify Password text field using XPath (tag name, attribute name and value) - TYPE
	 */
	@Test
	void test03_01() {
		WebElement element = getDriver().findElement(By.xpath("//input[@type='password']"));
		SeleniumUtils.printElementInfo("Password text field", element);
	}
	/*
	 * Identify User Name text field using XPath (tag name, attribute name and value) - ID
	 * variant of test03
	 */
	@Test
	void test03_02() {
		WebElement element = getDriver().findElement(By.xpath("//input[@id='user_login']"));
		SeleniumUtils.printElementInfo("User Name text field", element);
	}
	/*
	 * Identify User Name text field using XPath (tag name, attribute name and value) - Class
	 * variant of test03
	 */
	@Test
	void test03_03() {
		WebElement element = getDriver().findElement(By.xpath("//input[@class='input']"));
		SeleniumUtils.printElementInfo("User Name text field", element);
	}
	/*
	 * Identify User Name text field using XPath (tag name, attribute name and value) - Name
	 * variant of test03
	 */
	@Test
	void test03_04() {
		WebElement element = getDriver().findElement(By.xpath("//input[@name='log']"));
		SeleniumUtils.printElementInfo("User Name text field", element);
	}
	/*
	 * Identify User Name text field using XPath (tag name, attribute name and value) - ANY TAG
	 * variant of test03
	 */
	@Test
	void test03_05() {
		WebElement element = getDriver().findElement(By.xpath("//*[@name='log']"));
		SeleniumUtils.printElementInfo("User Name text field", element);
	}
	/*
	 * Identify Lost your password link using XPath -Text
	 */
	@Test
	void test04() {
		WebElement element = getDriver().findElement(By.xpath("//*[text()='Lost your password?']"));
		SeleniumUtils.printElementInfo("Lost your password link", element);
	}
	/*
	 * Identify User name text field using XPath - Relationships - Child
	 */
	@Test
	void test05_01() {
		WebElement element = getDriver().findElement(By.xpath("//p/input"));
		SeleniumUtils.printElementInfo("User Name text field", element);
	}
	/*
	 * Identify User name text field using XPath - Relationships - following-sibling
	 */
	@Test
	void test05_02() {
		WebElement element = getDriver().findElement(By.xpath("//label/following-sibling::input"));
		SeleniumUtils.printElementInfo("User Name text field", element);
	}
	/*
	 * Identify User name text field using XPath - Partial Match - Attribute value contains
	 */
	@Test
	void test06_01() {
		WebElement element = getDriver().findElement(By.xpath("//input[contains(@id, 'er_l')]"));
		SeleniumUtils.printElementInfo("User Name text field", element);
	}
	
	/*
	 * Identify User name text field using XPath - Partial Match - Attribute value - starts-with
	 */
	@Test
	void test06_02() {
		WebElement element = getDriver().findElement(By.xpath("//input[starts-with(@id, 'user_l')]"));
		SeleniumUtils.printElementInfo("User Name text field", element);
	}
	/*
	 * Identify User name text field using XPath - Partial Match - Attribute value - ends-with
	 * ends-with is not supported in current browsers. 
	 * As it requires XPath 2.0 where all browsers use XPath V1.0
	 */
	@Test
	void test06_03() {
		WebElement element = getDriver().findElement(By.xpath("//input[ends-with(@id, '_login')]"));
		SeleniumUtils.printElementInfo("User Name text field", element);
	}
	/*
	 * Identify Lost your password link using XPath - Partial Match - Text contains
	 */
	@Test
	void test06_04() {
		WebElement element = getDriver().findElement(By.xpath("//a[contains(text(), 'Lost')]"));
		SeleniumUtils.printElementInfo("Lost your password link", element);
	}
	/*
	 * Identify Lost your password link using XPath - Partial Match - Text starts-with
	 */
	@Test
	void test06_05() {
		WebElement element = getDriver().findElement(By.xpath("//a[starts-with(text(), 'Lost')]"));
		SeleniumUtils.printElementInfo("Lost your password link", element);
	}
	/*
	 * Identify User name text field using XPath - Logical OR: using or keyword
	 */
	@Test
	void test07_01() {
		WebElement element = getDriver().findElement(By.xpath("//input[@class='input' or @id='user_pass']"));
		SeleniumUtils.printElementInfo("User Name text field", element);
	}
	/*
	 * Identify Password text field using XPath - Logical AND: using and keyword
	 */
	@Test
	void test07_02() {
		WebElement element = getDriver().findElement(By.xpath("//input[@name='pwd' and @id='user_pass']"));
		SeleniumUtils.printElementInfo("Password text field", element);
	}
	
	/*
	 * Identify Password text field using XPath - Logical NOT: Using the not() function
	 */
	@Test
	void test07_03() {
		WebElement element = getDriver().findElement(By.xpath("//input[@type and not(@name='log')]"));
		SeleniumUtils.printElementInfo("Password text field", element);
	}
	/*
	 * Identify Login Form  using XPath - Hierarchy (Axis) - Parent
	 */
	@Test
	void test08_01() {
		WebElement element = getDriver().findElement(By.xpath("//label/../.."));
		SeleniumUtils.printElementInfo("Login Form", element);
	}
	/*
	 * Identify User name text field  using XPath - Hierarchy (Axis) - Descendant
	 * (using // instead of / between form and input)
	 */
	@Test
	void test08_02() {
		WebElement element = getDriver().findElement(By.xpath("//form//input"));
		SeleniumUtils.printElementInfo("User Name text field", element);
	}
	/*
	 * Identify Login Form using XPath - Hierarchy (Axis) - ancestor
	 */
	@Test
	void test08_03() {
		WebElement element = getDriver().findElement(By.xpath("//input/ancestor::form"));
		SeleniumUtils.printElementInfo("Login Form", element);
	}
	
	/*
	 * Identify User name text field using XPath - Hierarchy (Axis) - ancestor
	 */
	@Test
	void test08_04() {
		WebElement element = getDriver().findElement(By.xpath("//p[@class='submit']/preceding-sibling::p/input"));
		SeleniumUtils.printElementInfo("User name text field", element);
	}
	/*
	 * Identify User name text field using XPath - Index (index uses Human counting)
	 * This variant looks at children of the same parent
	 * That is the reason //input[2] did not point to the password field
	 */
	@Test
	void test09_01() {
		WebElement element = getDriver().findElement(By.xpath("//input[1]"));
		SeleniumUtils.printElementInfo("User name text field", element);
	}
	/*
	 * Identify User name text field using XPath - Index (index uses Human counting)
	 * This variant looks at elements across the DOM
	 * Here (//input)[2] points to the password field
	 */
	@Test
	void test09_02() {
		WebElement element = getDriver().findElement(By.xpath("(//input)[1]"));
		SeleniumUtils.printElementInfo("User name text field", element);
	}
	/*
	 * Identify User name text field using XPath - Multiple Attribute names
	 */
	@Test
	void test10_01() {
		WebElement element = getDriver().findElement(By.xpath("//input[@type and @name]"));
		SeleniumUtils.printElementInfo("User name text field", element);
	}
	/*
	 * Identify Password text field using XPath - Multiple Attribute names and values
	 */
	@Test
	void test10_02() {
		WebElement element = getDriver().findElement(By.xpath("//input[@type='password' and @name='pwd']"));
		SeleniumUtils.printElementInfo("Password text field", element);
	}

}
