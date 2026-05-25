package program;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriver wd=new ChromeDriver ();
		Thread.sleep(5000);
		
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		wd.get("https://jqueryui.com/resources/demos/droppable/default.html");
		Thread.sleep(5000);
		
		WebElement sou=wd.findElement(By.id("draggable"));
		Thread.sleep(5000);
		
		WebElement des=wd.findElement(By.id("droppable"));
		Thread.sleep(5000);
		
		Actions act=new Actions(wd);
		Thread.sleep(5000);
		
		act.dragAndDrop(sou, des).build().perform();
		
		
		
		
	}

}
