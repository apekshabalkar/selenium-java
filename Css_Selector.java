package program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css_Selector {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver wd = new ChromeDriver();
		Thread.sleep(2000);

		wd.get("https://www.saucedemo.com/");
		Thread.sleep(2000);

		wd.manage().window().maximize();
		Thread.sleep(2000);

		wd.findElement(By.cssSelector("input.input_error")).sendKeys("standard_user");
		Thread.sleep(2000);

		wd.findElement(By.cssSelector("input#password")).sendKeys("secret_sauce");
		Thread.sleep(2000);

		wd.findElement(By.cssSelector("input[type='submit']")).click();
		Thread.sleep(2000);

		wd.findElement(By.cssSelector("button#react-burger-menu-btn")).click();
		Thread.sleep(2000);

	}
}
