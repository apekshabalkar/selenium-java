package MiniProject;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) throws InterruptedException {

		WebDriver wd = new ChromeDriver();
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(2000);

		wd.manage().window().maximize();
		Thread.sleep(2000);

		wd.get("https://testautomationpractice.blogspot.com/");
		Thread.sleep(2000);

		
	}
}