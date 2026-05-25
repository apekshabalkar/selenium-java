package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Logout_repo
{
 WebDriver d;
 public Logout_repo(WebDriver wd)
 {
	 d=wd;
 }
 void logout()
 {
d.findElement(By.xpath("//*[@id=\"react-burger-menu-btn\"]")).click();
d.findElement(By.xpath("//*[@id=\"logout_sidebar_link\"]")).click();
 }
}

