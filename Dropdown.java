package program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	WebDriver wd=new ChromeDriver();
	Thread.sleep(2000);
	
	wd.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/#google_vignette");
	Thread.sleep(2000);	
		
	Select sc=new Select(wd.findElement(By.xpath("//*[@id=\"post-2646\"]/div[2]/div/div/div/p/select")));
	
	sc.selectByIndex(1);
	
	//sc.selectByIndex(2);
	//sc.selectByValue("AUS");
	sc.selectByVisibleText("Iraq");
		
		
		
	}

}
