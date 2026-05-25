package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class pom_ddf_logout {

WebDriver d;
public pom_ddf_logout(WebDriver wd)
{
d=wd;
}
void logout() 
{

d.findElement(By.xpath("//*[@id=\"react-burger-menu-btn\"]")).click();
d.findElement(By.xpath("//*[@id=\"logout_sidebar_link\"]")).click();
}
}