package POM;

import java.time.Duration;
import java.util.Scanner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class cross_browser {

	static WebDriver wd;
	
	public static void main(String [] args) throws InterruptedException {
		
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter your choice :-");
	int ch=sc.nextInt();
	
	switch(ch) {
	
	case 1:
	wd=new ChromeDriver();
	wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	break;
	
	case 2:
    wd=new FirefoxDriver ();
    Thread.sleep(2000);
	
	case 3:
	default:
	System.out.println("Invalid choice");
	break;
	}
	
	if(wd!=null)
	
	wd.get("https://www.saucedemo.com");	
	Thread.sleep(2000);
	
	wd.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
	Thread.sleep(2000);
	
	wd.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
	Thread.sleep(2000);
	
	wd.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
	Thread.sleep(2000);
	
	
}
}
