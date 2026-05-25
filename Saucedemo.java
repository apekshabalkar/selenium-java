package MiniProject;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class Saucedemo {

	public static void main(String[] args) throws InterruptedException, IOException {

//WebDriver
		WebDriver wd = new ChromeDriver();

//Implicit wait
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(2000);

//Url
		wd.get("https://www.saucedemo.com/");
		Thread.sleep(2000);

//maximize
		wd.manage().window().maximize();
		Thread.sleep(2000);

//Scroll
		Actions act = new Actions(wd);
		act.scrollByAmount(0, 500).perform();
		Thread.sleep(5000);

//Username
		wd.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("performance_glitch_user");
		Thread.sleep(5000);

//Password
		wd.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
		Thread.sleep(5000);

//Login
		wd.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		Thread.sleep(5000);

//Product
		wd.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]")).click();
		Thread.sleep(5000);

		wd.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
		Thread.sleep(5000);

		wd.findElement(By.xpath("//*[@id=\"checkout\"]")).click();
		Thread.sleep(5000);

		wd.findElement(By.xpath("//*[@id=\"first-name\"]")).sendKeys("Dick");
		Thread.sleep(5000);

		wd.findElement(By.xpath("//*[@id=\"last-name\"]")).sendKeys("Thomas");
		Thread.sleep(5000);

		wd.findElement(By.xpath("//*[@id=\"postal-code\"]")).sendKeys("4000357");
		Thread.sleep(5000);

		wd.findElement(By.xpath("//*[@id=\"continue\"]")).click();
		Thread.sleep(5000);

		wd.findElement(By.xpath("//*[@id=\"finish\"]")).click();
		Thread.sleep(5000);

//Screenshot		
		TakesScreenshot ts = (TakesScreenshot) wd;
		File sor = ts.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\Lenovo\\Desktop\\Study\\Screenshot\\ss4.jpg");
		Files.copy(sor, des);

		wd.findElement(By.xpath("//*[@id=\"back-to-products\"]")).click();
		Thread.sleep(5000);

		wd.findElement(By.xpath("//*[@id=\"react-burger-menu-btn\"]")).click();
		Thread.sleep(5000);
		
//Logout
		wd.findElement(By.xpath("//*[@id=\"logout_sidebar_link\"]")).click();
		Thread.sleep(5000);

	}
}
