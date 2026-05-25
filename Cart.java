package program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cart {

	public static void main(String[] args) throws InterruptedException {	
	

		WebDriver wd=new ChromeDriver ();
		Thread.sleep(2000);
		
		wd.get("https://www.saucedemo.com/");
		Thread.sleep(2000);
		
		wd.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
		Thread.sleep(5000);
		
		wd.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
		Thread.sleep(5000);
		
		wd.findElement(By.xpath("//*[@id=\"login-button\"]")).click();	
		Thread.sleep(5000);
		
		wd.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]")).click();	
		Thread.sleep(5000);
		
		wd.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
		Thread.sleep(5000);
		
		wd.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]")).click();
		Thread.sleep(5000);
		
		wd.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a/span")).click();
		Thread.sleep(5000);
		
		wd.findElement(By.xpath("//*[@id=\"checkout\"]")).click();
		Thread.sleep(5000);
		
		wd.findElement(By.xpath("//*[@id=\"continue-shopping\"]")).click();
		Thread.sleep(5000);
		
		wd.findElement(By.xpath("//*[@id=\"react-burger-menu-btn\"]")).click();
		Thread.sleep(5000);
		
		wd.findElement(By.xpath("//*[@id=\"logout_sidebar_link\"]")).click();
		Thread.sleep(5000);
		
		
	}
	
}
