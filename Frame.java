package MiniProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frame {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver wd = new ChromeDriver();
		Thread.sleep(5000);

		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		wd.manage().window().maximize();
		wd.get("https://jqueryui.com/droppable/");
		Thread.sleep(5000);

		WebElement fr=wd.findElement(By.xpath("//*[@id=\"content\"]/iframe "));
		wd.switchTo().frame(fr);
		WebElement sou = wd.findElement(By.xpath("//*[@id=\"draggable\"]"));
		Thread.sleep(5000);

		WebElement des = wd.findElement(By.xpath("//*[@id=\"droppable\"]"));
		Thread.sleep(5000);

		Actions act = new Actions(wd);
		Thread.sleep(5000);

		act.dragAndDrop(sou, des).build().perform();

	}

}