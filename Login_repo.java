package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login_repo
{
	WebDriver d;
	
	public Login_repo(WebDriver wd)
	{
		d=wd;		
	}
	
	void username()
	{
	d.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
	}
	void password()
	{
	d.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
	}
	void login()
	{
	d.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
	}
}