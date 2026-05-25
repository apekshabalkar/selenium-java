package MiniProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Keyboard_Actions {

	public static void main(String[] args) throws InterruptedException {

		WebDriver wd= new ChromeDriver();
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(2000);
		
		wd.get("https:www.google.com");
		Thread.sleep(2000);
		
		WebElement search= wd.findElement(By.name("q"));
		Thread.sleep(2000);
		
		search.sendKeys("automation testing");
		Thread.sleep(2000);
		
		search.sendKeys(Keys.CONTROL + "a");
		Thread.sleep(2000);
		
        search.sendKeys(Keys.CONTROL + "c");
        Thread.sleep(2000);
        
        search.sendKeys(Keys.CONTROL + "v");
        Thread.sleep(2000);
        
        search.sendKeys(Keys.CONTROL + "a");
        Thread.sleep(2000);
        
        search.sendKeys(Keys.BACK_SPACE);
        Thread.sleep(2000);
        
        search.sendKeys(Keys.DELETE);
        Thread.sleep(2000);
        
        search.sendKeys(Keys.ESCAPE);
        Thread.sleep(2000);
        
        
	}

}
