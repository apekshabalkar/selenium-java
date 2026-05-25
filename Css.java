package program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css {

	public static void main(String[] args) throws InterruptedException {

		WebDriver wd = new ChromeDriver();
		Thread.sleep(2000);

		wd.get("https://www.saucedemo.com/");
		Thread.sleep(2000);

		wd.findElement(By.cssSelector("input.input_error")).sendKeys("standard_user");
		Thread.sleep(2000);

		wd.findElement(By.cssSelector("input#password")).sendKeys("secret_sauce");
		Thread.sleep(2000);

		wd.findElement(By.cssSelector("input[type='submit']")).click();
		Thread.sleep(2000);
		
		wd.findElement(By.cssSelector("react-burger-menu-btn")).click();
		Thread.sleep(2000);
		
				
}
}
