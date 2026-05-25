package program;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver wd = new ChromeDriver();
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		wd.get("https://global-sq.com/contact-us/");
		Thread.sleep(2000);

		wd.findElement(By.xpath("//*[@id=\"wpforms-362-field_0\"]")).sendKeys("Apeksha");
		Thread.sleep(2000);
		
		wd.findElement(By.xpath("//*[@id=\"wpforms-362-field_0-last\"]")).sendKeys("Balkar");
		Thread.sleep(2000);
		
		wd.findElement(By.xpath("//*[@id=\"wpforms-362-field_11\"]")).sendKeys("TCS");
		Thread.sleep(2000);
		
		wd.findElement(By.xpath("//*[@id=\"wpforms-362-field_1\"]")).sendKeys("apeksha.balkar@gmail.com");
		Thread.sleep(2000);
		
		wd.findElement(By.xpath("//*[@id=\"wpforms-362-field_4\"]")).sendKeys("9567997690");
		Thread.sleep(2000);
		
		wd.findElement(By.xpath("//*[@id=\"wpforms-362-field_10\"]")).sendKeys("Email");
		Thread.sleep(2000);
		
		wd.findElement(By.xpath("//*[@id=\"wpforms-362-field_6-time\"]")).sendKeys("7:30 PM");
		Thread.sleep(2000);
		
		wd.findElement(By.xpath("//*[@id=\"wpforms-362-field_2\"]")).sendKeys("Automation Tester");
		Thread.sleep(2000);
		
		wd.findElement(By.xpath("//*[@id=\"wpforms-submit-362\"]")).click();
		Thread.sleep(2000);

	}

}
