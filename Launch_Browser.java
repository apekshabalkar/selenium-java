package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_Browser {

	public static void main(String[] args) throws InterruptedException {

		WebDriver wd = new ChromeDriver();

		wd.get("https://www.saucedemo.com");
		Thread.sleep(2000);

		wd.findElement(By.id("user-name")).sendKeys("standard_user");
		Thread.sleep(2000);

		wd.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(2000);

		wd.findElement(By.id("login-button")).click();
		Thread.sleep(2000);

	}

}
