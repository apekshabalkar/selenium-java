package program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {

	public static void main(String[] args) throws InterruptedException {

		WebDriver wd = new FirefoxDriver();// open br
		// url
		Thread.sleep(2000);
		wd.get("https://www.saucedemo.com/");
		Thread.sleep(2000);
		// username enter
		wd.manage().window().maximize();
		Thread.sleep(2000);
		wd.findElement(By.id("user-name")).sendKeys("standard_user");
		Thread.sleep(2000);
		// password enter
		wd.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(2000);
		// login
		wd.findElement(By.id("login-button")).click();
		Thread.sleep(2000);
		// quit br
		wd.close();

	}
}
