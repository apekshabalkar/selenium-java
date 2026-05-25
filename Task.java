package MiniProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task {

	public static void main(String[] args) throws InterruptedException {
		
    WebDriver wd=new ChromeDriver();
    wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    Thread.sleep(2000);
    
    wd.get("https://demo.extension.jajuma.de");
    Thread.sleep(2000);
    
    Actions act =new Actions (wd);
    
    act.moveToElement(wd.findElement(By.xpath("//*[@id=\"ui-id-3\"]/span[2]"))).perform();       
    Thread.sleep(2000);
    
    act.moveToElement(wd.findElement(By.xpath("//*[@id=\"ui-id-12\"]/span[2]"))).perform();
    Thread.sleep(2000);
    
    act.moveToElement(wd.findElement(By.xpath("//*[@id=\"ui-id-21\"]/span[2]"))).perform();
    Thread.sleep(2000);
    
    act.moveToElement(wd.findElement(By.xpath("//*[@id=\"ui-id-25\"]/span[2]"))).perform();
    Thread.sleep(2000);
    
    act.moveToElement(wd.findElement(By.xpath("//*[@id=\"ui-id-27\"]/span"))).perform();
    Thread.sleep(2000);
    
	}

}
