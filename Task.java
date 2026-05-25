package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Task {
	WebDriver wd;

	@Test
	public void Login() {
		wd.get("https://www.saucedemo.com");
		wd.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
		wd.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
		wd.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
	}

	@BeforeTest
	public void beforeTest() {
		WebDriver wd = new ChromeDriver();
	}

	@AfterTest
	public void afterTest() {

	}

}
