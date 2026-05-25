
package TestNG;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Swag_Lab { // global declare WebDriver
	WebDriver wd;

	@Test(priority=0,groups= {"smoke"})
	public void Login() throws InterruptedException // main method
	{
		wd = new ChromeDriver();
		wd.get("https://www.saucedemo.com");
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(2000);

		wd.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
		Thread.sleep(2000);

		wd.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
		Thread.sleep(2000);

		wd.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		Thread.sleep(2000);
	}

	@Test(priority=1,groups= {"sanity"})
	public void Logout() throws InterruptedException // main method
	{
		wd.findElement(By.xpath("//*[@id=\"react-burger-menu-btn\"]")).click();

		wd.findElement(By.xpath("//*[@id=\"logout_sidebar_link\"]")).click();
		

	}

}
