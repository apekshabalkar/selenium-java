package program;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scroll {

	public static void main(String[] args) throws InterruptedException {
		WebDriver wd = new ChromeDriver();
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Thread.sleep(2000);

		wd.get("https://omayo.blogspot.com/");
		Actions act = new Actions(wd);

		act.scrollByAmount(0, 500).perform();

		wd.findElement(By.xpath("//*[@id=\"HTML42\"]/div[1]/form/input[1]")).sendKeys("Apeksha");
		wd.findElement(By.xpath("//*[@id=\"HTML42\"]/div[1]/form/input[2]")).sendKeys("apeksha123");
		wd.findElement(By.xpath("//*[@id=\"HTML42\"]/div[1]/form/input[3]")).click();

	}

}
