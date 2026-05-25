
package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class pom_ddf_login {

	WebDriver d;
	public pom_ddf_login(WebDriver wd)
	{
	d=wd;	
	}
	void username(String un)
	{
	d.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys(un);
	}
	void password(String pw)
	{
	d.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(pw);
	}
	void login()
	{
	d.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
	}
	}
