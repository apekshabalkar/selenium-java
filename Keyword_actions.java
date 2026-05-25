package program;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Keyword_actions {

	public static void main(String[] args) throws InterruptedException {
		WebDriver wd = new ChromeDriver();
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		wd.manage().window().maximize();
		Thread.sleep(2000);

		wd.get("https://www.google.com/");
		WebElement search = wd.findElement(By.name("q"));
		Thread.sleep(2000);
		search.sendKeys("selenium");
		Thread.sleep(2000);
		//control a
		search.sendKeys(Keys.CONTROL +"a");
		Thread.sleep(2000);
		//control c
		search.sendKeys(Keys.CONTROL +"c");
		Thread.sleep(2000);
		//control v
		search.sendKeys(Keys.CONTROL +"v");
		//control a
		search.sendKeys(Keys.CONTROL +"a");
		Thread.sleep(2000);
		//backspace
		search.sendKeys(Keys.BACK_SPACE);
		//delete
		search.sendKeys(Keys.DELETE);
		//escape
		search.sendKeys(Keys.ESCAPE);
		//search.sendKeys(Keys.ENTER);
		Thread.sleep(2000);

	}

}
