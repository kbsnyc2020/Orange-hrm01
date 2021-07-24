package dashboard.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class DashBoardPages {

	public DashBoardPages(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = "//*[@name='txtUsername']")
	private static WebElement username;

	@FindBy(how = How.XPATH, using = "//*[@name='txtPassword']")
	private static WebElement password;

	@FindBy(how = How.XPATH, using = "//*[@value='LOGIN']")
	private static WebElement loginBtn;

	@FindBy(how = How.XPATH, using = "//*[@id='welcome']")
	private static WebElement welcomeword;

	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Logout')]")
	private static WebElement logoutBtn;

	public void enternameandpassword() {
		username.sendKeys("Admin");
		password.sendKeys("admin123");

	}

	public void clickonloginbutton() {
		loginBtn.click();
	}

	public void verifyWelcomeWord() {
		String expected = "Welcome";
		String actual = welcomeword.getText().trim();
		Assert.assertTrue("word does not match", actual.contains(expected));

	}

	public void verifyUserName() {
		String expected = "Welcome";
		String actual = welcomeword.getText().trim();
		Assert.assertTrue("Title does not match", actual.contains(expected));

	}

	public void clickLogOut() {
		welcomeword.click();
		logoutBtn.click();

	}

}
