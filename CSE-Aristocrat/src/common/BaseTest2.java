package common;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseTest2 {

	private WebDriver driver = null;
	private WebDriverWait wait = null;

	@BeforeEach
	void login() throws Exception {
		setDriver(Configuration.createChromeDriver());
		wait = new WebDriverWait(getDriver(), 60);
		getDriver().manage().window().maximize();

		getDriver().get(Configuration.ADMIN_URL);

		WebElement userTxtBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("log")));
		userTxtBox.sendKeys(Configuration.USER_NAME);

		WebElement pwdTxtBox = getDriver().findElement(By.name("pwd"));
		pwdTxtBox.sendKeys(Configuration.PASSWORD);
		pwdTxtBox.submit();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("wpadminbar")));

	}

	@AfterEach
	void closeBrowser() throws Exception {

		WebElement logOut = getDriver().findElement(By.xpath("//*[text()='Log Out']"));
		getDriver().get(logOut.getAttribute("href"));

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(), 'logged out')]")));

		getDriver().quit();
	}

	protected WebDriver getDriver() {
		return driver;
	}

	private void setDriver(WebDriver driver) {
		this.driver = driver;

	}

	protected WebDriverWait getWaiter() {
		return this.wait;
	}
}
