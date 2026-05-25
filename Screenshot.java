package program;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.common.io.Files;

public class Screenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		WebDriver wd = new ChromeDriver();
		Thread.sleep(2000);
		wd.get("https://www.saucedemo.com/");
		Thread.sleep(2000);

		wd.manage().window().maximize();
		Thread.sleep(2000);
		wd.findElement(By.id("user-name")).sendKeys("standardsdfg1");
		Thread.sleep(2000);

		wd.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(2000);

		wd.findElement(By.id("login-button")).click();
		Thread.sleep(2000);

		TakesScreenshot ts = (TakesScreenshot) wd;

		File sor = ts.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\Lenovo\\Desktop\\Study\\Screenshot\\ss1.jpg");
		Files.copy(sor, des);

	}

}
