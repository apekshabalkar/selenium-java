package program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class {

	public static void main(String[] args) throws InterruptedException {

		WebDriver wd = new ChromeDriver();
		Thread.sleep(2000);

		wd.get("https://www.saucedemo.com/");
		Thread.sleep(2000);

		wd.findElement(By.xpath("(//input[@class=\"input_error form_input\"]) [1]")).sendKeys("standard_user");
		Thread.sleep(2000);

		wd.findElement(By.xpath("(//input[@class=\"input_error form_input\"]) [2]")).sendKeys("secret_sauce");
		Thread.sleep(2000);

		wd.findElement(By.className("submit-button")).click();

	}
}
