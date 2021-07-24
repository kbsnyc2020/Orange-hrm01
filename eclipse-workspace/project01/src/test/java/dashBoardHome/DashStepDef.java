package dashBoardHome;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import dashboard.pages.DashBoardPages;

public class DashStepDef {

	WebDriver driver;
	DashBoardPages dashpage;

	@Given("^User go to orange hrm home page$")
	public void user_go_to_orange_hrm_home_page() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();

	}

	@When("^user enter valid username and password$")
	public void user_enter_valid_username_and_password() throws Exception {
		dashpage = new DashBoardPages(driver);
		dashpage.enternameandpassword();

	}

	@When("^user click on the login button$")
	public void user_click_on_the_login_button() throws Exception {
		dashpage.clickonloginbutton();

	}

	@Then("^user navigate to the welcome page$")
	public void user_navigate_to_the_welcome_page() throws Throwable {
		dashpage.verifyWelcomeWord();
	}

	@Then("^user verify the page title as \"([^\"]*)\"$")
	public void user_verify_the_page_title_as(String title) throws Exception {
		String expected = title;
		String actual = driver.getTitle();
		Assert.assertTrue("Titel  does not match", actual.contains(expected));
	}

	@Then("^user verify user name is displays at top right$")
	public void user_verify_user_name_is_displays_at_top_right() throws Throwable {
		dashpage.verifyUserName();
	}

	@Then("^user log out$")
	public void user_log_out() throws Throwable {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		dashpage.clickLogOut();

	}

	@Then("^user close browser$")
	public void user_close_browser() throws Throwable {
driver.close();
driver.quit();
	}

}
