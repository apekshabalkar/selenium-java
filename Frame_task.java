package MiniProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_task {

	public static void main(String[] args) throws InterruptedException {

		WebDriver wd = new ChromeDriver();
		Thread.sleep(2000);

		wd.get("https://demo.automationtesting.in/Frames.html");
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(2000);

		wd.manage().window().maximize();
		Thread.sleep(2000);

		wd.findElement(By.xpath("/html/body/section/div[1]/div/div/div/div[1]/div/ul/li[2]/a")).click();
		Thread.sleep(2000);

		WebElement fr = wd.findElement(By.xpath("//*[@id=\"singleframe\"]"));
		wd.switchTo().frame(fr);
		Thread.sleep(2000);

		WebElement fr1 = wd.findElement(By.xpath("/html/body/iframe[1]"));
		wd.switchTo().frame(fr1);
		Thread.sleep(2000);

		wd.findElement(By.xpath("/html/body/section/div/div/div/input")).click();
		Thread.sleep(2000);
		
		wd.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("Testing");
		Thread.sleep(2000);

	}
}
