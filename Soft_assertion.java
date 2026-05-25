package TestNG;

import java.time.Duration;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_assertion {
	WebDriver wd;

	@Test
	public void f() throws InterruptedException {
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

		wd.findElement(By.xpath("//*[@id=\"item_4_title_link\"]/div")).click();
		String tit = wd.getTitle();
		SoftAssert as=new SoftAssert ();
		as.assertEquals(tit, "fdgfghfh");
		System.out.println("Hello");
		System.out.println("hi");

	}
}
