package stepDefination.table;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class OrgTable 
{
	WebDriver driver;


	@Given("Launch browser")
	public void launch_browser() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
	}

	@Given("enterURL {string}")
	public void enter_url(String url) {
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(22));
	}

	@When("login page is displayed")
	public void login_page_is_displayed() {
		String expTitle="vtiger CRM 5 - Commercial Open Source CRM";
		SoftAssert softAssert= new SoftAssert();
		softAssert.assertEquals(expTitle, driver.getTitle());
	}

	@Then("enterusername {string}")
	public void enterusername(String username) {
		driver.findElement(By.name("user_name")).sendKeys(username);
	}


	@Then("enterpassword {string}")
	public void enterpassword(String pwd) {
		driver.findElement(By.name("user_password")).sendKeys(pwd);
	}

	@Then("click on login button")
	public void click_on_login_button() {
		driver.findElement(By.id("submitButton")).click();	}

	@Then("verify the homepage title")
	public void verify_the_homepage_title() {
		String expTitlehomepahe="Administrator - Home - vtiger CRM 5 - Commercial Open Source CRM";
		Assert.assertEquals(expTitlehomepahe, driver.getTitle());
	}

	@Then("click on organizationlink")
	public void click_on_organizationlink() {
		driver.findElement(By.xpath("//a[text()='Organizations']")).click();
	}

	@Then("click on createorganization img")
	public void click_on_createorganization_img() {
		driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
	}



	@Then("save the organization")
	public void save_the_organization() throws InterruptedException {
		driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
		Thread.sleep(3000);
	}

	@Then("logout from the application")
	public void logout_from_the_application() throws InterruptedException 
	{
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"))).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
	}

	@Then("close the browser")
	public void close_the_browser()
	{
		driver.close();
	}

	@Then("create org with name mobile and mailid")
	public void create_org_with_name_mobile_and_mailid(DataTable datatable) {

		List<List<String>> data = datatable.asLists();

		String orgname=data.get(1).get(0);
		String phonenum=data.get(1).get(1);
		String emailid=data.get(1).get(2);
		
		driver.findElement(By.name("accountname")).sendKeys(orgname);
		driver.findElement(By.name("phone")).sendKeys(phonenum);
		driver.findElement(By.id("email1")).sendKeys(emailid);
	

	}
}
