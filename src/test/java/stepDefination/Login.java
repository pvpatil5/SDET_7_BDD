package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login
{
	WebDriver driver;

	@Given("launch browser")
	public void launch_browser() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
	}

	@Then("enter URL")
	public void enter_url() {
		driver.get("http://localhost:8888");
	}

	@Then("validated login page is displayed or not")
	public void validated_login_page_is_displayed_or_not() {

		String expTitle="vtiger CRM 5 - Commercial Open Source CRM";
		SoftAssert softAssert= new SoftAssert();
		softAssert.assertEquals(expTitle, driver.getTitle());
	}

	@Then("enter username")
	public void enter_username() {
		driver.findElement(By.name("user_name")).sendKeys("admin");
	}

	@Then("enter password")
	public void enter_password() {
		driver.findElement(By.name("user_password")).sendKeys("12345");
	}

	@Then("click on login btn")
	public void click_on_login_btn() {
		driver.findElement(By.id("submitButton")).click();
	}

	@Then("home page should display")
	public void home_page_should_display()
	{
	
		String expTitlehomepahe="Administrator - Home - vtiger CRM 5 - Commercial Open Source CRM";
		Assert.assertEquals(expTitlehomepahe, driver.getTitle());

	}

	@Then("enter username {string}")
	public void enter_username(String username) {
		driver.findElement(By.name("user_name")).sendKeys(username);
	}

	@Then("enter password {string}")
	public void enter_password(String password) {
		driver.findElement(By.name("user_password")).sendKeys(password);
	}

	@Then("check error msg")
	public void check_error_msg() {
		boolean actual = driver.findElement(By.className("errorMessage")).isDisplayed();
		Assert.assertEquals(actual, true);

	}


}
