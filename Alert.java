package program;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver wd = new ChromeDriver();
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		wd.get("https://demoqa.com/alerts");
		Thread.sleep(2000);

		wd.findElement(By.id("alertButton")).click();
		Thread.sleep(2000);

		String str = wd.switchTo().alert().getText();
		System.out.println(str);
		wd.switchTo().alert().accept();

		wd.findElement(By.id("confirmButton")).click();
		Thread.sleep(2000);

		String a = wd.switchTo().alert().getText();
		System.out.println(a);
		wd.switchTo().alert().accept();
		
		String b = wd.switchTo().alert().getText();
		System.out.println(b);
		wd.switchTo().alert().accept();
		
		String c= wd.switchTo().alert().getText();
        System.out.println(c);
 
    	wd.findElement(By.xpath("//*[@id=\"promtButton\"]")).click();
		Thread.sleep(2000);
		
		wd.switchTo().alert().sendKeys("Apeksha");
		wd.switchTo().alert().accept();
     
	}

}
