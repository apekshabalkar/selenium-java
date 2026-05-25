package program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) throws InterruptedException {
		{
			// TODO Auto-generated method stub
			WebDriver wd = new ChromeDriver();
			Thread.sleep(2000);
			wd.get("https://www.saucedemo.com/");
			Thread.sleep(2000);
			wd.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
			Thread.sleep(2000);
			wd.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
			Thread.sleep(2000);
			wd.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
			wd.close();
		}

	}
}