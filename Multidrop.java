package program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multidrop {

	public static void main(String[] args) throws InterruptedException {

		WebDriver wd = new ChromeDriver();
		wd.manage().window().maximize();

		wd.get("https://omayo.blogspot.com/");
		Thread.sleep(5000);

		Select sc = new Select(wd.findElement(By.id("multiselect1")));

		sc.selectByIndex(0);
		sc.selectByValue("swiftx");
		sc.selectByVisibleText("Audi");

		Select sc1 = new Select(wd.findElement(By.xpath("//*[@id=\"drop1\"]")));

		sc1.selectByIndex(1);

	}

}
