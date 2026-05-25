package program;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class keyboard2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver wd = new ChromeDriver();
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(2000);

		wd.manage().window().maximize();
		Thread.sleep(2000);

		wd.get("https://www.saucedemo.com");
		Thread.sleep(2000);

		WebElement user = wd.findElement(By.xpath("//*[@id=\"user-name\"]"));
		user.sendKeys("standard_user" + Keys.TAB);
		Thread.sleep(2000);

		WebElement pass = wd.findElement(By.xpath("//*[@id=\"password\"]"));
		pass.sendKeys("secret_sauce" + Keys.TAB);
		Thread.sleep(2000);

		WebElement login = wd.findElement(By.xpath("//*[@id=\"login-button\"]"));
		login.sendKeys("login" + Keys.ENTER);
		Thread.sleep(2000);
	}

}
