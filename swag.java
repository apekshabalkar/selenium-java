package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class swag {

	WebDriver wd;

	@Given("To test Login with valid data")
	public void to_test_login_with_valid_data() {
		wd = new ChromeDriver();
		wd.get("https://www.saucedemo.com");
	}

	@When("user enter valid standard_user")
	public void user_enter_valid_standard_user() {
		wd.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
	}

	@When("user enter valid secret_sauce")
	public void user_enter_valid_secret_sauce() {
		wd.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
	}

	@Then("user redirect to next page")
	public void user_redirect_to_next_page() {
		wd.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
	}

}
